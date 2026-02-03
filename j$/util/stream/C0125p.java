package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0125p extends AbstractC0088h2 {
    public static K0 P(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        C0105l c0105l = new C0105l(14);
        C0105l c0105l2 = new C0105l(15);
        return new K0((Collection) new D1(EnumC0099j3.REFERENCE, new C0105l(16), c0105l2, c0105l, 3).b(abstractC0050a, spliterator));
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0094i3.DISTINCT.x(abstractC0050a.f)) {
            return abstractC0050a.l(spliterator, false, intFunction);
        }
        if (EnumC0094i3.ORDERED.x(abstractC0050a.f)) {
            return P(abstractC0050a, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new P(new j$.nio.file.B(6, atomicBoolean, concurrentHashMap), false).b(abstractC0050a, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new K0(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator G(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        return EnumC0094i3.DISTINCT.x(abstractC0050a.f) ? abstractC0050a.O(spliterator) : EnumC0094i3.ORDERED.x(abstractC0050a.f) ? P(abstractC0050a, spliterator).spliterator() : new C0138r3(abstractC0050a.O(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        return EnumC0094i3.DISTINCT.x(i) ? interfaceC0128p2 : EnumC0094i3.SORTED.x(i) ? new C0115n(interfaceC0128p2) : new C0120o(interfaceC0128p2);
    }
}
