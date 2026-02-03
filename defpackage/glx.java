package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glx {
    static /* synthetic */ lty a(List list, int i, boolean z, int i2) {
        long j;
        char c;
        List listA;
        float fFloatValue;
        int i3 = i;
        long j2 = 4294967295L;
        char c2 = ' ';
        long jFloatToRawIntBits = (i2 & 4) != 0 ? (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L) : 0L;
        float f = 360.0f;
        if (((i2 & 8) == 0) && z) {
            fcww fcwwVar = new fcww((byte[]) null);
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                glw glwVar = (glw) list.get(i4);
                lsz lszVar = gly.a;
                long jD = ihs.d(glwVar.a, jFloatToRawIntBits);
                arrayList.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (jD & r16)), Float.intBitsToFloat((int) (jD >> 32)))) * 180.0f) / 3.1415927f));
                i4++;
                j2 = j2;
            }
            j = j2;
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList2.add(Float.valueOf(ihs.a(ihs.d(((glw) list.get(i5)).a, jFloatToRawIntBits))));
            }
            int i6 = i3 + i3;
            float f2 = 360.0f / i6;
            for (int i7 = 0; i7 < i6; i7++) {
                fcvy it = fcva.k(list).iterator();
                while (((fddp) it).a) {
                    int iA = it.a();
                    int i8 = i7 % 2;
                    if (i8 != 0) {
                        iA = fcva.e(list) - iA;
                    }
                    if (iA > 0 || i8 == 0) {
                        float f3 = i7 * f2;
                        lsz lszVar2 = gly.a;
                        if (i8 == 0) {
                            fFloatValue = ((Number) arrayList.get(iA)).floatValue();
                        } else {
                            float fFloatValue2 = f2 - ((Number) arrayList.get(iA)).floatValue();
                            float fFloatValue3 = ((Number) arrayList.get(0)).floatValue();
                            fFloatValue = fFloatValue2 + fFloatValue3 + fFloatValue3;
                        }
                        float fCos = (float) Math.cos(c(f3 + fFloatValue));
                        fcwwVar.add(new glw(ihs.e(ihs.f((Float.floatToRawIntBits((float) Math.sin(r14)) & j) | (Float.floatToRawIntBits(fCos) << c2), ((Number) arrayList2.get(iA)).floatValue()), jFloatToRawIntBits), ((glw) list.get(iA)).b));
                        arrayList = arrayList;
                        c2 = c2;
                    }
                }
            }
            c = c2;
            listA = fcva.a(fcwwVar);
        } else {
            j = 4294967295L;
            c = ' ';
            int size3 = list.size();
            fddq fddqVarR = fddu.r(0, size3 * i3);
            ArrayList arrayList3 = new ArrayList(fcva.p(fddqVarR, 10));
            fcvy it2 = fddqVarR.iterator();
            while (((fddp) it2).a) {
                int iA2 = it2.a();
                lsz lszVar3 = gly.a;
                int i9 = iA2 % size3;
                long jD2 = ihs.d(((glw) list.get(i9)).a, jFloatToRawIntBits);
                double dC = c(((iA2 / size3) * f) / i3);
                int i10 = (int) (jD2 >> 32);
                int i11 = (int) (jD2 & 4294967295L);
                arrayList3.add(new glw(ihs.e((Float.floatToRawIntBits((((float) Math.sin(dC)) * Float.intBitsToFloat(i10)) + (Float.intBitsToFloat(i11) * ((float) Math.cos(dC)))) & 4294967295L) | (Float.floatToRawIntBits((Float.intBitsToFloat(i10) * ((float) Math.cos(dC))) - (Float.intBitsToFloat(i11) * ((float) Math.sin(dC)))) << 32), jFloatToRawIntBits), ((glw) list.get(i9)).b));
                i3 = i;
                size3 = size3;
                f = 360.0f;
            }
            listA = arrayList3;
        }
        int size4 = listA.size();
        int i12 = size4 + size4;
        float[] fArr = new float[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            long j3 = ((glw) listA.get(i13 / 2)).a;
            fArr[i13] = Float.intBitsToFloat((int) (i13 % 2 == 0 ? j3 >> c : j3 & j));
        }
        fcww fcwwVar2 = new fcww((byte[]) null);
        Iterator it3 = listA.iterator();
        while (it3.hasNext()) {
            fcwwVar2.add(((glw) it3.next()).b);
        }
        return ltz.b(fArr, lsz.a, fcva.a(fcwwVar2), Float.intBitsToFloat((int) (jFloatToRawIntBits >> c)), Float.intBitsToFloat((int) (jFloatToRawIntBits & j)));
    }

    public static final lty b() {
        lty ltyVar = gly.l;
        if (ltyVar != null) {
            return ltyVar;
        }
        lty ltyVarC = a(fcva.g(new glw((Float.floatToRawIntBits(0.193f) << 32) | (Float.floatToRawIntBits(0.277f) & 4294967295L), new lsz(0.053f, 2)), new glw((Float.floatToRawIntBits(0.176f) << 32) | (Float.floatToRawIntBits(0.055f) & 4294967295L), new lsz(0.053f, 2))), 10, false, 12).c();
        gly.l = ltyVarC;
        return ltyVarC;
    }

    private static final float c(float f) {
        float f2 = f / 360.0f;
        return (f2 + f2) * 3.1415927f;
    }
}
