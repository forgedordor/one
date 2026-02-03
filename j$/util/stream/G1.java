package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class G1 extends U1 implements T1, InterfaceC0113m2 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ C0130q d;

    public G1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C0130q c0130q) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = c0130q;
    }

    @Override // j$.util.stream.InterfaceC0113m2
    public final /* synthetic */ void C(Double d) {
        AbstractC0171y1.e(this, d);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    @Override // j$.util.stream.U1
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void u(T1 t1) {
        this.a = this.d.apply(this.a, ((G1) t1).a);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        C((Double) obj);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }
}
