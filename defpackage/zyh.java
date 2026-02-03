package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyh {
    public final zuh a;

    public zyh(zuh zuhVar) {
        zuhVar.getClass();
        this.a = zuhVar;
    }

    public final void a(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2058690661);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(this);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: zyf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        this.a.a.g();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            diqe.b((fdae) objS, hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zyg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    this.a.a((hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
