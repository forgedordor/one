package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxc implements fdau {
    final /* synthetic */ ctwr a;
    final /* synthetic */ hsf b;
    final /* synthetic */ sgd c;

    public ctxc(ctwr ctwrVar, sgd sgdVar, hsf hsfVar) {
        this.a = ctwrVar;
        this.c = sgdVar;
        this.b = hsfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((egc) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            ctwr ctwrVar = this.a;
            ctwq ctwqVar = ctwrVar.k;
            ics icsVarE = ctxd.e(icsVarC, ctwqVar.b, hmlVar);
            hsf hsfVar = this.b;
            iby ibyVar = ibw.a;
            ixm ixmVarA = ecz.a(ibyVar, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            fdvc fdvcVar = ctwrVar.e;
            edf edfVar = edf.a;
            hmlVar.v(-542251043);
            ics icsVarA = edfVar.a(idb.a(icoVar, 3.0f), ibw.i);
            hmlVar.v(-542250497);
            ics icsVarC2 = ctwqVar.a ? efy.c(ehm.b(icsVarA, new efr(ehv.f(hmlVar), 32)), efy.h(0.0f, 0.0f, 16.0f, 17.0f, 3)) : efy.c(ehr.a(icsVarA), efy.h(0.0f, 0.0f, 16.0f, 17.0f, 3));
            hmlVar.o();
            hmlVar.o();
            ctuy.a(fdvcVar, icsVarC2, hmlVar, 0);
            ctuo.n(ctwrVar.g, idb.a(icoVar, 2.0f), null, hmlVar, 48);
            ctxd.b(ctwrVar, edfVar.a(idb.a(icoVar, 1.0f), ibyVar), hmlVar, 0);
            dktt dkttVarA = ctxd.a(hsfVar);
            djmy djmyVar = dkttVarA instanceof djmy ? (djmy) dkttVarA : null;
            hmlVar.v(-542232604);
            if (djmyVar != null) {
                djmf.a(djmyVar, null, hmlVar, 0);
            }
            hmlVar.o();
            dktt dkttVarA2 = ctxd.a(hsfVar);
            divg divgVar = dkttVarA2 instanceof divg ? (divg) dkttVarA2 : null;
            hmlVar.v(-542230576);
            if (divgVar != null) {
                diuy.a(divgVar, null, hmlVar, 0, 2);
            }
            hmlVar.o();
            hmlVar.n();
            cuib.a(this.c, ije.g, false, null, hmlVar, 48, 12);
        }
        return fctx.a;
    }
}
