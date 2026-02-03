package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhd implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ fdat b;

    public hhd(String str, fdat fdatVar) {
        this.a = str;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final String str = this.a;
            ico icoVar = ics.e;
            boolean zD = hmlVar.D(str);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: hhc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jto jtoVar = (jto) obj3;
                        jtk.n(jtoVar, 1);
                        jtk.o(jtoVar, str);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarC = jsh.c(icoVar, false, (fdap) objF);
            fdat fdatVar = this.b;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
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
