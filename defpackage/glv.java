package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glv {
    public static final void a(final ics icsVar, final long j, final long j2, final ikp ikpVar, final List list, hml hmlVar, final int i) {
        int i2;
        float f;
        final ddp ddpVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1776169461);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(list) ? 8192 : 16384;
        }
        if (!hmlVarC.J((i2 & 9363) != 9362, i2 & 1)) {
            hmlVarC.s();
        } else {
            if (list.size() <= 1) {
                throw new IllegalArgumentException("indicatorPolygons should have, at least, two RoundedPolygons");
            }
            boolean zD = hmlVarC.D(list);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                fcww fcwwVar = new fcww((byte[]) null);
                int size = list.size();
                int i4 = 0;
                while (i4 < size) {
                    int i5 = i4 + 1;
                    if (i5 < list.size()) {
                        fcwwVar.add(new ltr(((lty) list.get(i4)).c(), ((lty) list.get(i5)).c()));
                    } else {
                        fcwwVar.add(new ltr(((lty) list.get(i4)).c(), ((lty) list.get(0)).c()));
                    }
                    i4 = i5;
                }
                objS = fcva.a(fcwwVar);
                hmwVar.af(objS);
            }
            final List list2 = (List) objS;
            boolean zD2 = hmlVarC.D(list);
            Object objS2 = hmwVar.S();
            if (zD2 || objS2 == hmk.a) {
                float[] fArr = new float[4];
                int size2 = list.size();
                float fMin = 1.0f;
                int i6 = 0;
                f = 0.0f;
                while (i6 < size2) {
                    lty ltyVar = (lty) list.get(i6);
                    int i7 = size2;
                    lty.e(ltyVar, fArr, 2);
                    List list3 = ltyVar.b;
                    float[] fArr2 = fArr;
                    int i8 = ((fcww) list3).c;
                    float fMax = 0.0f;
                    int i9 = 0;
                    while (i9 < i8) {
                        List list4 = list3;
                        ltb ltbVar = (ltb) list3.get(i9);
                        float fA = ltbVar.a() - ltyVar.a();
                        float fB = ltbVar.b() - ltyVar.b();
                        float f2 = lub.a;
                        int i10 = i8;
                        long jI = ltbVar.i(0.5f);
                        float fC = ltt.c(jI) - ltyVar.a();
                        float fD = ltt.d(jI) - ltyVar.b();
                        fMax = Math.max(fMax, Math.max((fA * fA) + (fB * fB), (fC * fC) + (fD * fD)));
                        i9++;
                        list3 = list4;
                        i8 = i10;
                    }
                    float fSqrt = (float) Math.sqrt(fMax);
                    float[] fArr3 = {ltyVar.a() - fSqrt, ltyVar.b() - fSqrt, ltyVar.a() + fSqrt, ltyVar.b() + fSqrt};
                    fMin = Math.min(fMin, Math.max(d(fArr2) / d(fArr3), c(fArr2) / c(fArr3)));
                    i6++;
                    size2 = i7;
                    fArr = fArr2;
                }
                List list5 = glo.a;
                objS2 = Float.valueOf(fMin * glo.b);
                hmwVar.af(objS2);
            } else {
                f = 0.0f;
            }
            final float fFloatValue = ((Number) objS2).floatValue();
            Object objS3 = hmwVar.S();
            Object obj = hmk.a;
            if (objS3 == obj) {
                objS3 = ddq.a(f);
                hmwVar.af(objS3);
            }
            ddp ddpVar2 = (ddp) objS3;
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = new hpf(90.0f);
                hmwVar.af(objS4);
            }
            final hrg hrgVar = (hrg) objS4;
            Object objS5 = hmwVar.S();
            if (objS5 == obj) {
                objS5 = ddq.a(f);
                hmwVar.af(objS5);
            }
            final ddp ddpVar3 = (ddp) objS5;
            boolean zD3 = hmlVarC.D(list);
            Object objS6 = hmwVar.S();
            if (zD3 || objS6 == obj) {
                objS6 = new hph(0);
                hmwVar.af(objS6);
            }
            final hri hriVar = (hri) objS6;
            boolean zF = hmlVarC.F(ddpVar2) | hmlVarC.D(hriVar) | hmlVarC.F(list2) | hmlVarC.F(ddpVar3);
            Object objS7 = hmwVar.S();
            if (zF || objS7 == obj) {
                objS7 = new glu(ddpVar3, ddpVar2, list2, hriVar, hrgVar, null);
                ddpVar = ddpVar2;
                hmwVar.af(objS7);
            } else {
                ddpVar = ddpVar2;
            }
            hob.g(list, (fdat) objS7, hmlVarC);
            Object objS8 = hmwVar.S();
            if (objS8 == obj) {
                objS8 = new iik((byte[]) null);
                hmwVar.af(objS8);
            }
            final ikd ikdVar = (ikd) objS8;
            Object objS9 = hmwVar.S();
            if (objS9 == obj) {
                iju ijuVar = new iju(iju.f());
                hmwVar.af(ijuVar);
                objS9 = ijuVar;
            }
            final float[] fArr4 = ((iju) objS9).a;
            ics icsVarA = dpa.a(icsVar);
            List list6 = glo.a;
            ics icsVarA2 = dkl.a(iex.a(egq.c(egq.m(icsVarA, 48.0f, 48.0f), 1.0f), ikpVar), j, ikj.a);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA2);
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
            ics icsVarA3 = ecs.a(ics.e, 1.0f, true);
            boolean zF2 = hmlVarC.F(ddpVar) | hmlVarC.F(ddpVar3) | hmlVarC.F(list2) | hmlVarC.D(hriVar) | hmlVarC.F(ikdVar) | hmlVarC.A(fFloatValue) | hmlVarC.F(fArr4);
            boolean z = (i2 & 896) == 256;
            Object objS10 = hmwVar.S();
            if ((zF2 | z) || objS10 == obj) {
                fdap fdapVar = new fdap() { // from class: glp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        imw imwVar = (imw) obj2;
                        float fFloatValue2 = ((Number) ddpVar.d()).floatValue();
                        float fC2 = (90.0f * fFloatValue2) + hrgVar.c() + ((Number) ddpVar3.d()).floatValue();
                        long jA = imwVar.a();
                        imt imtVarT = imwVar.t();
                        long jA2 = imtVarT.a();
                        imtVarT.b().l();
                        hri hriVar2 = hriVar;
                        long j3 = j2;
                        float[] fArr5 = fArr4;
                        float f3 = fFloatValue;
                        ikd ikdVar2 = ikdVar;
                        List list7 = list2;
                        try {
                            imtVarT.c.c(fC2, jA);
                            ikd ikdVarB = hjv.b((ltr) list7.get(hriVar2.c()), fFloatValue2, ikdVar2, false, 0.0f, 0.0f, 120);
                            long jB = imwVar.b();
                            iju.c(fArr5);
                            iju.g(fArr5, Float.intBitsToFloat((int) (jB >> 32)) * f3, Float.intBitsToFloat((int) (4294967295L & jB)) * f3);
                            ikdVarB.n(fArr5);
                            ikdVarB.o(ihs.d(iia.b(jB), ikdVarB.b().a()));
                            imy.h(imwVar, ikdVarB, j3, inc.a, 52);
                            imtVarT.b().j();
                            imtVarT.h(jA2);
                            return fctx.a;
                        } catch (Throwable th) {
                            imtVarT.b().j();
                            imtVarT.h(jA2);
                            throw th;
                        }
                    }
                };
                hmwVar.af(fdapVar);
                objS10 = fdapVar;
            }
            egt.a(ifb.c(icsVarA3, (fdap) objS10), hmlVarC);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: glq
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    long j4 = j2;
                    ikp ikpVar2 = ikpVar;
                    glv.a(icsVar2, j3, j4, ikpVar2, list, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final long j, final List list, hml hmlVar, final int i) {
        int i2;
        long j2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(387862047);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= true != hmlVarC.C(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(list) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            long j3 = ije.h;
            List list2 = glo.a;
            a(icsVar, j3, j2, gsc.e(7, hmlVarC), list, hmlVarC, (i2 & 14) | 48 | ((i2 << 3) & 896) | ((i2 << 6) & 57344));
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: glr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    long j4 = j;
                    glv.b(icsVar2, j4, list, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final float c(float[] fArr) {
        return fArr[3] - fArr[1];
    }

    private static final float d(float[] fArr) {
        return fArr[2] - fArr[0];
    }
}
