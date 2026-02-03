package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gha implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ geq b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;

    public gha(String str, geq geqVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = geqVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            ico icoVar = ics.e;
            ics icsVarI = egq.i(icoVar, 40.0f, 40.0f);
            String str = this.a;
            geq geqVar = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarI);
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
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: ggz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarB2 = jsh.b(icoVar, (fdap) objF);
            long j = (z2 && z3) ? geqVar.p : z2 ? geqVar.q : (z && z3) ? geqVar.t : z3 ? geqVar.n : geqVar.o;
            hmlVar.v(-969418633);
            hsf hsfVarB = dcs.b(j, gpg.b(4, hmlVar), hmlVar, 0, 12);
            hmlVar.o();
            gyj.c(str, icsVarB2, ((ije) hsfVarB.a()).i, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 261112);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
