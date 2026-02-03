package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djdu implements fdat {
    final /* synthetic */ kio a;
    final /* synthetic */ hox b;
    final /* synthetic */ Integer c;
    final /* synthetic */ int d;
    final /* synthetic */ djdy e;

    public djdu(kio kioVar, hox hoxVar, Integer num, int i, djdy djdyVar) {
        this.a = kioVar;
        this.b = hoxVar;
        this.c = num;
        this.d = i;
        this.e = djdyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final hox hoxVar = this.b;
            float f = djdx.a(hoxVar) == null ? 0.0f : 1.0f;
            hmlVar.v(-613693942);
            dljl dljlVar = dljt.d(hmlVar).q;
            dljl dljlVar2 = dljt.d(hmlVar).q;
            dia diaVar = new dia(150, 50, dljt.d(hmlVar).r.b);
            hmlVar.o();
            hsf hsfVarC = ddu.c(f, diaVar, null, hmlVar, 0, 28);
            kio kioVar = this.a;
            ics icsVarC = dpc.c(dkl.a(ien.a(iex.a(egq.u(egq.o(ics.e, kioVar.el(this.c.intValue())), 0.0f, kioVar.el(this.d), 1), evn.b(24.0f)), ((Number) hsfVarC.a()).floatValue()), glz.a(hmlVar).J, ikj.a), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            hmlVar.v(5004770);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: djdt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ivy ivyVar = (ivy) obj3;
                        ivyVar.getClass();
                        hoxVar.b(Integer.valueOf((int) (ivyVar.g() & 4294967295L)));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarA = ixy.a(icsVarC, (fdap) objF);
            djdy djdyVar = this.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
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
            hmlVar.v(-284158829);
            for (djia djiaVar : djdyVar.a) {
                if (djiaVar instanceof djhy) {
                    hmlVar.v(-284156306);
                    djdx.c((djhy) djiaVar, hmlVar, 0);
                    hmlVar.o();
                } else {
                    if (!(djiaVar instanceof djhz)) {
                        hmlVar.v(-284157659);
                        hmlVar.o();
                        throw new fctg();
                    }
                    hmlVar.v(-284154445);
                    djdx.d((djhz) djiaVar, hmlVar, 0);
                    hmlVar.o();
                }
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
