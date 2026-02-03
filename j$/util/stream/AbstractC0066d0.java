package j$.util.stream;

import j$.util.C0184y;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0066d0 extends AbstractC0050a implements IntStream {
    public static Spliterator.OfInt P(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (!T3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        T3.a(AbstractC0050a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final boolean C(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        IntConsumer f;
        boolean zQ;
        Spliterator.OfInt ofIntP = P(spliterator);
        if (interfaceC0128p2 instanceof IntConsumer) {
            f = (IntConsumer) interfaceC0128p2;
        } else {
            if (T3.a) {
                T3.a(AbstractC0050a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            interfaceC0128p2.getClass();
            f = new j$.util.F(interfaceC0128p2, 1);
        }
        do {
            zQ = interfaceC0128p2.q();
            if (zQ) {
                break;
            }
        } while (ofIntP.tryAdvance(f));
        return zQ;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final EnumC0099j3 D() {
        return EnumC0099j3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0170y0 E(long j, IntFunction intFunction) {
        return AbstractC0171y1.K(j);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator L(AbstractC0050a abstractC0050a, Supplier supplier, boolean z) {
        return new C0158v3(abstractC0050a, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) m(AbstractC0171y1.M(EnumC0145t0.ALL, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) m(AbstractC0171y1.M(EnumC0145t0.ANY, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final C asDoubleStream() {
        return new C0154v(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new Y(this, 0, 0);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B average() {
        long j = ((long[]) collect(new E(17), new E(18), new E(19)))[0];
        return j > 0 ? new j$.util.B(r0[1] / j) : j$.util.B.c;
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0139s(this, 0, new E(11), 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0130q c0130q = new C0130q(biConsumer, 1);
        supplier.getClass();
        objIntConsumer.getClass();
        return m(new D1(EnumC0099j3.INT_VALUE, c0130q, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) m(new F1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC0093i2) boxed()).distinct().mapToInt(new E(10));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream dropWhile(IntPredicate intPredicate) {
        int i = k4.a;
        intPredicate.getClass();
        return new a4(this, k4.b, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final C e() {
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        intPredicate.getClass();
        return new W(this, EnumC0094i3.t, intPredicate, 3);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findAny() {
        return (OptionalInt) m(G.d);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) m(G.c);
    }

    public void forEach(IntConsumer intConsumer) {
        intConsumer.getClass();
        m(new N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        intConsumer.getClass();
        m(new N(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final LongStream k() {
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return A2.f(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        intUnaryOperator.getClass();
        return new W(this, EnumC0094i3.p | EnumC0094i3.n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new C0139s(this, EnumC0094i3.p | EnumC0094i3.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return reduce(new E(16));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return reduce(new E(12));
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) m(AbstractC0171y1.M(EnumC0145t0.NONE, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 p(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0171y1.A(abstractC0050a, spliterator, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new W(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream r(L l) {
        return new W(this, EnumC0094i3.p | EnumC0094i3.n | EnumC0094i3.t, l, 2);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        intBinaryOperator.getClass();
        return ((Integer) m(new O1(EnumC0099j3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : A2.f(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new J2(this, EnumC0094i3.q | EnumC0094i3.o, 0);
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new E(15));
    }

    @Override // j$.util.stream.IntStream
    public final C0184y summaryStatistics() {
        return (C0184y) collect(new j$.desugar.sun.nio.fs.n(29), new E(13), new E(14));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream takeWhile(IntPredicate intPredicate) {
        int i = k4.a;
        intPredicate.getClass();
        return new Y3(this, k4.a, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0171y1.H((C0) n(new E(9))).b();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !EnumC0094i3.ORDERED.x(this.f) ? this : new C0051a0(this, EnumC0094i3.r, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator$OfInt, java.lang.Object] */
    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public final Iterator<Integer> iterator2() {
        ?? Spliterator2 = spliterator2();
        Spliterator2.getClass();
        return new j$.util.b0(Spliterator2);
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    /* renamed from: spliterator, reason: merged with bridge method [inline-methods] */
    public final Spliterator<Integer> spliterator2() {
        return P(super.spliterator2());
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        intBinaryOperator.getClass();
        return (OptionalInt) m(new B1(EnumC0099j3.INT_VALUE, intBinaryOperator, 3));
    }
}
