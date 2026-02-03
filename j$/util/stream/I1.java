package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class I1 extends U1 implements T1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ BiFunction c;
    public final /* synthetic */ BinaryOperator d;

    public I1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
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
        this.a = this.b;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void u(T1 t1) {
        this.a = this.d.apply(this.a, ((I1) t1).a);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }
}
