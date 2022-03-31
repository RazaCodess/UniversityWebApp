package com.project.firstMvcProject;

import java.beans.PropertyEditorSupport;

public class CustomNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		if(name.contains("Mr.")|| name.contains("Ms.")) {
			setValue(name);
		}
		else
		{
			setValue("Ms." +name);
		}
	}	
}
