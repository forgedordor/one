package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctoj {
    public static final void a(final String str, ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(1425569846);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
            icsVar2 = icsVar;
        } else {
            ico icoVar = ics.e;
            hmlVar2 = hmlVarC;
            dthx.a(new juo(str), efy.j(icoVar, 0.0f, 2.0f, 0.0f, 0.0f, 13), glz.a(hmlVarC).s, 0L, 0L, null, 0L, 2, false, 2, null, null, glz.d(hmlVarC).k, hmlVar2, 0, 3120, 55288);
            icsVar2 = icoVar;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctoh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i3 = i;
                    ctoj.a(str2, icsVar2, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(-1131826504);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            hmlVar2 = hmlVarC;
        } else {
            icsVar2 = ics.e;
            hmlVar2 = hmlVarC;
            dthx.a(new juo(str), icsVar2, glz.a(hmlVarC).q, 0L, 0L, null, 0L, 2, false, 1, null, null, glz.d(hmlVarC).j, hmlVar2, i3 & 112, 3120, 55288);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctoi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    ctoj.b(str2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ctoe ctoeVar, ics icsVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(-1616578040);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ctoeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = ics.e;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            hmlVarC.v(1246673099);
            ics icsVarA = z ? dkl.a(iex.a(efy.e(icsVar2, 12.0f, 14.0f), glz.c(hmlVarC).d), dljt.a(hmlVarC).F, ikj.a) : iex.a(efy.e(icsVar2, 8.0f, 2.0f), evn.b(24.0f));
            hmwVar.ab();
            ics icsVarC = dli.c(icsVarA, ebkVar, fsd.a(true, 0.0f, 6), false, null, null, ctoeVar.d, 28);
            if (!z) {
                icsVarC = icsVarC.a(efy.f(icsVar2, 8.0f, 12.0f, 8.0f, 12.0f));
            }
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = ctof.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            ics icsVarD = egq.d(icsVar2, 1.0f);
            if (z) {
                icsVarD = icsVarD.a(efy.e(icsVar2, 16.0f, 14.0f));
            }
            ixm ixmVarA2 = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA2 = ctof.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarD);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            egp egpVar = egp.a;
            dkqr.h(ctoeVar.c, egq.k(icsVar2, 40.0f), hmlVarC, 48);
            ics icsVarJ = efy.j(egpVar.a(icsVar2, 1.0f, true), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            ixm ixmVarA3 = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA3 = ctof.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icsVarJ);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            b(ctoeVar.a, null, hmlVarC, 0);
            a(ctoeVar.b, null, hmlVarC, 0);
            hmlVarC.n();
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ctog
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ctoe ctoeVar2 = ctoeVar;
                    ics icsVar3 = icsVar2;
                    int i4 = i;
                    ctoj.c(ctoeVar2, icsVar3, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
