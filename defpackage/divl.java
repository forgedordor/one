package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class divl implements fdat {
    final /* synthetic */ divn a;

    public divl(divn divnVar) {
        this.a = divnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarE = efy.e(ics.e, 16.0f, 8.0f);
            divn divnVar = this.a;
            ixm ixmVarA = ecz.a(ibw.d, false);
            long jB = hmg.b(hmlVar);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarE);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j2;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            String str = divnVar.a;
            jyq jyqVar = dljt.e(hmlVar).g;
            hmlVar.v(-148439518);
            if (divnVar.c) {
                hmlVar.v(1654712202);
                j = dljt.a(hmlVar).b.k;
                hmlVar.o();
            } else {
                hmlVar.v(1654771660);
                j = glz.a(hmlVar).s;
                hmlVar.o();
            }
            hmlVar.o();
            dthx.b(str, null, j, 0L, new kbw(1), null, 0L, null, 0L, 0, false, 0, 0, null, jyqVar, hmlVar, 0, 0, 65514);
            hmlVar.n();
        }
        return fctx.a;
    }
}
