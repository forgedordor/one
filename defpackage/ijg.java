package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijg {
    public static final float a(long j) {
        ilg ilgVarF = ije.f(j);
        long j2 = ilgVarF.b;
        if (!ilf.b(j2, 12884901888L)) {
            String strA = ilf.a(j2);
            Objects.toString(strA);
            ijs.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(strA));
        }
        ilgVarF.getClass();
        ilt iltVar = ((imn) ilgVarF).p;
        float fA = (float) ((iltVar.a(ije.d(j)) * 0.2126d) + (iltVar.a(ije.c(j)) * 0.7152d) + (iltVar.a(ije.b(j)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int b(long j) {
        float[] fArr = ilo.a;
        return (int) (ije.e(j, ilo.e) >>> 32);
    }

    public static final long c(int i) {
        long j = ije.a;
        return i << 32;
    }

    public static final long d(long j) {
        long j2 = ije.a;
        return j << 32;
    }

    public static final long e(int i, int i2, int i3, int i4) {
        return c(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long f(float r20, float r21, float r22, float r23, defpackage.ilg r24) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijg.f(float, float, float, float, ilg):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long g(float r18, float r19, float r20, float r21, defpackage.ilg r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijg.g(float, float, float, float, ilg):long");
    }

    public static final long h(long j, long j2) {
        long jE = ije.e(j, ije.f(j2));
        float fA = ije.a(jE);
        float fD = ije.d(jE);
        float fD2 = ije.d(j2);
        float fA2 = ije.a(j2);
        float f = 1.0f - fA;
        float f2 = (fA2 * f) + fA;
        return g(f2 == 0.0f ? 0.0f : ((fD * fA) + ((fD2 * fA2) * f)) / f2, f2 == 0.0f ? 0.0f : ((ije.c(jE) * fA) + ((ije.c(j2) * fA2) * f)) / f2, f2 != 0.0f ? ((ije.b(jE) * fA) + ((ije.b(j2) * fA2) * f)) / f2 : 0.0f, f2, ije.f(j2));
    }

    public static final long i(long j, long j2, float f) {
        float[] fArr = ilo.a;
        ilg ilgVar = ilo.x;
        long jE = ije.e(j, ilgVar);
        long jE2 = ije.e(j2, ilgVar);
        float fA = ije.a(jE);
        float fD = ije.d(jE);
        float fC = ije.c(jE);
        float fB = ije.b(jE);
        float fA2 = ije.a(jE2);
        float fD2 = ije.d(jE2);
        float fC2 = ije.c(jE2);
        float fB2 = ije.b(jE2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return ije.e(g(kjx.b(fD, fD2, f), kjx.b(fC, fC2, f), kjx.b(fB, fB2, f), kjx.b(fA, fA2, f), ilgVar), ije.f(j2));
    }

    public static /* synthetic */ long j(float f, float f2, float f3, float f4, ilg ilgVar, int i) {
        if ((i & 16) != 0) {
            float[] fArr = ilo.a;
            ilgVar = ilo.e;
        }
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        return f(f, f2, f3, f4, ilgVar);
    }
}
