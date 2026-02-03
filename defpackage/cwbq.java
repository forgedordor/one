package defpackage;

import android.content.ClipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbq {
    public static final void a(final cwbj cwbjVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        long j;
        jyq jyqVar;
        boolean z;
        final iqa iqaVar;
        hmw hmwVar;
        int i3;
        ico icoVar;
        final jgv jgvVar;
        hml hmlVar2;
        long j2;
        jyq jyqVar2;
        hmw hmwVar2;
        hml hmlVar3;
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(363636561);
        if (i4 == 0) {
            i2 = (true != hmlVarC.D(cwbjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar3 = hmlVarC;
        } else {
            final String str = cwbjVar.a;
            if (str == null && cwbjVar.b == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cwbk
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cwbj cwbjVar2 = cwbjVar;
                            int i5 = i;
                            cwbq.a(cwbjVar2, icsVar, (hml) obj, hpy.a(i5 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            final jgv jgvVar2 = (jgv) hmlVarC.e(jmh.b);
            final iqa iqaVar2 = (iqa) hmlVarC.e(jmh.h);
            boolean z2 = cwbjVar.d.a;
            float f = true != z2 ? 8.0f : 16.0f;
            ico icoVar2 = ics.e;
            ics icsVarJ = efy.j(icoVar2, 0.0f, f, 0.0f, 0.0f, 13);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            long jB = hmg.b(hmlVarC);
            long j3 = jB ^ (jB >>> 32);
            hmw hmwVar3 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar3.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            int i5 = i2;
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar3.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i6 = (int) j3;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar3.z || !fdbq.f(hmwVar3.S(), Integer.valueOf(i6))) {
                Integer numValueOf = Integer.valueOf(i6);
                hmwVar3.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(1300700436);
            if (str == null) {
                hmlVar2 = hmlVarC;
                i3 = -1746271574;
                jgvVar = jgvVar2;
                iqaVar = iqaVar2;
                z = z2;
                hmwVar = hmwVar3;
                icoVar = icoVar2;
            } else {
                if (z2) {
                    hmlVarC.v(2105889923);
                    j = glz.a(hmlVarC).d;
                    hmwVar3.ab();
                } else {
                    hmlVarC.v(2105965036);
                    j = glz.a(hmlVarC).q;
                    hmwVar3.ab();
                }
                if (z2) {
                    hmlVarC.v(2106135753);
                    jyqVar = glz.d(hmlVarC).f;
                    hmwVar3.ab();
                } else {
                    hmlVarC.v(2106205131);
                    jyqVar = glz.d(hmlVarC).h;
                    hmwVar3.ab();
                }
                jyq jyqVar3 = jyqVar;
                int i7 = true != z2 ? 1 : 2;
                hmlVarC.v(-1746271574);
                boolean zF = hmlVarC.F(iqaVar2) | hmlVarC.F(jgvVar2) | hmlVarC.D(str);
                Object objS = hmwVar3.S();
                if (zF || objS == hmk.a) {
                    objS = new fdae() { // from class: cwbl
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            iqaVar2.a(0);
                            String str2 = str;
                            ClipData clipDataNewPlainText = ClipData.newPlainText(str2, str2);
                            clipDataNewPlainText.getClass();
                            jgvVar2.a(new jlf(clipDataNewPlainText));
                            return fctx.a;
                        }
                    };
                    hmwVar3.af(objS);
                }
                fdae fdaeVar2 = (fdae) objS;
                hmwVar3.ab();
                hmlVarC.v(1849434622);
                Object objS2 = hmwVar3.S();
                if (objS2 == hmk.a) {
                    objS2 = new fdae() { // from class: cwbm
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return fctx.a;
                        }
                    };
                    hmwVar3.af(objS2);
                }
                hmwVar3.ab();
                z = z2;
                iqaVar = iqaVar2;
                hmwVar = hmwVar3;
                i3 = -1746271574;
                icoVar = icoVar2;
                jgvVar = jgvVar2;
                dthx.b(str, dli.g(icsVar, true, fdaeVar2, (fdae) objS2, 238), j, 0L, null, null, 0L, new khk(3), 0L, 2, false, i7, 0, null, jyqVar3, hmlVarC, 0, 48, 54776);
                hmlVar2 = hmlVarC;
            }
            hmwVar.ab();
            String str2 = cwbjVar.b;
            hmlVar2.v(1300735144);
            if (str2 == null) {
                hmlVar3 = hmlVar2;
                hmwVar2 = hmwVar;
            } else {
                if (z) {
                    hmlVar2.v(449464570);
                    j2 = glz.a(hmlVar2).d;
                    hmwVar.ab();
                } else {
                    hmlVar2.v(449539683);
                    j2 = glz.a(hmlVar2).q;
                    hmwVar.ab();
                }
                if (z) {
                    hmlVar2.v(449773764);
                    jyqVar2 = glz.d(hmlVar2).j;
                    hmwVar.ab();
                } else {
                    hmlVar2.v(449839267);
                    jyqVar2 = glz.d(hmlVar2).k;
                    hmwVar.ab();
                }
                jyq jyqVar4 = jyqVar2;
                hmlVar2.v(i3);
                boolean z3 = (i5 & 14) == 4;
                boolean zF2 = hmlVar2.F(iqaVar) | z3 | hmlVar2.F(jgvVar);
                Object objS3 = hmwVar.S();
                if (zF2 || objS3 == hmk.a) {
                    objS3 = new fdae() { // from class: cwbn
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            String str3 = cwbjVar.c;
                            if (str3 != null) {
                                jgv jgvVar3 = jgvVar;
                                iqaVar.a(0);
                                ClipData clipDataNewPlainText = ClipData.newPlainText(str3, str3);
                                clipDataNewPlainText.getClass();
                                jgvVar3.a(new jlf(clipDataNewPlainText));
                            }
                            return fctx.a;
                        }
                    };
                    hmwVar2 = hmwVar;
                    hmwVar2.af(objS3);
                } else {
                    hmwVar2 = hmwVar;
                }
                fdae fdaeVar3 = (fdae) objS3;
                hmwVar2.ab();
                hmlVar2.v(-1633490746);
                boolean zF3 = z3 | hmlVar2.F(jgvVar);
                Object objS4 = hmwVar2.S();
                if (zF3 || objS4 == hmk.a) {
                    objS4 = new fdae() { // from class: cwbo
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            String str3 = cwbjVar.c;
                            if (str3 != null) {
                                jgv jgvVar3 = jgvVar;
                                ClipData clipDataNewPlainText = ClipData.newPlainText(str3, str3);
                                clipDataNewPlainText.getClass();
                                jgvVar3.a(new jlf(clipDataNewPlainText));
                            }
                            return fctx.a;
                        }
                    };
                    hmwVar2.af(objS4);
                }
                hmwVar2.ab();
                hmlVar3 = hmlVar2;
                dthx.b(str2, dli.g(icoVar, true, fdaeVar3, (fdae) objS4, 238), j2, 0L, null, null, 0L, new khk(3), 0L, 2, false, 1, 0, null, jyqVar4, hmlVar3, 0, 3120, 54776);
            }
            hmwVar2.ab();
            hmlVar3.n();
        }
        hpx hpxVarL2 = hmlVar3.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cwbp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cwbj cwbjVar2 = cwbjVar;
                    int i8 = i;
                    cwbq.a(cwbjVar2, icsVar, (hml) obj, hpy.a(i8 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
