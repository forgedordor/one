package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqi {
    public static final void a(final fdae fdaeVar, final ics icsVar, final ikp ikpVar, final long j, final long j2, final fox foxVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        ikp ikpVar2;
        long j3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-482679837);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            ikpVar2 = ikpVar;
            i2 |= true != hmlVarC.D(ikpVar2) ? 1024 : 2048;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= true != hmlVarC.C(j3) ? 8192 : 16384;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(foxVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793491 & i2) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(36082328);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: fqb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jtk.q((jto) obj2, 0);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            ics icsVarC = jsh.c(icsVar, false, (fdap) objS2);
            int i4 = i2 >> 15;
            hmlVarC.v(-478475335);
            boolean zD = hmlVarC.D(ebkVar);
            Object objS3 = hmwVar.S();
            if (zD || objS3 == obj) {
                objS3 = new fqa();
                hmwVar.af(objS3);
            }
            fqa fqaVar = (fqa) objS3;
            boolean zF = hmlVarC.F(fqaVar) | ((((i4 & 112) ^ 48) > 32 && hmlVarC.D(foxVar)) || (i4 & 48) == 32);
            Object objS4 = hmwVar.S();
            if (zF || objS4 == obj) {
                objS4 = new fot(fqaVar, foxVar, null);
                hmwVar.af(objS4);
            }
            hob.g(foxVar, (fdat) objS4, hmlVarC);
            boolean zD2 = hmlVarC.D(ebkVar) | hmlVarC.F(fqaVar);
            Object objS5 = hmwVar.S();
            if (zD2 || objS5 == obj) {
                objS5 = new fow(ebkVar, fqaVar, null);
                hmwVar.af(objS5);
            }
            hob.g(ebkVar, (fdat) objS5, hmlVarC);
            deb debVar = fqaVar.e.a;
            hmwVar.ab();
            long j4 = j3;
            ikp ikpVar3 = ikpVar2;
            fuh.d(fdaeVar, icsVarC, false, ikpVar3, j4, j2, ((kir) debVar.a()).a, ebkVar, hxe.d(-1823447062, new fqh(j2, fdatVar), hmlVarC), hmlVarC, (i2 & 14) | 805306368 | (i2 & 7168) | (57344 & i2) | (i2 & 458752));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fqc
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    ics icsVar2 = icsVar;
                    ikp ikpVar4 = ikpVar;
                    long j5 = j;
                    long j6 = j2;
                    fox foxVar2 = foxVar;
                    fqi.a(fdaeVar2, icsVar2, ikpVar4, j5, j6, foxVar2, fdatVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdat fdatVar, final fdae fdaeVar, ics icsVar, ikp ikpVar, long j, long j2, fox foxVar, hml hmlVar, final int i) {
        int i2;
        fdae fdaeVar2;
        ics icsVar2;
        ikp evmVar;
        long j3;
        long jA;
        fox foxVar2;
        final ikp ikpVar2;
        final fox foxVar3;
        final long j4;
        final long j5;
        final ics icsVar3;
        hml hmlVarC = hmlVar.c(-1506973027);
        if ((i & 6) == 0) {
            i2 = i | (true != hmlVarC.F(fdatVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        } else {
            fdaeVar2 = fdaeVar;
        }
        int i3 = i2 | 28032;
        if ((i & 196608) == 0) {
            i3 = i2 | 93568;
        }
        if ((i & 1572864) == 0) {
            i3 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((38347923 & i3) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            ikpVar2 = ikpVar;
            j4 = j;
            j5 = j2;
            foxVar3 = foxVar;
        } else {
            int i4 = (-268369921) & i3;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar2 = ics.e;
                eve eveVar = fqq.b(hmlVarC).a;
                evf evfVarA = evh.a(50);
                evmVar = new evm(evfVarA, evfVarA, evfVarA, evfVarA);
                j3 = fqq.a(hmlVarC).j();
                jA = fof.a(j3, hmlVarC);
                boolean zA = hmlVarC.A(6.0f) | hmlVarC.A(12.0f) | hmlVarC.A(8.0f) | hmlVarC.A(8.0f);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (zA || objS == hmk.a) {
                    objS = new fox();
                    hmwVar.af(objS);
                }
                foxVar2 = (fox) objS;
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                evmVar = ikpVar;
                j3 = j;
                jA = j2;
                foxVar2 = foxVar;
            }
            hmlVarC.l();
            ics icsVar4 = icsVar2;
            ikpVar2 = evmVar;
            long j6 = jA;
            foxVar3 = foxVar2;
            j4 = j3;
            j5 = j6;
            a(fdaeVar2, egq.w(icsVar4, 48.0f, 48.0f, 0.0f, 0.0f, 12), ikpVar2, j4, j5, foxVar3, hxe.d(-555697957, new fqe(fdatVar), hmlVarC), hmlVarC, 12582912 | ((i4 >> 3) & 14) | ((i4 >> 6) & 896));
            icsVar3 = icsVar4;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fqd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar2 = fdatVar;
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar5 = icsVar3;
                    ikp ikpVar3 = ikpVar2;
                    long j7 = j4;
                    long j8 = j5;
                    fqi.b(fdatVar2, fdaeVar3, icsVar5, ikpVar3, j7, j8, foxVar3, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
