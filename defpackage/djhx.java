package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhx {
    public static final void a(final djcy djcyVar, final djdm djdmVar, final djga djgaVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2123332100);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djdmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(djgaVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = djcyVar.a.b.length() == 0;
            dljn dljnVarD = dljt.d(hmlVarC);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                dljl dljlVar = dljnVarD.q;
                objS = dea.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, dljnVarD.r.f, 2);
                hmwVar.af(objS);
            }
            dia diaVar = (dia) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                dljl dljlVar2 = dljnVarD.q;
                objS2 = dea.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, dljnVarD.r.f, 2);
                hmwVar.af(objS2);
            }
            dia diaVar2 = (dia) objS2;
            hmwVar.ab();
            ibx ibxVar = ibw.k;
            dap dapVarJ = dae.j(diaVar, ibxVar, 8);
            dljl dljlVar3 = dljnVarD.q;
            dljm dljmVar = dljnVarD.r;
            cye.b(z, null, dapVarJ.a(dae.n(dea.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, dljmVar.f, 2), 0.0f, 0L, 6)), dae.p(diaVar2, ibxVar, 8).a(dae.o(dea.c(100, 0, dljmVar.b, 2), 0.0f, 0L, 6)), null, hxe.d(353635364, new djhw(djdmVar, djgaVar, diaVar, diaVar2), hmlVarC), hmlVarC, 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djhl
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    djcy djcyVar2 = djcyVar;
                    djdm djdmVar2 = djdmVar;
                    int i4 = i;
                    djhx.a(djcyVar2, djdmVar2, djgaVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(djcy djcyVar, final djfn djfnVar, djdm djdmVar, final boolean z, final int i, final float f, final igr igrVar, djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ico icoVar;
        egp egpVar;
        fdat fdatVar;
        fdae fdaeVar;
        hml hmlVar2;
        eci eciVar;
        final djcy djcyVar2 = djcyVar;
        djdm djdmVar2 = djdmVar;
        djga djgaVar2 = djgaVar;
        int i7 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1134096636);
        if (i7 == 0) {
            i3 = (true != hmlVarC.D(djcyVar2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(djfnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(djdmVar2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.A(f) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != hmlVarC.D(igrVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != hmlVarC.D(djgaVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i8 = i3;
        if ((i8 & 4793491) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i9 = i8 >> 15;
            int i10 = i8 >> 3;
            icc iccVar = ibw.o;
            ico icoVar2 = ics.e;
            eci eciVar2 = ecr.a;
            ixm ixmVarA = egk.a(eciVar2, iccVar, hmlVarC, 48);
            int iA = djhk.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar2);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar2 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar2);
            fdat fdatVar3 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar3);
            fdat fdatVar4 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar4);
            }
            int i11 = i10 & 112;
            int i12 = i11 | 3078;
            int i13 = i9 & 896;
            fdat fdatVar5 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar5);
            boolean z2 = djdmVar2.f;
            egp egpVar2 = egp.a;
            if (z2 || djdmVar2.d == null) {
                i4 = i13;
                i5 = i11;
                i6 = i12;
                icoVar = icoVar2;
                egpVar = egpVar2;
                fdatVar = fdatVar5;
                fdaeVar = fdaeVar2;
                hmlVar2 = hmlVarC;
                eciVar = eciVar2;
                hmlVar2.v(1101504740);
                egt.a(egq.o(icoVar, 16.0f), hmlVar2);
                hmwVar.ab();
            } else {
                hmlVarC.v(1101567515);
                int i14 = i12 | i13;
                icoVar = icoVar2;
                i4 = i13;
                fdaeVar = fdaeVar2;
                i5 = i11;
                fdatVar = fdatVar5;
                eciVar = eciVar2;
                i6 = i12;
                egpVar = egpVar2;
                djco.j(djdi.e, djdmVar2, djgaVar2, true, null, false, 0, 0.0f, null, hmlVarC, i14, 496);
                hmlVar2 = hmlVarC;
                hmwVar.ab();
            }
            ics icsVarU = egq.u(egpVar.a(icoVar, 1.0f, true), djbc.a(hmlVar2), 0.0f, 2);
            ixm ixmVarA2 = ecz.a(ibw.d, false);
            int iA2 = djhk.a(hmg.b(hmlVar2));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVar2, icsVarU);
            hmlVar2.x();
            egp egpVar3 = egpVar;
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA2, fdatVar2);
            hsk.b(hmlVar2, hxiVarAk2, fdatVar3);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVar2.h(numValueOf2, fdatVar4);
            }
            hsk.b(hmlVar2, icsVarB2, fdatVar);
            ixm ixmVarA3 = egk.a(eciVar, ibw.m, hmlVar2, 0);
            int iA3 = djhk.a(hmg.b(hmlVar2));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVar2, icoVar);
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA3, fdatVar2);
            hsk.b(hmlVar2, hxiVarAk3, fdatVar3);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVar2.h(numValueOf3, fdatVar4);
            }
            hsk.b(hmlVar2, icsVarB3, fdatVar);
            int i15 = i8 << 3;
            djcyVar2 = djcyVar;
            hmlVarC = hmlVar2;
            djco.m(egpVar3, djcyVar2, igrVar, i, f, null, djgaVar, hmlVarC, (i15 & 112) | 6 | ((i8 >> 12) & 896) | (i10 & 7168) | (57344 & i10) | (i15 & 234881024), 112);
            hmlVarC.n();
            hmlVarC.n();
            int i16 = i8 << 6;
            djdmVar2 = djdmVar;
            djgaVar2 = djgaVar;
            djco.j(djdi.d, djdmVar2, djgaVar2, true, null, z, i, 0.0f, null, hmlVarC, (458752 & i16) | i6 | i4 | (i16 & 3670016), 400);
            a(djcyVar2, djdmVar2, djgaVar2, hmlVarC, (i8 & 14) | i5 | i4);
            djfm.a(djfnVar, hmlVarC, i10 & 14);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final djdm djdmVar3 = djdmVar2;
            final djga djgaVar3 = djgaVar2;
            hpxVarL.d = new fdat() { // from class: djhq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar3 = djcyVar2;
                    djfn djfnVar2 = djfnVar;
                    djdm djdmVar4 = djdmVar3;
                    boolean z3 = z;
                    int i17 = i;
                    float f2 = f;
                    igr igrVar2 = igrVar;
                    djhx.b(djcyVar3, djfnVar2, djdmVar4, z3, i17, f2, igrVar2, djgaVar3, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final djcy djcyVar, final djdm djdmVar, final int i, final float f, final hox hoxVar, hml hmlVar, final int i2) {
        int i3;
        djdm djdmVar2;
        float f2;
        hox hoxVar2;
        hmw hmwVar;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1544238733);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            djdmVar2 = djdmVar;
            i3 |= true != hmlVarC.D(djdmVar2) ? 16 : 32;
        } else {
            djdmVar2 = djdmVar;
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
            hoxVar2 = hoxVar;
            i3 |= true != hmlVarC.D(hoxVar2) ? 8192 : 16384;
        } else {
            hoxVar2 = hoxVar;
        }
        if ((i3 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ibx ibxVar = ibw.k;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            int iA = djhk.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            djcr djcrVar = djcyVar.e;
            hmlVarC.v(-1133206217);
            if (djcrVar != null) {
                String str = djcrVar.a;
                hmwVar = hmwVar2;
                djco.i(str, i, null, true, hmlVarC, ((i3 >> 3) & 112) | 3072, 4);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            djcv djcvVar = djcyVar.a;
            hmlVarC.v(-1133200349);
            djgx djgxVar = djcvVar.g;
            if (djgxVar != null) {
                djco.b(djgxVar, 12, hmlVarC, 48, 0);
                egt.a(egq.e(icoVar, 4.0f), hmlVarC);
            }
            hmwVar.ab();
            d(djcyVar, djdmVar2, i, f2, hoxVar2, hmlVarC, i3 & 65534);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djho
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    djdm djdmVar3 = djdmVar;
                    int i5 = i;
                    float f3 = f;
                    djhx.c(djcyVar2, djdmVar3, i5, f3, hoxVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djcy djcyVar, final djdm djdmVar, final int i, final float f, final hox hoxVar, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(2049166182);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(djdmVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.D(hoxVar) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            djew djewVar = djcyVar.d;
            hmlVarC.v(5004770);
            int i5 = i3 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i5 == 4 || objS == hmk.a) {
                objS = new hpl(Boolean.valueOf(djcyVar.a()), hsi.a);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            boolean z = true;
            boolean z2 = djdmVar.f;
            boolean zBooleanValue = ((Boolean) ((hox) objS).a()).booleanValue();
            djdl djdlVar = djdmVar.h;
            djjn djjnVar = djdmVar.b;
            if (djjnVar != null) {
                z = djjnVar.b;
            }
            boolean z3 = z;
            djit djitVar = djdlVar.a;
            djev djevVar = djewVar.g;
            long jO = djco.o(z2, djevVar.a, zBooleanValue, djevVar.b, i, f, djitVar, z3, hmlVarC);
            dljl dljlVar = dljt.d(hmlVarC).q;
            gvk.c(null, evn.a, ((ije) dcs.b(jO, dea.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, dljt.d(hmlVarC).r.d, 2), hmlVarC, 0, 12).a()).i, 0L, 0.0f, 0.0f, null, hxe.d(-889257365, new djhr(djcyVar, djdmVar, hoxVar), hmlVarC), hmlVarC, 121);
            hmlVar2 = hmlVarC;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djhn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    djdm djdmVar2 = djdmVar;
                    int i6 = i;
                    float f2 = f;
                    djhx.d(djcyVar2, djdmVar2, i6, f2, hoxVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final djcy djcyVar, final djdm djdmVar, final djfn djfnVar, final igr igrVar, final boolean z, final int i, final float f, final boolean z2, final djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1550743378);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(djdmVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.D(djfnVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(igrVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.E(z) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= true != hmlVarC.A(f) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != hmlVarC.D(djgaVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i3) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = fdbq.f(igrVar, igr.a) ? new igr() : igrVar;
                hmwVar.af(objS);
            }
            igr igrVar2 = (igr) objS;
            hmwVar.ab();
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = djhk.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            int i5 = i3;
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
            int i6 = i5 >> 12;
            djco.k(djcyVar.c, true != ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() ? 0 : i, f, true, hmlVarC, (i6 & 896) | 3072, 0);
            djco.h(djcyVar.b, z, i, f, hmlVarC, (i5 >> 9) & 8176);
            int i7 = i5 >> 3;
            b(djcyVar, djfnVar, djdmVar, z2, i, f, igrVar2, djgaVar, hmlVarC, (i6 & 7168) | (i5 & 14) | 1572864 | (i7 & 112) | ((i5 << 3) & 896) | (57344 & i7) | (458752 & i7) | (29360128 & i7));
            hmlVarC = hmlVarC;
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djhm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    djdm djdmVar2 = djdmVar;
                    djfn djfnVar2 = djfnVar;
                    igr igrVar3 = igrVar;
                    boolean z3 = z;
                    int i8 = i;
                    float f2 = f;
                    boolean z4 = z2;
                    djhx.e(djcyVar2, djdmVar2, djfnVar2, igrVar3, z3, i8, f2, z4, djgaVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final djcy djcyVar, final djfn djfnVar, final djdm djdmVar, final int i, final float f, final boolean z, final ics icsVar, final igr igrVar, final boolean z2, final djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        hml hmlVar3;
        icsVar.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-407077583);
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
            i3 |= true != hmlVarC.A(f) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != hmlVarC.D(igrVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != hmlVarC.E(z2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i2) == 0) {
            i3 |= true != hmlVarC.D(djgaVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i5 = i3;
        if ((i5 & 306783379) == 306783378 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar3 = hmlVarC;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(-359519302);
            if (((Boolean) hoxVar.a()).booleanValue()) {
                djjn djjnVar = djdmVar.b;
                if (djjnVar == null) {
                    throw new IllegalArgumentException("No way to handle recording events.");
                }
                djgw.j(djjnVar.a, djjnVar.c, i, f, icsVar, hmlVarC, ((i5 >> 3) & 8064) | ((i5 >> 6) & 57344));
                hmlVar2 = hmlVarC;
            } else {
                hmlVar2 = hmlVarC;
            }
            int i6 = i5 >> 3;
            int i7 = i5 >> 6;
            int i8 = i6 & 7168;
            int i9 = i6 & 896;
            hmwVar.ab();
            ics icsVarK = ((Boolean) hoxVar.a()).booleanValue() ? egq.k(ics.e, 0.0f) : efy.d(icsVar, 8.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.o, hmlVar2, 48);
            int iA = djhk.a(hmg.b(hmlVar2));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVar2, icsVarK);
            fdae fdaeVar = jbb.a;
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA, jbb.e);
            hsk.b(hmlVar2, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVar2.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar2, icsVarB, jbb.c);
            hml hmlVar4 = hmlVar2;
            djbb.b(egp.a, i, f, djcyVar.f, hxe.d(-383779051, new djhs(djcyVar, djdmVar, djfnVar, igrVar, z, i, f, z2, djgaVar), hmlVar4), hmlVar4, (i7 & 112) | 24582 | (i7 & 896), 0);
            egt.a(egq.o(ics.e, 8.0f), hmlVar4);
            c(djcyVar, djdmVar, i, f, hoxVar, hmlVar4, (i5 & 14) | 24576 | (i6 & 112) | i9 | i8);
            hmlVar3 = hmlVar4;
            hmlVar3.n();
        }
        hpx hpxVarL = hmlVar3.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djhp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    djfn djfnVar2 = djfnVar;
                    djdm djdmVar2 = djdmVar;
                    int i10 = i;
                    float f2 = f;
                    boolean z3 = z;
                    ics icsVar2 = icsVar;
                    igr igrVar2 = igrVar;
                    boolean z4 = z2;
                    djhx.f(djcyVar2, djfnVar2, djdmVar2, i10, f2, z3, icsVar2, igrVar2, z4, djgaVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
