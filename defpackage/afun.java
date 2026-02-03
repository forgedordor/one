package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afun {
    public static final void a(final afuh afuhVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1750431852);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(afuhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djmn djmnVar = (djmn) hro.a(afuhVar.d, hmlVarC).a();
            hmlVarC.v(1462174654);
            if (!djmnVar.b.isEmpty()) {
                djmf.a(djmnVar, null, hmlVarC, 0);
            }
            ((hmw) hmlVarC).ab();
            gvk.c(null, null, 0L, 0L, 0.0f, 0.0f, null, hxe.d(-551607121, new aful(afuhVar), hmlVarC), hmlVarC, 127);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afui
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    afun.a(afuhVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final afuh afuhVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-426760287);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(afuhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            sgd sgdVarA = sgg.a(hmlVarC);
            hmlVarC.v(-2094734440);
            boolean z = afuhVar.f.a;
            long j = z ? ije.g : glz.a(hmlVarC).F;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            cuib.b(sgdVarA, j, false, null, hmlVarC, 0, 12);
            hmlVarC.v(-2094724477);
            ico icoVar = ics.e;
            ics icsVarB = ehm.b(egq.c(icoVar, 1.0f), new efr(ehv.f(hmlVarC), 15));
            if (!z) {
                icsVarB = icsVarB.a(dkl.a(icoVar, glz.a(hmlVarC).p, ikj.a));
            }
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: afuj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtl.a(jtoVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dtgq.a(jsh.c(icsVarB, false, (fdap) objS), null, null, null, null, 0, 0L, 0L, null, hxe.d(-564986960, new afum(afuhVar, sgdVarA), hmlVarC), hmlVar2, 805306368, 510);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afuk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    afun.b(afuhVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
