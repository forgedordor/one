package j$.util.stream;

import j$.util.C0183x;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0164x extends AbstractC0050a implements C {
    @Override // j$.util.stream.C
    public final boolean A() {
        throw null;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final boolean C(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        DoubleConsumer c;
        boolean zQ;
        if (!(spliterator instanceof Spliterator.OfDouble)) {
            if (!T3.a) {
                throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
            }
            T3.a(AbstractC0050a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        Spliterator.OfDouble ofDouble = (Spliterator.OfDouble) spliterator;
        if (interfaceC0128p2 instanceof DoubleConsumer) {
            c = (DoubleConsumer) interfaceC0128p2;
        } else {
            if (T3.a) {
                T3.a(AbstractC0050a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            interfaceC0128p2.getClass();
            c = new j$.util.C(interfaceC0128p2, 1);
        }
        do {
            zQ = interfaceC0128p2.q();
            if (zQ) {
                break;
            }
        } while (ofDouble.tryAdvance(c));
        return zQ;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final EnumC0099j3 D() {
        return EnumC0099j3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0170y0 E(long j, IntFunction intFunction) {
        return AbstractC0171y1.D(j);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator L(AbstractC0050a abstractC0050a, Supplier supplier, boolean z) {
        return new C0148t3(abstractC0050a, supplier, z);
    }

    @Override // j$.util.stream.C
    public final C a() {
        int i = k4.a;
        throw null;
    }

    @Override // j$.util.stream.C
    public final j$.util.B average() {
        double[] dArr = (double[]) collect(new C0105l(19), new C0105l(20), new C0105l(21));
        if (dArr[2] <= 0.0d) {
            return j$.util.B.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.B(d / dArr[2]);
    }

    @Override // j$.util.stream.C
    public final C b() {
        throw null;
    }

    @Override // j$.util.stream.C
    public final Stream boxed() {
        return new C0139s(this, 0, new C0105l(24), 0);
    }

    @Override // j$.util.stream.C
    public final C c(j$.desugar.sun.nio.fs.h hVar) {
        return new C0144t(this, EnumC0094i3.p | EnumC0094i3.n | EnumC0094i3.t, hVar, 1);
    }

    @Override // j$.util.stream.C
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0130q c0130q = new C0130q(biConsumer, 0);
        supplier.getClass();
        objDoubleConsumer.getClass();
        return m(new D1(EnumC0099j3.DOUBLE_VALUE, c0130q, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.C
    public final long count() {
        return ((Long) m(new F1(1))).longValue();
    }

    @Override // j$.util.stream.C
    public final C d() {
        int i = k4.a;
        throw null;
    }

    @Override // j$.util.stream.C
    public final C distinct() {
        return ((AbstractC0093i2) boxed()).distinct().mapToDouble(new C0105l(25));
    }

    @Override // j$.util.stream.C
    public final j$.util.B findAny() {
        return (j$.util.B) m(F.d);
    }

    @Override // j$.util.stream.C
    public final j$.util.B findFirst() {
        return (j$.util.B) m(F.c);
    }

    @Override // j$.util.stream.C
    public final void forEach(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        m(new M(doubleConsumer, false));
    }

    @Override // j$.util.stream.C
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        m(new M(doubleConsumer, true));
    }

    @Override // j$.util.stream.C
    public final C limit(long j) {
        if (j >= 0) {
            return A2.e(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.C
    public final C map(DoubleUnaryOperator doubleUnaryOperator) {
        doubleUnaryOperator.getClass();
        return new C0144t(this, EnumC0094i3.p | EnumC0094i3.n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.C
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        doubleFunction.getClass();
        return new C0139s(this, EnumC0094i3.p | EnumC0094i3.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.C
    public final j$.util.B max() {
        return reduce(new C0105l(27));
    }

    @Override // j$.util.stream.C
    public final j$.util.B min() {
        return reduce(new C0105l(18));
    }

    @Override // j$.util.stream.C
    public final boolean o() {
        throw null;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 p(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0171y1.z(abstractC0050a, spliterator, z);
    }

    @Override // j$.util.stream.C
    public final C peek(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0144t(this, doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        doubleBinaryOperator.getClass();
        return ((Double) m(new H1(EnumC0099j3.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.C
    public final C skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : A2.e(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.C
    public final C sorted() {
        return new I2(this, EnumC0094i3.q | EnumC0094i3.o, 0);
    }

    @Override // j$.util.stream.C
    public final double sum() {
        double[] dArr = (double[]) collect(new C0105l(28), new C0105l(29), new C0105l(17));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.C
    public final C0183x summaryStatistics() {
        return (C0183x) collect(new j$.desugar.sun.nio.fs.n(22), new C0105l(22), new C0105l(23));
    }

    @Override // j$.util.stream.C
    public final double[] toArray() {
        return (double[]) AbstractC0171y1.G((A0) n(new C0105l(26))).b();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !EnumC0094i3.ORDERED.x(this.f) ? this : new C0154v(this, EnumC0094i3.r, 0);
    }

    @Override // j$.util.stream.C
    public final boolean v() {
        throw null;
    }

    @Override // j$.util.stream.C
    public final LongStream w() {
        throw null;
    }

    @Override // j$.util.stream.C
    public final IntStream y() {
        throw null;
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator */
    public final PrimitiveIterator.OfDouble iterator2() {
        return new j$.util.d0(spliterator2());
    }

    @Override // j$.util.stream.AbstractC0050a, j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final Spliterator.OfDouble spliterator2() {
        Spliterator spliteratorSpliterator2 = super.spliterator2();
        if (spliteratorSpliterator2 instanceof Spliterator.OfDouble) {
            return (Spliterator.OfDouble) spliteratorSpliterator2;
        }
        if (!T3.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        T3.a(AbstractC0050a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.C
    public final j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator) {
        doubleBinaryOperator.getClass();
        return (j$.util.B) m(new B1(EnumC0099j3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }
}
