package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class R0 extends I0 {
    @Override // j$.util.stream.G0
    public final G0 e(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.c) {
            return this;
        }
        long jCount = this.a.count();
        if (j >= jCount) {
            return this.b.e(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 <= jCount) {
            return this.a.e(j, j2, intFunction);
        }
        return AbstractC0171y1.C(EnumC0099j3.REFERENCE, this.a.e(j, jCount, intFunction), this.b.e(0L, j2 - jCount, intFunction));
    }

    @Override // j$.util.stream.G0
    public final void f(Object[] objArr, int i) {
        objArr.getClass();
        G0 g0 = this.a;
        g0.f(objArr, i);
        this.b.f(objArr, i + ((int) g0.count()));
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.G0
    public final Object[] j(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new C0092i1(this);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
