/*!
 * jQuery lightweight plugin boilerplate
 * Original author: @ajpiano
 * Further changes, comments: @addyosmani
 * Licensed under the MIT license
 *
 * ..............................................................................
 *
 * Carousel Jquery Plugin
 *
 * slideTime : slider animation time in ms
 * disableCarouselonDesktop : disables the functionality of the carousel on desktop views
 * mobileMaxResolution : set the mobile max resolution for our brakepoint to desktop
 */

;(function($, window, document, undefined) {

	// Create the defaults once
	var pluginName = 'carousel', defaults = {
		slideTime : 400,
		disableCarouselonDesktop : false,
		mobileMaxResolution : 990,
		startIndex : "",
		showSingleItem : true
	};

	// The actual plugin constructor
	function Plugin(element, options) {
		this.element = element;
		this.options = $.extend({}, defaults, options);
		this._defaults = defaults;
		this._name = pluginName;
		this.slider = {};

		//check data tags
		this.checkDataTags(this);
		//init plugin
		this.init();
	}


	Plugin.prototype.init = function() {
		var scope = this;
		var mouseEnbaled = true;
		var screenWidth = $(window).width();

		//disable mouse and touch events for desktop version
		if (screenWidth > scope.options.mobileMaxResolution) {
			if (scope.options.disableCarouselonDesktop) {
				mouseEnbaled = false;
			}
		}

		scope.slider = $(scope.element).owlCarousel({
			slideSpeed : scope.options.slideTime,
			paginationSpeed : scope.options.slideTime,
			singleItem : scope.options.showSingleItem,
			mouseDrag : mouseEnbaled,
			touchDrag : mouseEnbaled,
			afterMove : function(slideEvent) {
				scope.onSlideComplete(scope, slideEvent);
			}
		});

		//get carousel instance data and store it in variable owl
		scope.sliderdata = $(scope.element).data('owlCarousel');

		//scroll Carousel to middle index
		scope.itemsCount = $(scope.element).find('li').length - 1;
		scope.sliderdata.goTo(Math.round(scope.itemsCount / 2));

		//init buttons and bullets
		scope.initCarouselItems(scope);

		//add resize event to check screen resolution
		$(window).resize(function() {
			screenWidth = $(window).width();
			//check if is mobile screen
			if (screenWidth > scope.options.mobileMaxResolution) {
				//reset slider module to slide of index 0
				if (scope.options.disableCarouselonDesktop)
					if (scope.options.startIndex != '') {
						scope.sliderdata.goTo(Math.round(scope.itemsCount / 2));
					} else {
						scope.sliderdata.goTo(scope.options.startIndex);
						if (screenWidth < scope.options.mobileMaxResolution) {
							scope.sliderdata.goTo(Math.round(scope.itemsCount / 2));
						}
					}
			}

			if (scope.options.disableCarouselonDesktop) {
				if (screenWidth < scope.options.mobileMaxResolution) {
					$(scope.element).find('.owl-pagination').css('display', 'block');
					scope.sliderdata.goTo(Math.round(scope.itemsCount / 2));
				} else {
					$(scope.element).find('.owl-pagination').css('display', 'none');
				}
			}
		});

		scope.sliderdata.goTo(scope.options.startIndex);

		if (scope.options.disableCarouselonDesktop) {
			if (screenWidth < scope.options.mobileMaxResolution) {
				$('.owl-pagination').css('display', 'block');
				scope.sliderdata.goTo(Math.round(scope.itemsCount / 2));
			} else {
				$(scope.element).find('.owl-pagination').css('display', 'none');
			}
		} else {
			scope.sliderdata.goTo(Math.round(scope.itemsCount / 2));
		}

		$(window).trigger('resize');
	};

	//set mouse events carousel items
	Plugin.prototype.initCarouselItems = function(scope) {
		$(scope.element).find('li').each(function(index, object) {
			//add click function
			$(object).click(function() {
				if (!scope.options.disableCarouselonDesktop)
					scope.sliderdata.goTo(index);
			});
		});
	};

	Plugin.prototype.onSlideComplete = function(scope, event) {
		var currentItemIndex = scope.sliderdata.currentItem;
		$(scope.element).find('li').each(function(index, element) {
			if (index == parseInt(currentItemIndex)) {
				$(element).css('opacity', 1);
			} else {
				if (!scope.options.disableCarouselonDesktop)
					$(element).css('opacity', 0.5);
			}
		});
	};

	Plugin.prototype.checkDataTags = function(scope) {
		//read out data tags and override options if necessary
		if (scope.isDataTag(scope, 'data-disablecarouselondesktop'))
			scope.options.disableCarouselonDesktop = scope.isDataTrue(scope, 'data-disablecarouselondesktop');

		if (scope.isDataTag(scope, 'data-showsingleitem'))
			scope.options.showSingleItem = scope.isDataTrue(scope, 'data-showsingleitem');

		if (scope.isDataTag(scope, 'data-startindex'))
			scope.options.startIndex = parseInt($(scope.element).attr('data-startindex'));

		if (scope.isDataTag(scope, 'data-mobilemaxresolution'))
			scope.options.mobileMaxResolution = parseInt($(scope.element).attr('data-mobilemaxresolution'));
	};

	Plugin.prototype.isDataTag = function(scope, dataTagName) {
		//check, if data tag is not undefined
		if ($(scope.element).attr(dataTagName) !== undefined) {
			return true;
		} else {
			return false;
		}
	};

	Plugin.prototype.isDataTrue = function(scope, dataTagName) {
		//check, if data boolean tag is true or false (String to Boolean)
		if ($(scope.element).attr(dataTagName) !== "false") {
			return true;
		} else {
			return false;
		}
	};

	// A really lightweight plugin wrapper around the constructor,
	// preventing against multiple instantiations
	$.fn[pluginName] = function(options) {
		return this.each(function() {
			if (!$.data(this, 'plugin_' + pluginName)) {
				$.data(this, 'plugin_' + pluginName, new Plugin(this, options));
			}
		});
	};
	//init all carousel objects on page automatically -> TBR
	$(window).load(function() {
		$(".carousel-wrapper").carousel();
	});
})(jQuery, window, document);
