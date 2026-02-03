package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctqz implements fdat {
    final /* synthetic */ ctqe a;

    public ctqz(ctqe ctqeVar) {
        this.a = ctqeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ctqe ctqeVar = this.a;
            ecj ecjVar = ecr.e;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecjVar, iccVar, hmlVar, 54);
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
            ctra.d(hmlVar, 0);
            egt.a(egq.o(icoVar, 16.0f), hmlVar);
            ctra.e(ctqeVar.a, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
