package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evvw extends evvy {
    public evvw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.evvy
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // defpackage.evvy
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.evvy
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.evvy
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.evvy
    public final void e(Object obj, long j, boolean z) {
        if (evvz.d) {
            evvz.o(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            evvz.p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.evvy
    public final void f(Object obj, long j, byte b) {
        if (evvz.d) {
            evvz.o(obj, j, b);
        } else {
            evvz.p(obj, j, b);
        }
    }

    @Override // defpackage.evvy
    public final void g(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.evvy
    public final void h(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.evvy
    public final boolean i(Object obj, long j) {
        return evvz.d ? evvz.x(obj, j) : evvz.y(obj, j);
    }
}
