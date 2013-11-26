package com.lj.demoview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class CustomView extends View {
 
	private float cx = 0;
	private float cy = 0;
  String TAG  = "View";
	public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		 
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		  
	}

	public CustomView(Context context) {
		super(context);
		 
	}
    public void setXY(float cx,float cy){
    	this.cx = cx;
    	this.cy = cy;
    }
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Paint paint = new Paint();
		Log.e(TAG,  cx+"----"+cy);
		  
	 
		canvas.drawCircle(cx, cy, 100, paint);
		super.onDraw(canvas);
	}
    
	 @Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		 Log.e(TAG,  "i  touching  you");
		 
		return super.onTouchEvent(event);
	}
	 
	 
	 
	
}
