 
package com.lj.demoview.view;

import com.lj.demoview.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomTextIBLayout extends LinearLayout {
    private ImageButton ib;
    private TextView tv;
	public CustomTextIBLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomTextIBLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	    TypedArray type =  context.obtainStyledAttributes(attrs, R.styleable.MyView);
		
	  
	    View  view = LayoutInflater.from(context).inflate(R.layout.tv_ib, this, true);  
		ib = (ImageButton) view.findViewById(R.id.btn1);
		tv = (TextView) view.findViewById(R.id.text1);
	}

	public CustomTextIBLayout(Context context, AttributeSet attrs, int defStyle) {
		 
		 super(context,attrs, defStyle);
	}
    public void setIBBackground(int resid){
    	ib.setBackgroundResource(resid);
    }
    public void setTVSize(String text){
    	tv.setText(text);
    }
}
