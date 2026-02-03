package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0109l3 extends AbstractC0124o3 implements DoubleConsumer {
    public final double[] c;

    public C0109l3(int i) {
        this.c = new double[i];
    }

    @Override // j$.util.stream.AbstractC0124o3
    public final void a(Object obj, long j) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < j; i++) {
            doubleConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }
}
