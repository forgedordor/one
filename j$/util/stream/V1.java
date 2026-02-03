package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public final class V1 extends Z1 implements InterfaceC0113m2 {
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

    @Override // j$.util.stream.Z1, j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        this.b++;
    }
}
