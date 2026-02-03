package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gms {
    public static final float a(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final void b(final fdat fdatVar, final fdae fdaeVar, final ics icsVar, final fdat fdatVar2, final boolean z, final gmi gmiVar, final egc egcVar, hml hmlVar, final int i) {
        fdat fdatVar3;
        int i2;
        fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1325192924);
        if (i3 == 0) {
            fdatVar3 = fdatVar;
            i2 = (true != hmlVarC.F(fdatVar3) ? 2 : 4) | i;
        } else {
            fdatVar3 = fdatVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(gmiVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(egcVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            ics icsVarC = efy.c(egq.w(egq.d(dli.c(icsVar, null, grb.a(true, 0.0f, 0L, 6), z, null, null, fdaeVar2, 24), 1.0f), 112.0f, 48.0f, 280.0f, 0.0f, 8), egcVar);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = hmg.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar3);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar4 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar4);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            gyj.a(glz.d(hmlVarC).m, hxe.d(865999929, new gmr(fdatVar2, gmiVar, z, egp.a, fdatVar3), hmlVarC), hmlVarC, 48);
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gmj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar5 = fdatVar;
                    fdae fdaeVar4 = fdaeVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar6 = fdatVar2;
                    boolean z2 = z;
                    gmi gmiVar2 = gmiVar;
                    gms.b(fdatVar5, fdaeVar4, icsVar2, fdatVar6, z2, gmiVar2, egcVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [dew, java.lang.Object] */
    public static final void c(final ics icsVar, final dfw dfwVar, final hox hoxVar, final dpn dpnVar, final ikp ikpVar, final long j, final float f, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(848986741);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(dfwVar) : hmlVarC.F(dfwVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(dpnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.A(0.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if (hmlVarC.J((306783379 & i2) != 306783378, i2 & 1)) {
            dhk dhkVarC = dhy.c(dfwVar, "DropDownMenu", hmlVarC, ((i2 >> 3) & 14) | 48, 0);
            dew dewVarB = gpg.b(2, hmlVarC);
            dew dewVarB2 = gpg.b(5, hmlVarC);
            gmo gmoVar = new gmo(dewVarB);
            dib dibVar = diu.a;
            boolean zBooleanValue = ((Boolean) dhkVarC.e()).booleanValue();
            hmlVarC.v(143964305);
            float f2 = true != zBooleanValue ? 0.8f : 1.0f;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            Float fValueOf = Float.valueOf(f2);
            boolean zBooleanValue2 = ((Boolean) dhkVarC.f()).booleanValue();
            hmlVarC.v(143964305);
            float f3 = true == zBooleanValue2 ? 1.0f : 0.8f;
            hmwVar.ab();
            final hsf hsfVarF = dhy.f(dhkVarC, fValueOf, Float.valueOf(f3), gmoVar.a(dhkVarC.d(), hmlVarC, 0), dibVar, hmlVarC, 0);
            gmn gmnVar = new gmn(dewVarB2);
            boolean zBooleanValue3 = ((Boolean) dhkVarC.e()).booleanValue();
            hmlVarC.v(892761509);
            float f4 = true != zBooleanValue3 ? 0.0f : 1.0f;
            hmwVar.ab();
            Float fValueOf2 = Float.valueOf(f4);
            boolean zBooleanValue4 = ((Boolean) dhkVarC.f()).booleanValue();
            hmlVarC.v(892761509);
            float f5 = true != zBooleanValue4 ? 0.0f : 1.0f;
            hmwVar.ab();
            boolean z = true;
            final hsf hsfVarF2 = dhy.f(dhkVarC, fValueOf2, Float.valueOf(f5), gmnVar.a(dhkVarC.d(), hmlVarC, 0), dibVar, hmlVarC, 0);
            final boolean zBooleanValue5 = ((Boolean) hmlVarC.e(jnj.a)).booleanValue();
            ico icoVar = ics.e;
            boolean zE = hmlVarC.E(zBooleanValue5) | hmlVarC.D(hsfVarF) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(dfwVar))) | hmlVarC.D(hsfVarF2);
            if ((i2 & 896) != 256) {
                z = false;
            }
            Object objS = hmwVar.S();
            if ((z | zE) || objS == hmk.a) {
                fdap fdapVar = new fdap() { // from class: gmk
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        boolean z2 = zBooleanValue5;
                        dfw dfwVar2 = dfwVar;
                        hsf hsfVar = hsfVarF;
                        ikl iklVar = (ikl) obj;
                        float fA = 0.8f;
                        float fFloatValue = 1.0f;
                        iklVar.x(!z2 ? gms.a(hsfVar) : ((Boolean) dfwVar2.b()).booleanValue() ? 1.0f : 0.8f);
                        if (!z2) {
                            fA = gms.a(hsfVar);
                        } else if (((Boolean) dfwVar2.b()).booleanValue()) {
                            fA = 1.0f;
                        }
                        iklVar.y(fA);
                        if (!z2) {
                            fFloatValue = ((Number) hsfVarF2.a()).floatValue();
                        } else if (!((Boolean) dfwVar2.b()).booleanValue()) {
                            fFloatValue = 0.0f;
                        }
                        hox hoxVar2 = hoxVar;
                        iklVar.a(fFloatValue);
                        iklVar.C(((ikz) hoxVar2.a()).b);
                        return fctx.a;
                    }
                };
                hmwVar.af(fdapVar);
                objS = fdapVar;
            }
            gvk.c(ijn.a(icoVar, (fdap) objS), ikpVar, j, 0L, 0.0f, f, null, hxe.d(-1463404422, new gmm(icsVar, dpnVar, fdauVar), hmlVarC), hmlVarC, 8);
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gml
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    dfw dfwVar2 = dfwVar;
                    hox hoxVar2 = hoxVar;
                    dpn dpnVar2 = dpnVar;
                    ikp ikpVar2 = ikpVar;
                    long j2 = j;
                    float f6 = f;
                    gms.c(icsVar2, dfwVar2, hoxVar2, dpnVar2, ikpVar2, j2, f6, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
