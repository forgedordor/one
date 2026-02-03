package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djpd {
    public static final void a(final djpe djpeVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1332291043);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djpeVar) ? 2 : 4) | i;
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
            dtdi.e(djpeVar.c, icsVar2, false, null, null, null, hxe.d(83767770, new djpc(djpeVar, djpeVar.b ? djrr.t : djrr.s), hmlVarC), hmlVarC, (i2 & 112) | 805306368, 508);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djpb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djpe djpeVar2 = djpeVar;
                    int i4 = i;
                    djpd.a(djpeVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
