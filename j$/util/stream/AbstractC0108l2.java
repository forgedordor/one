package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0108l2 implements InterfaceC0123o2 {
    public final InterfaceC0128p2 a;

    public AbstractC0108l2(InterfaceC0128p2 interfaceC0128p2) {
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

    @Override // j$.util.stream.InterfaceC0128p2
    public boolean q() {
        return this.a.q();
    }

    @Override // j$.util.stream.InterfaceC0123o2
    public final /* synthetic */ void z(Long l) {
        AbstractC0171y1.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        z((Long) obj);
    }
}
