package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0103k2 implements InterfaceC0118n2 {
    public final InterfaceC0128p2 a;

    public AbstractC0103k2(InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        this.a = interfaceC0128p2;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
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

    @Override // j$.util.stream.InterfaceC0118n2
    public final /* synthetic */ void o(Integer num) {
        AbstractC0171y1.g(this, num);
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Integer) obj);
    }
}
