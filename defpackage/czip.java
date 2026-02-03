package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czip extends Drawable {
    private static final LinearInterpolator d = new LinearInterpolator();
    public float a;
    public boolean b;
    public float c;
    private final ValueAnimator e;
    private final ValueAnimator f;
    private final Paint j;
    private final int k;
    private final dtcd m;
    private final dtcg n;
    private final RectF g = new RectF();
    private final Rect h = new Rect();
    private int o = 255;
    private boolean p = false;
    private final float l = -1.0f;
    private final int i = -1;

    public czip(int i) {
        this.k = i;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: czim
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                czip czipVar = this.a;
                czipVar.a = valueAnimator.getAnimatedFraction();
                czipVar.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.setDuration(750L);
        LinearInterpolator linearInterpolator = d;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        this.e = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: czim
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                czip czipVar = this.a;
                czipVar.a = valueAnimator.getAnimatedFraction();
                czipVar.invalidateSelf();
            }
        });
        valueAnimatorOfFloat2.addListener(new czio(this));
        valueAnimatorOfFloat2.setDuration(750L);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        this.f = valueAnimatorOfFloat2;
        Paint paint = new Paint();
        this.j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.b = false;
        dtcd dtcdVar = new dtcd();
        this.m = dtcdVar;
        this.n = new dtcg(dtcdVar);
    }

    public final void a() {
        this.m.c(getLevel() / 10000.0d);
        dtcg dtcgVar = this.n;
        if (dtcgVar.e) {
            if (dtcgVar.f) {
                dtcgVar.f = false;
                dtcb.c().b(dtcgVar.g);
            }
            dtcgVar.e = false;
        }
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f;
        if (valueAnimator2.isStarted()) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (getBounds().isEmpty() || !isVisible()) {
            return;
        }
        if (!this.p) {
            this.c = getLevel() / 10000;
            dtcd dtcdVar = this.m;
            dtcdVar.c(getLevel() / 10000.0d);
            dtcdVar.b(this.c);
            dtcdVar.l = true;
            dtcdVar.d(new czin(this));
            this.p = true;
        }
        if (this.l == -1.0f) {
            bounds = getBounds();
        } else {
            Rect bounds2 = getBounds();
            int iCenterX = bounds2.centerX();
            int iCenterY = bounds2.centerY();
            Rect rect = this.h;
            rect.left = iCenterX - (getIntrinsicWidth() / 2);
            rect.right = iCenterX + (getIntrinsicWidth() / 2);
            rect.top = iCenterY - (getIntrinsicHeight() / 2);
            rect.bottom = iCenterY + (getIntrinsicHeight() / 2);
            bounds = rect;
        }
        int i = this.k;
        float f = this.a;
        float f2 = i;
        float f3 = f2 * f;
        Paint paint = this.j;
        paint.setStrokeWidth(f3);
        RectF rectF = this.g;
        rectF.set(bounds);
        float f4 = f2 - (f3 / 2.0f);
        rectF.inset(f4, f4);
        float fWidth = rectF.width() / 2.0f;
        float f5 = this.c * 360.0f;
        paint.setColor(this.i);
        int i2 = (int) (this.o * f);
        paint.setAlpha((int) (i2 * 0.0f));
        canvas.drawOval(rectF, paint);
        paint.setAlpha(i2);
        float fMax = Math.max(f5, (float) (((fWidth - f3) * 3.141592653589793d) / (f3 * 180.0f)));
        if (fMax >= 5.0f) {
            canvas.drawArc(rectF, -90.0f, fMax, false, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.l;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        this.m.b(i / 10000.0d);
        dtcg dtcgVar = this.n;
        if (!dtcgVar.e) {
            dtcgVar.e = true;
            dtcgVar.d = -1L;
            dtcgVar.a();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.o) {
            this.o = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.b;
        if (!z3 && !z2) {
            return false;
        }
        this.b = z;
        if (!z) {
            if (!z3) {
                a();
                return z3;
            }
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator.isRunning()) {
                this.f.setCurrentPlayTime(750 - valueAnimator.getCurrentPlayTime());
                valueAnimator.cancel();
            }
            this.f.start();
            return z3;
        }
        super.setVisible(true, z2);
        ValueAnimator valueAnimator2 = this.f;
        if (valueAnimator2.isRunning()) {
            this.e.setCurrentPlayTime(750 - valueAnimator2.getCurrentPlayTime());
            valueAnimator2.cancel();
        }
        if (!z2) {
            this.e.start();
            return z3;
        }
        a();
        this.e.start();
        return z3;
    }
}
