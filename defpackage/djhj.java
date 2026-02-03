package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhj {
    public static final void a(final boolean z, final fdae fdaeVar, final djdm djdmVar, final boolean z2, final djcy djcyVar, final djga djgaVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-883297753);
        hmw hmwVar = (hmw) hmlVarC;
        int i3 = hmwVar.z ? -hmwVar.u.s : hmwVar.s.h;
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(djdmVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(djgaVar) ? 65536 : 131072;
        }
        if ((66707 & i2) == 66706 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 >> 3;
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 4.0f, 0.0f, 2);
            if (z2) {
                icsVarI = icsVarI.a(cyi.b(icoVar));
            }
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = djgz.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(979617050);
            if (!z || djdmVar.f) {
                int i5 = (i4 & 112) | 6;
                hmlVarC.v(979900544);
                hmlVarC.v(-938221569);
                int i6 = (i2 >> 9) & 896;
                if (djdmVar.f) {
                    int i7 = i5 | i6;
                    int i8 = i3;
                    djco.j(djdi.c, djdmVar, djgaVar, false, null, false, 0, 0.0f, null, hmlVarC, i7, 504);
                    if (i8 >= 0) {
                        if (hmwVar.z) {
                            hre hreVar = hmwVar.u;
                            while (hmwVar.z) {
                                hmwVar.aa(hreVar.T(hreVar.s));
                            }
                        }
                        hqz hqzVar = hmwVar.s;
                        while (true) {
                            int i9 = hqzVar.h;
                            if (i9 <= i8) {
                                break;
                            } else {
                                hmwVar.aa(hqzVar.B(i9));
                            }
                        }
                    } else {
                        int i10 = -i8;
                        hre hreVar2 = hmwVar.u;
                        while (true) {
                            int i11 = hreVar2.s;
                            if (i11 <= i10) {
                                break;
                            } else {
                                hmwVar.aa(hreVar2.T(i11));
                            }
                        }
                    }
                    hpx hpxVarL = hmlVarC.L();
                    if (hpxVarL != null) {
                        hpxVarL.d = new fdat() { // from class: djhc
                            @Override // defpackage.fdat
                            public final Object a(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                boolean z3 = z;
                                fdae fdaeVar3 = fdaeVar;
                                djdm djdmVar2 = djdmVar;
                                boolean z4 = z2;
                                djcy djcyVar2 = djcyVar;
                                djhj.a(z3, fdaeVar3, djdmVar2, z4, djcyVar2, djgaVar, (hml) obj, hpy.a(i | 1));
                                return fctx.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                hmwVar.ab();
                int i12 = i5 | i6;
                djco.j(djdi.e, djdmVar, djgaVar, false, null, false, 0, 0.0f, null, hmlVarC, i12, 504);
                djco.j(djdi.c, djdmVar, djgaVar, false, null, false, 0, 0.0f, null, hmlVarC, i12, 504);
                hmwVar.ab();
            } else {
                hmlVarC.v(979651397);
                dtfk.b(fdaeVar, null, false, null, null, djat.a, hmlVarC, (i4 & 14) | 1572864, 62);
                hmlVarC = hmlVarC;
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: djhd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    fdae fdaeVar3 = fdaeVar;
                    djdm djdmVar2 = djdmVar;
                    boolean z4 = z2;
                    djcy djcyVar2 = djcyVar;
                    djhj.a(z3, fdaeVar3, djdmVar2, z4, djcyVar2, djgaVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djcy djcyVar, final djfn djfnVar, final djdm djdmVar, final int i, final float f, final boolean z, final boolean z2, final ics icsVar, final igr igrVar, final djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        float f2;
        hml hmlVar2;
        hmw hmwVar;
        boolean z3;
        hml hmlVar3;
        icsVar.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-719282317);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(djfnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(djdmVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            f2 = f;
            i3 |= true != hmlVarC.A(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != hmlVarC.D(igrVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i2) == 0) {
            i3 |= true != hmlVarC.D(djgaVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i3) == 306783378 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar3 = hmlVarC;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar2.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar2.ab();
            hmlVarC.v(259442044);
            if (((Boolean) hoxVar.a()).booleanValue()) {
                djjn djjnVar = djdmVar.b;
                if (djjnVar == null) {
                    throw new IllegalArgumentException("No way to handle recording events.");
                }
                hmwVar = hmwVar2;
                djgw.j(djjnVar.a, djjnVar.c, i, f2, icsVar, hmlVarC, ((i3 >> 9) & 57344) | ((i3 >> 3) & 8064));
                hmlVar2 = hmlVarC;
            } else {
                hmlVar2 = hmlVarC;
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            ics icsVarI = !((Boolean) hoxVar.a()).booleanValue() ? efy.i(icsVar, 0.0f, 8.0f, 1) : egq.k(ics.e, 0.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar2, 0);
            int iA = djgz.a(hmg.b(hmlVar2));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVar2, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar2, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar2, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVar2.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar2, icsVarB, fdatVar4);
            icc iccVar = ibw.o;
            ico icoVar = ics.e;
            ixm ixmVarA2 = egk.a(ecr.a, iccVar, hmlVar2, 48);
            int iA2 = djgz.a(hmg.b(hmlVar2));
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
            djcv djcvVar = djcyVar.a;
            hmlVar2.v(5004770);
            CharSequence charSequence = djcvVar.b;
            boolean zD = hmlVar2.D(charSequence);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                z3 = false;
                hpl hplVar2 = new hpl(false, hsi.a);
                hmwVar.af(hplVar2);
                objS2 = hplVar2;
            } else {
                z3 = false;
            }
            final hox hoxVar2 = (hox) objS2;
            hmwVar.ab();
            hmlVar2.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar3 = new hpl(Boolean.valueOf(z3), hsi.a);
                hmwVar.af(hplVar3);
                objS3 = hplVar3;
            }
            hox hoxVar3 = (hox) objS3;
            hmwVar.ab();
            boolean z4 = (charSequence.length() <= 0 || ((Boolean) hoxVar2.a()).booleanValue()) ? z3 : true;
            hmlVar2.v(5004770);
            boolean zD2 = hmlVar2.D(hoxVar2);
            Object objS4 = hmwVar.S();
            if (zD2 || objS4 == obj) {
                objS4 = new fdae() { // from class: djhe
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hoxVar2.b(true);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            hml hmlVar4 = hmlVar2;
            a(z4, (fdae) objS4, djdmVar, ((Boolean) hoxVar3.a()).booleanValue(), djcyVar, djgaVar, hmlVar4, (i3 & 896) | ((i3 << 12) & 57344) | (458752 & (i3 >> 12)));
            int i5 = i3 >> 6;
            hmlVar3 = hmlVar4;
            djaw.b(djcyVar.c, i, f, false, hxe.d(-1843359870, new djhi(djcyVar, z, i, f, igrVar, djgaVar, djfnVar, djdmVar, hoxVar, z2, hoxVar3), hmlVar4), hmlVar3, (i5 & 112) | 24576 | (i5 & 896), 8);
            hmlVar3.n();
            hmlVar3.n();
        }
        hpx hpxVarL = hmlVar3.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djhf
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djcy djcyVar2 = djcyVar;
                    djfn djfnVar2 = djfnVar;
                    djdm djdmVar2 = djdmVar;
                    int i6 = i;
                    float f3 = f;
                    boolean z5 = z;
                    boolean z6 = z2;
                    ics icsVar2 = icsVar;
                    igr igrVar2 = igrVar;
                    djhj.b(djcyVar2, djfnVar2, djdmVar2, i6, f3, z5, z6, icsVar2, igrVar2, djgaVar, (hml) obj2, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final djcy djcyVar, final djfn djfnVar, final djdm djdmVar, final hox hoxVar, final boolean z, final int i, final djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        djcy djcyVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(2004228756);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(djfnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(djdmVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(hoxVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.E(z) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != hmlVarC.D(djgaVar) ? 524288 : 1048576;
        }
        if ((599187 & i3) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
            djcyVar2 = djcyVar;
        } else {
            int i5 = i3 << 3;
            int i6 = i3 >> 12;
            int i7 = i3 >> 3;
            int i8 = (i7 & 112) | 6;
            hmlVarC.v(1918495494);
            int i9 = i6 & 896;
            int i10 = 458752 & i5;
            int i11 = 3670016 & i5;
            if (djdmVar.f) {
                djco.j(djdi.d, djdmVar, djgaVar, false, null, z, i, 0.0f, null, hmlVarC, i8 | i9 | i10 | i11, 408);
                ibx ibxVar = ibw.k;
                ico icoVar = ics.e;
                ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
                int iA = djgz.a(hmg.b(hmlVarC));
                hmw hmwVar = (hmw) hmlVarC;
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icoVar);
                fdae fdaeVar = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA, jbb.e);
                hsk.b(hmlVarC, hxiVarAk, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                    Integer numValueOf = Integer.valueOf(iA);
                    hmwVar.af(numValueOf);
                    hmlVarC.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVarC, icsVarB, jbb.c);
                djco.b(djcyVar.a.g, 0, hmlVarC, 0, 2);
                djes.c(djcyVar.d, false, false, null, hmlVarC, 0, 14);
                hmlVarC.n();
                hmwVar.ab();
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: djha
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            djcy djcyVar3 = djcyVar;
                            djfn djfnVar2 = djfnVar;
                            djdm djdmVar2 = djdmVar;
                            hox hoxVar2 = hoxVar;
                            boolean z2 = z;
                            int i12 = i;
                            djhj.c(djcyVar3, djfnVar2, djdmVar2, hoxVar2, z2, i12, djgaVar, (hml) obj, hpy.a(i2 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            int i12 = i8 | i9;
            djfm.a(djfnVar, hmlVarC, i7 & 14);
            int i13 = i12 | i10 | i11;
            djcyVar2 = djcyVar;
            djco.j(djdi.d, djdmVar, djgaVar, false, null, z, i, 0.0f, null, hmlVarC, i13, 408);
            djew djewVar = djcyVar2.d;
            if ((!djewVar.g.a || djcyVar2.a()) && !((Boolean) hoxVar.a()).booleanValue()) {
                hmlVarC.v(-655229167);
                ibx ibxVar2 = ibw.k;
                ico icoVar2 = ics.e;
                ixm ixmVarA2 = edl.a(ecr.c, ibxVar2, hmlVarC, 48);
                int iA2 = djgz.a(hmg.b(hmlVarC));
                hxi hxiVarAk2 = hmwVar2.ak();
                ics icsVarB2 = icj.b(hmlVarC, icoVar2);
                fdae fdaeVar2 = jbb.a;
                hmlVarC.x();
                if (hmwVar2.z) {
                    hmlVarC.j(fdaeVar2);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA2, jbb.e);
                hsk.b(hmlVarC, hxiVarAk2, jbb.d);
                fdat fdatVar2 = jbb.f;
                if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA2))) {
                    Integer numValueOf2 = Integer.valueOf(iA2);
                    hmwVar2.af(numValueOf2);
                    hmlVarC.h(numValueOf2, fdatVar2);
                }
                hsk.b(hmlVarC, icsVarB2, jbb.c);
                djco.b(djcyVar2.a.g, 0, hmlVarC, 0, 2);
                djes.c(djewVar, false, false, null, hmlVarC, 0, 14);
                hmlVarC = hmlVarC;
                hmlVarC.n();
                hmwVar2.ab();
            } else {
                hmlVarC.v(-655396660);
                djco.j(djdi.f, djdmVar, djgaVar, false, hoxVar, false, 0, 0.0f, null, hmlVarC, i12 | (57344 & i5), 488);
                hmwVar2.ab();
            }
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            final djcy djcyVar3 = djcyVar2;
            hpxVarL2.d = new fdat() { // from class: djhb
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar4 = djcyVar3;
                    djfn djfnVar2 = djfnVar;
                    djdm djdmVar2 = djdmVar;
                    hox hoxVar2 = hoxVar;
                    boolean z2 = z;
                    int i14 = i;
                    djhj.c(djcyVar4, djfnVar2, djdmVar2, hoxVar2, z2, i14, djgaVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
