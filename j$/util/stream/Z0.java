package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public abstract class Z0 implements G0 {
    @Override // j$.util.stream.G0
    public G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj) {
    }

    @Override // j$.util.stream.G0
    public /* synthetic */ G0 e(long j, long j2, IntFunction intFunction) {
        return AbstractC0171y1.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.G0
    public final Object[] j(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int r() {
        return 0;
    }

    public final void c(int i, Object obj) {
    }
}
