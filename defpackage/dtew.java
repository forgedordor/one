package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtew {
    public static final long a(long j, float f) {
        double d = f;
        if (!(d < 1.0E-4d) && !(d > 99.9999d)) {
            float[] fArr = ilo.a;
            ilg ilgVar = ilo.t;
            long jE = ije.e(j, ilgVar);
            return ije.e(ijg.j(f, ije.c(jE), ije.b(jE), 0.0f, ilgVar, 8), ilo.e);
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f2 * f2 * f2;
        if (f3 <= 0.008856452f) {
            f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        double d2 = (f3 * 100.0f) / 100.0f;
        int iB = kzz.b(fdcu.a((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
        return ijg.e(iB, iB, iB, 255);
    }

    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
