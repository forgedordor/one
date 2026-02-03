package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hce {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        new egd(8.0f, 4.0f, 8.0f, 4.0f);
        a = 16.0f;
        b = 24.0f;
        c = 16.0f;
        d = 36.0f;
        e = 8.0f;
    }

    public static final void a(final hcf hcfVar, final ics icsVar, fdat fdatVar, final long j, final float f, final ikp ikpVar, final gqx gqxVar, final float f2, final float f3, final fdat fdatVar2, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4;
        fdat fdatVar3;
        hml hmlVar2;
        Object obj;
        int i5;
        final hox hoxVar;
        ics icsVarA;
        int i6 = i & 6;
        hml hmlVarC = hmlVar.c(-2125725529);
        if (i6 == 0) {
            i3 = (true != ((i & 8) == 0 ? hmlVarC.D(hcfVar) : hmlVarC.F(hcfVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.A(f) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != hmlVarC.D(ikpVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != hmlVarC.D(gqxVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.A(f2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != hmlVarC.A(f3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != hmlVarC.F(fdatVar2) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (hmlVarC.J(((i7 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i7 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                hpl hplVar = new hpl(new iik((byte[]) null), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar2 = (hox) objS;
            if (j != 9205357640488583168L) {
                hmlVarC.v(1804245745);
                hpt hptVar = jmh.e;
                final kio kioVar = (kio) hmlVarC.e(hptVar);
                hmlVarC.v(-784724216);
                final int iEp = ((kio) hmlVarC.e(hptVar)).ep(((Configuration) hmlVarC.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
                hmwVar.ab();
                int i8 = i7 & 14;
                ico icoVar = ics.e;
                boolean z = i8 == 4 || ((i7 & 8) != 0 && hmlVarC.F(hcfVar));
                Object objS2 = hmwVar.S();
                if (z || objS2 == obj2) {
                    objS2 = new fdap() { // from class: hbv
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            float f4 = hce.a;
                            return hcfVar.a.invoke();
                        }
                    };
                    hmwVar.af(objS2);
                }
                final fdap fdapVar = (fdap) objS2;
                obj = obj2;
                i5 = 1048576;
                hoxVar = hoxVar2;
                icsVarA = iwl.a(icoVar, new fdau() { // from class: hbu
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
                    @Override // defpackage.fdau
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
                        /*
                            Method dump skipped, instructions count: 355
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbu.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }).a(icsVar);
                hmwVar.ab();
            } else {
                obj = obj2;
                i5 = 1048576;
                hoxVar = hoxVar2;
                hmlVarC.v(1582234543);
                hmwVar.ab();
                icsVarA = icsVar;
            }
            boolean z2 = (((i7 & 3670016) ^ 1572864) > i5 && hmlVarC.D(ikpVar)) || (i7 & 1572864) == i5;
            Object objS3 = hmwVar.S();
            if (z2 || objS3 == obj) {
                objS3 = new hbq(ikpVar, hoxVar);
                hmwVar.af(objS3);
            }
            fdatVar3 = fdatVar;
            hmlVar2 = hmlVarC;
            gvk.c(egq.w(icsVarA, 40.0f, 24.0f, f, 0.0f, 8), (hbq) objS3, gqxVar.a, 0L, f2, f3, null, hxe.d(-950255550, new hbx(fdatVar3, gqxVar, fdatVar2), hmlVarC), hmlVar2, 72);
        } else {
            fdatVar3 = fdatVar;
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            final fdat fdatVar4 = fdatVar3;
            hpxVarL.d = new fdat() { // from class: hbw
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    hml hmlVar3 = (hml) obj3;
                    ((Integer) obj4).intValue();
                    hcf hcfVar2 = hcfVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar5 = fdatVar4;
                    long j2 = j;
                    float f4 = f;
                    ikp ikpVar2 = ikpVar;
                    gqx gqxVar2 = gqxVar;
                    float f5 = f2;
                    int i9 = i;
                    hce.a(hcfVar2, icsVar2, fdatVar5, j2, f4, ikpVar2, gqxVar2, f5, f3, fdatVar2, hmlVar3, hpy.a(i9 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(koa koaVar, final fdau fdauVar, hcj hcjVar, ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        koa koaVar2;
        ics icsVar2;
        final hcj hcjVar2;
        hml hmlVarC = hmlVar.c(2055306788);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(koaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(hcjVar) : hmlVarC.F(hcjVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(true) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.E(true) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if (hmlVarC.J((4793491 & i2) != 4793490, i2 & 1)) {
            dhk dhkVarC = dhy.c(hcjVar.a, "tooltip transition", hmlVarC, 48, 0);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new hcf(new fdae() { // from class: hbr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        float f = hce.a;
                        return (ivy) hoxVar.a();
                    }
                });
                hmwVar.af(objS2);
            }
            hwv hwvVarD = hxe.d(829623798, new hca(hoxVar, fdatVar), hmlVarC);
            hwv hwvVarD2 = hxe.d(336389722, new hby(dhkVarC, fdauVar, (hcf) objS2), hmlVarC);
            int i3 = 57344 & i2;
            int i4 = 458752 & i2;
            int i5 = (i2 & 14) | 12582960 | (i2 & 896) | (i2 & 7168) | i3 | i4;
            koaVar2 = koaVar;
            icsVar2 = icsVar;
            hhp.a(koaVar2, hwvVarD2, hcjVar, icsVar2, hwvVarD, hmlVarC, i5 | (i2 & 3670016));
            hcjVar2 = hcjVar;
        } else {
            koaVar2 = koaVar;
            icsVar2 = icsVar;
            hcjVar2 = hcjVar;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final koa koaVar3 = koaVar2;
            final ics icsVar3 = icsVar2;
            hpxVarL.d = new fdat() { // from class: hbs
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    hml hmlVar2 = (hml) obj2;
                    ((Integer) obj3).intValue();
                    koa koaVar4 = koaVar3;
                    fdau fdauVar2 = fdauVar;
                    hcj hcjVar3 = hcjVar2;
                    int i6 = i;
                    hce.b(koaVar4, fdauVar2, hcjVar3, icsVar3, fdatVar, hmlVar2, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
