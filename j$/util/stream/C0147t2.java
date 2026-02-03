package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0147t2 extends AbstractC0061c0 {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147t2(AbstractC0066d0 abstractC0066d0, int i, long j, long j2) {
        super(abstractC0066d0, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 F(AbstractC0050a abstractC0050a, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jT = abstractC0050a.t(spliterator);
        if (jT > 0 && spliterator.hasCharacteristics(16384)) {
            AbstractC0050a abstractC0050a2 = abstractC0050a;
            while (abstractC0050a2.e > 0) {
                abstractC0050a2 = abstractC0050a2.b;
            }
            return AbstractC0171y1.A(abstractC0050a, A2.b(abstractC0050a2.D(), spliterator, this.m, this.n), true);
        }
        if (EnumC0094i3.ORDERED.x(abstractC0050a.f)) {
            return (G0) new C0177z2(this, abstractC0050a, spliterator, intFunction, this.m, this.n).invoke();
        }
        Spliterator.OfInt ofInt = (Spliterator.OfInt) abstractC0050a.O(spliterator);
        long j2 = this.m;
        long j3 = this.n;
        if (j2 <= jT) {
            long j4 = jT - j2;
            jMin = j3 >= 0 ? Math.min(j3, j4) : j4;
            j = 0;
        } else {
            jMin = j3;
            j = j2;
        }
        return AbstractC0171y1.A(this, new F3(ofInt, j, jMin), true);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator G(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        long jT = abstractC0050a.t(spliterator);
        long j = this.n;
        if (jT > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) abstractC0050a.O(spliterator);
            long j2 = this.m;
            return new C0178z3(ofInt, j2, A2.c(j2, j));
        }
        if (EnumC0094i3.ORDERED.x(abstractC0050a.f)) {
            return ((G0) new C0177z2(this, abstractC0050a, spliterator, new C0076f0(11), this.m, this.n).invoke()).spliterator();
        }
        Spliterator.OfInt ofInt2 = (Spliterator.OfInt) abstractC0050a.O(spliterator);
        long j3 = this.m;
        if (j3 <= jT) {
            long jMin = jT - j3;
            if (j >= 0) {
                jMin = Math.min(j, jMin);
            }
            j = jMin;
            j3 = 0;
        }
        return new F3(ofInt2, j3, j);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        return new C0142s2(interfaceC0128p2, this.m, this.n);
    }
}
