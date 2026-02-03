package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcf implements fdat {
    final /* synthetic */ float a;
    final /* synthetic */ ikp b;
    final /* synthetic */ fdat c;

    public gcf(float f, ikp ikpVar, fdat fdatVar) {
        this.a = f;
        this.b = ikpVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final float f = this.a;
            ico icoVar = ics.e;
            boolean zA = hmlVar.A(f);
            final ikp ikpVar = this.b;
            boolean zD = zA | hmlVar.D(ikpVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: gce
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ikl iklVar = (ikl) obj3;
                        iklVar.a(f);
                        iklVar.A(ikpVar);
                        iklVar.r(true);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarA = ijn.a(icoVar, (fdap) objF);
            fdat fdatVar = this.c;
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
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
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
