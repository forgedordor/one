package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class A3 extends B3 implements Spliterator.OfLong {
    @Override // j$.util.stream.D3
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new A3((Spliterator.OfLong) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.B3
    public final Object b() {
        return new D0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.w(this, consumer);
    }
}
