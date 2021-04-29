package com.example.canvasproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint=new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(),
                R.color.kaca, null));
        mPaintText.setTextSize(30);
    }

    public void drawSomething(View view) {
        int vWidth= view.getWidth();
        int vHeight=view.getHeight();
        mBitmap=Bitmap.createBitmap(vWidth,vHeight,Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas= new Canvas(mBitmap);
        mCanvas.drawColor(Color.WHITE);
        mCanvas.drawText(getString(R.string.name), 100,100, mPaintText);

        mPaint.setColor(getResources().getColor(R.color.bangunan));
        Rect mRect= new Rect();
        mRect.set(100,400,600,800);
        mCanvas.drawRect(mRect,mPaint);

        Path path = new Path();
        path.moveTo(70,400);
        path.lineTo(350,150);
        path.lineTo(650,400);
        mPaint.setColor(getResources().getColor(R.color.atap));
        mCanvas.drawPath(path,mPaint);

        path.lineTo(100,400);
        path.lineTo(350,200);
        path.lineTo(600,400);
        mPaint.setColor(getResources().getColor(R.color.bangunan));
        mCanvas.drawPath(path,mPaint);



        mPaint.setColor(getResources().getColor(R.color.pintu));
        mRect.set(250,500,450,800);
        mCanvas.drawRect(mRect,mPaint);

        mPaint.setColor(Color.GRAY);
        RectF rectF = new RectF();
        rectF.set(280,320,430,470);
        mCanvas.drawOval(rectF,mPaint);








//        mPaint.setColor(Color.BLUE);
//        mPaint.setStrokeWidth(6);
//        mCanvas.drawLine(100,150,400,150, mPaint);
//
//        mPaint.setColor(Color.RED);
//        Rect mRect= new Rect();
//        mRect.set(100,200,600,400);
//        mCanvas.drawRect(mRect,mPaint);
//
//        mPaint.setColor(Color.CYAN);
//        mCanvas.drawCircle(250,500,100, mPaint);
//
//        Path path = new Path();
//        path.moveTo(100,700);
//        path.lineTo(300,800);
//        path.lineTo(400,700);
//        path.lineTo(400,800);
//        path.lineTo(200,700);
//        mPaint.setColor(Color.MAGENTA);
//        mCanvas.drawPath(path,mPaint);
//
//        mPaint.setColor(Color.GRAY);
//        RectF rectF = new RectF();
//        rectF.set(100,200,600,400);
//        mCanvas.drawOval(rectF,mPaint);

        view.invalidate();

    }
}