package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilw extends ilg {
    private static final float[] d;
    private static final float[] e;
    private static final float[] f;
    private static final float[] g;

    static {
        float[] fArr = ile.b.c;
        imq imqVar = ilu.a;
        float[] fArrF = ilh.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ilh.d(fArr, ilu.b.a(), ilu.d.a()));
        d = fArrF;
        float[] fArr2 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr2;
        f = ilh.e(fArrF);
        g = ilh.e(fArr2);
    }

    public ilw() {
        super("Oklab", 12884901890L, 19);
    }

    @Override // defpackage.ilg
    public final float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.ilg
    public final float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.ilg
    public final float c(float f2, float f3, float f4) {
        float[] fArr = g;
        float f5 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f6 = f5 * f2;
        float f7 = fArr[3];
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        float f8 = f7 * f3;
        float f9 = fArr[6];
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f10 = f4 <= 0.5f ? f4 : 0.5f;
        float f11 = f9 * f10;
        float f12 = fArr[1] * f2;
        float f13 = fArr[4] * f3;
        float f14 = fArr[7] * f10;
        float f15 = fArr[2] * f2;
        float f16 = fArr[5] * f3;
        float f17 = fArr[8] * f10;
        float[] fArr2 = f;
        float f18 = f6 + f8 + f11;
        float f19 = f12 + f13 + f14;
        float f20 = f15 + f16 + f17;
        return (fArr2[2] * f18 * f18 * f18) + (fArr2[5] * f19 * f19 * f19) + (fArr2[8] * f20 * f20 * f20);
    }

    @Override // defpackage.ilg
    public final long d(float f2, float f3, float f4) {
        float[] fArr = g;
        float f5 = fArr[0];
        float f6 = f2 >= 0.0f ? f2 : 0.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = f5 * f6;
        float f8 = fArr[3];
        float f9 = f3 < -0.5f ? -0.5f : f3;
        if (f9 > 0.5f) {
            f9 = 0.5f;
        }
        float f10 = f8 * f9;
        float f11 = fArr[6];
        float f12 = f4 >= -0.5f ? f4 : -0.5f;
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float f14 = fArr[1] * f6;
        float f15 = fArr[4] * f9;
        float f16 = fArr[7] * f13;
        float f17 = fArr[2] * f6;
        float f18 = fArr[5] * f9;
        float f19 = fArr[8] * f13;
        float[] fArr2 = f;
        float f20 = f7 + f10 + (f11 * f13);
        float f21 = f20 * f20 * f20;
        float f22 = f14 + f15 + f16;
        float f23 = f22 * f22 * f22;
        float f24 = f17 + f18 + f19;
        float f25 = f24 * f24 * f24;
        return (Float.floatToRawIntBits(((fArr2[0] * f21) + (fArr2[3] * f23)) + (fArr2[6] * f25)) << 32) | (Float.floatToRawIntBits((fArr2[1] * f21) + (fArr2[4] * f23) + (fArr2[7] * f25)) & 4294967295L);
    }

    @Override // defpackage.ilg
    public final long e(float f2, float f3, float f4, float f5, ilg ilgVar) {
        float[] fArr = d;
        float f6 = fArr[0] * f2;
        float f7 = fArr[3] * f3;
        float f8 = fArr[6] * f4;
        float f9 = fArr[1] * f2;
        float f10 = fArr[4] * f3;
        float f11 = fArr[7] * f4;
        float f12 = fArr[2] * f2;
        float f13 = fArr[5] * f3;
        float f14 = fArr[8] * f4;
        float fA = kjx.a(f6 + f7 + f8);
        float fA2 = kjx.a(f9 + f10 + f11);
        float fA3 = kjx.a(f12 + f13 + f14);
        float[] fArr2 = e;
        float f15 = fArr2[0] * fA;
        float f16 = fArr2[3] * fA2;
        float f17 = fArr2[6] * fA3;
        float f18 = fArr2[1] * fA;
        float f19 = fArr2[4] * fA2;
        return ijg.f(f15 + f16 + f17, f18 + f19 + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), f5, ilgVar);
    }
}
