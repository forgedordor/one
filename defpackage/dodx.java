package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dodx {
    public static final void a(final long j, final long j2, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1302484457);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.C(j) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            float fE = 0.01f;
            if (j > 0 && j2 >= 0) {
                fE = fddu.e(j2 / j, 0.01f, 1.0f);
            }
            final hsf hsfVarC = ddu.c(fE, dea.b(0.0f, 50.0f, null, 5), null, hmlVarC, 3120, 20);
            long j3 = glz.a(hmlVarC).a;
            long j4 = glz.a(hmlVarC).c;
            ics icsVarK = egq.k(ics.e, 48.0f);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(hsfVarC);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdae() { // from class: dodr
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Float.valueOf(((Number) hsfVarC.a()).floatValue());
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtgm.b((fdae) objS, icsVarK, j3, 0.0f, j4, 0, 0.0f, hmlVarC, 48, 104);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dods
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j5 = j;
                    dodx.a(j5, j2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.doeb r18, final defpackage.fdae r19, final defpackage.fdae r20, float r21, defpackage.hml r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dodx.b(doeb, fdae, fdae, float, hml, int, int):void");
    }

    public static final void c(final int i, hml hmlVar, final int i2) throws Resources.NotFoundException {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(645458458);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String string = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
            string.getClass();
            hmlVar2 = hmlVarC;
            dthx.b(string, egq.x(ics.e, 0.0f, 280.0f, 1), glz.a(hmlVarC).o, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).h, hmlVar2, 48, 0, 65016);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dodq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    int i5 = i2;
                    dodx.c(i, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final doea doeaVar, final fdae fdaeVar, final fdae fdaeVar2, hml hmlVar, final int i) throws Resources.NotFoundException {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1692713952);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(doeaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fdvc fdvcVar = doeaVar.a;
            hmlVarC.v(1094504656);
            hsf hsfVarA = fdvcVar == null ? null : hro.a(fdvcVar, hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(1094503640);
            if (hsfVarA == null) {
                hmlVarC.v(1849434622);
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    hpl hplVar = new hpl(false, hsi.a);
                    hmwVar.af(hplVar);
                    objS = hplVar;
                }
                hsfVarA = (hox) objS;
                hmwVar.ab();
            }
            hmwVar.ab();
            fdvc fdvcVar2 = doeaVar.c;
            hmlVarC.v(1094508240);
            hsf hsfVarA2 = fdvcVar2 == null ? null : hro.a(fdvcVar2, hmlVarC);
            hmwVar.ab();
            hmlVarC.v(1094507411);
            if (hsfVarA2 == null) {
                hmlVarC.v(1849434622);
                Object objS2 = hmwVar.S();
                if (objS2 == hmk.a) {
                    objS2 = new hpj(0L);
                    hmwVar.af(objS2);
                }
                hsfVarA2 = (hrk) objS2;
                hmwVar.ab();
            }
            hmwVar.ab();
            fdvc fdvcVar3 = doeaVar.d;
            hmlVarC.v(1094512176);
            hsf hsfVarA3 = fdvcVar3 == null ? null : hro.a(fdvcVar3, hmlVarC);
            hmwVar.ab();
            hmlVarC.v(1094511192);
            if (hsfVarA3 == null) {
                hmlVarC.v(1849434622);
                Object objS3 = hmwVar.S();
                if (objS3 == hmk.a) {
                    objS3 = new hpj(0L);
                    hmwVar.af(objS3);
                }
                hsfVarA3 = (hrk) objS3;
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVarC.v(1094514211);
            if (!i(hsfVarA)) {
                a(((Number) hsfVarA2.a()).longValue(), ((Number) hsfVarA3.a()).longValue(), hmlVarC, 0);
                egt.a(egq.d(egq.e(ics.e, 16.0f), 1.0f), hmlVarC);
            }
            hmwVar.ab();
            c(true != i(hsfVarA) ? R.string.magic_compose_feature_downloading_error_message : R.string.magic_compose_storage_error_message, hmlVarC, 0);
            hmlVarC.v(1849434622);
            Object objS4 = hmwVar.S();
            Object obj = hmk.a;
            if (objS4 == obj) {
                hpl hplVar2 = new hpl(doeaVar.b, hsi.a);
                hmwVar.af(hplVar2);
                objS4 = hplVar2;
            }
            hox hoxVar = (hox) objS4;
            hmwVar.ab();
            hmlVarC.v(1094529810);
            if (i(hsfVarA) && h(hoxVar) != null) {
                egt.a(egq.d(egq.e(ics.e, 16.0f), 1.0f), hmlVarC);
                fdae fdaeVarH = h(hoxVar);
                fdaeVarH.getClass();
                g(fdaeVarH, hmlVarC, 0);
            }
            hmwVar.ab();
            b(doeaVar, fdaeVar, fdaeVar2, true == i(hsfVarA) ? 8.0f : 16.0f, hmlVarC, i2 & 1022, 0);
            fdvc fdvcVar4 = doeaVar.e;
            hmlVarC.v(1094542384);
            hsf hsfVarA4 = fdvcVar4 == null ? null : hro.a(fdvcVar4, hmlVarC);
            hmwVar.ab();
            if (hsfVarA4 == null) {
                hmlVarC.v(1849434622);
                Object objS5 = hmwVar.S();
                if (objS5 == obj) {
                    hpl hplVar3 = new hpl(false, hsi.a);
                    hmwVar.af(hplVar3);
                    objS5 = hplVar3;
                }
                hsfVarA4 = (hox) objS5;
                hmwVar.ab();
            }
            if (((Boolean) hsfVarA4.a()).booleanValue()) {
                doeaVar.f.invoke();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dodu
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) throws Resources.NotFoundException {
                    ((Integer) obj3).intValue();
                    doea doeaVar2 = doeaVar;
                    fdae fdaeVar3 = fdaeVar;
                    int i4 = i;
                    dodx.d(doeaVar2, fdaeVar3, fdaeVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(doeb doebVar, fdae fdaeVar, fdae fdaeVar2, hml hmlVar, final int i) throws Resources.NotFoundException {
        int i2;
        final doeb doebVar2;
        final fdae fdaeVar3;
        final fdae fdaeVar4;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1375903669);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(doebVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            doebVar2 = doebVar;
            fdaeVar3 = fdaeVar;
            fdaeVar4 = fdaeVar2;
        } else {
            c(doebVar.a(), hmlVarC, 0);
            doebVar2 = doebVar;
            fdaeVar3 = fdaeVar;
            fdaeVar4 = fdaeVar2;
            b(doebVar2, fdaeVar3, fdaeVar4, 0.0f, hmlVarC, i2 & 1022, 8);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dodn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    doeb doebVar3 = doebVar2;
                    fdae fdaeVar5 = fdaeVar3;
                    int i4 = i;
                    dodx.e(doebVar3, fdaeVar5, fdaeVar4, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final doeb doebVar, final fdae fdaeVar, final fdae fdaeVar2, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2101894925);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(doebVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ibx ibxVar = ibw.k;
            ecj ecjVar = ecr.e;
            ics icsVarC = dpc.c(egq.c(icsVar, 1.0f), dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            ixm ixmVarA = edl.a(ecjVar, ibxVar, hmlVarC, 54);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
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
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            if (doebVar instanceof doea) {
                hmlVarC.v(-862660176);
                d((doea) doebVar, fdaeVar, fdaeVar2, hmlVarC, i2 & 1008);
                hmwVar.ab();
            } else {
                hmlVarC.v(-862582056);
                e(doebVar, fdaeVar, fdaeVar2, hmlVarC, i2 & 1022);
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dodt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doeb doebVar2 = doebVar;
                    fdae fdaeVar4 = fdaeVar;
                    fdae fdaeVar5 = fdaeVar2;
                    dodx.f(doebVar2, fdaeVar4, fdaeVar5, icsVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2001805018);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(R.string.magic_compose_storage_settings_link) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            egc egcVar = dtdc.a;
            fdaeVar2 = fdaeVar;
            dtdi.e(fdaeVar2, null, false, null, dtdc.f(glz.a(hmlVarC).a, hmlVarC, 13), new egd(10.0f, 12.0f, 10.0f, 12.0f), hxe.d(-737714103, new dodw(), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 817889280, 366);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dodo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dodx.g(fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final fdae h(hox hoxVar) {
        return (fdae) hoxVar.a();
    }

    private static final boolean i(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }
}
