package com.example.yin_yang;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Top extends View {
      float tx = 200;
      float ty = 300;


    public Top(Context context) { super(context); }
    public Top(Context context, AttributeSet attrs){ super(context,attrs); }
    public Top(Context context, AttributeSet attrs, int def){ super(context,attrs,def); }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(tx, ty, 80, paint);
        canvas.drawCircle(tx - 40, ty, 10, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(tx + 40, ty, 10, paint);
        canvas.drawCircle(tx,ty+40,20,paint);
        canvas.drawLine(tx-100,ty-50,tx+100,ty-50,paint);
        canvas.drawRect(tx-70,ty-150,tx+60,ty-50,paint);
//        Path path = new Path();
//        path.moveTo(bx, by);
//        path.quadTo(bx+by, by+bx, -bx+-by, -by+-bx);
//        path.quadTo(-bx, -by, bx, by);
//        path.cubicTo(150, 100, 200, 300, 150, 100);
        paint.setColor(Color.BLACK);
        // canvas.drawPath(path, paint);
    }

    public boolean onTouchEvent(MotionEvent event){
       tx = event.getX();
       ty= event.getY();
       this.invalidate();
       return true;
    }
}
