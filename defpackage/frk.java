package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frk {
    public static final /* synthetic */ int a = 0;
    private static final long b = kjm.c(8);

    public static final int a(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, egc egcVar) {
        int iMax = Math.max(i3, Math.max(i5, kjx.c(i4, 0, f)));
        egd egdVar = (egd) egcVar;
        float f3 = egdVar.a * f2;
        return kim.b(j, Math.max(i, Math.max(i2, fdcu.b(kjx.b(f3, Math.max(f3, i4 / 2.0f), f) + iMax + (egdVar.b * f2)))));
    }

    public static final int b(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, egc egcVar) {
        int iMax = i + Math.max(i3, Math.max(kjx.c(i4, 0, f), i5));
        kji kjiVar = kji.a;
        return kim.c(j, Math.max(iMax + i2, fdcu.b((i4 + ((egcVar.b(kjiVar) + egcVar.c(kjiVar)) * f2)) * f)));
    }

    public static final void c(final String str, final fdap fdapVar, ics icsVar, boolean z, jyq jyqVar, final fdat fdatVar, final fdat fdatVar2, kfp kfpVar, fae faeVar, fad fadVar, int i, int i2, ikp ikpVar, foz fozVar, hml hmlVar, final int i3, final int i4) {
        int i5;
        fdat fdatVar3;
        ikp ikpVar2;
        int i6;
        int i7;
        int i8;
        jyq jyqVar2;
        fae faeVar2;
        fad fadVar2;
        foz fozVar2;
        boolean z2;
        int i9;
        kfp kfpVar2;
        boolean z3;
        ebk ebkVar;
        long j;
        hml hmlVar2;
        final fae faeVar3;
        final boolean z4;
        final fad fadVar3;
        final int i10;
        final ics icsVar2;
        final foz fozVar3;
        final ikp ikpVar3;
        final jyq jyqVar3;
        final int i11;
        final kfp kfpVar3;
        hml hmlVarC = hmlVar.c(801000036);
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        int i12 = i5 | 28032;
        if ((i3 & 196608) == 0) {
            i12 = i5 | 93568;
        }
        if ((i3 & 1572864) == 0) {
            i12 |= true != hmlVarC.F(fdatVar) ? 524288 : 1048576;
        }
        int i13 = i12 | 113246208;
        if ((i3 & 805306368) == 0) {
            fdatVar3 = fdatVar2;
            i13 |= true != hmlVarC.F(fdatVar3) ? 268435456 : 536870912;
        } else {
            fdatVar3 = fdatVar2;
        }
        int i14 = i13;
        int i15 = i4 | 28086;
        if ((i4 & 196608) == 0) {
            i15 = 93622 | i4;
        }
        int i16 = 14155776 | i15;
        if ((100663296 & i4) == 0) {
            i16 = i15 | 47710208;
        }
        if ((805306368 & i4) == 0) {
            i16 |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        int i17 = i16;
        if ((i14 & 306783379) == 306783378 && (i17 & 306783379) == 306783378 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            z4 = z;
            jyqVar3 = jyqVar;
            kfpVar3 = kfpVar;
            faeVar3 = faeVar;
            fadVar3 = fadVar;
            i11 = i;
            i10 = i2;
            ikpVar3 = ikpVar;
            fozVar3 = fozVar;
            hmlVar2 = hmlVarC;
        } else {
            int i18 = i17 >> 18;
            int i19 = i17 & (-2114387969);
            hmlVarC.t();
            if ((i3 & 1) == 0 || hmlVarC.G()) {
                ico icoVar = ics.e;
                jyq jyqVar4 = (jyq) hmlVarC.e(fvx.a);
                kfp kfpVar4 = kfo.a;
                fae faeVar4 = fae.a;
                fad fadVar4 = fad.a;
                ikpVar2 = fqq.b(hmlVarC).a;
                i6 = 196608;
                i7 = i14;
                long j2 = ((ije) hmlVarC.e(C0001for.a)).i;
                long jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), ((Number) hmlVarC.e(fop.a)).floatValue(), ije.f(j2));
                long jF2 = ijg.f(ije.d(jF), ije.c(jF), ije.b(jF), fon.a(hmlVarC), ije.f(jF));
                long j3 = ije.g;
                long jH = fqq.a(hmlVarC).h();
                long jB = fqq.a(hmlVarC).b();
                icsVar = icoVar;
                long jH2 = fqq.a(hmlVarC).h();
                long jF3 = ijg.f(ije.d(jH2), ije.c(jH2), ije.b(jH2), fon.b(hmlVarC), ije.f(jH2));
                long jG = fqq.a(hmlVarC).g();
                long jF4 = ijg.f(ije.d(jG), ije.c(jG), ije.b(jG), fon.a(hmlVarC), ije.f(jG));
                long jF5 = ijg.f(ije.d(jF4), ije.c(jF4), ije.b(jF4), fon.a(hmlVarC), ije.f(jF4));
                long jB2 = fqq.a(hmlVarC).b();
                long jG2 = fqq.a(hmlVarC).g();
                long jF6 = ijg.f(ije.d(jG2), ije.c(jG2), ije.b(jG2), 0.54f, ije.f(jG2));
                long jF7 = ijg.f(ije.d(jF6), ije.c(jF6), ije.b(jF6), fon.a(hmlVarC), ije.f(jF6));
                long jG3 = fqq.a(hmlVarC).g();
                long jF8 = ijg.f(ije.d(jG3), ije.c(jG3), ije.b(jG3), 0.54f, ije.f(jG3));
                long jF9 = ijg.f(ije.d(jF8), ije.c(jF8), ije.b(jF8), fon.a(hmlVarC), ije.f(jF8));
                long jB3 = fqq.a(hmlVarC).b();
                long jH3 = fqq.a(hmlVarC).h();
                long jF10 = ijg.f(ije.d(jH3), ije.c(jH3), ije.b(jH3), fon.b(hmlVarC), ije.f(jH3));
                long jG4 = fqq.a(hmlVarC).g();
                long jF11 = ijg.f(ije.d(jG4), ije.c(jG4), ije.b(jG4), fon.c(hmlVarC), ije.f(jG4));
                long jF12 = ijg.f(ije.d(jF11), ije.c(jF11), ije.b(jF11), fon.a(hmlVarC), ije.f(jF11));
                long jB4 = fqq.a(hmlVarC).b();
                long jG5 = fqq.a(hmlVarC).g();
                long jF13 = ijg.f(ije.d(jG5), ije.c(jG5), ije.b(jG5), fon.c(hmlVarC), ije.f(jG5));
                foz fozVar4 = new foz(jF, jF2, jH, jB, jF3, jF4, jB2, jF5, jF6, jF7, jF6, jF8, jF9, jB3, j3, jF10, jF11, jF12, jB4, jF13, ijg.f(ije.d(jF13), ije.c(jF13), ije.b(jF13), fon.a(hmlVarC), ije.f(jF13)));
                i8 = Integer.MAX_VALUE;
                jyqVar2 = jyqVar4;
                faeVar2 = faeVar4;
                fadVar2 = fadVar4;
                fozVar2 = fozVar4;
                z2 = true;
                i9 = 1;
                kfpVar2 = kfpVar4;
            } else {
                hmlVarC.s();
                z2 = z;
                jyqVar2 = jyqVar;
                kfpVar2 = kfpVar;
                faeVar2 = faeVar;
                i9 = i2;
                ikpVar2 = ikpVar;
                fozVar2 = fozVar;
                i6 = 196608;
                i7 = i14;
                fadVar2 = fadVar;
                i8 = i;
            }
            ics icsVar3 = icsVar;
            hmlVarC.l();
            hmlVarC.v(-245170377);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar2 = (ebk) objS;
            hmwVar.ab();
            hmlVarC.v(961927698);
            long jF14 = jyqVar2.f();
            if (jF14 != 16) {
                ebkVar = ebkVar2;
                j = jF14;
                z3 = z2;
            } else {
                z3 = z2;
                ebkVar = ebkVar2;
                j = ((ije) fozVar2.b(z2, hmlVarC).a()).i;
            }
            hmwVar.ab();
            jyq jyqVarM = jyqVar2.m(new jyq(j, 0L, null, null, 0L, 0, 0L, 16777214));
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            hmlVarC.v(-244699115);
            ico icoVar2 = ics.e;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: frf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        int i20 = frk.a;
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            jyq jyqVar5 = jyqVar2;
            fae faeVar5 = faeVar2;
            ics icsVarJ = efy.j(jsh.c(icoVar2, true, (fdap) objS2), 0.0f, kioVar.eg(b), 0.0f, 0.0f, 13);
            hmwVar.ab();
            fua.a(3, hmlVarC);
            ics icsVarA = egq.a(icsVarJ, 280.0f, 56.0f);
            int i20 = i8;
            ikt iktVar = new ikt(((ije) fozVar2.a(hmlVarC).a()).i);
            ebk ebkVar3 = ebkVar;
            boolean z5 = z3;
            ikp ikpVar4 = ikpVar2;
            foz fozVar5 = fozVar2;
            hwv hwvVarD = hxe.d(-591103097, new frj(str, z5, kfpVar2, ebkVar3, fdatVar, fdatVar3, ikpVar2, fozVar2), hmlVarC);
            int i21 = i19 << 12;
            int i22 = (i7 & 64638) | (3670016 & i21) | (29360128 & i21) | (i21 & 234881024);
            int i23 = (i18 & 14) | i6 | (i17 & 112);
            int i24 = i9;
            fad fadVar5 = fadVar2;
            hmlVar2 = hmlVarC;
            kfp kfpVar5 = kfpVar2;
            ewj.c(str, fdapVar, icsVarA, z5, jyqVarM, faeVar5, fadVar5, false, i20, i24, kfpVar5, null, ebkVar3, iktVar, hwvVarD, hmlVar2, i22, i23, 4096);
            faeVar3 = faeVar5;
            z4 = z5;
            fadVar3 = fadVar5;
            i10 = i24;
            icsVar2 = icsVar3;
            fozVar3 = fozVar5;
            ikpVar3 = ikpVar4;
            jyqVar3 = jyqVar5;
            i11 = i20;
            kfpVar3 = kfpVar5;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: frg
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    fdap fdapVar2 = fdapVar;
                    ics icsVar4 = icsVar2;
                    boolean z6 = z4;
                    jyq jyqVar6 = jyqVar3;
                    fdat fdatVar4 = fdatVar;
                    fdat fdatVar5 = fdatVar2;
                    kfp kfpVar6 = kfpVar3;
                    fae faeVar6 = faeVar3;
                    fad fadVar6 = fadVar3;
                    int i25 = i11;
                    int i26 = i10;
                    int i27 = i3;
                    ikp ikpVar5 = ikpVar3;
                    int iA = hpy.a(i27 | 1);
                    int iA2 = hpy.a(i4);
                    frk.c(str2, fdapVar2, icsVar4, z6, jyqVar6, fdatVar4, fdatVar5, kfpVar6, faeVar6, fadVar6, i25, i26, ikpVar5, fozVar3, (hml) obj2, iA, iA2);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ics r24, final defpackage.fdat r25, final defpackage.fdat r26, final defpackage.fdat r27, final float r28, final defpackage.fdap r29, final defpackage.fdat r30, final defpackage.egc r31, defpackage.hml r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frk.d(ics, fdat, fdat, fdat, float, fdap, fdat, egc, hml, int, int):void");
    }
}
