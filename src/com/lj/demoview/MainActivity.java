package com.lj.demoview;

import com.lj.demoview.view.CustomClickInvalidateView;
import com.lj.demoview.view.CustomTextIBLayout;
import com.lj.demoview.view.CustomView;
import com.lj.demoview.view.CustomView2;
import com.lj.demoview.view.CustomView3;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	private CustomView cv;
	TextView tv;
     CustomClickInvalidateView v;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// cv = new CustomView(this);
		//

		//CustomView2 view2 = new CustomView2(this);
	 
	 //v = new CustomClickInvalidateView(this);
	    setContentView(R.layout.activity_main);
//     v = (CustomClickInvalidateView) findViewById(R.id.view3);
//	 v.setOnClickListener(new OnClickListener() {
//		
//		@Override
//		public void onClick(View v) {
//			// TODO Auto-generated method stub
//	 	  v.postInvalidate();	
//		}
//	});
	  

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
