package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltz {
    public static final long a(float[] fArr) {
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            int length = fArr.length;
            if (i >= length) {
                float f3 = length >> 1;
                return csy.a(f / f3, f2 / f3);
            }
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final lty b(float[] fArr, lsz lszVar, List list, float f, float f2) {
        float f3;
        float f4;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        float f5;
        ArrayList arrayList2;
        List listB;
        ltb ltbVarA;
        fcti fctiVar;
        lsz lszVar2;
        int length = fArr.length;
        if (length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i4 = 1;
        if ((length & 1) == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null) {
            int size = list.size();
            if (size + size != length) {
                throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int i5 = length >> 1;
        ArrayList arrayList4 = new ArrayList();
        int i6 = 0;
        int i7 = 0;
        while (i7 < i5) {
            lsz lszVar3 = (list == null || (lszVar2 = (lsz) list.get(i7)) == null) ? lszVar : lszVar2;
            int i8 = ((i7 + i5) - 1) % i5;
            int i9 = i7 + 1;
            int i10 = i9 % i5;
            int i11 = i8 + i8;
            int i12 = i7 + i7;
            int i13 = i10 + i10;
            arrayList4.add(new ltw(csy.a(fArr[i11], fArr[i11 + 1]), csy.a(fArr[i12], fArr[i12 + 1]), csy.a(fArr[i13], fArr[i13 + 1]), lszVar3));
            i7 = i9;
        }
        fddq fddqVarR = fddu.r(0, i5);
        ArrayList arrayList5 = new ArrayList(fcva.p(fddqVarR, 10));
        fcvy it = fddqVarR.iterator();
        while (true) {
            f3 = 0.0f;
            f4 = 1.0f;
            if (!((fddp) it).a) {
                break;
            }
            int iA = it.a();
            int i14 = (iA + 1) % i5;
            float f6 = ((ltw) arrayList4.get(iA)).g + ((ltw) arrayList4.get(i14)).g;
            float fB = ((ltw) arrayList4.get(iA)).b() + ((ltw) arrayList4.get(i14)).b();
            int i15 = iA + iA;
            int i16 = i14 + i14;
            float fA = lub.a(fArr[i15] - fArr[i16], fArr[i15 + 1] - fArr[i16 + 1]);
            if (f6 > fA) {
                fctiVar = new fcti(Float.valueOf(fA / f6), Float.valueOf(0.0f));
            } else if (fB > fA) {
                fctiVar = new fcti(Float.valueOf(1.0f), Float.valueOf((fA - f6) / (fB - f6)));
            } else {
                Float fValueOf = Float.valueOf(1.0f);
                fctiVar = new fcti(fValueOf, fValueOf);
            }
            arrayList5.add(fctiVar);
        }
        int i17 = 0;
        while (i17 < i5) {
            cue cueVar = new cue(2);
            int i18 = i6;
            while (i18 < 2) {
                fcti fctiVar2 = (fcti) arrayList5.get((((i17 + i5) - 1) + i18) % i5);
                cueVar.d((((ltw) arrayList4.get(i17)).g * ((Number) fctiVar2.a).floatValue()) + ((((ltw) arrayList4.get(i17)).b() - ((ltw) arrayList4.get(i17)).g) * ((Number) fctiVar2.b).floatValue()));
                i18++;
                f3 = f3;
            }
            float f7 = f3;
            ltw ltwVar = (ltw) arrayList4.get(i17);
            float fA2 = cueVar.a(i6);
            float fA3 = cueVar.a(i4);
            float fMin = Math.min(fA2, fA3);
            float f8 = ltwVar.g;
            if (f8 < 1.0E-4f || fMin < 1.0E-4f) {
                i = i17;
                i2 = i4;
            } else {
                i2 = i4;
                float f9 = ltwVar.f;
                if (f9 < 1.0E-4f) {
                    i = i17;
                } else {
                    float fMin2 = Math.min(fMin, f8);
                    float fA4 = ltwVar.a(fA2);
                    float fA5 = ltwVar.a(fA3);
                    float f10 = (f9 * fMin2) / f8;
                    float f11 = lub.a;
                    float fSqrt = (float) Math.sqrt((f10 * f10) + (fMin2 * fMin2));
                    long j = ltwVar.b;
                    int i19 = i6;
                    arrayList = arrayList5;
                    long j2 = ltwVar.d;
                    f5 = f4;
                    long j3 = ltwVar.e;
                    i3 = i19;
                    ltwVar.h = ltt.h(j, ltt.i(ltt.f(ltt.e(ltt.h(j2, j3), 2.0f)), fSqrt));
                    long jH = ltt.h(j, ltt.i(j2, fMin2));
                    long jH2 = ltt.h(j, ltt.i(j3, fMin2));
                    ltb ltbVarC = ltw.c(fMin2, fA4, j, ltwVar.a, jH, jH2, ltwVar.h, f10);
                    ltb ltbVarC2 = ltw.c(fMin2, fA5, j, ltwVar.c, jH2, jH, ltwVar.h, f10);
                    ltb ltbVarA2 = ltc.a(ltbVarC2.c(), ltbVarC2.d(), ltbVarC2.g(), ltbVarC2.h(), ltbVarC2.e(), ltbVarC2.f(), ltbVarC2.a(), ltbVarC2.b());
                    ltb[] ltbVarArr = new ltb[3];
                    ltbVarArr[i3] = ltbVarC;
                    float fC = ltt.c(ltwVar.h);
                    float fD = ltt.d(ltwVar.h);
                    float fC2 = ltbVarC.c();
                    float fD2 = ltbVarC.d();
                    float fA6 = ltbVarA2.a();
                    float fB2 = ltbVarA2.b();
                    float f12 = fC2 - fC;
                    float f13 = fD2 - fD;
                    float f14 = fA6 - fC;
                    float f15 = fB2 - fD;
                    i = i17;
                    long jC = lub.c(f12, f13);
                    arrayList2 = arrayList4;
                    long jC2 = lub.c(f14, f15);
                    long jD = lub.d(jC);
                    long jD2 = lub.d(jC2);
                    float fC3 = ltt.c(jD) * f14;
                    float fD3 = ltt.d(jD) * f15;
                    float fA7 = ltt.a(jC, jC2);
                    if (fA7 > 0.999f) {
                        ltbVarA = lta.a(fC2, fD2, fA6, fB2);
                    } else {
                        float fA8 = ((((lub.a(f12, f13) * 4.0f) / 3.0f) * (((float) Math.sqrt(r5 + r5)) - ((float) Math.sqrt(f5 - (fA7 * fA7))))) / (f5 - fA7)) * (fC3 + fD3 >= f7 ? f5 : -1.0f);
                        ltbVarA = ltc.a(fC2, fD2, (ltt.c(jD) * fA8) + fC2, (ltt.d(jD) * fA8) + fD2, fA6 - (ltt.c(jD2) * fA8), fB2 - (ltt.d(jD2) * fA8), fA6, fB2);
                    }
                    ltbVarArr[i2] = ltbVarA;
                    ltbVarArr[2] = ltbVarA2;
                    listB = fcva.g(ltbVarArr);
                    arrayList3.add(listB);
                    i17 = i + 1;
                    f3 = f7;
                    arrayList5 = arrayList;
                    i4 = i2;
                    arrayList4 = arrayList2;
                    f4 = f5;
                    i6 = i3;
                }
            }
            arrayList2 = arrayList4;
            i3 = i6;
            arrayList = arrayList5;
            f5 = f4;
            long j4 = ltwVar.b;
            ltwVar.h = j4;
            listB = fcva.b(lta.a(ltt.c(j4), ltt.d(j4), ltt.c(j4), ltt.d(j4)));
            arrayList3.add(listB);
            i17 = i + 1;
            f3 = f7;
            arrayList5 = arrayList;
            i4 = i2;
            arrayList4 = arrayList2;
            f4 = f5;
            i6 = i3;
        }
        int i20 = i4;
        int i21 = i6;
        float f16 = f3;
        ArrayList arrayList6 = new ArrayList();
        int i22 = i21;
        while (i22 < i5) {
            int i23 = i22 + 1;
            int i24 = i22 + i22;
            long jA = csy.a(fArr[i24], fArr[i24 + 1]);
            int i25 = ((i22 + i5) - 1) % i5;
            int i26 = i25 + i25;
            long jA2 = csy.a(fArr[i26], fArr[i26 + 1]);
            int i27 = i23 % i5;
            int i28 = i27 + i27;
            long jA3 = csy.a(fArr[i28], fArr[i28 + 1]);
            float f17 = lub.a;
            long jG = ltt.g(jA, jA2);
            long jG2 = ltt.g(jA3, jA);
            arrayList6.add(new ltg((List) arrayList3.get(i22), (ltt.c(jG) * ltt.d(jG2)) - (ltt.d(jG) * ltt.c(jG2)) > f16 ? i20 : i21));
            arrayList6.add(new lth(fcva.b(lta.a(((ltb) fcva.S((List) arrayList3.get(i22))).c(), ((ltb) fcva.S((List) arrayList3.get(i22))).d(), ((ltb) fcva.N((List) arrayList3.get(i27))).a(), ((ltb) fcva.N((List) arrayList3.get(i27))).b()))));
            i22 = i23;
        }
        long jA4 = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? a(fArr) : csy.a(f, f2);
        int i29 = (int) (jA4 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i29);
        if (arrayList6.size() < 2) {
            throw new IllegalArgumentException("Polygons must have at least 2 features");
        }
        fcww fcwwVar = new fcww((byte[]) null);
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            for (ltb ltbVar : ((lti) it2.next()).b) {
                fcwwVar.add(Float.valueOf(ltbVar.a()));
                fcwwVar.add(Float.valueOf(ltbVar.b()));
            }
        }
        float[] fArrAB = fcva.aB(fcva.a(fcwwVar));
        if (Float.isNaN(fIntBitsToFloat)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (a(fArrAB) >> 32));
        }
        if (Float.isNaN(fIntBitsToFloat2)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & a(fArrAB)));
        }
        return new lty(arrayList6, csy.a(fIntBitsToFloat, fIntBitsToFloat2));
    }
}
