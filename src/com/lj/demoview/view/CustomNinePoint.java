package com.lj.demoview.view;

import com.lj.demoview.entity.PointInfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class CustomNinePoint extends View {
	String tag = "CustomNinePoint";
	PointInfo[] points = new PointInfo[9];
	int screenW, screenH;
    int pointSpac = 20;
	public CustomNinePoint(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomNinePoint(Context context, AttributeSet attrs) {
		super(context, attrs);
		getScreenInfo(context);
		initPoints();

	}

	private void getScreenInfo(Context context) {
		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		Display display = wm.getDefaultDisplay();
		screenW = display.getWidth();
		screenH = display.getHeight();
	}

	private void initPoints() {
        int total = screenW-4*pointSpac;
		int len = points.length;
		for (int i = 0; i < len; i++) {
			PointInfo pi = points[i];
			
			
			
			pi.x = 100;
			pi.y = 100;
		}

	}

	public CustomNinePoint(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Paint mPaint = new Paint();
		mPaint.setColor(Color.rgb(111, 222, 2));
		canvas.drawCircle(100, 100, 100, mPaint);

		super.onDraw(canvas);
	}
}
