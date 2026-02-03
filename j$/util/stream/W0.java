package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class W0 extends Z0 implements C0 {
    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ Object b() {
        return AbstractC0171y1.e;
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final /* synthetic */ G0 e(long j, long j2, IntFunction intFunction) {
        return AbstractC0171y1.u(this, j, j2);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void f(Object[] objArr, int i) {
        AbstractC0171y1.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0171y1.r(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ j$.util.X spliterator() {
        return Spliterators.b;
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.b;
    }
}
