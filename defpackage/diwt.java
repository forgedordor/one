package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diwt {
    public static final void a(djrr djrrVar, final long j, final long j2, final String str, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        djrr djrrVar2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-430957240);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(str) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            djrrVar2 = djrrVar;
            hmlVar2 = hmlVarC;
        } else {
            djrrVar2 = djrrVar;
            hmlVar2 = hmlVarC;
            gvk.e(fdaeVar, joj.a(egq.c(ics.e, 1.0f), "BadgedIconButton"), false, evn.a, j, 0L, 0.0f, null, null, hxe.d(159993811, new diws(djrrVar2, str, j2), hmlVarC), hmlVar2, 996);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            final djrr djrrVar3 = djrrVar2;
            hpxVarL.d = new fdat() { // from class: diwm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar4 = djrrVar3;
                    long j3 = j;
                    long j4 = j2;
                    String str2 = str;
                    diwt.a(djrrVar4, j3, j4, str2, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final diwu diwuVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1714473042);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(diwuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarK = egq.k(icsVar, 48.0f);
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarK);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            djrr djrrVar = diwuVar.d;
            ije ijeVar = diwuVar.f;
            edf edfVar = edf.a;
            hmlVarC.v(1787491608);
            hmwVar.ab();
            ije ijeVar2 = diwuVar.e;
            hmlVarC.v(1787494252);
            hmwVar.ab();
            a(djrrVar, ijeVar.i, ijeVar2.i, diwuVar.c, diwuVar.h, hmlVarC, 0);
            hmlVarC.v(1787499319);
            int i5 = diwuVar.a;
            ije ijeVar3 = diwuVar.g;
            hmlVarC.v(1787503543);
            hmwVar.ab();
            ije ijeVar4 = diwuVar.b;
            hmlVarC.v(1787506331);
            hmwVar.ab();
            c(edfVar, i5, ijeVar3.i, ijeVar4.i, hmlVarC, 6);
            hmlVar2 = hmlVarC;
            hmwVar.ab();
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diwq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diwu diwuVar2 = diwuVar;
                    int i6 = i;
                    diwt.b(diwuVar2, icsVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ede edeVar, final int i, final long j, final long j2, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1177988554);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.C(j2) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarK = egq.k(edeVar.a(ics.e, ibw.c), 18.0f);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdau() { // from class: diwn
                    @Override // defpackage.fdau
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ixp ixpVar = (ixp) obj;
                        ixk ixkVar = (ixk) obj2;
                        ixpVar.getClass();
                        ixkVar.getClass();
                        final iyl iylVarE = ixkVar.e(((kil) obj3).a);
                        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: diwp
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj4) {
                                iyk iykVar = (iyk) obj4;
                                iykVar.getClass();
                                iykVar.s(iylVarE, 0, (int) kin.d(iykVar, -5.0f), 0.0f);
                                return fctx.a;
                            }
                        });
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            edj.a(dkl.a(iwl.a(icsVarK, (fdau) objS), j, evn.a), null, hxe.d(467993396, new diwr(i, j2), hmlVarC), hmlVarC, 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diwo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i5 = i;
                    long j3 = j;
                    diwt.c(edeVar2, i5, j3, j2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
