package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0111m0 extends AbstractC0050a implements LongStream {
    public static Spliterator.OfLong P(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfLong) {
            return (Spliterator.OfLong) spliterator;
        }
        if (!T3.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        T3.a(AbstractC0050a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final boolean C(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        LongConsumer i;
        boolean zQ;
        Spliterator.OfLong ofLongP = P(spliterator);
        if (interfaceC0128p2 instanceof LongConsumer) {
            i = (LongConsumer) interfaceC0128p2;
        } else {
            if (T3.a) {
                T3.a(AbstractC0050a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            interfaceC0128p2.getClass();
            i = new j$.util.I(interfaceC0128p2, 1);
        }
        do {
            zQ = interfaceC0128p2.q();
            if (zQ) {
                break;
            }
        } while (ofLongP.tryAdvance(i));
        return zQ;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final EnumC0099j3 D() {
        return EnumC0099j3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0170y0 E(long j, IntFunction intFunction) {
        return AbstractC0171y1.L(j);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator L(AbstractC0050a abstractC0050a, Supplier supplier, boolean z) {
        return new C0168x3(abstractC0050a, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i = k4.a;
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final C asDoubleStream() {
        return new C0154v(this, EnumC0094i3.n, 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B average() {
        long j = ((long[]) collect(new E(26), new E(27), new E(28)))[0];
        return j > 0 ? new j$.util.B(r0[1] / j) : j$.util.B.c;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new C0139s(this, 0, new E(25), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c(j$.desugar.sun.nio.fs.h hVar) {
        return new C0091i0(this, EnumC0094i3.p | EnumC0094i3.n | EnumC0094i3.t, hVar, 1);
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0130q c0130q = new C0130q(biConsumer, 2);
        supplier.getClass();
        objLongConsumer.getClass();
        return m(new D1(EnumC0099j3.LONG_VALUE, c0130q, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) m(new F1(0))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d() {
        int i = k4.a;
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((AbstractC0093i2) boxed()).distinct().mapToLong(new E(22));
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findAny() {
        return (OptionalLong) m(H.d);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findFirst() {
        return (OptionalLong) m(H.c);
    }

    public void forEach(LongConsumer longConsumer) {
        longConsumer.getClass();
        m(new O(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        longConsumer.getClass();
        m(new O(longConsumer, true));
    }

    @Override // j$.util.stream.LongStream
    public final C j() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j >= 0) {
            return A2.g(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream map(LongUnaryOperator longUnaryOperator) {
        longUnaryOperator.getClass();
        return new C0091i0(this, EnumC0094i3.p | EnumC0094i3.n, longUnaryOperator, 0);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        longFunction.getClass();
        return new C0139s(this, EnumC0094i3.p | EnumC0094i3.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong max() {
        return reduce(new E(29));
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong min() {
        return reduce(new E(21));
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 p(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0171y1.B(abstractC0050a, spliterator, z);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0091i0(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final boolean q() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        longBinaryOperator.getClass();
        return ((Long) m(new C0176z1(EnumC0099j3.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : A2.g(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new K2(this, EnumC0094i3.q | EnumC0094i3.o, 0);
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new C0076f0(0));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.A summaryStatistics() {
        return (j$.util.A) collect(new C0105l(2), new E(20), new E(23));
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) AbstractC0171y1.I((E0) n(new E(24))).b();
    }

    @Override // j$.util.stream.LongStream
    public final boolean u() {
        throw null;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !EnumC0094i3.ORDERED.x(this.f) ? this : new Y(this, EnumC0094i3.r, 1);
    }

    @Override // j$.util.stream.LongStream
    public final boolean x() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final IntStream z() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator$OfLong, java.lang.Object] */
    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator<Long> iterator2() {
        ?? Spliterator2 = spliterator2();
        Spliterator2.getClass();
        return new j$.util.c0(Spliterator2);
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final Spliterator<Long> spliterator2() {
        return P(super.spliterator2());
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        longBinaryOperator.getClass();
        return (OptionalLong) m(new B1(EnumC0099j3.LONG_VALUE, longBinaryOperator, 0));
    }
}
