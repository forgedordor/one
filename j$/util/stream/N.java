package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
public final class N extends Q implements InterfaceC0118n2 {
    public final IntConsumer b;

    public N(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        o((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0118n2
    public final /* synthetic */ void o(Integer num) {
        AbstractC0171y1.g(this, num);
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        this.b.accept(i);
    }
}
