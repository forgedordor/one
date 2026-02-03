package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djnl {
    public static final void a(final ics icsVar, final djmq djmqVar, hml hmlVar, final int i) {
        int i2;
        icsVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1053356268);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djmqVar) ? 16 : 32;
        }
        if ((i2 & 19) != 18 || !hmlVarC.I()) {
            throw null;
        }
        hmlVarC.s();
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djnk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    djnl.a(icsVar2, djmqVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
