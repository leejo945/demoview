package com.lj.demoview;

import com.lj.demoview.view.CustomView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;

public class MainActivity extends Activity {
	private CustomView cv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	 
		cv  = new CustomView(this);
		 setContentView(cv);
		 
	}

	 @Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		 float cx = event.getX();
		 float cy = event.getY();
		 cv.setXY(cx, cy);
		 cv.invalidate();
		return true;
	}

}
