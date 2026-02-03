package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* loaded from: classes9.dex */
public final class Y3 extends AbstractC0061c0 {
    public final /* synthetic */ IntPredicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(AbstractC0066d0 abstractC0066d0, int i, IntPredicate intPredicate) {
        super(abstractC0066d0, i, 0);
        this.m = intPredicate;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        return (G0) new e4(this, abstractC0050a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator G(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return EnumC0094i3.ORDERED.x(abstractC0050a.f) ? F(abstractC0050a, spliterator, new C0076f0(16)).spliterator() : new g4((Spliterator.OfInt) abstractC0050a.O(spliterator), this.m);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        return new X3(interfaceC0128p2, this.m);
    }
}
