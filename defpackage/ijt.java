package defpackage;

import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijt extends ikm {
    private final List a;
    private final List b;
    private final long c;
    private final long d;
    private final int e = 0;

    public ijt(List list, List list2, long j, long j2) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.ikm
    public final Shader b(long j) {
        long j2 = this.c;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.d;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        return iip.c((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L), this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijt)) {
            return false;
        }
        ijt ijtVar = (ijt) obj;
        if (!fdbq.f(this.a, ijtVar.a) || !fdbq.f(this.b, ijtVar.b) || !ihs.h(this.c, ijtVar.c) || !ihs.h(this.d, ijtVar.d)) {
            return false;
        }
        int i = ijtVar.e;
        return ikx.b(0, 0);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return (((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + ihr.a(this.c)) * 31) + ihr.a(this.d)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) ihs.g(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.d;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) ihs.g(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=" + this.b + ", " + str + str2 + "tileMode=" + ((Object) ikx.a(0)) + ')';
    }
}
