package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public final class W2 extends Y2 implements Spliterator.OfLong {
    public final /* synthetic */ X2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(X2 x2, int i, int i2, int i3, int i4) {
        super(x2, i, i2, i3, i4);
        this.g = x2;
    }

    @Override // j$.util.stream.Y2
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.Y2
    public final j$.util.X b(Object obj, int i, int i2) {
        return Spliterators.spliterator((long[]) obj, i, i2 + i, 1040);
    }

    @Override // j$.util.stream.Y2
    public final j$.util.X c(int i, int i2, int i3, int i4) {
        return new W2(this.g, i, i2, i3, i4);
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
