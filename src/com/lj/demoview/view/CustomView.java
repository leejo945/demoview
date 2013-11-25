package com.lj.demoview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
	private float cx = 0;
	private float cy = 0;

	public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CustomView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
    public void setXY(float cx,float cy){
    	this.cx = cx;
    	this.cy = cy;
    }
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Paint paint = new Paint();

		paint.setColor(Color.rgb(11, 44, 55));
		canvas.drawCircle(cx, cy, 100, paint);
		super.onDraw(canvas);
	}
}
