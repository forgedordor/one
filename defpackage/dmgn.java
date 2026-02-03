package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmgn implements dmgl {
    @Override // defpackage.dmgl
    public final void a(final dmgp dmgpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2134638722);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dmgpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (!(dmgpVar instanceof dmhi)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            dmgk.c((dmhi) dmgpVar, hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmgm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmgn dmgnVar = this.a;
                    int i4 = i;
                    dmgnVar.a(dmgpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
