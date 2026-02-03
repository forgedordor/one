package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ditf implements fdau {
    final /* synthetic */ ditl a;
    final /* synthetic */ fdae b;
    final /* synthetic */ fdat c;

    public ditf(ditl ditlVar, fdae fdaeVar, fdat fdatVar) {
        this.a = ditlVar;
        this.b = fdaeVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        eve eveVar;
        long j;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            float f = true != ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() ? 4.0f : 8.0f;
            ics icsVarJ = efy.j(ics.e, f, f, f, 0.0f, 8);
            final ditl ditlVar = this.a;
            hmlVar.v(346681694);
            int iOrdinal = ditlVar.ordinal();
            if (iOrdinal == 0) {
                hmlVar.v(-1846337383);
                if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue()) {
                    hmlVar.v(-1401831757);
                    eveVar = glz.c(hmlVar).e;
                    hmlVar.o();
                } else {
                    hmlVar.v(-1401777352);
                    eveVar = glz.c(hmlVar).d;
                    hmlVar.o();
                }
                hmlVar.o();
            } else {
                if (iOrdinal != 1) {
                    hmlVar.v(-1846338837);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(-1846330936);
                eveVar = glz.c(hmlVar).e;
                hmlVar.o();
            }
            eve eveVar2 = eveVar;
            hmlVar.o();
            hmlVar.v(-2065540061);
            hmlVar.v(-709102970);
            boolean zBooleanValue = ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue();
            hmlVar.o();
            if (zBooleanValue) {
                hmlVar.v(-507318357);
                j = glz.a(hmlVar).F;
                hmlVar.o();
            } else {
                hmlVar.v(-709099526);
                boolean zH = dljt.h(hmlVar);
                hmlVar.o();
                if (zH) {
                    hmlVar.v(-507223466);
                    j = dljt.f(hmlVar).Q;
                    hmlVar.o();
                } else {
                    hmlVar.v(-507176408);
                    j = glz.a(hmlVar).I;
                    hmlVar.o();
                }
            }
            hmlVar.o();
            hmlVar.v(1596922893);
            hmlVar.v(1339577284);
            boolean z = false;
            if (!((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() && dljt.h(hmlVar)) {
                z = true;
            }
            hmlVar.o();
            float f2 = true != z ? 0.0f : 1.0f;
            hmlVar.o();
            hmlVar.v(-1633490746);
            boolean zB = hmlVar.B(ditlVar.ordinal());
            final fdae fdaeVar = this.b;
            boolean zD = zB | hmlVar.D(fdaeVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: dite
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        if (ditlVar == ditl.b) {
                            fdaeVar.invoke();
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            gvk.e((fdae) objF, icsVarJ, false, eveVar2, j, 0L, f2, null, null, this.c, hmlVar, 868);
        }
        return fctx.a;
    }
}
