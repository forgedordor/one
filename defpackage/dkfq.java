package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkfq implements fdau {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdae c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;

    public dkfq(String str, boolean z, fdae fdaeVar, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = fdaeVar;
        this.d = z2;
        this.e = z3;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [dew, java.lang.Object] */
    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float f;
        Object objE;
        dib dibVar;
        Object objE2;
        dhk dhkVar;
        hzg hzgVarA;
        fdap fdapVarK;
        hzg hzgVarB;
        float fEg;
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(-1293273519);
        hmlVar.v(5004770);
        String str = this.a;
        boolean zD = hmlVar.D(str);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new hph(0);
            hmlVar.y(objF);
        }
        final hri hriVar = (hri) objF;
        hmlVar.o();
        hmlVar.v(5004770);
        boolean zD2 = hmlVar.D(str);
        Object objF2 = hmlVar.f();
        if (zD2 || objF2 == hmk.a) {
            objF2 = new hph(0);
            hmlVar.y(objF2);
        }
        final hri hriVar2 = (hri) objF2;
        hmlVar.o();
        hmlVar.v(-1590294171);
        Object objE3 = hmlVar.e(jmh.e);
        boolean z = this.d;
        boolean z2 = this.e;
        kio kioVar = (kio) objE3;
        hmlVar.v(1849434622);
        Object objF3 = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF3 == obj4) {
            if (z) {
                f = 8.0f;
                fEg = kioVar.eg(kjm.c(12)) + 8.0f;
            } else {
                f = 8.0f;
                fEg = 0.0f;
            }
            objF3 = Integer.valueOf((int) kioVar.en(fEg + (true != z2 ? 0.0f : 7.0f)));
            hmlVar.y(objF3);
        } else {
            f = 8.0f;
        }
        int iIntValue = ((Number) objF3).intValue();
        hmlVar.o();
        hmlVar.o();
        hmlVar.v(-1590286216);
        if (hriVar2.c() == 0) {
            hmlVar.o();
            hmlVar.v(-1633490746);
            boolean zD3 = hmlVar.D(hriVar) | hmlVar.D(hriVar2);
            Object objF4 = hmlVar.f();
            if (zD3 || objF4 == hmk.a) {
                objF4 = new fdau() { // from class: dkfo
                    @Override // defpackage.fdau
                    public final Object a(Object obj5, Object obj6, Object obj7) {
                        ixp ixpVar = (ixp) obj5;
                        ixk ixkVar = (ixk) obj6;
                        ixpVar.getClass();
                        ixkVar.getClass();
                        long j = ((kil) obj7).a;
                        hriVar.i(ixkVar.e(j).a);
                        hriVar2.i(ixkVar.e(j).b);
                        return ixpVar.ej(0, 0, fcvp.a, new fdap() { // from class: dkfp
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj8) {
                                ((iyk) obj8).getClass();
                                return fctx.a;
                            }
                        });
                    }
                };
                hmlVar.y(objF4);
            }
            hmlVar.o();
            ics icsVarA = iwl.a(icsVar, (fdau) objF4);
            hmlVar.o();
            return icsVarA;
        }
        int iC = hriVar.c();
        final int iC2 = hriVar2.c();
        boolean z3 = this.b;
        fdae fdaeVar = this.c;
        hmlVar.v(291933050);
        hmlVar.v(5004770);
        boolean zD4 = hmlVar.D(str);
        Object objF5 = hmlVar.f();
        if (zD4 || objF5 == obj4) {
            objF5 = new dfw(false);
            hmlVar.y(objF5);
        }
        dfw dfwVar = (dfw) objF5;
        hmlVar.o();
        dfwVar.d(true);
        dhk dhkVarB = dhy.b(dfwVar, "sending expressive animation", hmlVar, 48, 0);
        dkfs dkfsVar = dkfs.a;
        dib dibVar2 = diu.a;
        if (dhkVarB.t()) {
            hmlVar.v(1666852333);
            hmlVar.o();
            objE = dhkVarB.e();
        } else {
            hmlVar.v(1666598288);
            boolean zD5 = hmlVar.D(dhkVarB);
            objE = hmlVar.f();
            if (zD5 || objE == obj4) {
                hzgVarA = hzf.a();
                fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                hzgVarB = hzf.b(hzgVarA);
                try {
                    Object objE4 = dhkVarB.e();
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    hmlVar.y(objE4);
                    objE = objE4;
                } finally {
                }
            }
            hmlVar.o();
        }
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        hmlVar.v(105504918);
        float f2 = true != zBooleanValue ? 0.0f : 1.0f;
        hmlVar.o();
        Float fValueOf = Float.valueOf(f2);
        boolean zD6 = hmlVar.D(dhkVarB);
        Object objF6 = hmlVar.f();
        if (zD6 || objF6 == hmk.a) {
            dkfk dkfkVar = new dkfk(dhkVarB);
            hxn hxnVar = hrp.a;
            hnt hntVar = new hnt(dkfkVar, null);
            hmlVar.y(hntVar);
            objF6 = hntVar;
        }
        boolean zBooleanValue2 = ((Boolean) ((hsf) objF6).a()).booleanValue();
        hmlVar.v(105504918);
        float f3 = true != zBooleanValue2 ? 0.0f : 1.0f;
        hmlVar.o();
        Float fValueOf2 = Float.valueOf(f3);
        boolean zD7 = hmlVar.D(dhkVarB);
        Object objF7 = hmlVar.f();
        if (zD7 || objF7 == hmk.a) {
            dkfl dkflVar = new dkfl(dhkVarB);
            hxn hxnVar2 = hrp.a;
            objF7 = new hnt(dkflVar, null);
            hmlVar.y(objF7);
        }
        hsf hsfVarF = dhy.f(dhkVarB, fValueOf, fValueOf2, dkfsVar.a(((hsf) objF7).a(), hmlVar, 0), dibVar2, hmlVar, 196608);
        dkfr dkfrVar = dkfr.a;
        dib dibVar3 = diu.b;
        if (dhkVarB.t()) {
            dibVar = dibVar3;
            hmlVar.v(1666852333);
            hmlVar.o();
            objE2 = dhkVarB.e();
        } else {
            hmlVar.v(1666598288);
            boolean zD8 = hmlVar.D(dhkVarB);
            objE2 = hmlVar.f();
            if (zD8 || objE2 == hmk.a) {
                hzgVarA = hzf.a();
                fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                hzgVarB = hzf.b(hzgVarA);
                dibVar = dibVar3;
                try {
                    Object objE5 = dhkVarB.e();
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    hmlVar.y(objE5);
                    objE2 = objE5;
                } finally {
                }
            } else {
                dibVar = dibVar3;
            }
            hmlVar.o();
        }
        boolean zBooleanValue3 = ((Boolean) objE2).booleanValue();
        hmlVar.v(-964260939);
        int i = true != zBooleanValue3 ? 0 : iC2;
        hmlVar.o();
        Integer numValueOf = Integer.valueOf(i);
        boolean zD9 = hmlVar.D(dhkVarB);
        Object objF8 = hmlVar.f();
        if (zD9 || objF8 == hmk.a) {
            dkfm dkfmVar = new dkfm(dhkVarB);
            hxn hxnVar3 = hrp.a;
            objF8 = new hnt(dkfmVar, null);
            hmlVar.y(objF8);
        }
        boolean zBooleanValue4 = ((Boolean) ((hsf) objF8).a()).booleanValue();
        hmlVar.v(-964260939);
        int i2 = true != zBooleanValue4 ? 0 : iC2;
        hmlVar.o();
        Integer numValueOf2 = Integer.valueOf(i2);
        boolean zD10 = hmlVar.D(dhkVarB);
        Object objF9 = hmlVar.f();
        if (zD10 || objF9 == hmk.a) {
            dkfn dkfnVar = new dkfn(dhkVarB);
            hxn hxnVar4 = hrp.a;
            dhkVar = dhkVarB;
            objF9 = new hnt(dkfnVar, null);
            hmlVar.y(objF9);
        } else {
            dhkVar = dhkVarB;
        }
        final hsf hsfVarF2 = dhy.f(dhkVar, numValueOf, numValueOf2, dkfrVar.a(((hsf) objF9).a(), hmlVar, 0), dibVar, hmlVar, 196608);
        final int iB = dkft.b(hsfVarF2) >= iIntValue ? 0 : iIntValue - dkft.b(hsfVarF2);
        if (((Boolean) dfwVar.a()).booleanValue() == ((Boolean) dfwVar.b()).booleanValue()) {
            fdaeVar.invoke();
        }
        hmlVar.v(1374849758);
        hpt hptVar = jmh.e;
        kio kioVar2 = (kio) hmlVar.e(hptVar);
        hmlVar.v(5004770);
        boolean zD11 = hmlVar.D(str);
        Object objF10 = hmlVar.f();
        if (zD11 || objF10 == hmk.a) {
            objF10 = Float.valueOf(kioVar2.en(f) / iC);
            hmlVar.y(objF10);
        }
        float fFloatValue = ((Number) objF10).floatValue();
        hmlVar.o();
        hmlVar.o();
        hmlVar.v(1374855165);
        kio kioVar3 = (kio) hmlVar.e(hptVar);
        hmlVar.v(5004770);
        boolean zD12 = hmlVar.D(str);
        Object objF11 = hmlVar.f();
        if (zD12 || objF11 == hmk.a) {
            objF11 = Float.valueOf(kioVar3.en(8.0f) / iC2);
            hmlVar.y(objF11);
        }
        float fFloatValue2 = 1.0f - ((Number) objF11).floatValue();
        hmlVar.o();
        hmlVar.o();
        hmlVar.v(-1746271574);
        boolean zD13 = hmlVar.D(hsfVarF2) | hmlVar.B(iC2) | hmlVar.B(iB);
        Object objF12 = hmlVar.f();
        if (zD13 || objF12 == hmk.a) {
            objF12 = new fdau() { // from class: dkfi
                @Override // defpackage.fdau
                public final Object a(Object obj5, Object obj6, Object obj7) {
                    ixp ixpVar = (ixp) obj5;
                    ixk ixkVar = (ixk) obj6;
                    ixpVar.getClass();
                    ixkVar.getClass();
                    final iyl iylVarE = ixkVar.e(((kil) obj7).a);
                    hsf hsfVar = hsfVarF2;
                    final int iB2 = dkft.b(hsfVar) - iC2;
                    int i3 = iylVarE.a;
                    int iB3 = dkft.b(hsfVar);
                    final int i4 = iB;
                    return ixpVar.ej(i3, iB3 + i4, fcvp.a, new fdap() { // from class: dkfj
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj8) {
                            iyk iykVar = (iyk) obj8;
                            iykVar.getClass();
                            iykVar.s(iylVarE, 0, i4 + iB2, 0.0f);
                            return fctx.a;
                        }
                    });
                }
            };
            hmlVar.y(objF12);
        }
        hmlVar.o();
        ics icsVarC = ijn.c(iwl.a(icsVar, (fdau) objF12), dkft.a(hsfVarF), dkft.a(hsfVarF), 0.0f, 0.0f, 0.0f, 0.0f, z3 ? ila.a(fFloatValue, fFloatValue2) : ila.a(1.0f - fFloatValue, fFloatValue2), null, false, 0, 523260);
        hmlVar.o();
        hmlVar.o();
        hmlVar.o();
        return icsVarC;
    }
}
