package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class Q1 extends U1 implements T1, InterfaceC0118n2 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjIntConsumer c;
    public final /* synthetic */ C0130q d;

    public Q1(Supplier supplier, ObjIntConsumer objIntConsumer, C0130q c0130q) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = c0130q;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
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

    @Override // j$.util.stream.InterfaceC0118n2
    public final /* synthetic */ void o(Integer num) {
        AbstractC0171y1.g(this, num);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void u(T1 t1) {
        this.a = this.d.apply(this.a, ((Q1) t1).a);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }
}
