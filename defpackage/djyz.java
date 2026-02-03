package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyz {
    public static final void a(final djza djzaVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1290128093);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djzaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = icsVar;
            dtev.a(icsVar2, 1.0f, 0L, hmlVarC, (i2 >> 3) & 14, 4);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djyy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djza djzaVar2 = djzaVar;
                    int i4 = i;
                    djyz.a(djzaVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
