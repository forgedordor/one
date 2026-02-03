package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public abstract class Q0 extends I0 implements F0 {
    @Override // j$.util.stream.F0
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        c(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.F0
    public final void c(int i, Object obj) {
        G0 g0 = this.a;
        ((F0) g0).c(i, obj);
        ((F0) this.b).c(i + ((int) ((F0) g0).count()), obj);
    }

    @Override // j$.util.stream.F0
    public final void d(Object obj) {
        ((F0) this.a).d(obj);
        ((F0) this.b).d(obj);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] j(IntFunction intFunction) {
        return AbstractC0171y1.m(this, intFunction);
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
