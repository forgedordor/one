package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0148t3 extends AbstractC0104k3 implements Spliterator.OfDouble {
    @Override // j$.util.stream.AbstractC0104k3
    public final void d() {
        T2 t2 = new T2();
        this.h = t2;
        this.e = this.b.N(new C0143s3(t2, 1));
        this.f = new j$.desugar.sun.nio.fs.h(20, this);
    }

    @Override // j$.util.stream.AbstractC0104k3
    public final AbstractC0104k3 e(Spliterator spliterator) {
        return new C0148t3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.u(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) super.trySplit();
    }

    @Override // j$.util.X
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        boolean zA = a();
        if (zA) {
            T2 t2 = (T2) this.h;
            long j = this.g;
            int iX = t2.x(j);
            doubleConsumer.accept((t2.c == 0 && iX == 0) ? ((double[]) t2.e)[(int) j] : ((double[][]) t2.f)[iX][(int) (j - t2.d[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final j$.util.X trySplit() {
        return (Spliterator.OfDouble) super.trySplit();
    }

    @Override // j$.util.X
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            doubleConsumer.getClass();
            c();
            C0143s3 c0143s3 = new C0143s3(doubleConsumer, 0);
            this.b.M(this.d, c0143s3);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.stream.AbstractC0104k3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfDouble) super.trySplit();
    }
}
