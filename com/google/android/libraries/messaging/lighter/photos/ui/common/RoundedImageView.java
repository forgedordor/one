package com.google.android.libraries.messaging.lighter.photos.ui.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RoundedImageView extends AppCompatImageView {
    private final Path a;
    private float[] b;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float[] fArr = this.b;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        Path path = this.a;
        path.reset();
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        float fAbs3 = Math.abs(f4);
        float fAbs4 = Math.abs(f3);
        float fMin = Math.min(width, height) / 2.0f;
        float fMin2 = Math.min(fAbs, fMin);
        float fMin3 = Math.min(fAbs2, fMin);
        float fMin4 = Math.min(fAbs3, fMin);
        float fMin5 = Math.min(fAbs4, fMin);
        path.moveTo(0.0f, fMin2);
        path.quadTo(0.0f, 0.0f, fMin2, 0.0f);
        path.lineTo(width - fMin3, 0.0f);
        path.quadTo(width, 0.0f, width, fMin3);
        path.lineTo(width, height - fMin5);
        path.quadTo(width, height, width - fMin5, height);
        path.lineTo(fMin4, height);
        path.quadTo(0.0f, height, 0.0f, height - fMin4);
        path.close();
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Path();
        this.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
