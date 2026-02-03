package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikg extends ikm {
    private final List a;
    private final long c;
    private final float d;
    private final List b = null;
    private final int e = 0;

    public ikg(List list, long j, float f) {
        this.a = list;
        this.c = j;
        this.d = f;
    }

    @Override // defpackage.ikm
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jB = iia.b(j);
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB >> 32));
            fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i2);
            fIntBitsToFloat2 = fIntBitsToFloat3;
        }
        List list = this.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L;
        float fB = this.d;
        if (fB == Float.POSITIVE_INFINITY) {
            fB = ihz.b(j) / 2.0f;
        }
        long j3 = jFloatToRawIntBits2 | jFloatToRawIntBits;
        iip.a(list, null);
        return new RadialGradient(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)), fB, iip.b(list), (float[]) null, iiq.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikg)) {
            return false;
        }
        ikg ikgVar = (ikg) obj;
        if (!fdbq.f(this.a, ikgVar.a)) {
            return false;
        }
        List list = ikgVar.b;
        if (!fdbq.f(null, null) || !ihs.h(this.c, ikgVar.c) || this.d != ikgVar.d) {
            return false;
        }
        int i = ikgVar.e;
        return ikx.b(0, 0);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 961) + ihr.a(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) ihs.g(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.d;
        if ((Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=" + ((Object) ikx.a(0)) + ')';
    }
}
