package com.lj.demoview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

public class CustomRelativeLayout extends RelativeLayout {

	public CustomRelativeLayout(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public CustomRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CustomRelativeLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	protected void onDraw(Canvas canvas) {
		 int w = canvas.getWidth();
		 int h = canvas.getHeight();
		 Log.e("View", w+""+h);
		Paint paint = new Paint();
		paint.setColor(Color.rgb(0, 0, 0))	;
	    
	    canvas.drawRect(100, 100, 100, 100, paint);
	
		 
		 
		super.onDraw(canvas);
	}
}
