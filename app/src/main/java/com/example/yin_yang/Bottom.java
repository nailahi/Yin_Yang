package com.example.yin_yang;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class Bottom extends View {
    float bx = 200;
    float by = 300;

    public Bottom(Context context) {
        super(context);
    }

    public Bottom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Bottom(Context context, AttributeSet attrs, int def) {
        super(context, attrs, def);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(bx, by, 80, paint);
        canvas.drawCircle(bx - 40, by, 10, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(bx + 40, by, 10, paint);
        canvas.drawCircle(bx,by+40,20,paint);
        super.onDraw(canvas);
        canvas.drawLine(bx-100,by-50,bx+100,by-50,paint);
        canvas.drawRect(bx-70,by-150,bx+60,by-50,paint);
//        Path path = new Path();
//        path.moveTo(bx, by);
//        path.quadTo(bx+by, by+bx, -bx+-by, -by+-bx);
//        path.quadTo(-bx, -by, bx, by);
//        path.cubicTo(150, 100, 200, 300, 150, 100);
        paint.setColor(Color.BLACK);
       // canvas.drawPath(path, paint);
    }

    public boolean onTouchEvent(MotionEvent event) {
        bx = event.getX();
        by = event.getY();
        this.invalidate();
        return true;
    }



}
