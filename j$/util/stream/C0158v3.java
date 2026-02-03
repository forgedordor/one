package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0158v3 extends AbstractC0104k3 implements Spliterator.OfInt {
    @Override // j$.util.stream.AbstractC0104k3
    public final void d() {
        V2 v2 = new V2();
        this.h = v2;
        this.e = this.b.N(new C0153u3(v2, 1));
        this.f = new j$.desugar.sun.nio.fs.h(21, this);
    }

    @Override // j$.util.stream.AbstractC0104k3
    public final AbstractC0104k3 e(Spliterator spliterator) {
        return new C0158v3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.v(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.X
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean zA = a();
        if (zA) {
            V2 v2 = (V2) this.h;
            long j = this.g;
            int iX = v2.x(j);
            intConsumer.accept((v2.c == 0 && iX == 0) ? ((int[]) v2.e)[(int) j] : ((int[][]) v2.f)[iX][(int) (j - v2.d[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final j$.util.X trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.X
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            intConsumer.getClass();
            c();
            C0153u3 c0153u3 = new C0153u3(intConsumer, 0);
            this.b.M(this.d, c0153u3);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }
}
