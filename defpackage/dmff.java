package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmff implements fdau {
    final /* synthetic */ kow a;
    final /* synthetic */ kow b;
    final /* synthetic */ dmhi c;

    public dmff(kow kowVar, kow kowVar2, dmhi dmhiVar) {
        this.a = kowVar;
        this.b = kowVar2;
        this.c = dmhiVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cyg cygVar = (cyg) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        cygVar.getClass();
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = ddq.a(1.0f);
            hmlVar.y(objF);
        }
        ddp ddpVar = (ddp) objF;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = ddq.a(0.5f);
            hmlVar.y(objF2);
        }
        ddp ddpVar2 = (ddp) objF2;
        hmlVar.o();
        ico icoVar = ics.e;
        ics icsVarC = egq.c(icoVar, 0.87f);
        kow kowVar = this.a;
        hmlVar.v(1849434622);
        Object objF3 = hmlVar.f();
        if (objF3 == obj4) {
            objF3 = dmfc.a;
            hmlVar.y(objF3);
        }
        hmlVar.o();
        ics icsVarA = idb.a(kph.d(icsVarC, kowVar, (fdap) objF3), 0.0f);
        ixm ixmVarA = ecz.a(ibw.a, false);
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
        edf edfVar = edf.a;
        ics icsVarC2 = egq.c(icoVar, 0.87f);
        float fFloatValue = ((Number) ddpVar.d()).floatValue();
        ics icsVarA2 = iex.a(edfVar.a(ifj.a(icsVarC2, fFloatValue, fFloatValue), ibw.e), evn.a);
        long j2 = glz.a(hmlVar).f;
        ecz.b(dkl.a(icsVarA2, ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), ((Number) ddpVar2.d()).floatValue(), ije.f(j2)), ikj.a), hmlVar, 0);
        hmlVar.n();
        hmlVar.v(1849434622);
        Object objF4 = hmlVar.f();
        if (objF4 == obj4) {
            objF4 = ddq.a(0.0f);
            hmlVar.y(objF4);
        }
        ddp ddpVar3 = (ddp) objF4;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF5 = hmlVar.f();
        if (objF5 == obj4) {
            objF5 = ddq.a(0.0f);
            hmlVar.y(objF5);
        }
        ddp ddpVar4 = (ddp) objF5;
        hmlVar.o();
        hmlVar.v(5004770);
        boolean zF = hmlVar.F(ddpVar3);
        Object objF6 = hmlVar.f();
        if (zF || objF6 == obj4) {
            objF6 = new dmfd(ddpVar3);
            hmlVar.y(objF6);
        }
        fdae fdaeVar2 = (fdae) objF6;
        hmlVar.o();
        kow kowVar2 = this.b;
        hmlVar.v(1849434622);
        Object objF7 = hmlVar.f();
        if (objF7 == obj4) {
            objF7 = dmfe.a;
            hmlVar.y(objF7);
        }
        hmlVar.o();
        dmig.a(fdaeVar2, idb.a(cygVar.b(ifi.a(kph.d(icoVar, kowVar2, (fdap) objF7), ((Number) ddpVar4.d()).floatValue()), dae.l(null, 3), dae.o(null, 0.0f, 0L, 7).a(dae.m(null, 3))), 1.0f), ijg.d(4293153105L), ijg.d(4294225516L), hmlVar, 28032);
        dmgk.d(ddpVar3, this.c.a(), ddpVar, ddpVar2, ddpVar4, hmlVar, 37384);
        return fctx.a;
    }
}
