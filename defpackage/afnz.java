package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnz implements fdat {
    final /* synthetic */ afns a;

    public afnz(afns afnsVar) {
        this.a = afnsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarB = egq.b(icoVar, 1.0f);
            afns afnsVar = this.a;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarB);
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
            hsk.b(hmlVar, icsVarB2, jbb.c);
            dloh dlohVar = afnsVar.d;
            hmlVar.v(552581132);
            boolean z = afnsVar.e.a;
            ije ijeVar = z ? new ije(glz.a(hmlVar).G) : null;
            hmlVar.o();
            dlor.c(dlohVar, null, null, null, false, ijeVar, hmlVar, 0, 30);
            afuz.a(afnsVar.b, true, z, hmlVar, 48, 0);
            ics icsVarB3 = edp.b(egq.d(icoVar, 1.0f), 1.0f, true);
            if (z) {
                hmlVar.v(-49195309);
                j = glz.a(hmlVar).F;
                hmlVar.o();
            } else {
                hmlVar.v(-49114244);
                j = glz.a(hmlVar).p;
                hmlVar.o();
            }
            egt.a(dkl.a(icsVarB3, j, ikj.a), hmlVar);
            afof.a(afnsVar.c, z, hmlVar, 0);
            hmlVar.n();
            afoa.a(dlohVar.b.k, hmlVar, 0);
        }
        return fctx.a;
    }
}
