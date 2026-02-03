package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlgp implements fdau {
    final /* synthetic */ float a;
    final /* synthetic */ fdat b;
    final /* synthetic */ icc c;

    public dlgp(float f, icc iccVar, fdat fdatVar) {
        this.a = f;
        this.c = iccVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((String) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            float f = this.a;
            ico icoVar = ics.e;
            ics icsVarC = egq.c(efy.j(icoVar, f, 0.0f, 0.0f, 0.0f, 10), 1.0f);
            icc iccVar = this.c;
            fdat fdatVar = this.b;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVar, 0);
            int iA = dlgo.a(hmg.b(hmlVar));
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
            fdat fdatVar2 = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar2);
            fdat fdatVar3 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar3);
            fdat fdatVar4 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar4);
            }
            fdat fdatVar5 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar5);
            egp egpVar = egp.a;
            egt.a(egpVar.a(egq.e(icoVar, 1.0f), 1.0f, true), hmlVar);
            ics icsVarB2 = egpVar.b(icoVar, iccVar);
            ixm ixmVarA2 = ecz.a(ibw.a, false);
            int iA2 = dlgo.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB3 = icj.b(hmlVar, icsVarB2);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar2);
            hsk.b(hmlVar, hxiVarN2, fdatVar3);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar4);
            }
            hsk.b(hmlVar, icsVarB3, fdatVar5);
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
