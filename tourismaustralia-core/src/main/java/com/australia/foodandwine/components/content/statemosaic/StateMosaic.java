package com.australia.foodandwine.components.content.statemosaic;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ValueMap;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.cq.component.annotations.FieldProperty;
import com.citytechinc.cq.component.annotations.Listener;
import com.citytechinc.cq.component.annotations.Tab;
import com.citytechinc.cq.component.annotations.widgets.TagInputField;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Component(disableTargeting = true, group = "Food and Wine", basePath = "jcr_root/apps/foodandwine/components", value = "State Mosaic", listeners = {
	@Listener(name = "aftercopy", value = "REFRESH_PAGE"), @Listener(name = "afterdelete", value = "REFRESH_PAGE"),
	@Listener(name = "afteredit", value = "REFRESH_PAGE"), @Listener(name = "afterinsert", value = "REFRESH_PAGE") })
public class StateMosaic {

	@DialogField(fieldLabel = "Top Text")
	private final String topText;

	@DialogField(fieldLabel = "Center Text", required=true)
	private final String centerText;

	@DialogField(fieldLabel = "Bottom text")
	private final String bottomText;

	private String template;
	/**
	 * Constructor
	 * @param request
	 */
	public StateMosaic(SlingHttpServletRequest request) {
		// TODO: Load first set server side so it can be indexed by google
		PageManager pageManager = request.getResourceResolver().adaptTo(PageManager.class);
		Page currentPage = pageManager.getContainingPage(request.getResource());
		template = currentPage.getTemplate().getName();
		ValueMap properties = request.getResource().adaptTo(ValueMap.class);
		topText = properties.get("topText", StringUtils.EMPTY);
		centerText = properties.get("centerText", StringUtils.EMPTY);
		bottomText = properties.get("bottomText", StringUtils.EMPTY);
	}

	/**
	 * 
	 * @return
	 */
	public String getTemplate() {
		return template;
	}
	
	public String getTopText() {
		return topText;
	}

	public String getCenterText() {
		return centerText;
	}

	public String getBottomText() {
		return bottomText;
	}

}