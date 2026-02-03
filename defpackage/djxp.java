package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxp implements fdau {
    final /* synthetic */ djym a;

    public djxp(djym djymVar) {
        this.a = djymVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.E(zBooleanValue) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else if (zBooleanValue) {
            hmlVar.v(-1694945037);
            djym djymVar = this.a;
            hmlVar.v(-1750081316);
            int iOrdinal = djymVar.h.ordinal();
            if (iOrdinal == 0) {
                hmlVar.v(1799040684);
                j = glz.a(hmlVar).s;
                hmlVar.o();
            } else if (iOrdinal == 1) {
                hmlVar.v(1799043107);
                j = glz.a(hmlVar).a;
                hmlVar.o();
            } else {
                if (iOrdinal != 2) {
                    hmlVar.v(1799038438);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(1799045347);
                j = glz.a(hmlVar).A;
                hmlVar.o();
            }
            hmlVar.o();
            djyg.j(j, hmlVar, 0);
            hmlVar.o();
        } else {
            hmlVar.v(-1694828477);
            dkqr.h(this.a.a, egq.k(ics.e, 40.0f), hmlVar, 48);
            hmlVar.o();
        }
        return fctx.a;
    }
}
