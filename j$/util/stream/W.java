package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

/* loaded from: classes9.dex */
public final class W extends AbstractC0061c0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(AbstractC0050a abstractC0050a, int i, Object obj, int i2) {
        super(abstractC0050a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        switch (this.m) {
            case 0:
                return new V(interfaceC0128p2, (IntConsumer) this.n, 1);
            case 1:
                return new V(interfaceC0128p2, (IntUnaryOperator) this.n, 2);
            case 2:
                return new Z(interfaceC0128p2, (L) this.n);
            case 3:
                return new V(interfaceC0128p2, (IntPredicate) this.n, 3);
            case 4:
                return new C0120o(interfaceC0128p2, (ToIntFunction) this.n, 4);
            default:
                return new C0073e2(interfaceC0128p2, (C0095j) this.n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AbstractC0066d0 abstractC0066d0, IntConsumer intConsumer) {
        super(abstractC0066d0, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
