package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzb {
    private static final ThreadLocal a = new ThreadLocal();

    public static double a(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #".concat(String.valueOf(Integer.toHexString(i2))));
        }
        if (Color.alpha(i) < 255) {
            i = g(i, i2);
        }
        double dB = b(i) + 0.05d;
        double dB2 = b(i2) + 0.05d;
        return Math.max(dB, dB2) / Math.min(dB, dB2);
    }

    public static double b(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = iRed / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = iGreen / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = iBlue / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        double d4 = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
        return d4 / 100.0d;
    }

    public static int c(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4;
        int iRound5 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - Math.abs((f3 + f3) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound5 = Math.round((fAbs + f4) * 255.0f);
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                int i = iRound;
                iRound3 = iRound2;
                iRound4 = i;
                break;
            case 1:
                iRound5 = Math.round((fAbs2 + f4) * 255.0f);
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                int i2 = iRound;
                iRound3 = iRound2;
                iRound4 = i2;
                break;
            case 2:
                float f5 = fAbs2 + f4;
                iRound5 = Math.round(f4 * 255.0f);
                iRound4 = Math.round((fAbs + f4) * 255.0f);
                iRound3 = Math.round(f5 * 255.0f);
                break;
            case 3:
                float f6 = fAbs + f4;
                iRound5 = Math.round(f4 * 255.0f);
                iRound4 = Math.round((fAbs2 + f4) * 255.0f);
                iRound3 = Math.round(f6 * 255.0f);
                break;
            case 4:
                float f7 = fAbs + f4;
                iRound5 = Math.round((fAbs2 + f4) * 255.0f);
                iRound4 = Math.round(f4 * 255.0f);
                iRound3 = Math.round(f7 * 255.0f);
                break;
            case 5:
            case 6:
                float f8 = fAbs2 + f4;
                iRound5 = Math.round((fAbs + f4) * 255.0f);
                iRound4 = Math.round(f4 * 255.0f);
                iRound3 = Math.round(f8 * 255.0f);
                break;
            default:
                iRound4 = 0;
                iRound3 = 0;
                break;
        }
        return Color.rgb(m(iRound5), m(iRound4), m(iRound3));
    }

    public static int d(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(m((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), m((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), m((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int e(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static int f(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #".concat(String.valueOf(Integer.toHexString(i2))));
        }
        double d = f;
        if (a(h(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            double dA = a(h(i, i6), i2);
            if (dA >= d) {
                i3 = i6;
            }
            if (dA < d) {
                i4 = i6;
            }
        }
        return i3;
    }

    public static int g(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha) * (255 - iAlpha2)) / 255);
        return Color.argb(i3, k(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), k(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), k(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    public static int h(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void i(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            f = fMax == f2 ? ((f3 - f4) / f5) % 6.0f : fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            fAbs = f5 / (1.0f - Math.abs((f6 + f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = l(f7, 360.0f);
        fArr[1] = l(fAbs, 1.0f);
        fArr[2] = l(f6, 1.0f);
    }

    public static void j(int i, float[] fArr) {
        i(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    private static int k(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static float l(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return Math.min(f, f2);
    }

    private static int m(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }
}
