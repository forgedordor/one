package com.google.android.libraries.user.profile.photopicker.art.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.edab;
import defpackage.edac;
import defpackage.edaq;
import defpackage.fbgv;
import defpackage.kzb;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ColorPickerView extends View {
    private static final int[] j = {R.string.op3_art_color_picker_wheel_color_announce_0, R.string.op3_art_color_picker_wheel_color_announce_1, R.string.op3_art_color_picker_wheel_color_announce_2, R.string.op3_art_color_picker_wheel_color_announce_3, R.string.op3_art_color_picker_wheel_color_announce_4, R.string.op3_art_color_picker_wheel_color_announce_5, R.string.op3_art_color_picker_wheel_color_announce_6, R.string.op3_art_color_picker_wheel_color_announce_7, R.string.op3_art_color_picker_wheel_color_announce_8, R.string.op3_art_color_picker_wheel_color_announce_9, R.string.op3_art_color_picker_wheel_color_announce_10, R.string.op3_art_color_picker_wheel_color_announce_11};
    private static final float[] k = {0.0f, 0.1666f, 0.3333f, 0.5f, 0.6666f, 0.8333f, 1.0f};
    public final Paint a;
    public final float[] b;
    final GestureDetector.SimpleOnGestureListener c;
    public float d;
    public edac e;
    public boolean f;
    public final int g;
    public int h;
    public final int i;
    private final Paint l;
    private final Paint m;
    private final GestureDetector n;
    private int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;

    public ColorPickerView(Context context) {
        this(context, null);
    }

    public final float a() {
        float f = this.b[0] - this.d;
        return f < 0.0f ? f + 360.0f : f;
    }

    public final void b(Integer num) {
        edac edacVar = this.e;
        if (edacVar != null) {
            edacVar.a(a(), num);
        }
    }

    public final void c() {
        setContentDescription(getContext().getString(j[Math.round(this.b[0] / 30.0f) % 12], Integer.valueOf(this.o & 16777215)));
    }

    public final void d() {
        this.o = kzb.c(this.b);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public final void e(int i, int i2) {
        int[] iArr = new int[7];
        float[] fArr = this.b;
        float[] fArr2 = {0.0f, fArr[1], fArr[2]};
        for (int i3 = 0; i3 < 7; i3++) {
            fArr2[0] = 360 - (i3 * 60);
            iArr[i3] = kzb.c(fArr2);
        }
        this.l.setShader(new SweepGradient(i / 2.0f, i2 / 2.0f, iArr, k));
    }

    public final void f(float f, float f2, MotionEvent motionEvent, Integer num) {
        double degrees = Math.toDegrees(Math.atan2(-(f2 - (getHeight() / 2.0f)), f - (getWidth() / 2.0f)));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        float[] fArr = this.b;
        if (fArr[0] != degrees) {
            fArr[0] = (float) degrees;
            d();
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) {
                c();
            }
            b(num);
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float width = getWidth();
        float f = this.q + (this.p / 2.0f);
        float f2 = width / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(f2, height, f, this.l);
        float[] fArr = this.b;
        double d = f;
        double dCos = Math.cos(Math.toRadians(fArr[0])) * d;
        double dSin = d * Math.sin(Math.toRadians(fArr[0]));
        Paint paint = this.m;
        paint.setColor(this.o);
        float f3 = (float) (f2 + dCos);
        float f4 = (float) (height - dSin);
        canvas.drawCircle(f3, f4, this.h, paint);
        canvas.drawCircle(f3, f4, this.h, this.a);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMin = Math.min(i, i2);
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.l.setStrokeWidth(this.p);
        e(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            int i = true == this.f ? 8 : 1;
            this.f = false;
            this.h = this.r;
            this.a.setStrokeWidth(this.u);
            f(motionEvent.getX(), motionEvent.getY(), motionEvent, Integer.valueOf(i));
        }
        return this.n.onTouchEvent(motionEvent);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, edaq.a, 0, 0);
        try {
            this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
            this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.r = dimensionPixelSize;
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.s = dimensionPixelSize2;
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.t = dimensionPixelSize3;
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.u = dimensionPixelSize4;
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
            int i = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.v = i;
            int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
            this.w = i2;
            typedArrayObtainStyledAttributes.recycle();
            this.h = dimensionPixelSize;
            Paint paint = new Paint(1);
            this.l = paint;
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint(1);
            this.a = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setStrokeWidth(dimensionPixelSize4);
            float[] fArr = {0.0f, 1.0f, 0.5f};
            this.b = fArr;
            this.d = 0.0f;
            Paint paint3 = new Paint(1);
            this.m = paint3;
            paint3.setShadowLayer(dimensionPixelSize3, 0.0f, dimensionPixelSize2, kzb.h(i, i2));
            if (!fbgv.a.get().h() || Build.VERSION.SDK_INT < 28) {
                setLayerType(1, null);
            }
            this.o = kzb.c(fArr);
            edab edabVar = new edab(this);
            this.c = edabVar;
            this.n = new GestureDetector(context, edabVar);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
