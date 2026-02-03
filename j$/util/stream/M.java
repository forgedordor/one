package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public final class M extends Q implements InterfaceC0113m2 {
    public final DoubleConsumer b;

    public M(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // j$.util.stream.InterfaceC0113m2
    public final /* synthetic */ void C(Double d) {
        AbstractC0171y1.e(this, d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        C((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        this.b.accept(d);
    }
}
