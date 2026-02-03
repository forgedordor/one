package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyw {
    public static final void a(final djyx djyxVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1856612913);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djyxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) != 18 || !hmlVarC.I()) {
            iex.a(efy.i(egq.u(icsVar, 80.0f, 0.0f, 2), 4.0f, 0.0f, 2), evn.b(42.0f));
            hmlVarC.v(1793591749);
            throw null;
        }
        hmlVarC.s();
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djyv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djyx djyxVar2 = djyxVar;
                    int i4 = i;
                    djyw.a(djyxVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
