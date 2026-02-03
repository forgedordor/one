package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoz {
    public static final void a(final zow zowVar, hml hmlVar, final int i) {
        int i2;
        zowVar.getClass();
        hml hmlVarC = hmlVar.c(1985973183);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(zowVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cye.b(zowVar.b, null, dae.k(null, null, 15).a(dae.l(null, 3)), dae.q(null, null, 15).a(dae.m(null, 3)), null, hxe.d(-2050144617, new zoy(zowVar, hsb.b(zowVar.c, false, null, hmlVarC, 2)), hmlVarC), hmlVarC, 200064, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zox
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    zoz.a(zowVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
