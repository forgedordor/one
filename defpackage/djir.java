package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djir {
    public static final void a(djcy djcyVar, final igr igrVar, final int i, final float f, final djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        igr igrVar2;
        float f2;
        final djcy djcyVar2 = djcyVar;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1897801932);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(djcyVar2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            igrVar2 = igrVar;
            i3 |= true != hmlVarC.D(igrVar2) ? 16 : 32;
        } else {
            igrVar2 = igrVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            f2 = f;
            i3 |= true != hmlVarC.A(f2) ? 1024 : 2048;
        } else {
            f2 = f;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.D(djgaVar) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            icc iccVar = ibw.o;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVarC, 48);
            int iA = djij.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            int i5 = i3;
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
            egp egpVar = egp.a;
            egt.a(egq.o(icoVar, 16.0f), hmlVarC);
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: djim
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        igx igxVar = (igx) obj2;
                        igxVar.getClass();
                        hoxVar.b(Boolean.valueOf(igxVar.b()));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            int i6 = i5 << 3;
            djcyVar2 = djcyVar;
            djco.m(egpVar, djcyVar2, igrVar2, i, f2, (fdap) objS2, djgaVar, hmlVarC, (i6 & 57344) | (i6 & 112) | 196614 | (i6 & 896) | (i6 & 7168) | ((i5 << 12) & 234881024), 96);
            djcv djcvVar = djcyVar2.a;
            hmlVarC.v(-896944166);
            djgx djgxVar = djcvVar.g;
            if (djgxVar != null) {
                ics icsVarI = efy.i(egq.e(icoVar, 48.0f), 16.0f, 0.0f, 2);
                ixm ixmVarA2 = ecz.a(ibw.e, false);
                int iA2 = djij.a(hmg.b(hmlVarC));
                hxi hxiVarAk2 = hmwVar.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVarI);
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
                djco.b(djgxVar, 12, hmlVarC, 48, 0);
                hmlVarC.n();
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djin
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djcy djcyVar3 = djcyVar2;
                    igr igrVar3 = igrVar;
                    int i7 = i;
                    float f3 = f;
                    djir.a(djcyVar3, igrVar3, i7, f3, djgaVar, (hml) obj2, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djcy djcyVar, int i, final float f, hml hmlVar, final int i2) {
        int i3;
        final int i4;
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(-410429381);
        if (i5 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.A(f) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            i4 = i;
        } else {
            i4 = i;
            gvk.c(null, evn.a, djco.o(false, false, true, djcyVar.d.g.b, i4, f, djit.VOICE_BUTTON_BACKGROUND_DEFAULT, true, hmlVarC), 0L, 0.0f, 0.0f, null, hxe.d(1314578560, new djio(djcyVar), hmlVarC), hmlVarC, 121);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djil
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    int i6 = i4;
                    int i7 = i2;
                    djir.b(djcyVar2, i6, f, (hml) obj, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(djcy djcyVar, int i, float f, final ics icsVar, final igr igrVar, final djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        igr igrVar2;
        djga djgaVar2;
        hml hmlVar2;
        djcy djcyVar2;
        final int i4;
        final float f2 = f;
        icsVar.getClass();
        int i5 = i2 & 6;
        hml hmlVarC = hmlVar.c(-320620138);
        if (i5 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.A(f2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            igrVar2 = igrVar;
            i3 |= true != hmlVarC.D(igrVar2) ? 8192 : 16384;
        } else {
            igrVar2 = igrVar;
        }
        if ((196608 & i2) == 0) {
            djgaVar2 = djgaVar;
            i3 |= true != hmlVarC.D(djgaVar2) ? 65536 : 131072;
        } else {
            djgaVar2 = djgaVar;
        }
        int i6 = i3;
        if ((74899 & i6) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            i4 = i;
            djcyVar2 = djcyVar;
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarD = efy.d(icsVar, 8.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.o, hmlVarC, 48);
            int iA = djij.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
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
            hmlVar2 = hmlVarC;
            djcyVar2 = djcyVar;
            djbb.b(egp.a, i, f, null, hxe.d(-2129439694, new djiq(djcyVar, i, f2, igrVar2, djgaVar2), hmlVarC), hmlVar2, (i6 & 112) | 24582 | (i6 & 896), 4);
            f2 = f;
            i4 = i;
            ico icoVar = ics.e;
            egt.a(egq.o(icoVar, 8.0f), hmlVar2);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.k, hmlVar2, 48);
            int iA2 = djij.a(hmg.b(hmlVar2));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVar2, icoVar);
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA2, fdatVar);
            hsk.b(hmlVar2, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVar2.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar2, icsVarB2, fdatVar4);
            b(djcyVar2, i4, f2, hmlVar2, i6 & 1022);
            hmlVar2.n();
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            final djcy djcyVar3 = djcyVar2;
            hpxVarL.d = new fdat() { // from class: djik
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar4 = djcyVar3;
                    int i7 = i4;
                    float f3 = f2;
                    ics icsVar2 = icsVar;
                    igr igrVar3 = igrVar;
                    djir.c(djcyVar4, i7, f3, icsVar2, igrVar3, djgaVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
