package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ToDoubleFunction;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0144t extends AbstractC0159w {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0144t(AbstractC0050a abstractC0050a, int i, Object obj, int i2) {
        super(abstractC0050a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        switch (this.m) {
            case 0:
                return new r(interfaceC0128p2, (DoubleUnaryOperator) this.n, 1);
            case 1:
                return new C0149u(interfaceC0128p2, (j$.desugar.sun.nio.fs.h) this.n);
            case 2:
                return new r(interfaceC0128p2, (DoubleConsumer) this.n, 2);
            case 3:
                return new C0120o(interfaceC0128p2, (ToDoubleFunction) this.n, 6);
            default:
                return new C0078f2(interfaceC0128p2, (C0095j) this.n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144t(AbstractC0164x abstractC0164x, DoubleConsumer doubleConsumer) {
        super(abstractC0164x, 0, 1);
        this.m = 2;
        this.n = doubleConsumer;
    }
}
