package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes9.dex */
public final class U3 extends AbstractC0088h2 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(AbstractC0093i2 abstractC0093i2, int i, Predicate predicate) {
        super(abstractC0093i2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        return (G0) new e4(this, abstractC0050a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator G(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return EnumC0094i3.ORDERED.x(abstractC0050a.f) ? F(abstractC0050a, spliterator, new C0076f0(2)).spliterator() : new i4(abstractC0050a.O(spliterator), this.m, 1);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        return new C0115n(interfaceC0128p2, this.m);
    }
}
