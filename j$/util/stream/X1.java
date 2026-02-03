package j$.util.stream;

import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public final class X1 extends Z1 implements InterfaceC0123o2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        z((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0123o2
    public final /* synthetic */ void z(Long l) {
        AbstractC0171y1.i(this, l);
    }

    @Override // j$.util.stream.Z1, j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        this.b++;
    }
}
