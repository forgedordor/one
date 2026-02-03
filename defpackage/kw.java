package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kw extends Drawable {
    private static final float b = (float) Math.toRadians(45.0d);
    public float a;
    private final Paint c;
    private final float d;
    private final float e;
    private final float f;
    private float g;
    private boolean h;
    private final Path i;
    private final int j;
    private float k;
    private final int l;

    public kw(Context context) {
        Paint paint = new Paint();
        this.c = paint;
        this.i = new Path();
        this.l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, kt.o, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        a(typedArrayObtainStyledAttributes.getColor(3, 0));
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.k = (float) ((dimension / 2.0f) * Math.cos(b));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.h != z) {
            this.h = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.g) {
            this.g = fRound;
            invalidateSelf();
        }
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.e = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.d = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(int i) {
        Paint paint = this.c;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || getLayoutDirection() == 1)) {
            z = true;
        }
        float f = this.d;
        float f2 = f * f;
        float fSqrt = (float) Math.sqrt(f2 + f2);
        float f3 = this.e;
        float f4 = this.a;
        float f5 = (fSqrt - f3) * f4;
        float f6 = (this.f - f3) * f4;
        float fRound = Math.round(((this.k + 0.0f) * f4) + 0.0f);
        float f7 = b;
        float f8 = this.a;
        float f9 = (f7 + 0.0f) * f8;
        float f10 = true != z ? -180.0f : 0.0f;
        float f11 = f8 * 180.0f;
        double d = f9 + 0.0f;
        double d2 = f5 + f3;
        float fRound2 = Math.round(Math.cos(d) * d2);
        float fRound3 = Math.round(d2 * Math.sin(d));
        Path path = this.i;
        path.rewind();
        float f12 = this.g;
        Paint paint = this.c;
        float strokeWidth = f12 + paint.getStrokeWidth();
        float f13 = ((-this.k) - strokeWidth) * this.a;
        float f14 = f6 + f3;
        float f15 = (-f14) / 2.0f;
        path.moveTo(f15 + fRound, 0.0f);
        path.rLineTo(f14 - (fRound + fRound), 0.0f);
        float f16 = strokeWidth + f13;
        path.moveTo(f15, f16);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f15, -f16);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth2 = paint.getStrokeWidth();
        float f17 = this.g;
        int iHeight = ((int) ((bounds.height() - (3.0f * strokeWidth2)) - (f17 + f17))) / 4;
        canvas.translate(bounds.centerX(), iHeight + iHeight + (strokeWidth2 * 1.5f) + f17);
        if (this.h) {
            canvas.rotate((f10 + f11) * (true != z ? 1 : -1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.c;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.a != f) {
            this.a = f;
            invalidateSelf();
        }
    }
}
