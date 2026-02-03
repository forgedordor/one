package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlft {
    public static final void a(final ics icsVar, hml hmlVar, final int i) {
        int i2 = (i | 6) & 3;
        hml hmlVarC = hmlVar.c(-194005086);
        if (i2 == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            evm evmVarB = evn.b(20.0f);
            ics icsVarC = dkr.c(dkl.a(egq.m(icsVar, 64.0f, 40.0f), glz.a(hmlVarC).n, evmVarB), 1.0f, glz.a(hmlVarC).a, evmVarB);
            ixm ixmVarA = ecz.a(ibw.e, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i3 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i3))) {
                Integer numValueOf = Integer.valueOf(i3);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dlpw.a(new dlpy(fcvo.a, null, new fdae() { // from class: dlpx
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }), egq.k(icsVar, 40.0f), glz.a(hmlVarC).a, hmlVarC, 54, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlfs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlft.a(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
