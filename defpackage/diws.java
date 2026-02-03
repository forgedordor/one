package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diws implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;

    public diws(djrr djrrVar, String str, long j) {
        this.a = djrrVar;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            djrr djrrVar = this.a;
            String str = this.b;
            long j = this.c;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
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
            dtfn.a(djrs.b(djrrVar, hmlVar), str, edf.a.a(egq.c(icoVar, 0.5f), ibw.e), j, hmlVar, 0, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
