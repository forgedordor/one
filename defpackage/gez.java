package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gez implements fdat {
    final /* synthetic */ fdau a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdat c;

    public gez(fdau fdauVar, fdat fdatVar, fdat fdatVar2) {
        this.a = fdauVar;
        this.b = fdatVar;
        this.c = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            fdau fdauVar = this.a;
            fdat fdatVar = this.b;
            fdat fdatVar2 = this.c;
            ecj ecjVar = ecr.g;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecjVar, ibw.j, hmlVar, 6);
            int iA = hmg.a(hmlVar);
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
            fdat fdatVar3 = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar3);
            fdat fdatVar4 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar4);
            fdat fdatVar5 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar5);
            }
            fdat fdatVar6 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar6);
            edp edpVar = edp.a;
            ics icsVarB2 = edp.b(icoVar, 1.0f, false);
            iby ibyVar = ibw.a;
            ixm ixmVarA2 = ecz.a(ibyVar, false);
            int iA2 = hmg.a(hmlVar);
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB3 = icj.b(hmlVar, icsVarB2);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar3);
            hsk.b(hmlVar, hxiVarN2, fdatVar4);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar5);
            }
            hsk.b(hmlVar, icsVarB3, fdatVar6);
            fdauVar.a(edpVar, hmlVar, 6);
            hmlVar.n();
            ics icsVarC = efy.c(edp.a(icoVar, ibw.l), gfb.a);
            ixm ixmVarA3 = ecz.a(ibyVar, false);
            int iA3 = hmg.a(hmlVar);
            hxi hxiVarN3 = hmlVar.N();
            ics icsVarB4 = icj.b(hmlVar, icsVarC);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA3, fdatVar3);
            hsk.b(hmlVar, hxiVarN3, fdatVar4);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmlVar.y(numValueOf3);
                hmlVar.h(numValueOf3, fdatVar5);
            }
            hsk.b(hmlVar, icsVarB4, fdatVar6);
            hjt.a(gdd.g(26, hmlVar), hct.a(10, hmlVar), hxe.d(-1103927529, new gey(fdatVar, fdatVar2), hmlVar), hmlVar, 384);
            hmlVar.n();
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
