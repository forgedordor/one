package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0081g0 extends AbstractC0108l2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0081g0(InterfaceC0128p2 interfaceC0128p2, Object obj, int i) {
        super(interfaceC0128p2);
        this.b = i;
        this.c = obj;
    }

    @Override // j$.util.stream.InterfaceC0123o2, j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0128p2) ((LongFunction) this.c).apply(j));
                break;
            case 1:
                this.a.accept(((LongUnaryOperator) this.c).applyAsLong(j));
                break;
            default:
                ((LongConsumer) this.c).accept(j);
                this.a.accept(j);
                break;
        }
    }
}
