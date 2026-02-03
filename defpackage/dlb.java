package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlb {
    public static final void a(final ics icsVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-932836462);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if (hmlVarC.J((i2 & 19) != 18, i2 & 1)) {
            egt.a(ifb.a(icsVar, fdapVar), hmlVarC);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dla
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dlb.a(icsVar2, fdapVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
