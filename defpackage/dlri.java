package defpackage;

import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlri extends ikm {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;

    public dlri(float f, long j, long j2, long j3) {
        this.a = f;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.ikm
    public final Shader b(long j) {
        double d = (this.a / 180.0f) * 3.141592653589793d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        float fSqrt = (float) Math.sqrt((((float) Math.pow(Float.intBitsToFloat(i), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat(i2), 2.0d))) / 2.0f);
        long jE = ihs.e(iia.b(j), (Float.floatToRawIntBits(fCos * fSqrt) << 32) | (Float.floatToRawIntBits(fSin * fSqrt) & 4294967295L));
        float fMin = Math.min(fddu.c(Float.intBitsToFloat((int) (jE >> 32)), 0.0f), Float.intBitsToFloat(i));
        float fIntBitsToFloat = Float.intBitsToFloat(i2) - Math.min(fddu.c(Float.intBitsToFloat((int) (jE & 4294967295L)), 0.0f), Float.intBitsToFloat(i2));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMin);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        long j2 = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
        Shader shaderC = iip.c(ihs.d((Float.floatToRawIntBits(Float.intBitsToFloat(i2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32), j2), j2, fcva.g(new ije(this.b), new ije(this.c)), null);
        long j3 = this.d;
        if (fcts.a(j3, ije.g)) {
            return shaderC;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        return new ComposeShader(iip.c(0L, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), fcva.g(new ije(j3), new ije(j3)), null), shaderC, PorterDuff.Mode.DST_OVER);
    }
}
