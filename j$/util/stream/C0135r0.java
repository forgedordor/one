package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0135r0 extends AbstractC0140s0 implements InterfaceC0118n2 {
    public final /* synthetic */ EnumC0145t0 c;
    public final /* synthetic */ IntPredicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0135r0(EnumC0145t0 enumC0145t0, IntPredicate intPredicate) {
        super(enumC0145t0);
        this.c = enumC0145t0;
        this.d = intPredicate;
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

    @Override // j$.util.stream.AbstractC0140s0, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(i);
        EnumC0145t0 enumC0145t0 = this.c;
        if (zTest == enumC0145t0.a) {
            this.a = true;
            this.b = enumC0145t0.b;
        }
    }
}
