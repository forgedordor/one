package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprw {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dplt r27, defpackage.ics r28, final defpackage.dppy r29, defpackage.iva r30, java.lang.String r31, defpackage.hml r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprw.a(dplt, ics, dppy, iva, java.lang.String, hml, int, int):void");
    }

    public static final void b(final dplv dplvVar, final ics icsVar, final dpsb dpsbVar, final dprl dprlVar, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        dprlVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-790347531);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dplvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dpsbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(dprlVar) : hmlVarC.F(dprlVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean zC = dprlVar.c();
            hsf hsfVar = dprlVar.i;
            hox hoxVar = dpsbVar.e;
            if (zC && !((Boolean) hsfVar.a()).booleanValue()) {
                z = false;
            }
            hoxVar.b(Boolean.valueOf(z));
            edj.a(icsVar, null, hxe.d(-1001805473, new dprp(dplvVar, dpsbVar, dplvVar, dprlVar, fdapVar), hmlVarC), hmlVarC, ((i4 >> 3) & 14) | 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dprn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dplv dplvVar2 = dplvVar;
                    ics icsVar2 = icsVar;
                    dpsb dpsbVar2 = dpsbVar;
                    dprl dprlVar2 = dprlVar;
                    dprw.b(dplvVar2, icsVar2, dpsbVar2, dprlVar2, fdapVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dplv dplvVar, final ics icsVar, final dpsb dpsbVar, final fdap fdapVar, final fdav fdavVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        dprl dprlVar;
        dprl dprlVar2;
        dplv dplvVar2 = dplvVar;
        dpsbVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(887587868);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dplvVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dpsbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdavVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z) ? 65536 : 131072;
        }
        if ((i2 & 74899) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new dprl(dplvVar2, z);
                hmwVar.af(objS);
            }
            dprl dprlVar3 = (dprl) objS;
            hmwVar.ab();
            ics icsVarC = egq.c(icsVar, 1.0f);
            int i4 = dprg.a;
            icsVarC.getClass();
            dprlVar3.getClass();
            hmlVarC.v(166545396);
            hsf hsfVar = dprlVar3.d;
            boolean z2 = dprg.a(hsfVar) == 1.0f;
            hsf hsfVar2 = dprlVar3.e;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = ihs.h(dprg.c(hsfVar2), 0L);
            hox hoxVar = dprlVar3.h;
            Boolean boolValueOf2 = Boolean.valueOf(zH);
            Boolean boolValueOf3 = Boolean.valueOf(dprg.i(hoxVar));
            hmlVarC.v(-1224400529);
            boolean zD = hmlVarC.D(hsfVar) | hmlVarC.D(hsfVar2) | hmlVarC.D(hoxVar) | hmlVarC.F(dprlVar3);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                objS2 = new dpqv(dprlVar3, hsfVar, hsfVar2, hoxVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.e(boolValueOf, boolValueOf2, boolValueOf3, (fdat) objS2, hmlVarC);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS3);
            }
            fdjx fdjxVar = (fdjx) objS3;
            hmlVarC.v(1136366692);
            if (dpsbVar.b) {
                hox hoxVar2 = dprlVar3.g;
                ico icoVar = ics.e;
                fctx fctxVar = fctx.a;
                hmlVarC.v(-1224400529);
                boolean zD2 = hmlVarC.D(hoxVar2) | hmlVarC.D(hsfVar) | hmlVarC.D(hsfVar2) | hmlVarC.F(dprlVar3) | hmlVarC.F(dpsbVar) | hmlVarC.F(dplvVar2);
                Object objS4 = hmwVar.S();
                if (zD2 || objS4 == obj) {
                    dpqx dpqxVar = new dpqx(dprlVar3, dpsbVar, dplvVar2, hoxVar2, hsfVar, hsfVar2);
                    dprlVar2 = dprlVar3;
                    dplvVar2 = dplvVar2;
                    hmwVar.af(dpqxVar);
                    objS4 = dpqxVar;
                } else {
                    dprlVar2 = dprlVar3;
                }
                hmwVar.ab();
                ics icsVarA = itf.a(icoVar, fctxVar, (PointerInputEventHandler) objS4);
                hmlVarC.v(-1224400529);
                boolean zF = hmlVarC.F(dpsbVar) | hmlVarC.F(dprlVar2) | hmlVarC.D(hsfVar) | hmlVarC.D(hoxVar2) | hmlVarC.F(fdjxVar) | hmlVarC.F(dplvVar2);
                Object objS5 = hmwVar.S();
                if (zF || objS5 == obj) {
                    dprl dprlVar4 = dprlVar2;
                    dpra dpraVar = new dpra(dpsbVar, dprlVar4, fdjxVar, dplvVar2, hsfVar, hoxVar2);
                    dprlVar = dprlVar4;
                    hmwVar.af(dpraVar);
                    objS5 = dpraVar;
                } else {
                    dprlVar = dprlVar2;
                }
                hmwVar.ab();
                icsVarC = icsVarC.a(itf.a(icsVarA, fctxVar, (PointerInputEventHandler) objS5));
            } else {
                dprlVar = dprlVar3;
            }
            hmwVar.ab();
            hmwVar.ab();
            edj.a(icsVarC, null, hxe.d(-336713358, new dprv(dplvVar, dpsbVar, dprlVar, fdapVar, fdavVar), hmlVarC), hmlVarC, 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpro
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dplv dplvVar3 = dplvVar;
                    ics icsVar2 = icsVar;
                    dpsb dpsbVar2 = dpsbVar;
                    fdap fdapVar2 = fdapVar;
                    fdav fdavVar2 = fdavVar;
                    dprw.c(dplvVar3, icsVar2, dpsbVar2, fdapVar2, fdavVar2, z, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
