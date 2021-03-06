package com.australia.www.components.content.categorizediconlinks;

import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.cq.component.annotations.widgets.PathField;
import com.citytechinc.cq.component.annotations.widgets.RichTextEditor;

public class TitleText {
	@DialogField(fieldLabel = "Title")
	private String title;

	@DialogField(fieldLabel = "Text")
	@RichTextEditor
	private String text;

	@DialogField(fieldLabel = "Icon image 1")
	@PathField(rootPath = "/content/dam", rootTitle = "Assets")
	private String iconImage1;

	@DialogField(fieldLabel = "Icon Alt Text 1")
	private String iconAltText1;

	@DialogField(fieldLabel = "Link 1", fieldDescription = "For external links please use prefix http:// or https:// (eg. http://www.google.com)")
	@PathField
	private String iconLink1;

	private boolean iconLink1IsExternal;

	@DialogField(fieldLabel = "Link Text 1")
	private String linkText1;

	@DialogField(fieldLabel = "Icon image 2")
	@PathField(rootPath = "/content/dam", rootTitle = "Assets")
	private String iconImage2;

	@DialogField(fieldLabel = "Icon Alt Text 2")
	private String iconAltText2;

	@DialogField(fieldLabel = "Link 2", fieldDescription = "For external links please use prefix http:// or https:// (eg. http://www.google.com)")
	@PathField
	private String iconLink2;

	private boolean iconLink2IsExternal;

	@DialogField(fieldLabel = "Link Text 2")
	private String linkText2;

	@DialogField(fieldLabel = "Icon image 3")
	@PathField(rootPath = "/content/dam", rootTitle = "Assets")
	private String iconImage3;

	@DialogField(fieldLabel = "Icon Alt Text 3")
	private String iconAltText3;

	@DialogField(fieldLabel = "Link 3", fieldDescription = "For external links please use prefix http:// or https:// (eg. http://www.google.com)")
	@PathField
	private String iconLink3;

	private boolean iconLink3IsExternal;

	@DialogField(fieldLabel = "Link Text 3")
	private String linkText3;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconImage1() {
		return iconImage1;
	}

	public void setIconImage1(String iconImage1) {
		this.iconImage1 = iconImage1;
	}

	public String getIconAltText1() {
		return iconAltText1;
	}

	public void setIconAltText1(String iconAltText1) {
		this.iconAltText1 = iconAltText1;
	}

	public String getIconLink1() {
		return iconLink1;
	}

	public void setIconLink1(String iconLink1) {
		this.iconLink1 = iconLink1;
	}

	public boolean getIconLink1IsExternal() {
		return iconLink1IsExternal;
	}

	public void setIconLink1IsExternal(boolean iconLink1IsExternal) {
		this.iconLink1IsExternal = iconLink1IsExternal;
	}

	public String getLinkText1() {
		return linkText1;
	}

	public void setLinkText1(String linkText1) {
		this.linkText1 = linkText1;
	}

	public String getIconImage2() {
		return iconImage2;
	}

	public void setIconImage2(String iconImage2) {
		this.iconImage2 = iconImage2;
	}

	public String getIconAltText2() {
		return iconAltText2;
	}

	public void setIconAltText2(String iconAltText2) {
		this.iconAltText2 = iconAltText2;
	}

	public String getIconLink2() {
		return iconLink2;
	}

	public void setIconLink2(String iconLink2) {
		this.iconLink2 = iconLink2;
	}

	public boolean getIconLink2IsExternal() {
		return iconLink2IsExternal;
	}

	public void setIconLink2IsExternal(boolean iconLink2IsExternal) {
		this.iconLink2IsExternal = iconLink2IsExternal;
	}

	public String getLinkText2() {
		return linkText2;
	}

	public void setLinkText2(String linkText2) {
		this.linkText2 = linkText2;
	}

	public String getIconImage3() {
		return iconImage3;
	}

	public void setIconImage3(String iconImage3) {
		this.iconImage3 = iconImage3;
	}

	public String getIconAltText3() {
		return iconAltText3;
	}

	public void setIconAltText3(String iconAltText3) {
		this.iconAltText3 = iconAltText3;
	}

	public String getIconLink3() {
		return iconLink3;
	}

	public void setIconLink3(String iconLink3) {
		this.iconLink3 = iconLink3;
	}

	public boolean getIconLink3IsExternal() {
		return iconLink3IsExternal;
	}

	public void setIconLink3IsExternal(boolean iconLink3IsExternal) {
		this.iconLink3IsExternal = iconLink3IsExternal;
	}

	public String getLinkText3() {
		return linkText3;
	}

	public void setLinkText3(String linkText3) {
		this.linkText3 = linkText3;
	}
}
