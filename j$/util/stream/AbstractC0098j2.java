package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0098j2 implements InterfaceC0113m2 {
    public final InterfaceC0128p2 a;

    public AbstractC0098j2(InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        this.a = interfaceC0128p2;
    }

    @Override // j$.util.stream.InterfaceC0113m2
    public final /* synthetic */ void C(Double d) {
        AbstractC0171y1.e(this, d);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public void k(long j) {
        this.a.k(j);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public boolean q() {
        return this.a.q();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C((Double) obj);
    }
}
