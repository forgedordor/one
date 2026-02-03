package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyj {
    public static final void a(final dpme dpmeVar, final ics icsVar, final xyz xyzVar, hml hmlVar, final int i) {
        int i2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(639489436);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dpmeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(xyzVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtct.a(hxe.d(-1703101864, new xyg(xyzVar), hmlVarC), icsVar, hxe.d(1088767126, new xyh(xyzVar, dpmeVar), hmlVarC), hxe.d(1379207949, new xyi(xyzVar), hmlVarC), 0.0f, null, dtil.b(ije.g, 0L, glz.a(hmlVarC).q, glz.a(hmlVarC).q, glz.a(hmlVarC).q, hmlVarC, 18), null, hmlVarC, (i2 & 112) | 3462, 176);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xyf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpme dpmeVar2 = dpmeVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    xyj.a(dpmeVar2, icsVar2, xyzVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
