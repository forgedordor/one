package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepa extends eepe {
    public static final /* synthetic */ int h = 0;
    private static final lnx q = new eeoz();
    public final eeph a;
    public final eepf b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final loa r;
    private final lnz s;
    private boolean t;
    private final ValueAnimator u;

    public eepa(Context context, final eeok eeokVar, eeph eephVar) {
        super(context, eeokVar);
        this.t = false;
        this.a = eephVar;
        eepf eepfVar = new eepf();
        this.b = eepfVar;
        eepfVar.h = true;
        loa loaVar = new loa();
        this.r = loaVar;
        loaVar.c(1.0f);
        loaVar.e(50.0f);
        lnz lnzVar = new lnz(this, q);
        this.s = lnzVar;
        lnzVar.r = loaVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.u = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eeoy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                eeok eeokVar2 = eeokVar;
                if (!eeokVar2.c(true) || eeokVar2.m == 0) {
                    return;
                }
                eepa eepaVar = this.a;
                if (eepaVar.isVisible()) {
                    eepaVar.invalidateSelf();
                }
            }
        });
        if (eeokVar.c(true) && eeokVar.m != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        float f = i;
        return (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.p)) {
            canvas.save();
            eeph eephVar = this.a;
            eephVar.h(canvas, getBounds(), f(), k(), j());
            eepf eepfVar = this.b;
            eepfVar.f = g();
            Paint paint = this.n;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            eeok eeokVar = this.j;
            eepfVar.c = eeokVar.e[0];
            int iA = eeokVar.i;
            if (iA > 0) {
                if (!(eephVar instanceof eepk)) {
                    iA = (int) ((iA * kzz.a(b(), 0.0f, 0.01f)) / 0.01f);
                }
                eephVar.f(canvas, paint, b(), 1.0f, eeokVar.f, this.o, iA);
            } else {
                eephVar.f(canvas, paint, 0.0f, 1.0f, eeokVar.f, this.o, 0);
            }
            eephVar.e(canvas, paint, eepfVar, this.o);
            eephVar.d(canvas, paint, eeokVar.e[0], this.o);
            canvas.restore();
        }
    }

    @Override // defpackage.eepe
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Context context = this.i;
        boolean zE = super.e(z, z2, z3);
        float fA = eeoe.a(context.getContentResolver());
        if (fA == 0.0f) {
            this.t = true;
            return zE;
        }
        this.t = false;
        this.r.e(50.0f / fA);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.eepe, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.s.f();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        if (!this.t) {
            lnz lnzVar = this.s;
            lnzVar.d(b() * 10000.0f);
            lnzVar.e(f);
            return true;
        }
        float fA = a(i);
        this.s.f();
        d(f / 10000.0f);
        c(fA);
        return true;
    }
}
