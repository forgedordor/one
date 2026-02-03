package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class I2 extends AbstractC0159w {
    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0094i3.SORTED.x(abstractC0050a.f)) {
            return abstractC0050a.l(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((A0) abstractC0050a.l(spliterator, true, intFunction)).b();
        Arrays.sort(dArr);
        return new S0(dArr);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        return EnumC0094i3.SORTED.x(i) ? interfaceC0128p2 : EnumC0094i3.SIZED.x(i) ? new N2(interfaceC0128p2) : new F2(interfaceC0128p2);
    }
}
