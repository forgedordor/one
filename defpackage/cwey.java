package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwey {
    public static final void a(final cvwx cvwxVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-429794360);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cvwxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (!cvwxVar.a.isEmpty()) {
            dtdn.a(null, null, dtdj.b(glz.a(hmlVarC).D, 0L, hmlVarC, 14), null, null, hxe.d(-1055868011, new cwex(cvwxVar), hmlVarC), hmlVarC, 196608, 27);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwew
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwey.a(cvwxVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
