package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dph extends icr implements jcd, jfy {
    public dpn a;
    public boolean b;
    public boolean c;

    public dph(dpn dpnVar, boolean z, boolean z2) {
        this.a = dpnVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        dlc.a(j, this.c ? dwm.a : dwm.b);
        boolean z = this.c;
        int iB = Alert.DURATION_SHOW_INDEFINITELY;
        int iA = z ? Integer.MAX_VALUE : kil.a(j);
        if (z) {
            iB = kil.b(j);
        }
        final iyl iylVarE = ixkVar.e(kil.m(j, 0, iB, 0, iA, 5));
        int i = iylVarE.a;
        int iG = fddu.g(i, kil.b(j));
        int i2 = iylVarE.b;
        int iG2 = fddu.g(i2, kil.a(j));
        final int i3 = i2 - iG2;
        int i4 = i - iG;
        if (true != this.c) {
            i3 = i4;
        }
        dpn dpnVar = this.a;
        dpnVar.e.i(i3);
        hzg hzgVarA = hzf.a();
        fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
        hzg hzgVarB = hzf.b(hzgVarA);
        try {
            if (dpnVar.c() > i3) {
                dpnVar.f(i3);
            }
            hzf.e(hzgVarA, hzgVarB, fdapVarK);
            this.a.c.i(true != this.c ? iG : iG2);
            return ixpVar.ej(iG, iG2, fcvp.a, new fdap() { // from class: dpd
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    dph dphVar = this.a;
                    iyk iykVar = (iyk) obj;
                    int iC = dphVar.a.c();
                    if (iC < 0) {
                        iC = 0;
                    }
                    boolean z2 = dphVar.b;
                    int i5 = i3;
                    if (iC > i5) {
                        iC = i5;
                    }
                    int i6 = z2 ? iC - i5 : -iC;
                    final iyl iylVar = iylVarE;
                    boolean z3 = dphVar.c;
                    final int i7 = true != z3 ? i6 : 0;
                    final int i8 = true == z3 ? i6 : 0;
                    iykVar.x(new fdap() { // from class: dpe
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            iyk.B((iyk) obj2, iylVar, i7, i8);
                            return fctx.a;
                        }
                    });
                    return fctx.a;
                }
            });
        } catch (Throwable th) {
            hzf.e(hzgVarA, hzgVarB, fdapVarK);
            throw th;
        }
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean dP() {
        return false;
    }

    @Override // defpackage.jfy
    public final void dQ(jto jtoVar) {
        jtk.L(jtoVar);
        jry jryVar = new jry(new fdae() { // from class: dpf
            @Override // defpackage.fdae
            public final Object invoke() {
                return Float.valueOf(this.a.a.c());
            }
        }, new fdae() { // from class: dpg
            @Override // defpackage.fdae
            public final Object invoke() {
                return Float.valueOf(this.a.a.b());
            }
        }, this.b);
        if (this.c) {
            jtk.A(jtoVar, jryVar);
        } else {
            jtk.m(jtoVar, jryVar);
        }
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        if (true != this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return ivtVar.a(i);
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        if (true == this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return ivtVar.b(i);
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        if (true != this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return ivtVar.c(i);
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        if (true == this.c) {
            i = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return ivtVar.d(i);
    }

    @Override // defpackage.jfy
    public final /* synthetic */ boolean u() {
        return false;
    }
}
