package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djno {
    public static final void a(ics icsVar, final djms djmsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1718024472);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djmsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = icsVar;
            djmd.d(icsVar2, true, djmsVar.e, null, hxe.d(-1332743906, new djnn(djmsVar), hmlVarC), hmlVarC, (i2 & 14) | 24624, 8);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djnm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar2;
                    int i4 = i;
                    djno.a(icsVar3, djmsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
