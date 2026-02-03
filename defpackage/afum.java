package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afum implements fdau {
    final /* synthetic */ afuh a;
    final /* synthetic */ sgd b;

    public afum(afuh afuhVar, sgd sgdVar) {
        this.a = afuhVar;
        this.b = sgdVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((egc) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1786587238);
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            afuh afuhVar = this.a;
            if (afuhVar.f.a) {
                icsVarC = icsVarC.a(dkl.a(icoVar, glz.a(hmlVar).F, ikj.a));
            }
            hmlVar.o();
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            afub.a(afuhVar.c, efy.c(ehm.b(edf.a.a(idb.a(icoVar, 3.0f), ibw.i), new efr(ehv.f(hmlVar), 32)), efy.h(0.0f, 0.0f, 16.0f, 17.0f, 3)), hmlVar, 0);
            afoa.b(afuhVar.e, idb.a(icoVar, 2.0f), hmlVar, 48);
            afun.a(afuhVar, hmlVar, 0);
            hmlVar.n();
            cuib.a(this.b, ije.g, false, null, hmlVar, 48, 12);
        }
        return fctx.a;
    }
}
