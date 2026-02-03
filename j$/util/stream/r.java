package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes9.dex */
public final class r extends AbstractC0098j2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(InterfaceC0128p2 interfaceC0128p2, Object obj, int i) {
        super(interfaceC0128p2);
        this.b = i;
        this.c = obj;
    }

    @Override // j$.util.stream.InterfaceC0113m2, j$.util.stream.InterfaceC0128p2
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0128p2) ((DoubleFunction) this.c).apply(d));
                break;
            case 1:
                this.a.accept(((DoubleUnaryOperator) this.c).applyAsDouble(d));
                break;
            default:
                ((DoubleConsumer) this.c).accept(d);
                this.a.accept(d);
                break;
        }
    }
}
