package j$.util.stream;

import j$.util.Comparator;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class L2 extends AbstractC0088h2 {
    public final boolean m;
    public final Comparator n;

    public L2(AbstractC0093i2 abstractC0093i2) {
        super(abstractC0093i2, EnumC0094i3.q | EnumC0094i3.o, 0);
        this.m = true;
        this.n = Comparator.CC.naturalOrder();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0094i3.SORTED.x(abstractC0050a.f) && this.m) {
            return abstractC0050a.l(spliterator, false, intFunction);
        }
        Object[] objArrJ = abstractC0050a.l(spliterator, true, intFunction).j(intFunction);
        Arrays.sort(objArrJ, this.n);
        return new J0(objArrJ);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        if (EnumC0094i3.SORTED.x(i) && this.m) {
            return interfaceC0128p2;
        }
        boolean zX = EnumC0094i3.SIZED.x(i);
        java.util.Comparator comparator = this.n;
        return zX ? new Q2(interfaceC0128p2, comparator) : new M2(interfaceC0128p2, comparator);
    }

    public L2(AbstractC0093i2 abstractC0093i2, java.util.Comparator comparator) {
        super(abstractC0093i2, EnumC0094i3.q | EnumC0094i3.p, 0);
        this.m = false;
        comparator.getClass();
        this.n = comparator;
    }
}
