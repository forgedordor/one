package defpackage;

import androidx.compose.animation.EnterExitTransitionElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dae {
    public static final dgi b;
    public static final dgi c;
    private static final dib d = new dib(czg.a, czh.a);
    public static final dgi a = dea.b(0.0f, 400.0f, null, 5);

    static {
        ihu ihuVar = djm.a;
        b = dea.b(0.0f, 400.0f, new kjb(4294967297L), 1);
        c = dea.b(0.0f, 400.0f, new kjg(4294967297L), 1);
    }

    public static final dap a(dew dewVar, iby ibyVar, boolean z, fdap fdapVar) {
        return new daq(new ddk(null, null, new cyo(ibyVar, fdapVar, dewVar, z), null, false, null, 59));
    }

    public static final dap b(dew dewVar, float f) {
        return new daq(new ddk(new dat(f, dewVar), null, null, null, false, null, 62));
    }

    public static final dap c(dew dewVar, float f, long j) {
        return new daq(new ddk(null, null, null, new daz(f, j, dewVar), false, null, 55));
    }

    public static final dap d(dew dewVar, fdap fdapVar) {
        return new daq(new ddk(null, new ddf(fdapVar, dewVar), null, null, false, null, 61));
    }

    public static final dap e(dew dewVar, fdap fdapVar) {
        return d(dewVar, new dac(fdapVar));
    }

    public static final dar f(dew dewVar, float f, long j) {
        return new das(new ddk(null, null, null, new daz(f, j, dewVar), false, null, 55));
    }

    public static final dar g(dew dewVar, iby ibyVar, boolean z, fdap fdapVar) {
        return new das(new ddk(null, null, new cyo(ibyVar, fdapVar, dewVar, z), null, false, null, 59));
    }

    public static final dar h(dew dewVar, fdap fdapVar) {
        return new das(new ddk(null, new ddf(new dad(fdapVar), dewVar), null, null, false, null, 61));
    }

    public static final ics i(dhk dhkVar, dap dapVar, dar darVar, fdae fdaeVar, String str, hml hmlVar, int i, int i2) {
        fdae fdaeVar2;
        dhc dhcVarG;
        dhc dhcVarG2;
        dhc dhcVar;
        cyo cyoVar;
        int i3;
        dhc dhcVar2;
        dhc dhcVarG3;
        dhc dhcVar3;
        dhc dhcVarG4;
        dhc dhcVar4;
        dar darVar2;
        dap dapVar2;
        if ((i2 & 4) != 0) {
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = czp.a;
                hmlVar.y(objF);
            }
            fdaeVar2 = (fdae) objF;
        } else {
            fdaeVar2 = fdaeVar;
        }
        int i4 = i & 14;
        boolean z = (((i & 14) ^ 6) > 4 && hmlVar.D(dhkVar)) || (i & 6) == 4;
        Object objF2 = hmlVar.f();
        if (z || objF2 == hmk.a) {
            objF2 = new hpl(dapVar, hsi.a);
            hmlVar.y(objF2);
        }
        hox hoxVar = (hox) objF2;
        if (dhkVar.e() == dhkVar.f() && dhkVar.e() == cze.b) {
            if (dhkVar.t()) {
                x(hoxVar, dapVar);
            } else {
                x(hoxVar, dap.a);
            }
        } else if (dhkVar.f() == cze.b) {
            x(hoxVar, u(hoxVar).a(dapVar));
        }
        dap dapVarU = u(hoxVar);
        int i5 = i >> 3;
        int i6 = (i5 & 112) | i4;
        boolean z2 = (((i6 & 14) ^ 6) > 4 && hmlVar.D(dhkVar)) || (i6 & 6) == 4;
        Object objF3 = hmlVar.f();
        if (z2 || objF3 == hmk.a) {
            objF3 = new hpl(darVar, hsi.a);
            hmlVar.y(objF3);
        }
        hox hoxVar2 = (hox) objF3;
        if (dhkVar.e() == dhkVar.f() && dhkVar.e() == cze.b) {
            if (dhkVar.t()) {
                y(hoxVar2, darVar);
            } else {
                y(hoxVar2, dar.a);
            }
        } else if (dhkVar.f() != cze.b) {
            y(hoxVar2, v(hoxVar2).a(darVar));
        }
        dar darVarV = v(hoxVar2);
        boolean z3 = (dapVarU.b().b == null && darVarV.b().b == null) ? false : true;
        boolean z4 = (dapVarU.b().c == null && darVarV.b().c == null) ? false : true;
        if (z3) {
            int i7 = i4 | 384;
            hmlVar.v(133837285);
            dib dibVar = diu.g;
            Object objF4 = hmlVar.f();
            if (objF4 == hmk.a) {
                objF4 = str.concat(" slide");
                hmlVar.y(objF4);
            }
            dhcVarG = dhy.g(dhkVar, dibVar, hmlVar, i7);
            hmlVar.o();
        } else {
            hmlVar.v(133943088);
            hmlVar.o();
            dhcVarG = null;
        }
        if (z4) {
            int i8 = i4 | 384;
            hmlVar.v(134034879);
            dib dibVar2 = diu.h;
            Object objF5 = hmlVar.f();
            if (objF5 == hmk.a) {
                objF5 = str.concat(" shrink/expand");
                hmlVar.y(objF5);
            }
            dhcVarG2 = dhy.g(dhkVar, dibVar2, hmlVar, i8);
            hmlVar.o();
        } else {
            hmlVar.v(134145703);
            hmlVar.o();
            dhcVarG2 = null;
        }
        if (z4) {
            int i9 = i4 | 384;
            hmlVar.v(134219298);
            dib dibVar3 = diu.g;
            Object objF6 = hmlVar.f();
            if (objF6 == hmk.a) {
                objF6 = str.concat(" InterruptionHandlingOffset");
                hmlVar.y(objF6);
            }
            dhc dhcVarG5 = dhy.g(dhkVar, dibVar3, hmlVar, i9);
            hmlVar.o();
            dhcVar = dhcVarG5;
        } else {
            hmlVar.v(134388743);
            hmlVar.o();
            dhcVar = null;
        }
        cyo cyoVar2 = dapVarU.b().c;
        boolean z5 = ((cyoVar2 == null || cyoVar2.d) && ((cyoVar = darVarV.b().c) == null || cyoVar.d) && z4) ? false : true;
        int i10 = i5 & 7168;
        boolean z6 = (dapVarU.b().a == null && darVarV.b().a == null) ? false : true;
        boolean z7 = (dapVarU.b().d == null && darVarV.b().d == null) ? false : true;
        int i11 = i10 | i4;
        int i12 = i11 & 14;
        if (z6) {
            int i13 = i12 | 384;
            hmlVar.v(-703860604);
            dib dibVar4 = diu.a;
            i3 = i11;
            Object objF7 = hmlVar.f();
            dhcVar2 = dhcVarG;
            if (objF7 == hmk.a) {
                objF7 = str.concat(" alpha");
                hmlVar.y(objF7);
            }
            dhcVarG3 = dhy.g(dhkVar, dibVar4, hmlVar, i13);
            hmlVar.o();
        } else {
            i3 = i11;
            dhcVar2 = dhcVarG;
            hmlVar.v(-703692120);
            hmlVar.o();
            dhcVarG3 = null;
        }
        if (z7) {
            int i14 = i12 | 384;
            hmlVar.v(-703624508);
            dib dibVar5 = diu.a;
            Object objF8 = hmlVar.f();
            dhcVar3 = dhcVarG2;
            if (objF8 == hmk.a) {
                objF8 = str.concat(" scale");
                hmlVar.y(objF8);
            }
            dhcVarG4 = dhy.g(dhkVar, dibVar5, hmlVar, i14);
            hmlVar.o();
        } else {
            dhcVar3 = dhcVarG2;
            hmlVar.v(-703456024);
            hmlVar.o();
            dhcVarG4 = null;
        }
        if (z7) {
            hmlVar.v(-703378399);
            dhc dhcVarG6 = dhy.g(dhkVar, d, hmlVar, i12 | 384);
            hmlVar.o();
            dhcVar4 = dhcVarG6;
        } else {
            hmlVar.v(-703207032);
            hmlVar.o();
            dhcVar4 = null;
        }
        boolean zF = (((i12 ^ 6) > 4 && hmlVar.D(dhkVar)) || (i3 & 6) == 4) | hmlVar.F(dhcVarG3) | hmlVar.D(dapVarU) | hmlVar.D(darVarV) | hmlVar.F(dhcVarG4) | hmlVar.F(dhcVar4);
        Object objF9 = hmlVar.f();
        if (zF || objF9 == hmk.a) {
            Object czfVar = new czf(dhcVarG3, dhcVarG4, dhkVar, dapVarU, darVarV, dhcVar4);
            darVar2 = darVarV;
            dapVar2 = dapVarU;
            hmlVar.y(czfVar);
            objF9 = czfVar;
        } else {
            dapVar2 = dapVarU;
            darVar2 = darVarV;
        }
        czf czfVar2 = (czf) objF9;
        ico icoVar = ics.e;
        boolean zE = hmlVar.E(z5) | ((((i & 7168) ^ 3072) > 2048 && hmlVar.D(fdaeVar2)) || (i & 3072) == 2048);
        Object objF10 = hmlVar.f();
        if (zE || objF10 == hmk.a) {
            objF10 = new czq(z5, fdaeVar2);
            hmlVar.y(objF10);
        }
        return ijn.a(icoVar, (fdap) objF10).a(new EnterExitTransitionElement(dhkVar, dhcVar3, dhcVar, dhcVar2, dapVar2, darVar2, fdaeVar2, czfVar2));
    }

    public static /* synthetic */ dap j(dew dewVar, ibx ibxVar, int i) {
        if ((i & 1) != 0) {
            ihu ihuVar = djm.a;
            dewVar = dea.b(0.0f, 400.0f, new kjg(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            ibxVar = ibw.l;
        }
        return a(dewVar, w(ibxVar), (i & 4) != 0, new czs(czr.a));
    }

    public static /* synthetic */ dap k(dew dewVar, icc iccVar, int i) {
        if ((i & 1) != 0) {
            ihu ihuVar = djm.a;
            dewVar = dea.b(0.0f, 400.0f, new kjg(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            iccVar = ibw.o;
        }
        return a(dewVar, z(iccVar), (i & 4) != 0, new czv(czu.a));
    }

    public static /* synthetic */ dap l(dew dewVar, int i) {
        if ((i & 1) != 0) {
            dewVar = dea.b(0.0f, 400.0f, null, 5);
        }
        return b(dewVar, 0.0f);
    }

    public static /* synthetic */ dar m(dew dewVar, int i) {
        if ((i & 1) != 0) {
            dewVar = dea.b(0.0f, 400.0f, null, 5);
        }
        return new das(new ddk(new dat(0.0f, dewVar), null, null, null, false, null, 62));
    }

    public static /* synthetic */ dap n(dew dewVar, float f, long j, int i) {
        if ((i & 1) != 0) {
            dewVar = dea.b(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = ikz.a;
        }
        return c(dewVar, f, j);
    }

    public static /* synthetic */ dar o(dew dewVar, float f, long j, int i) {
        if ((i & 1) != 0) {
            dewVar = dea.b(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = ikz.a;
        }
        return f(dewVar, f, j);
    }

    public static /* synthetic */ dar p(dew dewVar, ibx ibxVar, int i) {
        if ((i & 1) != 0) {
            ihu ihuVar = djm.a;
            dewVar = dea.b(0.0f, 400.0f, new kjg(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            ibxVar = ibw.l;
        }
        return g(dewVar, w(ibxVar), (i & 4) != 0, new czx(czw.a));
    }

    public static /* synthetic */ dar q(dew dewVar, icc iccVar, int i) {
        if ((i & 1) != 0) {
            ihu ihuVar = djm.a;
            dewVar = dea.b(0.0f, 400.0f, new kjg(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            iccVar = ibw.o;
        }
        return g(dewVar, z(iccVar), (i & 4) != 0, new daa(czz.a));
    }

    public static /* synthetic */ dap r(fdap fdapVar) {
        ihu ihuVar = djm.a;
        return e(dea.b(0.0f, 400.0f, new kjb(4294967297L), 1), fdapVar);
    }

    public static /* synthetic */ dap s(dew dewVar, iby ibyVar, int i) {
        if ((i & 1) != 0) {
            ihu ihuVar = djm.a;
            dewVar = dea.b(0.0f, 400.0f, new kjg(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            ibyVar = ibw.i;
        }
        return a(dewVar, ibyVar, (i & 4) != 0, czt.a);
    }

    public static /* synthetic */ dar t(dew dewVar, iby ibyVar, int i) {
        if ((i & 1) != 0) {
            ihu ihuVar = djm.a;
            dewVar = dea.b(0.0f, 400.0f, new kjg(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            ibyVar = ibw.i;
        }
        return g(dewVar, ibyVar, (i & 4) != 0, czy.a);
    }

    private static final dap u(hox hoxVar) {
        return (dap) hoxVar.a();
    }

    private static final dar v(hox hoxVar) {
        return (dar) hoxVar.a();
    }

    private static final iby w(ibx ibxVar) {
        return fdbq.f(ibxVar, ibw.j) ? ibw.d : fdbq.f(ibxVar, ibw.l) ? ibw.f : ibw.e;
    }

    private static final void x(hox hoxVar, dap dapVar) {
        hoxVar.b(dapVar);
    }

    private static final void y(hox hoxVar, dar darVar) {
        hoxVar.b(darVar);
    }

    private static final iby z(icc iccVar) {
        return fdbq.f(iccVar, ibw.m) ? ibw.b : fdbq.f(iccVar, ibw.o) ? ibw.h : ibw.e;
    }
}
