package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dazp {
    public static final void a(final daxs daxsVar, final String str, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2111643500);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(daxsVar) : hmlVarC.F(daxsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = efy.d(dkl.a(iex.a(egq.d(ics.e, 1.0f), evn.c(4.0f, 4.0f, 74.0f, 74.0f)), glz.a(hmlVarC).J, ikj.a), 16.0f);
            ixm ixmVarA = egk.a(ecr.e, ibw.n, hmlVarC, 54);
            int iA = daza.a(hmg.b(hmlVarC));
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
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            f(daxsVar, str, hmlVarC, (i2 & 112) | (i2 & 14) | 8);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dazg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    daxs daxsVar2 = daxsVar;
                    int i4 = i;
                    dazp.a(daxsVar2, str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, String str2, hml hmlVar, final int i) {
        int i2;
        jyq jyqVarY;
        hml hmlVar2;
        final String str3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1676946528);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            str3 = str2;
            hmlVar2 = hmlVarC;
        } else {
            if (str2 != null) {
                hmlVarC.v(1145704106);
                jyqVarY = glz.d(hmlVarC).b;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1145766354);
                jyqVarY = jyq.y(glz.d(hmlVarC).c, 0L, 0L, null, null, null, null, 0L, null, 0, 0, kjm.c(40), null, null, 0, 16646143);
                ((hmw) hmlVarC).ab();
            }
            jyq jyqVar = jyqVarY;
            long j = glz.a(hmlVarC).q;
            float f = str2 == null ? 16.0f : 12.0f;
            ico icoVar = ics.e;
            dthx.b(str, efy.j(icoVar, 0.0f, f, 0.0f, 0.0f, 13), j, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, jyqVar, hmlVarC, i4 & 14, 0, 65016);
            if (str2 != null) {
                egt.a(egq.e(icoVar, 2.0f), hmlVarC);
                hmlVar2 = hmlVarC;
                str3 = str2;
                dthx.b(str3, null, glz.a(hmlVarC).q, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).g, hmlVar2, (i4 >> 3) & 14, 0, 65018);
            } else {
                hmlVar2 = hmlVarC;
                str3 = str2;
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dazm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str4 = str;
                    int i5 = i;
                    dazp.b(str4, str3, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final daxu daxuVar, final egbs egbsVar, final Account account, final gun gunVar, hml hmlVar, final int i) throws PackageManager.NameNotFoundException {
        int i2;
        gun gunVar2;
        hml hmlVar2;
        hml hmlVarC = hmlVar.c(1133761339);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(daxuVar) : hmlVarC.F(daxuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(egbsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(account) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            gunVar2 = gunVar;
            i2 |= true != hmlVarC.D(gunVar2) ? 1024 : 2048;
        } else {
            gunVar2 = gunVar;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.v(1672433007);
            aeo aeoVar = new aeo();
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: daxq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((adh) obj2).getClass();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            add addVarA = acr.a(aeoVar, (fdap) objS, hmlVarC);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(addVarA);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                objS2 = new daxp(addVarA);
                hmwVar.af(objS2);
            }
            daxp daxpVar = (daxp) objS2;
            hmwVar.ab();
            hmwVar.ab();
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(dkl.a(iex.a(egq.d(icoVar, 1.0f), evn.c(74.0f, 74.0f, 4.0f, 4.0f)), glz.a(hmlVarC).J, ikj.a), 0.0f, 32.0f, 0.0f, 16.0f, 5);
            ixm ixmVarA = edl.a(ecr.e, ibw.k, hmlVarC, 54);
            int iA = daza.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
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
            if (!daxuVar.g.a || account == null) {
                hmlVarC.v(155347298);
                int i3 = ((i2 >> 3) & 14) | 64;
                hmlVar2 = hmlVarC;
                e(egbsVar, daxpVar, daxuVar.e, daxuVar.h, hmlVar2, i3);
                egt.a(egq.e(icoVar, 10.0f), hmlVar2);
                d(egbsVar, daxpVar, daxuVar.f, hmlVar2, i3);
                egt.a(egq.e(icoVar, 10.0f), hmlVar2);
                hmwVar.ab();
            } else {
                hmlVarC.v(155059711);
                hpt hptVar = AndroidCompositionLocals_androidKt.b;
                Context context = (Context) hmlVarC.e(hptVar);
                exwb exwbVar = daxuVar.h == ctcj.WELCOME_FLOW_SETTINGS ? exwb.ANDROID_MESSAGES : exwb.ANDROID_MESSAGES_ONBOARDING;
                String strD = cpge.d((Context) hmlVarC.e(hptVar));
                strD.getClass();
                new edzh(context, account, gunVar2, exwbVar, strD).b(hmlVarC, 8);
                hmwVar.ab();
                hmlVar2 = hmlVarC;
            }
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dazb
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) throws PackageManager.NameNotFoundException {
                    ((Integer) obj3).intValue();
                    daxu daxuVar2 = daxuVar;
                    egbs egbsVar2 = egbsVar;
                    Account account2 = account;
                    dazp.c(daxuVar2, egbsVar2, account2, gunVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final egbs egbsVar, final daxp daxpVar, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1291242498);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(egbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(daxpVar) : hmlVarC.F(daxpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icc iccVar = ibw.n;
            ecj ecjVar = ecr.e;
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 8.0f, 0.0f, 2);
            ixm ixmVarA = egk.a(ecjVar, iccVar, hmlVarC, 54);
            int iA = daza.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
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
            egp egpVar = egp.a;
            String str = egbsVar.d;
            str.getClass();
            boolean z = false;
            dthx.b(str, egpVar.a(icoVar, 1.0f, false), glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).e, hmlVarC, 0, 3120, 55288);
            hmlVarC = hmlVarC;
            hmlVarC.v(-1746271574);
            boolean z2 = (i2 & 896) == 256;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(daxpVar))) {
                z = true;
            }
            boolean zF = z2 | z | hmlVarC.F(egbsVar);
            Object objS = hmwVar2.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: dazc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar.invoke();
                        daxpVar.a(daxo.c, egbsVar);
                        return fctx.a;
                    }
                };
                hmwVar = hmwVar2;
                hmwVar.af(objS);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            dtfk.b((fdae) objS, null, false, null, null, daxm.b, hmlVarC, 1572864, 62);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dazd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    egbs egbsVar2 = egbsVar;
                    daxp daxpVar2 = daxpVar;
                    int i4 = i;
                    dazp.d(egbsVar2, daxpVar2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final egbs egbsVar, final daxp daxpVar, final fdae fdaeVar, ctcj ctcjVar, hml hmlVar, final int i) {
        int i2;
        final ctcj ctcjVar2;
        hmw hmwVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(436321343);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(egbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(daxpVar) : hmlVarC.F(daxpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.B(ctcjVar.ordinal()) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            ctcjVar2 = ctcjVar;
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = daza.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
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
            edf edfVar = edf.a;
            egjt egjtVar = new egjt(egbsVar);
            evm evmVar = evn.a;
            ics icsVarK = egq.k(iex.a(icoVar, evmVar), 170.0f);
            jtn jtnVar = rcy.b;
            boolean z = false;
            rcy.a(egjtVar, null, icsVarK, null, null, 0.0f, null, new rde(), null, hmlVarC, 48, 760);
            ics icsVarK2 = egq.k(edfVar.a(icoVar, new icd(1.0f, 0.85f)), 56.0f);
            egd egdVar = new egd(0.0f, 0.0f, 0.0f, 0.0f);
            egc egcVar = dtdc.a;
            gaq gaqVarC = dtdc.c(3.0f, hmlVarC, 30);
            hmlVarC.v(-1224400529);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 7168) == 2048;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(daxpVar))) {
                z = true;
            }
            boolean zF = z2 | z3 | z | hmlVarC.F(egbsVar);
            Object objS = hmwVar2.S();
            if (zF || objS == hmk.a) {
                ctcjVar2 = ctcjVar;
                objS = new fdae() { // from class: daze
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar.invoke();
                        ctcj ctcjVar3 = ctcjVar2;
                        daxp daxpVar2 = daxpVar;
                        egbs egbsVar2 = egbsVar;
                        if (ctcjVar3 == ctcj.WELCOME_FLOW_SETTINGS) {
                            daxpVar2.a(daxo.b, egbsVar2);
                        } else {
                            daxpVar2.a(daxo.a, egbsVar2);
                        }
                        return fctx.a;
                    }
                };
                hmwVar = hmwVar2;
                hmwVar.af(objS);
            } else {
                ctcjVar2 = ctcjVar;
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            dtdi.b((fdae) objS, icsVarK2, false, evmVar, null, gaqVarC, egdVar, daxm.a, hmlVarC, 817889280, 340);
            hmlVar2 = hmlVarC;
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dazf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    egbs egbsVar2 = egbsVar;
                    daxp daxpVar2 = daxpVar;
                    fdae fdaeVar3 = fdaeVar;
                    dazp.e(egbsVar2, daxpVar2, fdaeVar3, ctcjVar2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.daxs r36, final java.lang.String r37, defpackage.hml r38, final int r39) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dazp.f(daxs, java.lang.String, hml, int):void");
    }

    public static final void g(final edp edpVar, final daxu daxuVar, final dauy dauyVar, final gun gunVar, hml hmlVar, final int i) {
        int i2;
        dauyVar.getClass();
        gunVar.getClass();
        int i3 = i & 48;
        hml hmlVarC = hmlVar.c(2033119715);
        if (i3 == 0) {
            i2 = (true != ((i & 64) == 0 ? hmlVarC.D(daxuVar) : hmlVarC.F(daxuVar)) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dauyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(gunVar) ? 1024 : 2048;
        }
        if ((i2 & 1169) == 1168 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (daxuVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dazh
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            edp edpVar2 = edpVar;
                            dauy dauyVar2 = dauyVar;
                            dazp.g(edpVar2, null, dauyVar2, gunVar, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            b(daxuVar.a, daxuVar.b, hmlVarC, 0);
            ico icoVar = ics.e;
            egt.a(egq.e(icoVar, 48.0f), hmlVarC);
            c(daxuVar, dauyVar.a.b(), dauyVar.b, gunVar, hmlVarC, (i2 & 7168) | ((i2 >> 3) & 14) | 8);
            egt.a(egq.e(icoVar, 2.0f), hmlVarC);
            a(daxuVar.d, daxuVar.c, hmlVarC, 8);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dazi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    daxu daxuVar2 = daxuVar;
                    dauy dauyVar2 = dauyVar;
                    dazp.g(edpVar2, daxuVar2, dauyVar2, gunVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
