package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0178z3 extends B3 implements Spliterator.OfInt {
    @Override // j$.util.stream.D3
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C0178z3((Spliterator.OfInt) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.B3
    public final Object b() {
        return new B0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.v(this, consumer);
    }
}
