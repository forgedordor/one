package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipj {
    public static final void a(List list, ikd ikdVar) {
        int i;
        float f;
        int i2;
        iph iphVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        List list2 = list;
        ikd ikdVar2 = ikdVar;
        int iA = ikdVar2.a();
        ikdVar2.l();
        ikdVar2.m(iA);
        iph iphVar2 = list2.isEmpty() ? ioo.a : (iph) list2.get(0);
        int size = list2.size();
        float f16 = 0.0f;
        int i3 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (i3 < size) {
            iph iphVar3 = (iph) list2.get(i3);
            if (iphVar3 instanceof ioo) {
                ikdVar2.c();
                i = size;
                f = f16;
                i2 = i3;
                iphVar = iphVar3;
                f17 = f21;
                f20 = f17;
                f18 = f22;
                f19 = f18;
            } else {
                if (iphVar3 instanceof ipb) {
                    ipb ipbVar = (ipb) iphVar3;
                    float f23 = ipbVar.a;
                    f19 += f23;
                    float f24 = ipbVar.b;
                    f20 += f24;
                    ((iik) ikdVar2).a.rMoveTo(f23, f24);
                    i = size;
                    f = f16;
                    i2 = i3;
                    f22 = f19;
                    f21 = f20;
                } else {
                    if (iphVar3 instanceof ios) {
                        ios iosVar = (ios) iphVar3;
                        float f25 = iosVar.a;
                        float f26 = iosVar.b;
                        ikdVar2.f(f25, f26);
                        f20 = f26;
                        f21 = f20;
                        f19 = f25;
                        f22 = f19;
                    } else {
                        if (iphVar3 instanceof ipa) {
                            ipa ipaVar = (ipa) iphVar3;
                            float f27 = ipaVar.a;
                            f15 = ipaVar.b;
                            ikdVar2.i(f27, f15);
                            f19 += f27;
                        } else {
                            if (iphVar3 instanceof ior) {
                                ior iorVar = (ior) iphVar3;
                                f4 = iorVar.a;
                                f5 = iorVar.b;
                                ikdVar2.e(f4, f5);
                            } else if (iphVar3 instanceof ioz) {
                                float f28 = ((ioz) iphVar3).a;
                                ikdVar2.i(f28, f16);
                                f19 += f28;
                            } else if (iphVar3 instanceof ioq) {
                                float f29 = ((ioq) iphVar3).a;
                                ikdVar2.e(f29, f20);
                                f19 = f29;
                            } else if (iphVar3 instanceof ipf) {
                                f15 = ((ipf) iphVar3).a;
                                ikdVar2.i(f16, f15);
                            } else if (iphVar3 instanceof ipg) {
                                float f30 = ((ipg) iphVar3).a;
                                ikdVar2.e(f19, f30);
                                f20 = f30;
                            } else {
                                if (iphVar3 instanceof ioy) {
                                    ioy ioyVar = (ioy) iphVar3;
                                    float f31 = ioyVar.a;
                                    float f32 = ioyVar.b;
                                    f11 = ioyVar.c;
                                    f12 = ioyVar.d;
                                    f13 = ioyVar.e;
                                    f14 = ioyVar.f;
                                    ikdVar2.h(f31, f32, f11, f12, f13, f14);
                                } else {
                                    if (iphVar3 instanceof iop) {
                                        iop iopVar = (iop) iphVar3;
                                        float f33 = iopVar.a;
                                        float f34 = iopVar.b;
                                        f18 = iopVar.c;
                                        f6 = iopVar.d;
                                        f7 = iopVar.e;
                                        f8 = iopVar.f;
                                        ikdVar.d(f33, f34, f18, f6, f7, f8);
                                    } else if (iphVar3 instanceof ipd) {
                                        if (iphVar2.h) {
                                            f9 = f19 - f18;
                                            f10 = f20 - f17;
                                        } else {
                                            f9 = f16;
                                            f10 = f9;
                                        }
                                        ipd ipdVar = (ipd) iphVar3;
                                        f11 = ipdVar.a;
                                        f12 = ipdVar.b;
                                        f13 = ipdVar.c;
                                        f14 = ipdVar.d;
                                        ikdVar.h(f9, f10, f11, f12, f13, f14);
                                    } else if (iphVar3 instanceof iou) {
                                        if (iphVar2.h) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        iou iouVar = (iou) iphVar3;
                                        f18 = iouVar.a;
                                        f6 = iouVar.b;
                                        f7 = iouVar.c;
                                        f8 = iouVar.d;
                                        ikdVar.d(f19, f20, f18, f6, f7, f8);
                                    } else if (iphVar3 instanceof ipc) {
                                        ipc ipcVar = (ipc) iphVar3;
                                        float f35 = ipcVar.a;
                                        float f36 = ipcVar.b;
                                        float f37 = ipcVar.c;
                                        float f38 = ipcVar.d;
                                        ikdVar.j(f35, f36, f37, f38);
                                        float f39 = f35 + f19;
                                        float f40 = f36 + f20;
                                        f19 += f37;
                                        f20 += f38;
                                        f18 = f39;
                                        f17 = f40;
                                    } else if (iphVar3 instanceof iot) {
                                        iot iotVar = (iot) iphVar3;
                                        float f41 = iotVar.a;
                                        float f42 = iotVar.b;
                                        f4 = iotVar.c;
                                        f5 = iotVar.d;
                                        ikdVar.g(f41, f42, f4, f5);
                                        f18 = f41;
                                        f17 = f42;
                                    } else if (iphVar3 instanceof ipe) {
                                        if (iphVar2.i) {
                                            f2 = f20 - f17;
                                            f3 = f19 - f18;
                                        } else {
                                            f2 = f16;
                                            f3 = f2;
                                        }
                                        ipe ipeVar = (ipe) iphVar3;
                                        float f43 = ipeVar.a;
                                        float f44 = ipeVar.b;
                                        ikdVar.j(f3, f2, f43, f44);
                                        float f45 = f3 + f19;
                                        float f46 = f2 + f20;
                                        f19 += f43;
                                        f20 += f44;
                                        f18 = f45;
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        iphVar = iphVar3;
                                        f17 = f46;
                                    } else if (iphVar3 instanceof iov) {
                                        if (iphVar2.i) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        iov iovVar = (iov) iphVar3;
                                        float f47 = iovVar.a;
                                        float f48 = iovVar.b;
                                        ikdVar.g(f19, f20, f47, f48);
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        f18 = f19;
                                        iphVar = iphVar3;
                                        f19 = f47;
                                        f17 = f20;
                                        f20 = f48;
                                    } else if (iphVar3 instanceof iox) {
                                        double d = f19;
                                        iox ioxVar = (iox) iphVar3;
                                        float f49 = ioxVar.f + f19;
                                        float f50 = ioxVar.g + f20;
                                        f = 0.0f;
                                        i2 = i3;
                                        i = size;
                                        b(ikdVar, d, f20, f49, f50, ioxVar.a, ioxVar.b, ioxVar.c, ioxVar.d, ioxVar.e);
                                        f18 = f49;
                                        f19 = f18;
                                        f17 = f50;
                                        f20 = f17;
                                        iphVar = iphVar3;
                                    } else {
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        if (!(iphVar3 instanceof ion)) {
                                            throw new fctg();
                                        }
                                        ion ionVar = (ion) iphVar3;
                                        float f51 = ionVar.f;
                                        float f52 = ionVar.g;
                                        iphVar = iphVar3;
                                        b(ikdVar, f19, f20, f51, f52, ionVar.a, ionVar.b, ionVar.c, ionVar.d, ionVar.e);
                                        f18 = f51;
                                        f19 = f18;
                                        f17 = f52;
                                        f20 = f17;
                                    }
                                    f17 = f6;
                                    f19 = f7;
                                    f20 = f8;
                                }
                                f18 = f11 + f19;
                                float f53 = f12 + f20;
                                f19 += f13;
                                f20 += f14;
                                f17 = f53;
                            }
                            f20 = f5;
                            f19 = f4;
                        }
                        f20 += f15;
                    }
                    i = size;
                    f = f16;
                    i2 = i3;
                }
                iphVar = iphVar3;
            }
            i3 = i2 + 1;
            list2 = list;
            ikdVar2 = ikdVar;
            size = i;
            iphVar2 = iphVar;
            f16 = f;
        }
    }

    private static final void b(ikd ikdVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d14 = d12 - d13;
        double d15 = ((d * dCos) + (d2 * dSin)) / d10;
        double d16 = ((d3 * dCos) + (d4 * dSin)) / d10;
        double d17 = d15 - d16;
        double d18 = (d17 * d17) + (d14 * d14);
        if (d18 == 0.0d) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            b(ikdVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d19);
        double d20 = (d12 + d13) / 2.0d;
        double d21 = d17 * dSqrt2;
        double d22 = (d15 + d16) / 2.0d;
        double d23 = dSqrt2 * d14;
        if (z == z2) {
            d8 = d22 - d23;
            d9 = d20 + d21;
        } else {
            d8 = d22 + d23;
            d9 = d20 - d21;
        }
        double d24 = d9;
        double dAtan2 = Math.atan2(d12 - d9, d15 - d8);
        double dAtan22 = Math.atan2(d13 - d9, d16 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 += dAtan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d24 * d6;
        double d27 = d25 * dCos;
        double d28 = d26 * dSin;
        double d29 = d25 * dSin;
        double d30 = d26 * dCos;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d32 * dSin3;
        double d34 = d6 * dSin2;
        double d35 = d34 * dCos3;
        double d36 = d31 * dSin2;
        double d37 = d6 * dCos2;
        double d38 = (dSin3 * d36) + (dCos3 * d37);
        double d39 = d2;
        double d40 = dAtan22;
        double d41 = d33 - d35;
        int i = 0;
        double d42 = d38;
        double d43 = dAtan2;
        double d44 = d;
        while (i < iCeil) {
            int i2 = i;
            double d45 = d43 + (d40 / iCeil);
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            double d46 = d45 - d43;
            double dTan = Math.tan(d46 / 2.0d);
            double dSin5 = (Math.sin(d46) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            double d47 = d39 + (d42 * dSin5);
            int i3 = iCeil;
            double d48 = d29 + d30 + (d10 * dSin2 * dCos4) + (d37 * dSin4);
            double d49 = ((d27 - d28) + ((d10 * dCos2) * dCos4)) - (d34 * dSin4);
            d42 = (dSin4 * d36) + (dCos4 * d37);
            d41 = (d32 * dSin4) - (d34 * dCos4);
            ikdVar.d((float) (d44 + (d41 * dSin5)), (float) d47, (float) (d49 - (dSin5 * d41)), (float) (d48 - (dSin5 * d42)), (float) d49, (float) d48);
            i = i2 + 1;
            d43 = d45;
            d44 = d49;
            dCos2 = dCos2;
            d36 = d36;
            d39 = d48;
            iCeil = i3;
            dSin2 = dSin2;
            d10 = d5;
        }
    }
}
