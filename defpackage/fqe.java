package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqe implements fdat {
    final /* synthetic */ fdat a;

    public fqe(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarJ = efy.j(ics.e, 20.0f, 0.0f, 20.0f, 0.0f, 10);
            fdat fdatVar = this.a;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVar, 48);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hmlVar.v(185708299);
            hmlVar.o();
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
