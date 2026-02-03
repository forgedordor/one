package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctqy implements fdat {
    final /* synthetic */ ctqe a;

    public ctqy(ctqe ctqeVar) {
        this.a = ctqeVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            kji kjiVar = (kji) hmlVar.e(jmh.j);
            ctqe ctqeVar = this.a;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVar, 0);
            int iA = ctqx.a(hmg.b(hmlVar));
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
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            egt.a(egq.o(icoVar, 16.0f), hmlVar);
            ics icsVarA = egq.a(icoVar, 64.0f, 48.0f);
            ixm ixmVarA2 = ecz.a(ibw.e, false);
            int iA2 = ctqx.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarA);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar4);
            egc egcVar = dtdc.a;
            egc egcVar2 = dtdc.b;
            float fB = egcVar2.b(kjiVar);
            float fA = efy.a(egcVar2, kjiVar);
            egd egdVar = (egd) egcVar2;
            dthx.b(ctqeVar.b, efy.f(icoVar, fB, egdVar.a, fA, egdVar.b), ctra.i(hmlVar), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 65528);
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
