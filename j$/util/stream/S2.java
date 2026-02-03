package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public final class S2 extends Y2 implements Spliterator.OfDouble {
    public final /* synthetic */ T2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(T2 t2, int i, int i2, int i3, int i4) {
        super(t2, i, i2, i3, i4);
        this.g = t2;
    }

    @Override // j$.util.stream.Y2
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.Y2
    public final j$.util.X b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        dArr.getClass();
        Spliterators.a(dArr.length, i, i3);
        return new j$.util.g0(dArr, i, i3, 1040);
    }

    @Override // j$.util.stream.Y2
    public final j$.util.X c(int i, int i2, int i3, int i4) {
        return new S2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.u(this, consumer);
    }
}
