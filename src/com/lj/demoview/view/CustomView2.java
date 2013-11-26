package com.lj.demoview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class CustomView2 extends View {
	String tag = "CustomView2";

	public CustomView2(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomView2(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CustomView2(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		// Paint paint = new Paint();
		// paint.setColor(Color.RED);
		// canvas.drawCircle(100, 100, 200, paint);

		int w = canvas.getWidth();
		int h = canvas.getHeight();

		Log.e(tag, w + "---" + h);
		super.onDraw(canvas);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

}
