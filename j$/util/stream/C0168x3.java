package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0168x3 extends AbstractC0104k3 implements Spliterator.OfLong {
    @Override // j$.util.stream.AbstractC0104k3
    public final void d() {
        X2 x2 = new X2();
        this.h = x2;
        this.e = this.b.N(new C0163w3(x2, 1));
        this.f = new j$.desugar.sun.nio.fs.h(22, this);
    }

    @Override // j$.util.stream.AbstractC0104k3
    public final AbstractC0104k3 e(Spliterator spliterator) {
        return new C0168x3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.w(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.X
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        boolean zA = a();
        if (zA) {
            X2 x2 = (X2) this.h;
            long j = this.g;
            int iX = x2.x(j);
            longConsumer.accept((x2.c == 0 && iX == 0) ? ((long[]) x2.e)[(int) j] : ((long[][]) x2.f)[iX][(int) (j - x2.d[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final j$.util.X trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.X
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            longConsumer.getClass();
            c();
            C0163w3 c0163w3 = new C0163w3(longConsumer, 0);
            this.b.M(this.d, c0163w3);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }
}
