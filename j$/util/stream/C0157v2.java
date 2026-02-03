package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0157v2 extends AbstractC0106l0 {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157v2(AbstractC0111m0 abstractC0111m0, int i, long j, long j2) {
        super(abstractC0111m0, i, 0);
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
            return AbstractC0171y1.B(abstractC0050a, A2.b(abstractC0050a2.D(), spliterator, this.m, this.n), true);
        }
        if (EnumC0094i3.ORDERED.x(abstractC0050a.f)) {
            return (G0) new C0177z2(this, abstractC0050a, spliterator, intFunction, this.m, this.n).invoke();
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) abstractC0050a.O(spliterator);
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
        return AbstractC0171y1.B(this, new G3(ofLong, j, jMin), true);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator G(AbstractC0050a abstractC0050a, Spliterator spliterator) {
        long jT = abstractC0050a.t(spliterator);
        long j = this.n;
        if (jT > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator.OfLong ofLong = (Spliterator.OfLong) abstractC0050a.O(spliterator);
            long j2 = this.m;
            return new A3(ofLong, j2, A2.c(j2, j));
        }
        if (EnumC0094i3.ORDERED.x(abstractC0050a.f)) {
            return ((G0) new C0177z2(this, abstractC0050a, spliterator, new C0076f0(12), this.m, this.n).invoke()).spliterator();
        }
        Spliterator.OfLong ofLong2 = (Spliterator.OfLong) abstractC0050a.O(spliterator);
        long j3 = this.m;
        if (j3 <= jT) {
            long jMin = jT - j3;
            if (j >= 0) {
                jMin = Math.min(j, jMin);
            }
            j = jMin;
            j3 = 0;
        }
        return new G3(ofLong2, j3, j);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0128p2 I(int i, InterfaceC0128p2 interfaceC0128p2) {
        return new C0152u2(interfaceC0128p2, this.m, this.n);
    }
}
