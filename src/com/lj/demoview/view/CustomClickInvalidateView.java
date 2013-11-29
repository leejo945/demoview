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
		mPaint = new Paint();
		r = new Random();
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

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub

		setMeasuredDimension(measuredWidth(100), measuredHeight(200));

	}

	private int measuredWidth(int measureSpec) {
		// TODO Auto-generated method stub
		int result = 0;
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);

		if (specMode == MeasureSpec.EXACTLY) {
			// We were told how big to be
			result = specSize;
		} else {
			// Measure the text
			result = (int) mPaint.measureText(text) + getPaddingLeft()
					+ getPaddingRight();
			if (specMode == MeasureSpec.AT_MOST) {
				// Respect AT_MOST value if that was what is called for by
				// measureSpec
				result = Math.min(result, specSize);// 60,480
			}
		}

		return result;
	}

	private int mAscent;

	private int measuredHeight(int measureSpec) {
		int result = 0;
		int specMode = MeasureSpec.getMode(measureSpec);
		int specSize = MeasureSpec.getSize(measureSpec);

		mAscent = (int) mPaint.ascent();
		if (specMode == MeasureSpec.EXACTLY) {
			// We were told how big to be
			result = specSize;
		} else {
			// Measure the text (beware: ascent is a negative number)
			result = (int) (-mAscent + mPaint.descent()) + getPaddingTop()
					+ getPaddingBottom();
			if (specMode == MeasureSpec.AT_MOST) {
				// Respect AT_MOST value if that was what is called for by
				// measureSpec
				result = Math.min(result, specSize);
			}
		}
		return result;
	}

}
