package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxc extends View {
    public fxm b;
    public Boolean c;
    public Runnable d;
    public fdae e;
    private Long g;
    private static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] a = new int[0];

    public fxc(Context context) {
        super(context);
    }

    public final void a() {
        this.e = null;
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.d;
            runnable2.getClass();
            runnable2.run();
        } else {
            fxm fxmVar = this.b;
            if (fxmVar != null) {
                fxmVar.setState(a);
            }
        }
        fxm fxmVar2 = this.b;
        if (fxmVar2 == null) {
            return;
        }
        fxmVar2.setVisible(false, false);
        unscheduleDrawable(fxmVar2);
    }

    public final void b(long j, int i, long j2, float f2) {
        fxm fxmVar = this.b;
        if (fxmVar == null) {
            return;
        }
        Integer num = fxmVar.b;
        if (num == null || num.intValue() != i) {
            fxmVar.b = Integer.valueOf(i);
            fxmVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 += f2;
        }
        long jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), fddu.d(f2, 1.0f), ije.f(j2));
        ije ijeVar = fxmVar.a;
        if (ijeVar == null || !fcts.a(ijeVar.i, jF)) {
            fxmVar.a = new ije(jF);
            fxmVar.setColor(ColorStateList.valueOf(ijg.b(jF)));
        }
        Rect rect = new Rect(0, 0, fdcu.b(ihz.c(j)), fdcu.b(ihz.a(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        fxmVar.setBounds(rect);
    }

    public final void c(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z) {
            iArr = f;
        } else {
            if (jLongValue < 5) {
                Runnable runnable2 = new Runnable() { // from class: fxb
                    @Override // java.lang.Runnable
                    public final void run() {
                        fxc fxcVar = this.a;
                        fxm fxmVar = fxcVar.b;
                        if (fxmVar != null) {
                            fxmVar.setState(fxc.a);
                        }
                        fxcVar.d = null;
                    }
                };
                this.d = runnable2;
                postDelayed(runnable2, 50L);
                this.g = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = a;
        }
        fxm fxmVar = this.b;
        if (fxmVar != null) {
            fxmVar.setState(iArr);
        }
        this.g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            a();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        fdae fdaeVar = this.e;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
