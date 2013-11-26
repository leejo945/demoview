 
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
import android.widget.TextView;

public class CustomTextView extends TextView {
     private Paint mPaint;
	public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		 
		mPaint = new Paint();  
        //The  R.styleable.MyView   is custom in the values;
        TypedArray a = context.obtainStyledAttributes(attrs,  
                R.styleable.MyView);  
          
        //R.styleable.MyView_textColor  
        int textColor = a.getColor(R.styleable.MyView_textColor,  0XFFFFFFFF);  
        float textSize = a.getDimension(R.styleable.MyView_textSize, 36);  
          
        mPaint.setTextSize(textSize);  
        mPaint.setColor(textColor);  
          
        a.recycle();  
	 
	}
	public CustomTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		mPaint.setStyle(Style.FILL);  
        
        //画一个矩形,前俩个是矩形左上角坐标，后面俩个是右下角坐标  
       
          
        mPaint.setColor(Color.BLUE);  
        //绘制文字  
        canvas.drawText("shsh", 10, 110, mPaint);  
		super.onDraw(canvas);
	}
	
	 
	
	
}
