package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltl {
    public static final float a(csz cszVar, csz cszVar2, float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid progress: " + f);
        }
        fcvy it = fddu.r(0, cszVar.b).iterator();
        while (((fddp) it).a) {
            int iA = it.a();
            int i = iA + 1;
            if (d(f, cszVar.a(iA), cszVar.a(i % cszVar.b))) {
                int i2 = i % cszVar.b;
                float fA = cszVar.a(i2) - cszVar.a(iA);
                float f2 = lub.a;
                float fA2 = cszVar2.a(i2) - cszVar2.a(iA);
                float fE = lub.e(fA);
                return lub.e(cszVar2.a(iA) + (lub.e(fA2) * (fE < 0.001f ? 0.5f : lub.e(f - cszVar.a(iA)) / fE)));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final float b(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return Math.min(fAbs, 1.0f - fAbs);
    }

    public static final void c(csz cszVar) {
        float fB = cszVar.b();
        int i = cszVar.b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float fA = cszVar.a(i2);
            if (fA < 0.0f || fA >= 1.0f) {
                throw new IllegalArgumentException("FloatMapping - Progress outside of range: ".concat(csz.c(cszVar, null, null, 31)));
            }
            if (b(fA, fB) <= 1.0E-4f) {
                throw new IllegalArgumentException("FloatMapping - Progress repeats a value: ".concat(csz.c(cszVar, null, null, 31)));
            }
            if (fA < fB && (i3 = i3 + 1) > 1) {
                throw new IllegalArgumentException("FloatMapping - Progress wraps more than once: ".concat(csz.c(cszVar, null, null, 31)));
            }
            i2++;
            fB = fA;
        }
    }

    public static final boolean d(float f, float f2, float f3) {
        return f3 >= f2 ? f2 <= f && f <= f3 : f >= f2 || f <= f3;
    }
}
