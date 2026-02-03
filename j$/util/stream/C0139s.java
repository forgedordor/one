package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0139s extends AbstractC0088h2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139s(AbstractC0050a abstractC0050a, int i, Object obj, int i2) {
        super(abstractC0050a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        switch (this.m) {
            case 0:
                return new r(interfaceC0128p2, (DoubleFunction) this.n, 0);
            case 1:
                return new V(interfaceC0128p2, (IntFunction) this.n, 0);
            case 2:
                return new C0081g0(interfaceC0128p2, (LongFunction) this.n, 0);
            case 3:
                return new C0120o(interfaceC0128p2, (Consumer) this.n, 1);
            default:
                return new C0120o(interfaceC0128p2, (Predicate) this.n, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139s(AbstractC0093i2 abstractC0093i2, Consumer consumer) {
        super(abstractC0093i2, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
