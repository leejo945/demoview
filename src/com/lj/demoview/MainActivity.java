package com.lj.demoview;

import com.lj.demoview.view.CustomView;
import com.lj.demoview.view.CustomView2;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	private CustomView cv;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// cv = new CustomView(this);
		//

		CustomView2 view2 = new CustomView2(this);
		setContentView(view2);

	 

	}

	// @Override
	// public boolean onTouchEvent(MotionEvent event) {
	// // TODO Auto-generated method stub
	// float cx = event.getX();
	// float cy = event.getY();
	//
	//
	// cv.setXY(cx, cy);
	// cv.invalidate();
	// return true;
	// }

}
