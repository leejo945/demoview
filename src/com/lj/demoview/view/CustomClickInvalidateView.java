package com.lj.demoview.view;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomClickInvalidateView extends View {
	Paint mPaint;
	Random r;
	String text = "Hello Android";

	public CustomClickInvalidateView(Context context) {
		super(context);
		mPaint = new Paint();
		r = new Random();
	}

	public CustomClickInvalidateView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CustomClickInvalidateView(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		mPaint.setTextSize(50);

		mPaint.setColor(Color.rgb(r.nextInt(255), r.nextInt(255),
				r.nextInt(255)));
		canvas.drawText(text, 100, 100, mPaint);

		super.onDraw(canvas);
	}
}
