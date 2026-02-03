package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public abstract class Z1 extends U1 implements T1 {
    public long b;

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(double d) {
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

    @Override // j$.util.stream.U1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void u(T1 t1) {
        this.b += ((Z1) t1).b;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }
}
