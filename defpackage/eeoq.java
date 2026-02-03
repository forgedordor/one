package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeoq extends eepi {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new eeoo(Float.class);
    private static final Property m = new eeop(Float.class);
    public final lud d;
    public final eeok e;
    public int f;
    public float g;
    public float h;
    pnz i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public eeoq(eeow eeowVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = eeowVar;
        this.d = new lud();
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
        this.i = pnzVar;
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
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<eeoq, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new eeom(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<eeoq, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new eeon(this));
        }
        this.f = 0;
        ((eepf) this.k.get(0)).c = this.e.e[0];
        this.h = 0.0f;
        this.n.start();
    }

    @Override // defpackage.eepi
    public final void e() {
        this.i = null;
    }
}
