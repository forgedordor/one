package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hle {
    public static final hlf a(int i) {
        hlh hlhVar = hlh.a;
        float[][] fArr = hlg.a;
        double dB = hlg.b((i >> 16) & 255);
        float fB = hlg.b((i >> 8) & 255);
        float fB2 = hlg.b(i & 255);
        double[][] dArr = hlg.d;
        double[] dArr2 = dArr[0];
        double d = dArr2[0] * dB;
        double d2 = fB;
        double d3 = dArr2[1] * d2;
        double d4 = fB2;
        double d5 = dArr2[2] * d4;
        double[] dArr3 = dArr[1];
        double d6 = dArr3[0] * dB;
        double d7 = dArr3[1] * d2;
        double d8 = dArr3[2] * d4;
        double[] dArr4 = dArr[2];
        float f = (float) ((dB * dArr4[0]) + (d2 * dArr4[1]) + (d4 * dArr4[2]));
        float[] fArr2 = {(float) (d + d3 + d5), (float) (d6 + d7 + d8), f};
        float[][] fArr3 = hlg.a;
        float f2 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f3 = fArr4[0] * f2;
        float f4 = fArr2[1];
        float f5 = fArr4[1] * f4;
        float f6 = fArr4[2] * f;
        float[] fArr5 = fArr3[1];
        float f7 = fArr5[0] * f2;
        float f8 = fArr5[1] * f4;
        float f9 = fArr5[2] * f;
        float[] fArr6 = fArr3[2];
        float f10 = f2 * fArr6[0];
        float f11 = f4 * fArr6[1];
        float f12 = f * fArr6[2];
        float[] fArr7 = hlhVar.g;
        float f13 = fArr7[0] * (f3 + f5 + f6);
        float f14 = fArr7[1] * (f7 + f8 + f9);
        float f15 = fArr7[2] * (f10 + f11 + f12);
        float f16 = hlhVar.h;
        float fPow = (float) Math.pow((Math.abs(f13) * f16) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f14) * f16) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((f16 * Math.abs(f15)) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float fAtan2 = (((float) Math.atan2(((fSignum + fSignum2) - (fSignum3 + fSignum3)) / 9.0f, (((fSignum * 11.0f) + ((-12.0f) * fSignum2)) + fSignum3) / 11.0f)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fAtan2;
        float f18 = (f17 * 3.1415927f) / 180.0f;
        float f19 = ((((40.0f * fSignum) + (fSignum2 * 20.0f)) + fSignum3) / 20.0f) * hlhVar.d;
        float f20 = hlhVar.c;
        float f21 = hlhVar.f;
        float fPow4 = ((float) Math.pow(f19 / f20, hlhVar.j * 0.69000006f)) * 100.0f;
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0f)) * ((float) Math.pow((((((((float) Math.cos((((((double) f17) < 20.14d ? 360.0f + f17 : f17) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * hlhVar.e) * ((float) Math.sqrt((r9 * r9) + (r3 * r3)))) / (((((fSignum * 20.0f) + r4) + (fSignum3 * 21.0f)) / 20.0f) + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, hlhVar.b)), 0.7300000190734863d));
        float f22 = hlhVar.i * fSqrt;
        Math.sqrt((r0 * 0.69000006f) / (f20 + 4.0f));
        double d9 = f18;
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        return new hlf(f17, fSqrt, fPow4, (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f), fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
    }

    public static final hlf b(float f, float f2, float f3) {
        hlh hlhVar = hlh.a;
        float f4 = hlhVar.i * f2;
        float fSqrt = (float) Math.sqrt(f / 100.0d);
        float f5 = hlhVar.f;
        Math.sqrt(((f2 / fSqrt) * 0.69000006f) / (hlhVar.c + 4.0f));
        float fLog = (float) Math.log((f4 * 0.0228d) + 1.0d);
        double d = (3.1415927f * f3) / 180.0f;
        float f6 = fLog * 43.85965f;
        return new hlf(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), f6 * ((float) Math.cos(d)), f6 * ((float) Math.sin(d)));
    }
}
