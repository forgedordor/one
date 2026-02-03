package defpackage;

import android.content.Context;
import android.graphics.BitmapShader;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dldw {
    public static final hpt a = new hnz(hsi.a, dldu.a);

    public static final void a(final dlfr dlfrVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-578400234);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlfrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            if (dlfrVar.b().b()) {
                hmlVarC.v(287676985);
                j = glz.a(hmlVarC).a;
                hmwVar.ab();
            } else {
                hmlVarC.v(287733746);
                j = glz.a(hmlVarC).B;
                hmwVar.ab();
            }
            dky dkyVarA = dkz.a(1.0f, j);
            egd egdVar = new egd(16.0f, 12.0f, 16.0f, 12.0f);
            fdae fdaeVarA = dlfrVar.a();
            hmlVarC.v(-1791818436);
            ics icsVarX = egq.x(icsVar, h(dlfrVar, hmlVarC), 0.0f, 2);
            if (hoxVar.a() != null) {
                icsVarX = icsVarX.a(efy.i(ics.e, 0.0f, Math.max(Math.min(fdcu.b((((int) (((jyi) r8).c & 4294967295L)) / (((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics().ydpi / 160.0f)) + 24.0f), 48) - 40, 0) / 2, 1));
            }
            hmwVar.ab();
            ics icsVarA = dihi.a(icsVarX, dlfrVar.d(), true);
            evm evmVarB = evn.b(dlfrVar.b().a());
            egc egcVar = dtdc.a;
            dtdi.d(fdaeVarA, icsVarA, false, evmVarB, dtdc.e(g(hmlVarC), 0L, hmlVarC, 14), dkyVarA, egdVar, hxe.d(392751496, new dlds(dlfrVar, hoxVar), hmlVarC), hmlVarC, 817889280, 292);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlfr dlfrVar2 = dlfrVar;
                    int iA = hpy.a(i4 | 1);
                    dldw.a(dlfrVar2, icsVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dlfr dlfrVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1787602499);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlfrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dky dkyVar = new dky(1.0f, new iiz(new BitmapShader(iig.a(jqm.b(R.drawable.chipbg, hmlVarC)), iiq.a(0), iiq.a(0))));
            egd egdVar = new egd(12.0f, 4.0f, 12.0f, 4.0f);
            fdae fdaeVarA = dlfrVar.a();
            ics icsVarA = dihi.a(egq.x(icsVar, h(dlfrVar, hmlVarC), 0.0f, 2), dlfrVar.d(), true);
            evm evmVarB = evn.b(dlfrVar.b().a());
            egc egcVar = dtdc.a;
            dtdi.d(fdaeVarA, icsVarA, false, evmVarB, dtdc.e(g(hmlVarC), 0L, hmlVarC, 14), dkyVar, egdVar, hxe.d(119619723, new dldt(dlfrVar), hmlVarC), hmlVarC, 817889280, 292);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlfr dlfrVar2 = dlfrVar;
                    int iA = hpy.a(i4 | 1);
                    dldw.b(dlfrVar2, icsVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ego egoVar, final dlfr dlfrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1110296460);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dlfrVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarB = egoVar.b(egq.k(ics.e, 18.0f), ibw.n);
            if (dlfrVar instanceof dlfq) {
                hmlVarC.v(-1298450911);
                dlfq dlfqVar = (dlfq) dlfrVar;
                dlfp dlfpVar = dlfqVar.a;
                if (dlfpVar instanceof dlfn) {
                    hmlVarC.v(-1298344736);
                    dtfn.a(jqq.a(((dlfn) dlfpVar).a, hmlVarC, 0), null, icsVarB, i(dlfqVar.b, hmlVarC), hmlVarC, 0, 0);
                    ((hmw) hmlVarC).ab();
                } else {
                    if (!(dlfpVar instanceof dlfo)) {
                        hmlVarC.v(-1843000589);
                        ((hmw) hmlVarC).ab();
                        throw new fctg();
                    }
                    hmlVarC.v(-1298040037);
                    djrv.a(((dlfo) dlfpVar).a, null, icsVarB, null, null, null, null, null, 0.0f, null, null, null, "ResourceUri", null, null, null, hmlVarC, 0, 196608, 491512);
                    hmlVarC = hmlVarC;
                    ((hmw) hmlVarC).ab();
                }
                ((hmw) hmlVarC).ab();
            } else {
                if (!(dlfrVar instanceof dlfk)) {
                    hmlVarC.v(-1843002338);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-1297777963);
                dlfk dlfkVar = (dlfk) dlfrVar;
                djrr djrrVar = dlfkVar.a;
                hmlVarC.v(-1842978691);
                inz inzVarB = djrrVar == null ? null : djrs.b(djrrVar, hmlVarC);
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                if (inzVarB != null) {
                    dtfn.a(inzVarB, null, icsVarB, i(dlfkVar.b, hmlVarC), hmlVarC, 0, 0);
                }
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ego egoVar2 = egoVar;
                    int iA = hpy.a(i4 | 1);
                    dldw.c(egoVar2, dlfrVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final dlfr dlfrVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1110554840);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlfrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dlen dlenVarB = dlfrVar.b();
            boolean z = dlenVarB instanceof dlek;
            dlek dlekVar = z ? (dlek) dlenVarB : null;
            fdat fdatVar = dlekVar != null ? dlekVar.a : null;
            if (z) {
            }
            if (fdatVar != null) {
                hmlVarC.v(-405801005);
                j = ((ije) fdatVar.a(hmlVarC, 0)).i;
                ((hmw) hmlVarC).ab();
            } else if (dlenVarB.b()) {
                hmlVarC.v(-405655801);
                j = glz.a(hmlVarC).a;
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-405599040);
                j = glz.a(hmlVarC).B;
                ((hmw) hmlVarC).ab();
            }
            dky dkyVarA = dkz.a(1.0f, j);
            egd egdVar = new egd(12.0f, 4.0f, 12.0f, 4.0f);
            evm evmVarB = evn.b(dlfrVar.b().a());
            fdae fdaeVarA = dlfrVar.a();
            ics icsVarA = dihi.a(egq.x(icsVar, h(dlfrVar, hmlVarC), 0.0f, 2), dlfrVar.d(), true);
            egc egcVar = dtdc.a;
            dtdi.d(fdaeVarA, icsVarA, false, evmVarB, dtdc.e(g(hmlVarC), 0L, hmlVarC, 14), dkyVarA, egdVar, hxe.d(-1459431526, new dldv(dlfrVar), hmlVarC), hmlVarC, 817889280, 292);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlfr dlfrVar2 = dlfrVar;
                    int iA = hpy.a(i4 | 1);
                    dldw.d(dlfrVar2, icsVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dlfr dlfrVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(596044650);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dlfrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i6 = i3 & 112;
            if (i5 != 0) {
                icsVar = ics.e;
            }
            dlfk dlfkVar = dlfrVar instanceof dlfk ? (dlfk) dlfrVar : null;
            dlen dlenVar = dlfkVar != null ? dlfkVar.b : null;
            if (dlenVar instanceof dlej) {
                hmlVarC.v(1568264371);
                b(dlfrVar, icsVar, hmlVarC, i6);
                ((hmw) hmlVarC).ab();
            } else if (dlenVar instanceof dlei) {
                hmlVarC.v(1568266890);
                a(dlfrVar, icsVar, hmlVarC, i6);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1568268334);
                d(dlfrVar, icsVar, hmlVarC, i3 & 126);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dldn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dlfr dlfrVar2 = dlfrVar;
                    int iA = hpy.a(i7 | 1);
                    dldw.e(dlfrVar2, icsVar, (hml) obj, iA, i2);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.dlfr r32, defpackage.hox r33, defpackage.hml r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dldw.f(dlfr, hox, hml, int, int):void");
    }

    private static final long g(hml hmlVar) {
        hmlVar.v(-918311533);
        ije ijeVar = (ije) hmlVar.e(a);
        long j = ijeVar == null ? glz.a(hmlVar).p : ijeVar.i;
        ((hmw) hmlVar).ab();
        return j;
    }

    private static final float h(dlfr dlfrVar, hml hmlVar) {
        hmlVar.v(-434164891);
        String strC = dlfrVar.c();
        ((hmw) hmlVar).ab();
        return strC != null ? 64.0f : 48.0f;
    }

    private static final long i(dlen dlenVar, hml hmlVar) {
        long j;
        hmlVar.v(-1098809980);
        if (dlenVar instanceof dlel) {
            hmlVar.v(1592767028);
            j = glz.a(hmlVar).a;
            ((hmw) hmlVar).ab();
        } else if (dlenVar instanceof dlem) {
            hmlVar.v(605572687);
            ((hmw) hmlVar).ab();
            j = ije.h;
        } else {
            hmlVar.v(605574283);
            j = glz.a(hmlVar).a;
            ((hmw) hmlVar).ab();
        }
        ((hmw) hmlVar).ab();
        return j;
    }
}
