package defpackage;

import com.android.vcard.VCardConfig;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdt {
    public static final ics a(ics icsVar, final int i, final hec hecVar, final fdae fdaeVar, final hdd hddVar, final ikp ikpVar) {
        return iwl.a(icsVar, new fdau() { // from class: hdj
            @Override // defpackage.fdau
            public final Object a(Object obj, Object obj2, Object obj3) {
                long jL;
                ixp ixpVar = (ixp) obj;
                ixk ixkVar = (ixk) obj2;
                kil kilVar = (kil) obj3;
                final heq heqVar = (heq) fdaeVar.invoke();
                if (!heqVar.g) {
                    return ixpVar.ej(0, 0, fcvp.a, new fdap() { // from class: hdg
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            return fctx.a;
                        }
                    });
                }
                final hec hecVar2 = hecVar;
                hdy hdyVar = hecVar2.b;
                final boolean z = hdyVar.x().e == dwm.a;
                final boolean z2 = ixpVar.q() == kji.b;
                float fA = heqVar.a();
                if (z) {
                    long j = kilVar.a;
                    jL = kil.l(kil.d(j), kil.b(j), fdcu.b(fA), fdcu.b(fA));
                } else {
                    long j2 = kilVar.a;
                    jL = kil.l(fdcu.b(fA), fdcu.b(fA), kil.c(j2), kil.a(j2));
                }
                final int i2 = i;
                final iyl iylVarE = ixkVar.e(jL);
                final float f = i2 != hdyVar.j() ? i2 == 0 ? 0.0f : 1.0f / i2 : 1.0f;
                final ikp ikpVar2 = ikpVar;
                final hdd hddVar2 = hddVar;
                return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: hdh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        final hec hecVar3 = hecVar2;
                        final heq heqVar2 = heqVar;
                        final int i3 = i2;
                        final boolean z3 = z;
                        final hdd hddVar3 = hddVar2;
                        final ikp ikpVar3 = ikpVar2;
                        final boolean z4 = z2;
                        ((iyk) obj4).u(iylVarE, 0, 0, f, new fdap() { // from class: hdk
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj5) {
                                hef hefVar;
                                hef hefVar2;
                                float f2;
                                char c;
                                float fIntBitsToFloat;
                                char c2;
                                float fIntBitsToFloat2;
                                ikl iklVar = (ikl) obj5;
                                heq heqVar3 = heqVar2;
                                float fA2 = heqVar3.a();
                                float f3 = heqVar3.f;
                                float f4 = fA2 + f3;
                                hdy hdyVar2 = hecVar3.b;
                                float fJ = hdyVar2.j();
                                float fC = hdyVar2.c() * f4;
                                float fA3 = hem.a(heqVar3, hdyVar2.j(), hdyVar2.b());
                                float fB = hdyVar2.b();
                                float f5 = ((fJ * f4) + fC) - fA3;
                                float fC2 = fddu.c(((heqVar3.a() * fB) + ((fB - 1.0f) * f3)) - heqVar3.e, 0.0f);
                                int i4 = 0;
                                heg hegVarB = heqVar3.b(f5, fC2, false);
                                heg hegVarB2 = heqVar3.b(f5, fC2, true);
                                float fA4 = heqVar3.a() + f3;
                                float fA5 = heqVar3.a() / 2.0f;
                                int iA = hegVarB.a() - 1;
                                float f6 = ((i3 * fA4) + fA5) - f5;
                                if (iA >= 0) {
                                    while (true) {
                                        int i5 = iA - 1;
                                        hefVar = hegVarB.get(iA);
                                        if (hefVar.c < f6) {
                                            break;
                                        }
                                        if (i5 < 0) {
                                            break;
                                        }
                                        iA = i5;
                                    }
                                    hefVar = (hef) fcva.N(hegVarB);
                                } else {
                                    hefVar = (hef) fcva.N(hegVarB);
                                }
                                int iA2 = hegVarB.a();
                                while (true) {
                                    if (i4 >= iA2) {
                                        hefVar2 = null;
                                        break;
                                    }
                                    hefVar2 = hegVarB.get(i4);
                                    if (hefVar2.c >= f6) {
                                        break;
                                    }
                                    i4++;
                                }
                                if (hefVar2 == null) {
                                    hefVar2 = (hef) fcva.S(hegVarB);
                                }
                                if (fdbq.f(hefVar, hefVar2)) {
                                    f2 = 1.0f;
                                } else {
                                    float f7 = hefVar2.c;
                                    float f8 = hefVar.c;
                                    f2 = (f6 - f8) / (f7 - f8);
                                }
                                boolean z5 = z3;
                                hef hefVarA = heh.a(hefVar, hefVar2, f2);
                                boolean zF = fdbq.f(hefVar, hefVar2);
                                float fIntBitsToFloat3 = (z5 ? Float.intBitsToFloat((int) (iklVar.r & 4294967295L)) : heqVar3.a()) / 2.0f;
                                float fA6 = (z5 ? heqVar3.a() : Float.intBitsToFloat((int) (iklVar.r & 4294967295L))) / 2.0f;
                                if (z5) {
                                    c = ' ';
                                    fIntBitsToFloat = Float.intBitsToFloat((int) (iklVar.r >> 32));
                                } else {
                                    c = ' ';
                                    fIntBitsToFloat = hefVarA.a;
                                }
                                float f9 = fIntBitsToFloat / 2.0f;
                                if (z5) {
                                    fIntBitsToFloat2 = hefVarA.a / 2.0f;
                                    c2 = c;
                                } else {
                                    c2 = c;
                                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (iklVar.r & 4294967295L)) / 2.0f;
                                }
                                hdd hddVar4 = hddVar3;
                                char c3 = c2;
                                ihu ihuVar = new ihu(fIntBitsToFloat3 - f9, fA6 - fIntBitsToFloat2, fIntBitsToFloat3 + f9, fA6 + fIntBitsToFloat2);
                                float f10 = hefVarA.a;
                                hddVar4.b.h(f10);
                                Iterator<E> it = hegVarB2.iterator();
                                if (!it.hasNext()) {
                                    throw new NoSuchElementException();
                                }
                                Object next = it.next();
                                if (it.hasNext()) {
                                    float f11 = ((hef) next).a;
                                    do {
                                        Object next2 = it.next();
                                        float f12 = ((hef) next2).a;
                                        int iCompare = Float.compare(f11, f12);
                                        if (iCompare > 0) {
                                            f11 = f12;
                                        }
                                        if (iCompare > 0) {
                                            next = next2;
                                        }
                                    } while (it.hasNext());
                                }
                                ikp ikpVar4 = ikpVar3;
                                hddVar4.c.h(((hef) next).a);
                                hddVar4.d.h(hegVarB2.c().a);
                                hddVar4.a.b(ihuVar);
                                iklVar.r(!fdbq.f(ihuVar, new ihu(0.0f, 0.0f, Float.intBitsToFloat((int) (iklVar.r >> c3)), Float.intBitsToFloat((int) (iklVar.r & 4294967295L)))));
                                iklVar.A(ikpVar4);
                                float f13 = hefVarA.b - f6;
                                if (zF) {
                                    f13 += (f6 - hefVarA.c) / f10;
                                }
                                if (z5) {
                                    iklVar.E(f13);
                                } else {
                                    if (z4) {
                                        f13 = -f13;
                                    }
                                    iklVar.D(f13);
                                }
                                return fctx.a;
                            }
                        });
                        return fctx.a;
                    }
                });
            }
        });
    }

    public static final void b(final hec hecVar, final dwm dwmVar, final fdat fdatVar, final egc egcVar, final ics icsVar, final dzo dzoVar, final fdav fdavVar, hml hmlVar, final int i) {
        int i2;
        float fB;
        float fA;
        hml hmlVarC = hmlVar.c(-1978117904);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(hecVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(dwmVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(egcVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.B(2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.A(8.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(dzoVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.F(fdavVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            dwm dwmVar2 = dwm.a;
            if (dwmVar == dwmVar2) {
                hmlVarC.v(-143556958);
                ((hmw) hmlVarC).ab();
                fB = ((egd) egcVar).a;
            } else {
                hmlVarC.v(-143505436);
                fB = efy.b(egcVar, (kji) hmlVarC.e(jmh.j));
                ((hmw) hmlVarC).ab();
            }
            hpt hptVar = jmh.e;
            float fEn = ((kio) hmlVarC.e(hptVar)).en(fB);
            if (dwmVar == dwmVar2) {
                hmlVarC.v(-1907991582);
                ((hmw) hmlVarC).ab();
                fA = ((egd) egcVar).b;
            } else {
                hmlVarC.v(-1907937239);
                fA = efy.a(egcVar, (kji) hmlVarC.e(jmh.j));
                ((hmw) hmlVarC).ab();
            }
            float fEn2 = ((kio) hmlVarC.e(hptVar)).en(fA);
            int i3 = i2 & 896;
            hmw hmwVar = (hmw) hmlVarC;
            int i4 = i2;
            Object objS = hmwVar.S();
            if (i3 == 256 || objS == hmk.a) {
                objS = new hdu(fdatVar, fEn, fEn2);
                hmwVar.af(objS);
            }
            hdu hduVar = (hdu) objS;
            hel helVar = new hel(hduVar);
            if (dwmVar == dwm.b) {
                hmlVarC.v(1136785423);
                egd egdVar = (egd) egcVar;
                esp.c(hecVar.b, icsVar, efy.h(0.0f, egdVar.a, 0.0f, egdVar.b, 5), hduVar, 2, 8.0f, null, dzoVar, false, null, helVar, null, hxe.d(612983380, new hdp(hecVar, hduVar, fdavVar), hmlVarC), hmlVarC, ((i4 >> 12) & 112) | (i4 & 57344) | ((i4 >> 3) & 458752) | (i4 & 29360128), 24576, 12096);
                hmwVar.ab();
            } else if (dwmVar == dwmVar2) {
                hmlVarC.v(1138487323);
                hdy hdyVar = hecVar.b;
                hpt hptVar2 = jmh.j;
                esp.d(hdyVar, icsVar, efy.h(efy.b(egcVar, (kji) hmlVarC.e(hptVar2)), 0.0f, efy.a(egcVar, (kji) hmlVarC.e(hptVar2)), 0.0f, 10), hduVar, null, dzoVar, false, null, helVar, null, hxe.d(1665756061, new hds(hecVar, hduVar, fdavVar), hmlVarC), hmlVarC, ((i4 >> 3) & 458752) | (i4 & 57344) | ((i4 >> 12) & 112) | (i4 & 29360128), 24576);
                hmwVar.ab();
            } else {
                hmlVarC.v(1140139282);
                hmwVar.ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hdi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hec hecVar2 = hecVar;
                    dwm dwmVar3 = dwmVar;
                    fdat fdatVar2 = fdatVar;
                    egc egcVar2 = egcVar;
                    ics icsVar2 = icsVar;
                    dzo dzoVar2 = dzoVar;
                    hdt.b(hecVar2, dwmVar3, fdatVar2, egcVar2, icsVar2, dzoVar2, fdavVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final hec hecVar, final ics icsVar, final dzo dzoVar, float f, float f2, egc egcVar, final fdav fdavVar, hml hmlVar, final int i) {
        int i2;
        dzo dzoVar2;
        fdav fdavVar2;
        final float f3;
        final float f4;
        final egc egcVar2;
        final float f5;
        final float f6;
        egc egdVar;
        hml hmlVarC = hmlVar.c(-118598974);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(hecVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(156.0f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(8.0f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            dzoVar2 = dzoVar;
            i2 |= true != hmlVarC.D(dzoVar2) ? 8192 : 16384;
        } else {
            dzoVar2 = dzoVar;
        }
        int i3 = i2 | 14352384;
        if ((100663296 & i) == 0) {
            fdavVar2 = fdavVar;
            i3 |= true != hmlVarC.F(fdavVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            fdavVar2 = fdavVar;
        }
        if (hmlVarC.J((38347923 & i3) != 38347922, i3 & 1)) {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                f5 = 56.0f;
                f6 = 40.0f;
                egdVar = new egd(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                hmlVarC.s();
                f6 = f;
                f5 = f2;
                egdVar = egcVar;
            }
            hmlVarC.l();
            final kio kioVar = (kio) hmlVarC.e(jmh.e);
            int i4 = i3;
            dwm dwmVar = dwm.b;
            boolean zD = ((i4 & 112) == 32) | hmlVarC.D(kioVar) | hmlVarC.F(hecVar);
            boolean z = (i4 & 458752) == 131072;
            boolean z2 = (i4 & 3670016) == 1048576;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z | zD | z2) || objS == hmk.a) {
                objS = new fdat() { // from class: hdl
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        float fFloatValue = ((Float) obj).floatValue();
                        float fFloatValue2 = ((Float) obj2).floatValue();
                        kio kioVar2 = kioVar;
                        float fEn = kioVar2.en(156.0f);
                        int iIntValue = ((Number) ((fdae) hecVar.b.a.a()).invoke()).intValue();
                        float fEn2 = kioVar2.en(f6);
                        float fEn3 = kioVar2.en(f5);
                        if (fFloatValue == 0.0f || fEn == 0.0f) {
                            return heg.a;
                        }
                        int[] iArr = {1};
                        int[] iArr2 = {1, 0};
                        float fMin = Math.min(fEn, fFloatValue);
                        float fE = fddu.e(fMin / 3.0f, fEn2, fEn3);
                        float f7 = fMin + fE;
                        if (fFloatValue < fEn2 + fEn2) {
                            iArr = new int[]{0};
                        }
                        float f8 = f7 / 2.0f;
                        int iCeil = (int) Math.ceil(fFloatValue / fMin);
                        int iMax = (iCeil - Math.max(1, (int) Math.floor(((fFloatValue - (fcur.F(iArr2) * f8)) - (fcur.F(iArr) * fEn3)) / fMin))) + 1;
                        int[] iArr3 = new int[iMax];
                        for (int i5 = 0; i5 < iMax; i5++) {
                            iArr3[i5] = iCeil - i5;
                        }
                        final float fEn4 = kioVar2.en(10.0f);
                        final hdb hdbVarA = hda.a(fFloatValue, fFloatValue2, fE, fEn2, fEn3, iArr, f8, iArr2, fMin, iArr3);
                        if (hdbVarA != null && hdbVarA.b() > iIntValue) {
                            int i6 = hdbVarA.b;
                            int i7 = hdbVarA.d;
                            for (int iB = hdbVarA.b() - iIntValue; iB > 0; iB--) {
                                if (i6 > 0) {
                                    i6--;
                                } else if (i7 > 1) {
                                    i7--;
                                }
                            }
                            hdbVarA = hda.a(fFloatValue, fFloatValue2, fE, fEn2, fEn3, new int[]{i6}, f8, new int[]{i7}, fMin, iArr3);
                        }
                        if (hdbVarA == null) {
                            return heg.a;
                        }
                        fdap fdapVar = new fdap() { // from class: hen
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                hdb hdbVar;
                                hek hekVar = (hek) obj3;
                                hekVar.b(fEn4, true);
                                int i8 = 0;
                                while (true) {
                                    hdbVar = hdbVarA;
                                    if (i8 >= hdbVar.f) {
                                        break;
                                    }
                                    hekVar.b(hdbVar.e, false);
                                    i8++;
                                }
                                int i9 = hdbVar.d;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    hekVar.b(hdbVar.c, false);
                                }
                                int i11 = hdbVar.b;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    hekVar.b(hdbVar.a, false);
                                }
                                hekVar.b(fEn4, true);
                                return fctx.a;
                            }
                        };
                        hek hekVar = new hek();
                        fdapVar.invoke(hekVar);
                        int iA = hekVar.a();
                        int i8 = hekVar.a;
                        float f9 = hekVar.b;
                        return new heg(hek.c(i8, f9 / 2.0f, i8, iA, f9, fFloatValue, fFloatValue2, hekVar.c));
                    }
                };
                hmwVar.af(objS);
            }
            int i5 = i4 << 9;
            b(hecVar, dwmVar, (fdat) objS, egdVar, icsVar, dzoVar2, fdavVar2, hmlVarC, (i4 & 14) | 24624 | ((i4 >> 12) & 7168) | (i5 & 458752) | (3670016 & i5) | (29360128 & i5) | (i4 & 234881024));
            egcVar2 = egdVar;
            f4 = f5;
            f3 = f6;
        } else {
            hmlVarC.s();
            f3 = f;
            f4 = f2;
            egcVar2 = egcVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hdm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hec hecVar2 = hecVar;
                    ics icsVar2 = icsVar;
                    dzo dzoVar3 = dzoVar;
                    float f7 = f3;
                    float f8 = f4;
                    egc egcVar3 = egcVar2;
                    hdt.c(hecVar2, icsVar2, dzoVar3, f7, f8, egcVar3, fdavVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
