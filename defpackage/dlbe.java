package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlbe implements fdau {
    final /* synthetic */ ejy a;
    final /* synthetic */ dlbg b;
    final /* synthetic */ fdap c;
    final /* synthetic */ fdae d;

    public dlbe(ejy ejyVar, dlbg dlbgVar, fdap fdapVar, fdae fdaeVar) {
        this.a = ejyVar;
        this.b = dlbgVar;
        this.c = fdapVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        final float f;
        itc itcVar;
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(1208236223);
        Object objF = hmlVar.f();
        Object obj5 = hmk.a;
        if (objF == obj5) {
            objF = hob.a(fcyi.a, hmlVar);
            hmlVar.y(objF);
        }
        final fdjx fdjxVar = (fdjx) objF;
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj5) {
            hpl hplVar = new hpl(new ihz((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), hsi.a);
            hmlVar.y(hplVar);
            objF2 = hplVar;
        }
        final hox hoxVar = (hox) objF2;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF3 = hmlVar.f();
        if (objF3 == obj5) {
            hpl hplVar2 = new hpl(Float.valueOf(0.0f), hsi.a);
            hmlVar.y(hplVar2);
            objF3 = hplVar2;
        }
        final hox hoxVar2 = (hox) objF3;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF4 = hmlVar.f();
        if (objF4 == obj5) {
            hpl hplVar3 = new hpl(false, hsi.a);
            hmlVar.y(hplVar3);
            objF4 = hplVar3;
        }
        final hox hoxVar3 = (hox) objF4;
        hmlVar.o();
        final ejy ejyVar = this.a;
        boolean z = ejyVar.i() || ((Boolean) hoxVar3.a()).booleanValue();
        hmlVar.v(1139304201);
        float fFloatValue = ((Number) ddu.c(true != z ? 0.0f : 1.0f, dea.c(true != z ? 500 : 150, true != z ? 1000 : 0, null, 4), null, hmlVar, 0, 28).a()).floatValue();
        hmlVar.o();
        hmlVar.v(1473859726);
        long j = glz.a(hmlVar).q;
        final long jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.38f, ije.f(j));
        hmlVar.o();
        hmlVar.v(1473863161);
        final long j2 = glz.a(hmlVar).q;
        hmlVar.o();
        hmlVar.v(1473866207);
        final long j3 = glz.a(hmlVar).a;
        hmlVar.o();
        hmlVar.v(1473869208);
        final long j4 = glz.a(hmlVar).a;
        hmlVar.o();
        hmlVar.v(1473872126);
        final long j5 = glz.a(hmlVar).b;
        hmlVar.o();
        boolean z2 = hmlVar.e(jmh.j) == kji.b;
        Object objE = hmlVar.e(jmh.e);
        final dlbg dlbgVar = this.b;
        final fdap fdapVar = this.c;
        final fdae fdaeVar = this.d;
        final kio kioVar = (kio) objE;
        hmlVar.v(-1224400529);
        boolean zD = hmlVar.D(ejyVar) | hmlVar.A(fFloatValue) | hmlVar.A(2.0f) | hmlVar.D(dlbgVar) | hmlVar.A(4.0f) | hmlVar.C(j2) | hmlVar.C(j3) | hmlVar.C(jF) | hmlVar.C(j4) | hmlVar.C(j5) | hmlVar.E(z2) | hmlVar.D(fdapVar);
        final boolean z3 = z2;
        Object objF5 = hmlVar.f();
        if (zD || objF5 == obj5) {
            f = fFloatValue;
            itcVar = null;
            obj4 = new fdap() { // from class: dlbb
                @Override // defpackage.fdap
                public final Object invoke(Object obj6) {
                    imw imwVar = (imw) obj6;
                    imwVar.getClass();
                    hox hoxVar4 = hoxVar;
                    if (!ihz.f(((ihz) hoxVar4.a()).a, imwVar.b())) {
                        hoxVar4.b(new ihz(imwVar.b()));
                    }
                    dlbg dlbgVar2 = dlbgVar;
                    hox hoxVar5 = hoxVar3;
                    ejy ejyVar2 = ejyVar;
                    imwVar.p();
                    boolean zBooleanValue = ((Boolean) hoxVar5.a()).booleanValue();
                    eji ejiVar = (eji) fcva.P(ejyVar2.d().i());
                    if (ejiVar != null) {
                        float f2 = f;
                        if (ejyVar2.i() || zBooleanValue || f2 > 0.0f) {
                            Float f3 = dlbgVar2.a;
                            hox hoxVar6 = hoxVar2;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (imwVar.b() & 4294967295L));
                            float fEn = imwVar.en(2.0f);
                            float f4 = fIntBitsToFloat - (fEn + fEn);
                            int iD = ejyVar2.d().d() - ejyVar2.d().i().size();
                            hoxVar6.b(Float.valueOf(Math.max(f3.floatValue() * f4, (f4 * f4) / (((ejyVar2.d().e() - ejyVar2.d().f()) / ejyVar2.d().i().size()) * r6))));
                            float f5 = iD > 0 ? ejiVar.a / iD : 1.0f;
                            boolean z4 = z3;
                            float fEn2 = (f4 + imwVar.en(2.0f)) - ((Number) hoxVar6.a()).floatValue();
                            float fEn3 = z4 ? imwVar.en(1.0f) + (imwVar.en(2.0f) / 2.0f) : ((Float.intBitsToFloat((int) (imwVar.b() >> 32)) - imwVar.en(2.0f)) - imwVar.en(1.0f)) - (imwVar.en(2.0f) / 2.0f);
                            long j6 = jF;
                            float fEn4 = imwVar.en(2.0f);
                            long jFloatToRawIntBits = Float.floatToRawIntBits(fEn3);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fEn4);
                            float fEn5 = imwVar.en(2.0f);
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (imwVar.b() & 4294967295L));
                            float fEn6 = imwVar.en(2.0f);
                            float f6 = fIntBitsToFloat2 - (fEn6 + fEn6);
                            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fEn5);
                            long jFloatToRawIntBits4 = Float.floatToRawIntBits(f6);
                            float fEn7 = imwVar.en(1.0f);
                            imy.o(imwVar, j6, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), (Float.floatToRawIntBits(imwVar.en(1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fEn7) << 32), null, f2, 208);
                            float fEn8 = z4 ? imwVar.en(1.0f) : (Float.intBitsToFloat((int) (imwVar.b() >> 32)) - imwVar.en(4.0f)) - imwVar.en(1.0f);
                            fdap fdapVar2 = fdapVar;
                            long j7 = j3;
                            long j8 = j2;
                            float f7 = f5 * fEn2;
                            if (true != zBooleanValue) {
                                j7 = j8;
                            }
                            long jFloatToRawIntBits5 = Float.floatToRawIntBits(fEn8);
                            float fEn9 = imwVar.en(4.0f);
                            float fFloatValue2 = ((Number) hoxVar6.a()).floatValue();
                            long jFloatToRawIntBits6 = Float.floatToRawIntBits(fFloatValue2) & 4294967295L;
                            float fEn10 = imwVar.en(2.0f);
                            long j9 = j7;
                            imy.o(imwVar, j9, (jFloatToRawIntBits5 << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(fEn9) << 32) | jFloatToRawIntBits6, (Float.floatToRawIntBits(imwVar.en(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fEn10) << 32), null, f2, 208);
                            String str = (String) fdapVar2.invoke(ejiVar);
                            if (zBooleanValue && str != null) {
                                long j10 = j5;
                                float fEm = imwVar.em(kjm.c(45));
                                Paint paint = new Paint();
                                paint.setTextAlign(Paint.Align.CENTER);
                                paint.setTextSize(fEm);
                                paint.setColor(ijg.b(j10));
                                paint.setAntiAlias(true);
                                float fEn11 = imwVar.en(8.0f);
                                float fEn12 = imwVar.en(16.0f);
                                float fEn13 = imwVar.en(32.0f);
                                float f8 = fEm + fEn12 + fEn12;
                                float f9 = f8 / 2.0f;
                                float fMax = Math.max(paint.measureText(str) + fEn13 + fEn13, f8);
                                float fEn14 = imwVar.en(2.0f);
                                float fEn15 = z4 ? fEn8 + imwVar.en(4.0f) + fEn11 : (fEn8 - fEn11) - fMax;
                                long j11 = j4;
                                float fMax2 = Math.max(imwVar.en(2.0f), (f7 + (((Number) hoxVar6.a()).floatValue() / 2.0f)) - f8);
                                iik iikVar = new iik((byte[]) null);
                                float f10 = fEn15 + fMax;
                                float f11 = fMax2 + f8;
                                long jFloatToRawIntBits7 = Float.floatToRawIntBits(f9) << 32;
                                long jFloatToRawIntBits8 = Float.floatToRawIntBits(f9) & 4294967295L;
                                long jFloatToRawIntBits9 = Float.floatToRawIntBits(f9) << 32;
                                long jFloatToRawIntBits10 = Float.floatToRawIntBits(f9) & 4294967295L;
                                float f12 = true != z4 ? fEn14 : f9;
                                long jFloatToRawIntBits11 = Float.floatToRawIntBits(f12) << 32;
                                long jFloatToRawIntBits12 = Float.floatToRawIntBits(f12) & 4294967295L;
                                if (true != z4) {
                                    fEn14 = f9;
                                }
                                iikVar.t(new ihw(fEn15, fMax2, f10, f11, jFloatToRawIntBits8 | jFloatToRawIntBits7, jFloatToRawIntBits9 | jFloatToRawIntBits10, jFloatToRawIntBits11 | jFloatToRawIntBits12, (Float.floatToRawIntBits(fEn14) << 32) | (Float.floatToRawIntBits(fEn14) & 4294967295L)));
                                imy.h(imwVar, iikVar, j11, null, 60);
                                iid.a(imwVar.t().b()).drawText(str, fEn15 + (fMax / 2.0f), (fMax2 + f9) - ((paint.descent() + paint.ascent()) / 2.0f), paint);
                            }
                        }
                    }
                    return fctx.a;
                }
            };
            hmlVar.y(obj4);
        } else {
            obj4 = objF5;
            f = fFloatValue;
            itcVar = null;
        }
        hmlVar.o();
        ics icsVarC = ifb.c(icsVar, (fdap) obj4);
        boolean z4 = ejyVar.i() || f > 0.0f;
        final float fEn = kioVar.en(4.0f) + kioVar.en(24.0f);
        hmlVar.v(-1224400529);
        boolean zD2 = hmlVar.D(ejyVar) | hmlVar.D(kioVar) | hmlVar.A(2.0f) | hmlVar.F(fdjxVar);
        Object objF6 = hmlVar.f();
        if (zD2 || objF6 == obj5) {
            fdap fdapVar2 = new fdap() { // from class: dlbc
                @Override // defpackage.fdap
                public final Object invoke(Object obj6) {
                    float fFloatValue2 = ((Float) obj6).floatValue();
                    ejy ejyVar2 = ejyVar;
                    int iD = ejyVar2.d().d();
                    fdil.d(fdjxVar, null, null, new dlbd(ejyVar2, Math.min(Math.max((int) ((fFloatValue2 * iD) / ((Float.intBitsToFloat((int) (((ihz) hoxVar.a()).a & 4294967295L)) - kioVar.en(2.0f)) - ((Number) hoxVar2.a()).floatValue())), 0), iD - 1), null), 3);
                    return fctx.a;
                }
            };
            hmlVar.y(fdapVar2);
            objF6 = fdapVar2;
        }
        final fdap fdapVar3 = (fdap) objF6;
        hmlVar.o();
        final boolean z5 = z4;
        ics icsVarB = isx.b(icsVarC, itcVar, new fdap() { // from class: dlba
            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            @Override // defpackage.fdap
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    r10 = this;
                    android.view.MotionEvent r11 = (android.view.MotionEvent) r11
                    r11.getClass()
                    boolean r0 = r1
                    r1 = 0
                    if (r0 != 0) goto Lc
                    goto L9d
                Lc:
                    fdap r0 = r7
                    hox r2 = r5
                    int r3 = r11.getAction()
                    r4 = 1
                    if (r3 == 0) goto L4e
                    if (r3 == r4) goto L39
                    r5 = 2
                    if (r3 == r5) goto L21
                    r11 = 3
                    if (r3 == r11) goto L39
                    goto L9d
                L21:
                    java.lang.Object r2 = r2.a()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L9d
                    float r11 = r11.getY()
                    java.lang.Float r11 = java.lang.Float.valueOf(r11)
                    r0.invoke(r11)
                    goto L4c
                L39:
                    java.lang.Object r11 = r2.a()
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L9d
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                    r2.b(r11)
                L4c:
                    r1 = r4
                    goto L9d
                L4e:
                    float r3 = r4
                    hox r5 = r3
                    boolean r6 = r2
                    r7 = 32
                    if (r6 == 0) goto L5a
                    r8 = 0
                    goto L69
                L5a:
                    java.lang.Object r8 = r5.a()
                    ihz r8 = (defpackage.ihz) r8
                    long r8 = r8.a
                    long r8 = r8 >> r7
                    int r8 = (int) r8
                    float r8 = java.lang.Float.intBitsToFloat(r8)
                    float r8 = r8 - r3
                L69:
                    if (r6 != 0) goto L79
                    java.lang.Object r3 = r5.a()
                    ihz r3 = (defpackage.ihz) r3
                    long r5 = r3.a
                    long r5 = r5 >> r7
                    int r3 = (int) r5
                    float r3 = java.lang.Float.intBitsToFloat(r3)
                L79:
                    float r5 = r11.getX()
                    int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                    if (r6 > 0) goto L9d
                    int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r3 > 0) goto L9d
                    fdae r1 = r6
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
                    r2.b(r3)
                    r1.invoke()
                    float r11 = r11.getY()
                    java.lang.Float r11 = java.lang.Float.valueOf(r11)
                    r0.invoke(r11)
                    goto L4c
                L9d:
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dlba.invoke(java.lang.Object):java.lang.Object");
            }
        });
        hmlVar.o();
        return icsVarB;
    }
}
