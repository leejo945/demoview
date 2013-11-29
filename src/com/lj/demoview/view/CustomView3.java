package com.lj.demoview.view;

import com.lj.demoview.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class CustomView3 extends View {
	private Paint mPaint;
	private String text = "Hello View!!!!";
    
	public CustomView3(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public CustomView3(Context context, AttributeSet attrs) {
		super(context, attrs);
		mPaint = new Paint();
		TypedArray type = context.obtainStyledAttributes(attrs,
				R.styleable.MyView);
		int color = type.getColor(R.styleable.MyView_textColor, Color.BLUE);
		// float size = type.getDimension(R.styleable.MyView_textSize, 100);
	//	 mPaint.setTextSize(size);
		 mPaint.setColor(color);
	}

	public CustomView3(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		
	//	mPaint.setColor(Color.BLUE);
		mPaint.setStyle(Style.FILL);
		canvas.drawRect(new Rect(0, 0, 100, 100), mPaint);

	//	mPaint.setColor(Color.RED);
	    canvas.drawText(text, 200, 200, mPaint);

		super.onDraw(canvas);
	}
}
