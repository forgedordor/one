package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yam {
    public static final void a(final ics icsVar, final xza xzaVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(289471452);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(xzaVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(xzaVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdae() { // from class: xzw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        xzaVar.e.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarE = dli.e(icsVar, false, null, (fdae) objS, 15);
            iiy iiyVar = xzb.a;
            ics icsVarJ = efy.j(icsVarE, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            eci eciVar = ecr.a;
            ixm ixmVarA = egk.a(eciVar, ibw.m, hmlVarC, 0);
            int iA = xzm.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
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
            xzl xzlVar = xzaVar.a;
            ico icoVar = ics.e;
            int i4 = i2;
            dkqr.h(xzlVar.a.a, egq.k(icoVar, 48.0f), hmlVarC, 48);
            egt.a(egq.k(icoVar, 8.0f), hmlVarC);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA2 = xzm.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icoVar);
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
            b(xzlVar, hmlVarC, 0);
            ixm ixmVarA3 = egk.a(eciVar, ibw.n, hmlVarC, 48);
            int iA3 = xzm.a(hmg.b(hmlVarC));
            hxi hxiVarAk3 = hmwVar.ak();
            ics icsVarB3 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA3, fdatVar);
            hsk.b(hmlVarC, hxiVarAk3, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmwVar.af(numValueOf3);
                hmlVarC.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB3, fdatVar4);
            f(xzaVar, hmlVarC, (i4 >> 3) & 14);
            hmlVarC.v(-1139856058);
            if (xzaVar.b) {
                egt.a(egq.o(icoVar, 4.0f), hmlVarC);
                inz inzVarB = djrs.b(djrr.aZ, hmlVarC);
                ics icsVarK = egq.k(icoVar, 20.0f);
                long j = dtey.a;
                dtfn.a(inzVarB, "ERROR", icsVarK, dtey.b, hmlVarC, 384, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i5 = i;
                    yam.a(icsVar2, xzaVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final xzl xzlVar, hml hmlVar, final int i) {
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(1920536548);
        if (((i2 == 0 ? (true != hmlVarC.F(xzlVar) ? 2 : 4) | i : i) & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVarC, 48);
            int iA = xzm.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
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
            hmlVarC.v(524813935);
            Iterator it = xzlVar.b.iterator();
            while (it.hasNext()) {
                d((String) it.next(), true, hmlVarC, 48, 0);
                c(hmlVarC, 0);
            }
            hmwVar.ab();
            String str = xzlVar.c;
            hmlVarC.v(524818086);
            if (str != null) {
                d(jqu.b(R.string.metatext_separator, hmlVarC), false, hmlVarC, 0, 2);
                c(hmlVarC, 0);
                d(str, false, hmlVarC, 0, 2);
                c(hmlVarC, 0);
            }
            hmwVar.ab();
            hmlVarC.v(524823389);
            for (djrr djrrVar : xzlVar.d) {
                c(hmlVarC, 0);
                inz inzVarB = djrs.b(djrrVar, hmlVarC);
                String strName = djrrVar.name();
                ics icsVarK = egq.k(icoVar, 12.0f);
                iiy iiyVar = xzb.a;
                dtfn.a(inzVarB, strName, icsVarK, xzb.a(hmlVarC), hmlVarC, 384, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    yam.b(xzlVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(hml hmlVar, int i) {
        final int i2;
        hml hmlVarC = hmlVar.c(-1803620204);
        if (i == 0) {
            i2 = 0;
            if (hmlVarC.I()) {
                hmlVarC.s();
            } else {
                i = 0;
                egt.a(egq.o(ics.e, 2.0f), hmlVarC);
                i2 = i;
            }
        } else {
            egt.a(egq.o(ics.e, 2.0f), hmlVarC);
            i2 = i;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yam.c((hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final String str, boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        hml hmlVar2;
        final boolean z2 = z;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-188147200);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            boolean z4 = z3 & z2;
            kcc kccVar = z4 ? kcc.h : kcc.e;
            iiy iiyVar = xzb.a;
            hmlVar2 = hmlVarC;
            dthx.b(str, null, xzb.a(hmlVar2), 0L, null, kccVar, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).l, hmlVar2, i3 & 14, 0, 65498);
            z2 = z4;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yaa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i6 = i;
                    yam.d(str2, z2, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1969357449);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarC = egq.c(icsVar, 1.0f);
            ixm ixmVarA = edl.a(ecr.e, ibw.k, hmlVarC, 54);
            int iA = xzm.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
            String strB = jqu.b(R.string.no_comments_yet, hmlVarC);
            long j = ije.d;
            hmlVar2 = hmlVarC;
            dthx.b(strB, null, j, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).g, hmlVar2, 384, 0, 65018);
            dthx.b(jqu.b(R.string.start_conversation_hint, hmlVarC), null, j, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVar2, 384, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yac
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    yam.e(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final xza xzaVar, hml hmlVar, final int i) {
        int i2;
        String string;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1522183337);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(xzaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            xzk xzkVar = xzaVar.d;
            if (xzkVar instanceof xzj) {
                hmlVarC.v(1765665244);
                g(((xzj) xzkVar).a, null, xzaVar.c, xzaVar.b, hmlVarC, 0, 2);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(xzkVar instanceof xzi)) {
                    hmlVarC.v(1765663239);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1765670334);
                xzi xziVar = (xzi) xzkVar;
                hmlVarC.v(858626087);
                if (xziVar instanceof xzc) {
                    hmlVarC.v(505952304);
                    string = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_audio_clip);
                    ((hmw) hmlVarC).ab();
                } else if (xziVar instanceof xzf) {
                    hmlVarC.v(505954827);
                    string = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_image);
                    ((hmw) hmlVarC).ab();
                } else if (xziVar instanceof xzh) {
                    hmlVarC.v(505957195);
                    string = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_video);
                    ((hmw) hmlVarC).ab();
                } else if (xziVar instanceof xze) {
                    hmlVarC.v(505959530);
                    string = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_file);
                    ((hmw) hmlVarC).ab();
                } else if (xziVar instanceof xzd) {
                    hmlVarC.v(505961931);
                    string = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_vcard);
                    ((hmw) hmlVarC).ab();
                } else {
                    if (!(xziVar instanceof xzg)) {
                        hmlVarC.v(505951114);
                        ((hmw) hmlVarC).ab();
                        throw new fctg();
                    }
                    hmlVarC.v(505964502);
                    string = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getString(R.string.attachment_unsupported_file);
                    ((hmw) hmlVarC).ab();
                }
                string.getClass();
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                h(string, xzaVar.c, xzaVar.b, hmlVarC, 0);
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    yam.f(xzaVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final java.lang.String r25, java.util.List r26, final java.lang.String r27, final boolean r28, defpackage.hml r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yam.g(java.lang.String, java.util.List, java.lang.String, boolean, hml, int, int):void");
    }

    public static final void h(final String str, final String str2, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-232919504);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 & 14;
            int i5 = i2 << 3;
            g(str, fcva.b(new diin(dijs.e, 0, str.length(), (fdap) null, 24)), str2, z, hmlVarC, i4 | (i5 & 896) | (i5 & 7168), 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yab
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    String str4 = str2;
                    int i6 = i;
                    yam.h(str3, str4, z, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final edp edpVar, final boolean z, final ekgb ekgbVar, final boolean z2, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-271337703);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(ekgbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cye.f(edpVar, z, edp.b(ics.e, 1.0f, true), dae.k(null, null, 15).a(dae.l(null, 3)), dae.q(null, null, 15).a(dae.m(null, 3)), null, hxe.d(-794757647, new yad(fdaeVar, ekgbVar, edpVar, z2), hmlVarC), hmlVarC, (i2 & 14) | 1600512 | (i2 & 112), 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    boolean z3 = z;
                    ekgb ekgbVar2 = ekgbVar;
                    boolean z4 = z2;
                    yam.i(edpVar2, z3, ekgbVar2, z4, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final hri hriVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(637790593);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(hriVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            iiy iiyVar = xzb.a;
            ics icsVarJ = efy.j(icsVarD, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: xzr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ivy ivyVar = (ivy) obj;
                        ivyVar.getClass();
                        hriVar.i((int) (ivyVar.g() & 4294967295L));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA = ixy.a(icsVarJ, (fdap) objS);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            int iA = xzm.a(hmg.b(hmlVarC));
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
            ics icsVarA2 = iex.a(icoVar, evn.a);
            long j = ije.a;
            hmlVar2 = hmlVarC;
            dthx.b(jqu.b(R.string.comments_overflow, hmlVarC), efy.e(dkl.a(icsVarA2, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.5f, ije.f(j)), ikj.a), 20.0f, 7.0f), ije.d, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).k, hmlVar2, 384, 0, 65016);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    yam.j(hriVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final edp edpVar, final ics icsVar, final ekgb ekgbVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        boolean z2;
        hmw hmwVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-903943329);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(ekgbVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            final ejy ejyVarA = ekb.a(0, hmlVarC, 3);
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new hph(0);
                hmwVar2.af(objS);
            }
            final hri hriVar = (hri) objS;
            hmwVar2.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar2.S();
            if (objS2 == obj) {
                objS2 = new hph(0);
                hmwVar2.af(objS2);
            }
            final hri hriVar2 = (hri) objS2;
            hmwVar2.ab();
            iiy iiyVar = xzb.a;
            final iiy iiyVar2 = xzb.a;
            boolean z3 = false;
            ics icsVarA = joj.a(edp.b(egq.d(ifb.c(ijn.c(icsVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 1, 458751), new fdap() { // from class: xzq
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    imw imwVar = (imw) obj2;
                    imwVar.getClass();
                    imwVar.p();
                    imy.i(imwVar, iiyVar2, 0L, 0L, 0.0f, null, 6, 62);
                    return fctx.a;
                }
            }), 1.0f), 1.0f, true), "ReplyOverlay.repliesList");
            hmlVarC.v(-1224400529);
            boolean zF = hmlVarC.F(ekgbVar);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            }
            boolean zD = zF | z3 | hmlVarC.D(ejyVarA);
            Object objS3 = hmwVar2.S();
            if (zD || objS3 == obj) {
                final boolean z4 = z2;
                fdap fdapVar = new fdap() { // from class: xzo
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        eio eioVar = (eio) obj2;
                        eioVar.getClass();
                        ekgb ekgbVar2 = ekgbVar;
                        int size = ekgbVar2.size();
                        int size2 = ekgbVar2.size();
                        yai yaiVar = new yai(ekgbVar2);
                        hri hriVar3 = hriVar;
                        eioVar.a(size2, null, yaiVar, new hxd(2039820996, true, new yaj(ekgbVar2, size, hriVar3)));
                        hri hriVar4 = hriVar2;
                        if (z4) {
                            ejk.a(eioVar, null, new hxd(1608480815, true, new yaf(hriVar4)), 3);
                        }
                        ejk.a(eioVar, null, new hxd(-1525017686, true, new yah(ejyVarA, hriVar3, hriVar4)), 3);
                        return fctx.a;
                    }
                };
                hmwVar = hmwVar2;
                hmwVar.af(fdapVar);
                objS3 = fdapVar;
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            eig.a(icsVarA, ejyVarA, null, true, null, null, null, false, null, (fdap) objS3, hmlVar2, 3072, 500);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzp
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    edp edpVar2 = edpVar;
                    ics icsVar2 = icsVar;
                    ekgb ekgbVar2 = ekgbVar;
                    yam.k(edpVar2, icsVar2, ekgbVar2, z, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final edk edkVar, final ics icsVar, final ybf ybfVar, hml hmlVar, final int i) {
        int i2;
        ybfVar.getClass();
        int i3 = i & 48;
        hml hmlVarC = hmlVar.c(380620860);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(ybfVar) ? 128 : 256;
        }
        if ((i2 & 145) == 144 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarC = egq.c(ics.e, 1.0f);
            fctx fctxVar = fctx.a;
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(ybfVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new yal(ybfVar);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA = itf.a(icsVarC, fctxVar, (PointerInputEventHandler) objS);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = xzm.a(hmg.b(hmlVarC));
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
            ics icsVarD = egq.d(icsVar, 1.0f);
            iiy iiyVar = xzb.a;
            ics icsVarA2 = edfVar.a(egq.b(efy.d(icsVarD, 24.0f), 0.8f), ibw.h);
            ixm ixmVarA2 = edl.a(ecr.d, ibw.j, hmlVarC, 6);
            int iA2 = xzm.a(hmg.b(hmlVarC));
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
            boolean z = ybfVar.c;
            ekgb ekgbVar = ybfVar.a;
            boolean z2 = ybfVar.b;
            fdae fdaeVar2 = ybfVar.d;
            i(edp.a, z, ekgbVar, z2, fdaeVar2, hmlVarC, 6);
            hmlVarC.n();
            hmlVarC.n();
            acx.a(false, fdaeVar2, hmlVarC, 0, 1);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xzv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edk edkVar2 = edkVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    yam.l(edkVar2, icsVar2, ybfVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
