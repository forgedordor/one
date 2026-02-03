package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0093i2 extends AbstractC0050a implements Stream {
    @Override // j$.util.stream.Stream
    public final IntStream B(C0095j c0095j) {
        return new W(this, EnumC0094i3.p | EnumC0094i3.n | EnumC0094i3.t, c0095j, 5);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final boolean C(Spliterator spliterator, InterfaceC0128p2 interfaceC0128p2) {
        boolean zQ;
        do {
            zQ = interfaceC0128p2.q();
            if (zQ) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC0128p2));
        return zQ;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final EnumC0099j3 D() {
        return EnumC0099j3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC0050a
    public final InterfaceC0170y0 E(long j, IntFunction intFunction) {
        return AbstractC0171y1.x(j, intFunction);
    }

    @Override // j$.util.stream.AbstractC0050a
    public final Spliterator L(AbstractC0050a abstractC0050a, Supplier supplier, boolean z) {
        return new L3(abstractC0050a, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) m(AbstractC0171y1.N(EnumC0145t0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) m(AbstractC0171y1.N(EnumC0145t0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        supplier.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return m(new D1(EnumC0099j3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) m(new F1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C0125p(this, EnumC0094i3.m | EnumC0094i3.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = k4.a;
        predicate.getClass();
        return new W3(this, k4.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final C f(C0095j c0095j) {
        return new C0144t(this, EnumC0094i3.p | EnumC0094i3.n | EnumC0094i3.t, c0095j, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0139s(this, EnumC0094i3.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) m(I.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) m(I.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new C0068d2(this, EnumC0094i3.p | EnumC0094i3.n | EnumC0094i3.t, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        m(new P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        consumer.getClass();
        m(new P(consumer, true));
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator iterator2() {
        return Spliterators.iterator(spliterator2());
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return A2.h(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new C0068d2(this, EnumC0094i3.p | EnumC0094i3.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final C mapToDouble(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C0144t(this, EnumC0094i3.p | EnumC0094i3.n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new W(this, EnumC0094i3.p | EnumC0094i3.n, toIntFunction, 4);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C0091i0(this, EnumC0094i3.p | EnumC0094i3.n, toLongFunction, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return reduce(new j$.util.function.b(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return reduce(new j$.util.function.b(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) m(AbstractC0171y1.N(EnumC0145t0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0050a
    public final G0 p(AbstractC0050a abstractC0050a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0171y1.y(abstractC0050a, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        consumer.getClass();
        return new C0139s(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return (Optional) m(new B1(EnumC0099j3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final LongStream s(C0095j c0095j) {
        return new C0091i0(this, EnumC0094i3.p | EnumC0094i3.n | EnumC0094i3.t, c0095j, 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : A2.h(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = k4.a;
        predicate.getClass();
        return new U3(this, k4.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0171y1.F(n(intFunction), intFunction).j(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !EnumC0094i3.ORDERED.x(this.f) ? this : new C0063c2(this, EnumC0094i3.r, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C0076f0(10));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        biFunction.getClass();
        binaryOperator.getClass();
        return m(new D1(EnumC0099j3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objM;
        if (this.a.k && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!EnumC0094i3.ORDERED.x(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objM = collector.supplier().get();
            forEach(new j$.nio.file.B(10, collector.accumulator(), objM));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            objM = m(new K1(EnumC0099j3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objM : collector2.finisher().apply(objM);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return m(new D1(EnumC0099j3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }
}
