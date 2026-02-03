package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* loaded from: classes9.dex */
public final class V extends AbstractC0103k2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(InterfaceC0128p2 interfaceC0128p2, Object obj, int i) {
        super(interfaceC0128p2);
        this.b = i;
        this.c = obj;
    }

    @Override // j$.util.stream.InterfaceC0118n2, j$.util.stream.InterfaceC0128p2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0128p2) ((IntFunction) this.c).apply(i));
                break;
            case 1:
                ((IntConsumer) this.c).accept(i);
                this.a.accept(i);
                break;
            case 2:
                this.a.accept(((IntUnaryOperator) this.c).applyAsInt(i));
                break;
            default:
                if (((IntPredicate) this.c).test(i)) {
                    this.a.accept(i);
                    break;
                }
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0103k2, j$.util.stream.InterfaceC0128p2
    public void k(long j) {
        switch (this.b) {
            case 3:
                this.a.k(-1L);
                break;
            default:
                super.k(j);
                break;
        }
    }
}
