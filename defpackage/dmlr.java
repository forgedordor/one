package defpackage;

import android.content.Context;
import androidx.camera.view.PreviewView;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmlr {
    /* JADX WARN: Removed duplicated region for block: B:49:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ics r27, final defpackage.fdpl r28, defpackage.hml r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmlr.a(ics, fdpl, hml, int, int):void");
    }

    public static final void b(final float f, final fdap fdapVar, final azg azgVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1538225022);
        if (i3 == 0) {
            i2 = (true != hmlVarC.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(azgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(lyj.a);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = ddq.a(0.0f);
                hmwVar.af(objS);
            }
            final ddp ddpVar = (ddp) objS;
            hmwVar.ab();
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS2);
            }
            final fdjx fdjxVar = (fdjx) objS2;
            int i4 = true != fdbq.f(azgVar, azg.a) ? R.string.camera_selector_button_front_content_description : R.string.camera_selector_button_rear_content_description;
            long j = dmpj.a;
            long j2 = dmpj.c;
            evm evmVar = evn.a;
            ics icsVarA = dkl.a(icsVar, j2, evmVar);
            dky dkyVarA = dkz.a(2.0f, ije.d);
            egd egdVar = new egd(10.0f, 10.0f, 10.0f, 10.0f);
            hmlVarC.v(-1224400529);
            boolean zF = ((i2 & 112) == 32) | hmlVarC.F(fdjxVar) | hmlVarC.F(ddpVar) | hmlVarC.F(lvjVar);
            Object objS3 = hmwVar.S();
            if (zF || objS3 == obj) {
                objS3 = new fdae() { // from class: dmko
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdil.d(fdjxVar, null, null, new dmlk(ddpVar, null), 3);
                        fdapVar.invoke(lvjVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            gax.c((fdae) objS3, icsVarA, false, evmVar, null, dkyVarA, egdVar, hxe.d(1646262224, new dmll(icsVar, ddpVar, f, i4), hmlVarC), hmlVarC, 819462144);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkp
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    float f2 = f;
                    fdap fdapVar2 = fdapVar;
                    azg azgVar2 = azgVar;
                    dmlr.b(f2, fdapVar2, azgVar2, icsVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(boolean z, hml hmlVar, final int i) {
        int i2;
        final boolean z2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1921055058);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            z2 = z;
        } else {
            des desVar = dev.d;
            z2 = z;
            cye.b(z2, null, dae.l(dea.c(100, 0, desVar, 2), 2), dae.m(new dia(300, 100, desVar), 2), null, dmpi.a, hmlVarC, (i2 & 14) | 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmlr.c(z2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final dmoz dmozVar, final float f, ics icsVar, boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        final ics icsVar2;
        final boolean z2;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-653746324);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dmozVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        int i6 = i2 & 8;
        boolean z3 = i6 == 0;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
            z2 = z;
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            ics icsVar3 = icsVar;
            boolean z4 = (!z3) | z;
            boolean z5 = dmozVar.r;
            hmlVarC.v(1920143479);
            i(dmozVar, f, icsVar3, z4, hmlVarC, i3 & 8190);
            ((hmw) hmlVarC).ab();
            acx.a(false, dmozVar.n, hmlVarC, 0, 1);
            icsVar2 = icsVar3;
            z2 = z4;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmky
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmoz dmozVar2 = dmozVar;
                    float f2 = f;
                    ics icsVar4 = icsVar2;
                    dmlr.d(dmozVar2, f2, icsVar4, z2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final boolean e(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    public static final void f(final dmoz dmozVar, float f, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3;
        fdat fdatVar;
        hml hmlVar2;
        fdat fdatVar2;
        int i4;
        float f2;
        fdat fdatVar3;
        boolean z;
        hml hmlVar3;
        final float f3 = f;
        int i5 = i & 6;
        hml hmlVarC = hmlVar.c(-285778221);
        if (i5 == 0) {
            i2 = (true != hmlVarC.D(dmozVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(f3) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar3 = hmlVarC;
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(lyj.a);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 54);
            int iA = dmka.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar4 = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar4);
            fdat fdatVar5 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar5);
            fdat fdatVar6 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar6);
            }
            fdat fdatVar7 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar7);
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                i3 = i2;
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            } else {
                i3 = i2;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            Object obj2 = null;
            if (!e(hoxVar) || dmozVar.f) {
                fdatVar = fdatVar6;
                hmlVar2 = hmlVarC;
                fdatVar2 = fdatVar5;
                i4 = 6;
                hmlVar2.v(-2024093988);
                f2 = 24.0f;
                egt.a(egq.e(ics.e, 24.0f), hmlVar2);
                dmtb.a(dmozVar.g, null, f3, hmlVar2, (i3 << 3) & 896);
                hmwVar.ab();
            } else {
                hmlVarC.v(-2024797068);
                List list = dmozVar.m;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i4 = 6;
                        break;
                    }
                    Object next = it.next();
                    i4 = 6;
                    if (((dmsb) next).c) {
                        obj2 = next;
                        break;
                    }
                }
                dmsb dmsbVar = (dmsb) obj2;
                if (dmsbVar == null) {
                    dmsbVar = (dmsb) fcva.N(list);
                    dmsbVar.f.invoke(lvjVar);
                }
                ics icsVarA = iex.a(efy.j(ics.e, 8.0f, 0.0f, 8.0f, 0.0f, 10), evn.a);
                long j = dmpj.a;
                fdatVar2 = fdatVar5;
                ics icsVarA2 = dkl.a(icsVarA, dmpj.c, ikj.a);
                hmlVarC.v(5004770);
                boolean zF = hmlVarC.F(lvjVar);
                Object objS2 = hmwVar.S();
                if (zF || objS2 == obj) {
                    objS2 = new fdap() { // from class: dmkj
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            dmsb dmsbVar2 = (dmsb) obj3;
                            dmsbVar2.getClass();
                            dmsbVar2.f.invoke(lvjVar);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                fdatVar = fdatVar6;
                hmlVar2 = hmlVarC;
                f3 = f;
                dmsm.c(list, dmsbVar.d, icsVarA2, f3, (fdap) objS2, hmlVar2, (i3 << 6) & 7168);
                hmwVar.ab();
                f2 = 24.0f;
            }
            ico icoVar = ics.e;
            egt.a(egq.e(icoVar, f2), hmlVar2);
            ecj ecjVar = ecr.e;
            ixm ixmVarA2 = egk.a(ecjVar, ibw.n, hmlVar2, 54);
            int iA2 = dmka.a(hmg.b(hmlVar2));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVar2, icoVar);
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA2, fdatVar4);
            hsk.b(hmlVar2, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVar2.h(numValueOf2, fdatVar);
            }
            hsk.b(hmlVar2, icsVarB2, fdatVar7);
            egp egpVar = egp.a;
            ics icsVarA3 = egpVar.a(icoVar, 1.0f, true);
            icc iccVar = ibw.m;
            ixm ixmVarA3 = egk.a(ecjVar, iccVar, hmlVar2, i4);
            int iA3 = dmka.a(hmg.b(hmlVar2));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVar2, icsVarA3);
            hmlVar2.x();
            if (hmwVar.z) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA3, fdatVar4);
            hsk.b(hmlVar2, hxiVarAk3, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVar2.h(numValueOf3, fdatVar);
            }
            hsk.b(hmlVar2, icsVarB3, fdatVar7);
            if (dmozVar.m.isEmpty() || dmozVar.f) {
                fdatVar3 = fdatVar7;
                z = false;
            } else {
                fdatVar3 = fdatVar7;
                z = true;
            }
            fdat fdatVar8 = fdatVar2;
            fdat fdatVar9 = fdatVar3;
            fdat fdatVar10 = fdatVar;
            hml hmlVar4 = hmlVar2;
            cye.c(egpVar, z, null, dae.n(q(), 0.0f, 0L, 6), dae.o(q(), 0.0f, 0L, 6), null, hxe.d(1133410173, new dmlc(f3, hoxVar), hmlVar2), hmlVar4, 1572870, 18);
            hmlVar4.n();
            fdae fdaeVar2 = dmozVar.k;
            dmqz dmqzVar = dmozVar.p;
            boolean z2 = dmozVar.f;
            Duration duration = dmozVar.e;
            int i6 = dmozVar.a;
            long j2 = dmpj.a;
            dmqw.b(fdaeVar2, dmqzVar, z2, duration, i6, egq.k(icoVar, 76.0f), hmlVar4, 196608);
            ics icsVarA4 = egpVar.a(icoVar, 1.0f, true);
            ixm ixmVarA4 = egk.a(ecjVar, iccVar, hmlVar4, 6);
            int iA4 = dmka.a(hmg.b(hmlVar4));
            hxi hxiVarAk4 = hmwVar.ak();
            ics icsVarB4 = icj.b(hmlVar4, icsVarA4);
            hmlVar4.x();
            if (hmwVar.z) {
                hmlVar4.j(fdaeVar);
            } else {
                hmlVar4.z();
            }
            hsk.b(hmlVar4, ixmVarA4, fdatVar4);
            hsk.b(hmlVar4, hxiVarAk4, fdatVar8);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA4))) {
                Integer numValueOf4 = Integer.valueOf(iA4);
                hmwVar.af(numValueOf4);
                hmlVar4.h(numValueOf4, fdatVar10);
            }
            hsk.b(hmlVar4, icsVarB4, fdatVar9);
            cye.c(egpVar, !z2, null, dae.n(q(), 0.0f, 0L, 6), dae.o(q(), 0.0f, 0L, 6), null, hxe.d(-1765418138, new dmld(f3, dmozVar), hmlVar4), hmlVar4, 1572870, 18);
            hmlVar4.n();
            hmlVar4.n();
            egt.a(egq.e(icoVar, 26.0f), hmlVar4);
            czd.a(Boolean.valueOf(z2), null, dea.c(300, 0, new den(0.0f, 0.0f, 0.0f, 1.0f), 2), "Recording timer crossfade animation.", hxe.d(-60941506, new dmle(dmozVar), hmlVar4), hmlVar4, 28032, 2);
            hmlVar3 = hmlVar4;
            hmlVar3.n();
        }
        hpx hpxVarL = hmlVar3.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkk
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dmoz dmozVar2 = dmozVar;
                    float f4 = f3;
                    int i7 = i;
                    dmlr.f(dmozVar2, f4, icsVar, (hml) obj3, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final ics icsVar, final dmoz dmozVar, float f, final jfw jfwVar, hml hmlVar, final int i) {
        int i2;
        final float f2 = f;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(669038023);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dmozVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.A(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(jfwVar) : hmlVarC.F(jfwVar)) ? 1024 : 2048;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            long j = dmpj.a;
            ics icsVar2 = dmpj.e;
            long j2 = ije.a;
            ics icsVarA = icsVar.a(dkl.a(icsVar2, j2, ikj.a));
            ixm ixmVarA = ecz.a(ibw.b, false);
            int iA = dmka.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            edf edfVar = edf.a;
            ico icoVar = ics.e;
            ics icsVarA2 = dkl.a(icoVar, j2, ikj.a);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.k, hmlVarC, 54);
            int iA2 = dmka.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarA2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            ics icsVarD = egq.d(icoVar, 1.0f);
            boolean z = dmozVar.r;
            int i5 = (i4 >> 3) & 126;
            f2 = f;
            d(dmozVar, f2, icsVarD, false, hmlVarC, i5, 8);
            boolean z2 = dmozVar.q;
            k(jfwVar, dmpj.f, hmlVarC, ((i4 >> 9) & 14) | 392);
            hmlVarC.n();
            f(dmozVar, f2, edfVar.a(egq.d(efy.j(icoVar, 0.0f, 0.0f, 0.0f, 24.0f, 7), 1.0f), ibw.h), hmlVarC, i5);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    dmoz dmozVar2 = dmozVar;
                    float f3 = f2;
                    dmlr.g(icsVar3, dmozVar2, f3, jfwVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final ics icsVar, final dmoz dmozVar, float f, hml hmlVar, final int i) {
        int i2;
        final float f2 = f;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-554663565);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dmozVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.A(f2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            long j = dmpj.a;
            ics icsVarA = icsVar.a(dkl.a(dmpj.e, glz.a(hmlVarC).p, ikj.a));
            ixm ixmVarA = ecz.a(ibw.b, false);
            int iA = dmka.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            ics icsVar2 = dmpj.f;
            ixm ixmVarA2 = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            int iA2 = dmka.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVar2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            boolean z = dmozVar.r;
            int i4 = i2 >> 3;
            f2 = f;
            d(dmozVar, f2, idb.a(icsVarD, 2.0f), false, hmlVarC, (i4 & 14) | 3072 | (i4 & 112), 0);
            dmue.c(edp.b(icoVar, 1.0f, true), 1, hmlVarC, 48);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    dmoz dmozVar2 = dmozVar;
                    int i5 = i;
                    dmlr.h(icsVar3, dmozVar2, f2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final dmoz dmozVar, final float f, final ics icsVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(69585416);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dmozVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hck hckVarB = dtil.b(ije.g, 0L, 0L, 0L, 0L, hmlVarC, 62);
            hmlVarC = hmlVarC;
            dtct.a(dmpi.b, icsVar, hxe.d(470540366, new dmln(dmozVar), hmlVarC), hxe.d(280256951, new dmlo(dmozVar, z, f), hmlVarC), 0.0f, null, hckVarB, null, hmlVarC, ((i2 >> 3) & 112) | 3462, 176);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmks
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmoz dmozVar2 = dmozVar;
                    float f2 = f;
                    ics icsVar2 = icsVar;
                    dmlr.i(dmozVar2, f2, icsVar2, z, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(ics icsVar, final dmoz dmozVar, float f, final jfw jfwVar, hml hmlVar, final int i) {
        ics icsVar2;
        float f2 = f;
        hml hmlVarC = hmlVar.c(470506709);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dmozVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.A(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? hmlVarC.D(jfwVar) : hmlVarC.F(jfwVar)) ? 1024 : 2048;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = ics.e;
            long j = dmpj.a;
            ics icsVarA = dkl.a(dmpj.e, glz.a(hmlVarC).p, ikj.a);
            iby ibyVar = ibw.b;
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = dmka.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            edf edfVar = edf.a;
            ics icsVar3 = dmpj.f;
            ixm ixmVarA2 = ecz.a(ibyVar, false);
            int iA2 = dmka.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVar3);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            ics icsVarD = egq.d(icsVar2, 1.0f);
            boolean z = dmozVar.r;
            ics icsVarA2 = idb.a(icsVarD, 2.0f);
            int i4 = (i3 >> 3) & 126;
            f2 = f;
            d(dmozVar, f2, icsVarA2, false, hmlVarC, i4, 8);
            boolean z2 = dmozVar.q;
            k(jfwVar, edfVar.b(icsVar2), hmlVarC, ((i3 >> 9) & 14) | 8);
            dmso dmsoVar = dmozVar.o;
            dmqh.a(edfVar, dmsoVar, hmlVarC, 6);
            hmlVarC.n();
            f(dmozVar, f2, edfVar.a(egq.d(efy.j(icsVar2, 0.0f, 0.0f, 0.0f, ((kir) ddu.b(dmsoVar.a() ? 32.0f : dmpj.d, dea.c(500, 0, new den(0.2f, 0.0f, 0.0f, 1.0f), 2), hmlVarC, 48, 12).a()).a, 7), 1.0f), ibw.h), hmlVarC, i4);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final float f3 = f2;
            final ics icsVar4 = icsVar2;
            hpxVarL.d = new fdat() { // from class: dmki
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar5 = icsVar4;
                    dmoz dmozVar2 = dmozVar;
                    float f4 = f3;
                    dmlr.j(icsVar5, dmozVar2, f4, jfwVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final jfw jfwVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1546219229);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(jfwVar) : hmlVarC.F(jfwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(lyj.a);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dmka.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
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
            hmlVarC.v(5004770);
            int i4 = i2 & 112;
            Object objS2 = hmwVar.S();
            if (i4 == 32 || objS2 == obj) {
                objS2 = new fdap() { // from class: dmku
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Context context = (Context) obj2;
                        context.getClass();
                        PreviewView previewView = new PreviewView(context);
                        previewView.setClipToOutline(true);
                        return previewView;
                    }
                };
                hmwVar.af(objS2);
            }
            fdap fdapVar = (fdap) objS2;
            hmwVar.ab();
            ics icsVarC = egq.c(ics.e, 1.0f);
            hmlVarC.v(-1746271574);
            boolean zF = ((i2 & 14) == 4 || ((i2 & 8) != 0 && hmlVarC.F(jfwVar))) | hmlVarC.F(lvjVar);
            Object objS3 = hmwVar.S();
            if (zF || objS3 == obj) {
                objS3 = new fdap() { // from class: dmkv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        PreviewView previewView = (PreviewView) obj2;
                        previewView.getClass();
                        jfwVar.a = previewView;
                        final hox hoxVar2 = hoxVar;
                        previewView.e.f(lvjVar, new dmlq(new fdap() { // from class: dmkl
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                hoxVar2.b(Boolean.valueOf(((ciq) obj3) == ciq.STREAMING));
                                return fctx.a;
                            }
                        }));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            kli.b(fdapVar, icsVarC, (fdap) objS3, hmlVarC, 48, 0);
            c(!((Boolean) hoxVar.a()).booleanValue(), hmlVarC, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkw
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    jfw jfwVar2 = jfwVar;
                    int i5 = i;
                    dmlr.k(jfwVar2, icsVar, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(678420902);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.E(false) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(lyj.a);
            dixo[] dixoVarArr = new dixo[2];
            String strB = jqu.b(R.string.camera_mode_photo, hmlVarC);
            String strB2 = jqu.b(R.string.camera_mode_photo_content_description, hmlVarC);
            hmlVarC.v(-1633490746);
            boolean z = (i2 & 112) == 32;
            boolean zF = hmlVarC.F(lvjVar) | z;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: dmke
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        fdauVar.a(lvjVar, 1, bool);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dixoVarArr[0] = new dixo(strB, strB2, (fdap) objS);
            String strB3 = jqu.b(R.string.camera_mode_video, hmlVarC);
            String strB4 = jqu.b(R.string.camera_mode_video_content_description, hmlVarC);
            hmlVarC.v(-1633490746);
            boolean zF2 = z | hmlVarC.F(lvjVar);
            Object objS2 = hmwVar.S();
            if (zF2 || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: dmkf
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        fdauVar.a(lvjVar, 4, bool);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dixoVarArr[1] = new dixo(strB3, strB4, (fdap) objS2);
            diyj.e(new diyl(fcva.g(dixoVarArr), new diyk()), egq.d(ics.e, 1.0f), hmlVarC, 48);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    dmlr.l(fdauVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final Duration duration, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1303914597);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(duration) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarE = egq.e(icoVar, 32.0f);
            long j = dmpj.a;
            ics icsVarA = dkl.a(icsVarE, dmpj.a, evn.a(50));
            ixm ixmVarA = edl.a(ecr.h, ibw.k, hmlVarC, 54);
            int iA = dmka.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
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
            final String strC = jqu.c(R.string.camera_recording_time_content_description, new Object[]{Long.valueOf(duration.getSeconds())}, hmlVarC);
            dpzo dpzoVar = new dpzo(duration, dmpj.b, glz.d(hmlVarC).h);
            ics icsVarJ = efy.j(icoVar, 17.0f, 0.0f, 17.0f, 0.0f, 10);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(strC);
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: dmkq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.k(jtoVar, strC);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dpzt.a(dpzoVar, jsh.c(icsVarJ, false, (fdap) objS), hmlVarC, 0, 0);
            hmlVarC.n();
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Duration duration2 = duration;
                    int i3 = i;
                    dmlr.m(duration2, icsVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(fdae fdaeVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-436779437);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            ico icoVar = ics.e;
            fdaeVar2 = fdaeVar;
            gjz.b(fdaeVar2, icoVar, false, null, null, dmpi.c, hmlVarC, (i4 & 14) | 1572864 | (i4 & 112), 60);
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar2;
                    int i5 = i;
                    dmlr.n(fdaeVar3, icsVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final float f, final fdae fdaeVar, final boolean z, final int i, ics icsVar, hml hmlVar, final int i2) {
        int i3;
        fdae fdaeVar2;
        final ics icsVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(2057627628);
        if (i4 == 0) {
            i3 = (true != hmlVarC.A(f) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            fdaeVar2 = fdaeVar;
            i3 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.B(i) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if ((i5 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            ico icoVar = ics.e;
            List listG = i != 1 ? i != 2 ? fcva.g(Integer.valueOf(R.drawable.gs_flash_auto_vd_theme_24), Integer.valueOf(R.string.camera_flash_mode_auto_button_content_description)) : fcva.g(Integer.valueOf(R.drawable.gs_flash_off_vd_theme_24), Integer.valueOf(R.string.camera_flash_mode_off_button_content_description)) : fcva.g(Integer.valueOf(R.drawable.gs_flash_on_vd_theme_24), Integer.valueOf(R.string.camera_flash_mode_on_button_content_description));
            gjz.b(fdaeVar2, icoVar, !z, null, null, hxe.d(-1435284338, new dmlm(((Number) listG.get(0)).intValue(), f, ((Number) listG.get(1)).intValue()), hmlVarC), hmlVarC, ((i5 >> 3) & 14) | 1572864 | ((i5 >> 9) & 112), 56);
            icsVar2 = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmkn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    fdae fdaeVar3 = fdaeVar;
                    boolean z2 = z;
                    int i6 = i;
                    dmlr.o(f2, fdaeVar3, z2, i6, icsVar2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final float p(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    private static final dia q() {
        return dea.c(350, 0, new den(0.3f, 0.0f, 0.8f, 0.15f), 2);
    }

    private static final ics r(ics icsVar, igr igrVar, fdae fdaeVar, hml hmlVar) {
        hmlVar.v(-234403439);
        hmlVar.v(5004770);
        boolean zD = hmlVar.D(fdaeVar);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new dmlp(fdaeVar);
            hmwVar.af(objS);
        }
        hmwVar.ab();
        ics icsVarA = dme.a(igt.a(iqk.a(icsVar, (fdap) objS), igrVar), true, null);
        hmwVar.ab();
        return icsVarA;
    }
}
