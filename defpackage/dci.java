package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dci extends fdbr implements fdav {
    final /* synthetic */ fdau a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dci(fdau fdauVar) {
        super(4);
        this.a = fdauVar;
    }

    @Override // defpackage.fdav
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        dbs dbsVar = (dbs) obj;
        ics icsVar = (ics) obj2;
        hml hmlVar = (hml) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (true != hmlVar.D(dbsVar) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= true != hmlVar.D(icsVar) ? 16 : 32;
        }
        if (hmlVar.J((i & 147) != 146, i & 1)) {
            fdau fdauVar = this.a;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVar);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i2 = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
                Integer numValueOf = Integer.valueOf(i2);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdauVar.a(dbsVar, hmlVar, Integer.valueOf(i & 14));
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
