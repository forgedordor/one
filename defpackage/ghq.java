package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghq implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ geq b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;

    public ghq(String str, geq geqVar, boolean z, boolean z2, boolean z3) {
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
            ics icsVarD = egq.d(icoVar, 1.0f);
            String str = this.a;
            geq geqVar = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
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
                objF = new fdap() { // from class: ghp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gyj.c(str, jsh.b(icoVar, (fdap) objF), ((ije) dcs.b((z2 && z3) ? geqVar.j : z2 ? geqVar.k : (z && z3) ? geqVar.i : z3 ? geqVar.g : geqVar.h, gpg.b(4, hmlVar), hmlVar, 0, 12).a()).i, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 261112);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
