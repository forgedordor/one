package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwji implements fdau {
    final /* synthetic */ cwjf a;

    public cwji(cwjf cwjfVar) {
        this.a = cwjfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwjf cwjfVar = this.a;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hmlVar.v(-1094448005);
            ekqh it = cwjfVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                cwim cwimVar = (cwim) it.next();
                djvo.a(cwimVar.a, null, hmlVar, 0, 2);
                dizj dizjVar = cwimVar.b;
                hmlVar.v(-1094444417);
                if (dizjVar != null) {
                    dizi.a(dizjVar, joj.a(egq.e(efy.f(egq.d(icoVar, 1.0f), 16.0f, 14.0f, 24.0f, 14.0f), 110.0f), "actionItemThumbnail"), hmlVar, 0);
                }
                hmlVar.o();
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
