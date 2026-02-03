package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ten {
    public static final void a(final tel telVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 48;
        hml hmlVarC = hmlVar.c(168190276);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(icsVar) ? 16 : 32);
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b("Not implemented", icsVar, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar2, (i2 & 112) | 6, 0, 131068);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: tem
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tel telVar2 = telVar;
                    int i4 = i;
                    ten.a(telVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
