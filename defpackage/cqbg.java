package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqbg implements Interpolator {
    private final float a = 0.2f;
    private final float b = 1.0f;

    public cqbg(float f, float f2) {
    }

    private static float a(float f, float f2, float f3) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float f4 = ((f2 + 0.0f) * f) + 0.0f;
        float f5 = f2 + ((f3 - f2) * f);
        float f6 = f4 + ((f5 - f4) * f);
        return f6 + (((f5 + (((f3 + ((1.0f - f3) * f)) - f5) * f)) - f6) * f);
    }

    private final float b(float f) {
        return a(f, 0.4f, 0.2f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3;
        if (f <= 0.0f) {
            f2 = 0.0f;
        } else if (f >= 1.0f) {
            f2 = 1.0f;
        } else {
            f2 = f;
            float f4 = 0.0f;
            float fB = 0.0f;
            float f5 = 1.0f;
            for (int i = 0; i < 8; i++) {
                fB = b(f2);
                float fB2 = (b(f2 + 1.0E-6f) - fB) / 1.0E-6f;
                float f6 = fB - f;
                if (Math.abs(f6) < 1.0E-6f) {
                    break;
                }
                double d = fB2;
                if (Math.abs(d) < 9.999999974752427E-7d) {
                    break;
                }
                if (fB >= f) {
                    f5 = f2;
                }
                if (fB < f) {
                    f4 = f2;
                }
                f2 = (float) (f2 - (f6 / d));
            }
            for (int i2 = 0; Math.abs(fB - f) > 1.0E-6f && i2 < 8; i2++) {
                if (fB < f) {
                    f3 = (f2 + f5) / 2.0f;
                    f4 = f2;
                } else {
                    f3 = (f2 + f4) / 2.0f;
                    f5 = f2;
                }
                f2 = f3;
                fB = b(f2);
            }
        }
        return a(f2, 0.0f, 1.0f);
    }
}
