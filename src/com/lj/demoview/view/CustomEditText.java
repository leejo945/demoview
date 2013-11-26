package com.lj.demoview.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

public class CustomEditText extends EditText {
String tag = "CustomEditText";
	public CustomEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		 Log.e(tag, "1");
	}

	public CustomEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		 Log.e(tag, "2");
	}

	public CustomEditText(Context context) {
		super(context);
		 Log.e(tag, "3");
	}
    
 
}
