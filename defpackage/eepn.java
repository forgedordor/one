package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepn extends eepi {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new eepm(Float.class);
    public final lud a;
    public final eeok b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public eepn(eeps eepsVar) {
        super(3);
        this.c = 1;
        this.b = eepsVar;
        this.a = new lud();
    }

    @Override // defpackage.eepi
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.eepi
    public final void d() {
        if (this.h == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<eepn, Float>) g, 0.0f, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new eepl(this));
        }
        this.d = true;
        this.c = 1;
        for (eepf eepfVar : this.k) {
            eeok eeokVar = this.b;
            eepfVar.c = eeokVar.e[0];
            eepfVar.d = eeokVar.i / 2;
        }
        this.h.start();
    }

    @Override // defpackage.eepi
    public final void c() {
    }

    @Override // defpackage.eepi
    public final void e() {
    }

    @Override // defpackage.eepi
    public final void b(pnz pnzVar) {
    }
}
