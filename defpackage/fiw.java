package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiw {
    public static final int a(fctc fctcVar) {
        return ((Number) fctcVar.a()).intValue();
    }

    public static final fik b(fik fikVar, fij fijVar, int i) {
        return new fik(fijVar.f.t(i), i, fikVar.b);
    }

    public static final fik c(final fjz fjzVar, final fij fijVar, fik fikVar) {
        final int i = fjzVar.l() ? fijVar.c : fijVar.d;
        if ((fjzVar.l() ? fjzVar.c() : fjzVar.a()) != fijVar.b) {
            return fijVar.b(i);
        }
        final fctc fctcVarB = fctd.b(3, new fdae() { // from class: fiu
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(fijVar.f.h(i));
            }
        });
        final int i2 = fjzVar.l() ? fijVar.d : fijVar.c;
        fctc fctcVarB2 = fctd.b(3, new fdae() { // from class: fiv
            @Override // defpackage.fdae
            public final Object invoke() {
                fij fijVar2 = fijVar;
                jyi jyiVar = fijVar2.f;
                int i3 = i;
                fjz fjzVar2 = fjzVar;
                int iA = fiw.a(fctcVarB);
                boolean zL = fjzVar2.l();
                int iO = fjzVar2.o();
                long jL = jyiVar.l(i3);
                int iE = jyiVar.h(jyo.e(jL)) == iA ? jyo.e(jL) : iA >= jyiVar.f() ? jyiVar.j(jyiVar.f() - 1) : jyiVar.j(iA);
                int iA2 = jyiVar.h(jyo.a(jL)) == iA ? jyo.a(jL) : iA >= jyiVar.f() ? jyiVar.g(jyiVar.f() - 1, false) : jyiVar.g(iA, false);
                int i4 = i2;
                if (iE == i4) {
                    return fijVar2.b(iA2);
                }
                if (iA2 == i4) {
                    return fijVar2.b(iE);
                }
                if (!(zL ^ (iO == 1)) ? i3 >= iE : i3 > iA2) {
                    iE = iA2;
                }
                return fijVar2.b(iE);
            }
        });
        if (fijVar.a != fikVar.b) {
            return f(fctcVarB2);
        }
        int i3 = fijVar.e;
        if (i == i3) {
            return fikVar;
        }
        jyi jyiVar = fijVar.f;
        if (a(fctcVarB) != jyiVar.h(i3)) {
            return f(fctcVarB2);
        }
        int i4 = fikVar.a;
        long jL = jyiVar.l(i4);
        boolean zL = fjzVar.l();
        if (i3 != -1) {
            if (i != i3) {
                if (!(zL ^ (fijVar.f() == 1))) {
                }
            }
            return fijVar.b(i);
        }
        return (i4 == jyo.e(jL) || i4 == jyo.a(jL)) ? f(fctcVarB2) : fijVar.b(i);
    }

    public static final fil d(fjz fjzVar, fhx fhxVar) {
        boolean z = fjzVar.o() == 1;
        return new fil(e(fjzVar.i(), z, true, fjzVar.c(), fhxVar), e(fjzVar.f(), z, false, fjzVar.a(), fhxVar), z);
    }

    private static final fik e(fij fijVar, boolean z, boolean z2, int i, fhx fhxVar) {
        int i2 = z2 ? fijVar.c : fijVar.d;
        if (i != fijVar.b) {
            return fijVar.b(i2);
        }
        long jA = fhxVar.a(fijVar, i2);
        return fijVar.b(z ^ z2 ? jyo.e(jA) : jyo.a(jA));
    }

    private static final fik f(fctc fctcVar) {
        return (fik) fctcVar.a();
    }
}
