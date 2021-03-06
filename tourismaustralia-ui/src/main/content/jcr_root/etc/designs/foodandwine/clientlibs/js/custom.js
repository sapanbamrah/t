$(document).ready(function() {
	$(".video-container").video();
});

$(function(){
	$('.faw-video-teaser-icon,.form-video-button').click(function(){
		var id=$(this).data('video-button')
		$('#'+id).find('.BrightcoveExperience').each(function(){
			 adjustHeightAndWidth(this);
		});
	});
});

$(function(){
	$('.video-close-btn').click(function(){
		$(this).parent().find('.BrightcoveExperience').each(function(){
			var $this = $(this);
		    var id = $this.attr("id");
			var videoPlayerHolder = brightcove.api.getExperience(id);
			var videoPlayer = videoPlayerHolder.getModule(brightcove.api.modules.APIModules.VIDEO_PLAYER);
			videoPlayer.pause();
		});
	});
});

$(function(){
	$("form.add-experience-form").submit(function(e){
		if(validateForm()){
			return true;
		}else{
			e.preventDefault();
			return false;
		}
	});
});

$(function(){
	$('#imageupload').change(function(){
		var val=$(this).val();
		if(val && val != ""){
			$(this).parent().next().text(val);
		}else{
			$(this).parent().next().text("No File");
		}
	});
});