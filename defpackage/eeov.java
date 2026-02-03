package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeov extends eepi {
    public final TimeInterpolator c;
    public final eeok d;
    public int e;
    public float f;
    public float g;
    pnz h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = eecd.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new eeot(Float.class);
    private static final Property m = new eeou(Float.class);

    public eeov(Context context, eeow eeowVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = eeowVar;
        this.c = eenh.a(context, R.attr.motionEasingStandardInterpolator, i);
    }

    @Override // defpackage.eepi
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.eepi
    public final void b(pnz pnzVar) {
        this.h = pnzVar;
    }

    @Override // defpackage.eepi
    public final void c() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    @Override // defpackage.eepi
    public final void d() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<eeov, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new eeor(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<eeov, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new eeos(this));
        }
        this.e = 0;
        ((eepf) this.k.get(0)).c = this.d.e[0];
        this.g = 0.0f;
        this.n.start();
    }

    @Override // defpackage.eepi
    public final void e() {
        this.h = null;
    }
}
