package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class O0 extends Q0 implements C0 {
    @Override // j$.util.stream.G0
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

    @Override // j$.util.stream.F0
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.G0
    public final j$.util.X spliterator() {
        return new C0077f1(this);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new C0077f1(this);
    }
}
