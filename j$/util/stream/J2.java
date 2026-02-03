package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public final class J2 extends AbstractC0061c0 {
    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0094i3.SORTED.x(abstractC0050a.f)) {
            return abstractC0050a.l(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((C0) abstractC0050a.l(spliterator, true, intFunction)).b();
        Arrays.sort(iArr);
        return new C0057b1(iArr);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        return EnumC0094i3.SORTED.x(i) ? interfaceC0128p2 : EnumC0094i3.SIZED.x(i) ? new O2(interfaceC0128p2) : new G2(interfaceC0128p2);
    }
}
