package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongUnaryOperator;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0091i0 extends AbstractC0106l0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0091i0(AbstractC0050a abstractC0050a, int i, Object obj, int i2) {
        super(abstractC0050a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        switch (this.m) {
            case 0:
                return new C0081g0(interfaceC0128p2, (LongUnaryOperator) this.n, 1);
            case 1:
                return new C0096j0(interfaceC0128p2, (j$.desugar.sun.nio.fs.h) this.n);
            case 2:
                return new C0081g0(interfaceC0128p2, (LongConsumer) this.n, 2);
            case 3:
                return new C0058b2(interfaceC0128p2, (C0095j) this.n);
            default:
                return new C0120o(interfaceC0128p2, (ToLongFunction) this.n, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091i0(AbstractC0111m0 abstractC0111m0, LongConsumer longConsumer) {
        super(abstractC0111m0, 0, 1);
        this.m = 2;
        this.n = longConsumer;
    }
}
