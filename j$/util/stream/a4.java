package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* loaded from: classes9.dex */
public final class a4 extends AbstractC0061c0 implements b4 {
    public final /* synthetic */ IntPredicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(AbstractC0066d0 abstractC0066d0, int i, IntPredicate intPredicate) {
        super(abstractC0066d0, i, 0);
        this.m = intPredicate;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        return (G0) new d4(this, abstractC0050a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator G(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return EnumC0094i3.ORDERED.x(abstractC0050a.f) ? F(abstractC0050a, spliterator, new C0076f0(17)).spliterator() : new f4((Spliterator.OfInt) abstractC0050a.O(spliterator), this.m);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        return g(interfaceC0128p2, false);
    }

    @Override // j$.util.stream.b4
    public final c4 g(InterfaceC0128p2 interfaceC0128p2, boolean z) {
        return new Z3(interfaceC0128p2, this.m, z);
    }
}
