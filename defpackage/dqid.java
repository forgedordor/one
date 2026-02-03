package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqid {
    public static final void a(final boolean z, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(893910622);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = z ? R.drawable.gs_mic_noise_cancel_high_vd_theme_24 : R.drawable.gs_mic_noise_cancel_off_vd_theme_24;
            int i5 = z ? R.string.noise_cancellation_on : R.string.noise_cancellation_off;
            eve eveVar = glz.c(hmlVarC).b;
            evf evfVarA = evh.a(50);
            dtds.a(z, fdaeVar, hxe.d(1210934731, new dqhj(i5), hmlVarC), null, false, hxe.d(1973667240, new dqhk(i4), hmlVarC), new evm(evfVarA, evfVarA, evfVarA, evfVarA), dtex.a(glz.a(hmlVarC).n, glz.a(hmlVarC).o, glz.a(hmlVarC).o, hmlVarC, 2431), null, null, hmlVarC, (i2 & 14) | 196992 | (i2 & 112), 0, 3672);
            hmlVarC = hmlVarC;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqhf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i6 = i;
                    dqid.a(z2, fdaeVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dqiu dqiuVar, final dipu dipuVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2074869296);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dqiuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dipuVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(ics.e, 1.0f);
            hmlVarC.v(-1066585843);
            hmlVarC.v(-487940011);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new kpv(kioVar);
                hmwVar.af(objS);
            }
            kpv kpvVar = (kpv) objS;
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new kph();
                hmwVar.af(objS2);
            }
            kph kphVar = (kph) objS2;
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS3 = hplVar;
            }
            hox hoxVar = (hox) objS3;
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = new kpo(kphVar);
                hmwVar.af(objS4);
            }
            kpo kpoVar = (kpo) objS4;
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                hpl hplVar2 = new hpl(fctx.a, hpb.a);
                hmwVar.af(hplVar2);
                objS5 = hplVar2;
            }
            hox hoxVar2 = (hox) objS5;
            boolean zF = hmlVarC.F(kpvVar) | hmlVarC.B(257);
            Object objS6 = hmwVar.S();
            if (zF || objS6 == obj) {
                objS6 = new dqhm(hoxVar2, kpvVar, kpoVar, hoxVar);
                hmwVar.af(objS6);
            }
            ixm ixmVar = (ixm) objS6;
            Object objS7 = hmwVar.S();
            if (objS7 == obj) {
                objS7 = new dqhn(hoxVar, kpoVar);
                hmwVar.af(objS7);
            }
            boolean zF2 = hmlVarC.F(kpvVar);
            Object objS8 = hmwVar.S();
            if (zF2 || objS8 == obj) {
                objS8 = new dqho(kpvVar);
                hmwVar.af(objS8);
            }
            iwh.b(jsh.c(icsVarD, false, (fdap) objS8), hxe.d(-1759682870, new dqhp(hoxVar2, kphVar, dqiuVar, dipuVar), hmlVarC), ixmVar, hmlVarC, 48);
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqhi
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dqiu dqiuVar2 = dqiuVar;
                    int i4 = i;
                    dqid.b(dqiuVar2, dipuVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hml r25, int r26) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqid.c(hml, int):void");
    }

    public static final boolean d(dqga dqgaVar, dqix dqixVar) {
        return ((Boolean) dqgaVar.a.c()).booleanValue() && !dqgaVar.b.isEmpty() && (dqixVar instanceof dqiu);
    }

    public static final void e(final fdpl fdplVar, final fdpl fdplVar2, final dqfz dqfzVar, dqga dqgaVar, hml hmlVar, final int i) {
        int i2;
        dipk dipkVar;
        final dqga dqgaVar2 = dqgaVar;
        hml hmlVarC = hmlVar.c(1415415211);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdplVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdplVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dqfzVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(dqgaVar2) ? 1024 : 2048;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            dqix dqixVar = (dqix) hsb.b(fdplVar, dqiv.a, null, hmlVarC, 2).a();
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new iac();
                hmwVar.af(objS2);
            }
            iac iacVar = (iac) objS2;
            hmwVar.ab();
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(fdjxVar) | hmlVarC.F(fdplVar2);
            Object objS3 = hmwVar.S();
            if (zF || objS3 == obj) {
                objS3 = new dqhv(fdjxVar, fdplVar2, iacVar, null);
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            hob.g(fdjxVar, (fdat) objS3, hmlVarC);
            boolean z = dqixVar instanceof dqiu;
            dqiu dqiuVar = z ? (dqiu) dqixVar : null;
            hmlVarC.v(-1290592266);
            if (dqiuVar == null) {
                dipkVar = null;
            } else {
                hmlVarC.v(5004770);
                dqfx dqfxVar = dqiuVar.f;
                boolean zF2 = hmlVarC.F(dqfxVar);
                Object objS4 = hmwVar.S();
                if (zF2 || objS4 == obj) {
                    objS4 = new dqia(dqfxVar);
                    hmwVar.af(objS4);
                }
                hmwVar.ab();
                fdap fdapVar = (fdap) ((fdea) objS4);
                hmlVarC.v(5004770);
                boolean zF3 = hmlVarC.F(dqfxVar);
                Object objS5 = hmwVar.S();
                if (zF3 || objS5 == obj) {
                    objS5 = new dqib(dqfxVar);
                    hmwVar.af(objS5);
                }
                float f = dqiuVar.e;
                hmwVar.ab();
                dipkVar = new dipk(f, fdapVar, (fdae) ((fdea) objS5));
            }
            hmwVar.ab();
            dipu dipuVar = new dipu(iacVar, dipkVar);
            dqic dqicVar = new dqic(dqfzVar, (iqa) hmlVarC.e(jmh.h), iacVar, dqixVar);
            ics icsVarA = joj.a(efy.d(ics.e, 8.0f), "voice_screen");
            ixm ixmVarA = edl.a(ecr.g(8.0f), ibw.j, hmlVarC, 6);
            int iA = dqhe.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
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
            dqgaVar2 = dqgaVar;
            hnj.a(jmh.j.c(kji.a), hxe.d(-625942731, new dqhz(dqgaVar, dqixVar, edp.a, dqicVar, dipuVar), hmlVarC), hmlVarC, 56);
            hmlVarC.v(-1942184467);
            if (d(dqgaVar2, dqixVar)) {
                if (!z) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                dqgh.b((dqiu) dqixVar, dqgaVar2, null, hmlVarC, (i3 >> 6) & 112);
            }
            hmwVar.ab();
            dqfp.g(dqixVar, ((Boolean) hro.a(dqgaVar2.a, hmlVarC).a()).booleanValue(), dqicVar, hmlVarC, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqhh
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    fdpl fdplVar3 = fdplVar;
                    fdpl fdplVar4 = fdplVar2;
                    dqfz dqfzVar2 = dqfzVar;
                    dqid.e(fdplVar3, fdplVar4, dqfzVar2, dqgaVar2, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final dpzo f(dqix dqixVar, float f, hml hmlVar) {
        dpzo dpzoVar;
        long j;
        dqixVar.getClass();
        hmlVar.v(-485633043);
        if (dqixVar instanceof dqiw) {
            hmlVar.v(1458085107);
            dpzk dpzkVar = new dpzk(f, glz.a(hmlVar).w);
            dqiw dqiwVar = (dqiw) dqixVar;
            Duration duration = dqiwVar.a;
            Duration durationMinus = dqiwVar.b.minus(duration);
            Duration duration2 = dqgk.a;
            if (durationMinus.compareTo(dqgk.a) <= 0) {
                hmlVar.v(-2043786084);
                j = glz.a(hmlVar).w;
                hmlVar.o();
            } else {
                hmlVar.v(-2043723464);
                j = glz.a(hmlVar).q;
                hmlVar.o();
            }
            dpzoVar = new dpzo(dpzkVar, duration, j, glz.d(hmlVar).f);
            hmlVar.o();
        } else if (dqixVar instanceof dqiu) {
            hmlVar.v(1458099813);
            dqiu dqiuVar = (dqiu) dqixVar;
            Duration duration3 = dqiuVar.d;
            if (fdbq.f(duration3, Duration.ZERO)) {
                duration3 = dqiuVar.a;
            }
            hmlVar.v(1458105916);
            long j2 = dqct.c(dqiuVar.g) ? ije.a : glz.a(hmlVar).q;
            hmlVar.o();
            dpzoVar = new dpzo(duration3, j2, glz.d(hmlVar).m);
            hmlVar.o();
        } else {
            hmlVar.v(-2043140944);
            hmlVar.o();
            dpzoVar = null;
        }
        hmlVar.o();
        return dpzoVar;
    }
}
