package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lua {
    public static /* synthetic */ lty a(int i, int i2) {
        if (1 == (i2 & 1)) {
            i = 8;
        }
        if (i < 3) {
            throw new IllegalArgumentException("Circle must have at least three vertices");
        }
        float f = lub.a / i;
        float fCos = (float) Math.cos(f);
        lsz lszVar = new lsz(1.0f, 2);
        float[] fArr = new float[i + i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            long jH = ltt.h(lub.f(1.0f / fCos, (f + f) * i4), csy.a(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = ltt.c(jH);
            i3 += 2;
            fArr[i5] = ltt.d(jH);
        }
        return ltz.b(fArr, lszVar, null, 0.0f, 0.0f);
    }

    public static /* synthetic */ lty b(int i, float f, lsz lszVar, lsz lszVar2, int i2) {
        if ((i2 & 8) != 0) {
            lszVar = lsz.a;
        }
        float f2 = (i2 & 2) != 0 ? 1.0f : 0.0f;
        ArrayList arrayList = null;
        if ((i2 & 16) != 0) {
            lszVar2 = null;
        }
        if (f2 > 0.0f) {
            if ((i2 & 4) != 0) {
                f = 0.5f;
            }
            if (f > 0.0f) {
                if (f >= f2) {
                    throw new IllegalArgumentException("innerRadius must be less than radius");
                }
                if (lszVar2 != null) {
                    fddq fddqVarR = fddu.r(0, i);
                    ArrayList arrayList2 = new ArrayList();
                    fcvy it = fddqVarR.iterator();
                    while (((fddp) it).a) {
                        it.a();
                        fcva.y(arrayList2, fcva.g(lszVar, lszVar2));
                    }
                    arrayList = arrayList2;
                }
                float[] fArr = new float[i * 4];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    float f3 = lub.a / i;
                    long jF = lub.f(f2, (f3 + f3) * i4);
                    fArr[i3] = ltt.c(jF) + 0.0f;
                    fArr[i3 + 1] = ltt.d(jF) + 0.0f;
                    long jF2 = lub.f(f, f3 * (i4 + i4 + 1));
                    int i5 = i3 + 3;
                    fArr[i3 + 2] = ltt.c(jF2) + 0.0f;
                    i3 += 4;
                    fArr[i5] = ltt.d(jF2) + 0.0f;
                }
                return ltz.b(fArr, lszVar, arrayList, 0.0f, 0.0f);
            }
        }
        throw new IllegalArgumentException("Star radii must both be greater than 0");
    }
}
