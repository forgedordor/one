package j$.util.stream;

import j$.util.stream.IntStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
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
import java.util.stream.DoubleStream;

/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0079f3 implements java.util.stream.Stream {
    public final /* synthetic */ Stream a;

    public /* synthetic */ C0079f3(Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ java.util.stream.Stream g(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C0074e3 ? ((C0074e3) stream).a : new C0079f3(stream);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream distinct() {
        return g(this.a.distinct());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream dropWhile(Predicate predicate) {
        return g(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.a;
        if (obj instanceof C0079f3) {
            obj = ((C0079f3) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream filter(Predicate predicate) {
        return g(this.a.filter(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return j$.desugar.sun.nio.fs.g.F(this.a.findAny());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return j$.desugar.sun.nio.fs.g.F(this.a.findFirst());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
        return g(this.a.flatMap(AbstractC0171y1.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream flatMapToDouble(Function function) {
        return B.g(this.a.f(AbstractC0171y1.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream flatMapToInt(Function function) {
        return IntStream.Wrapper.convert(this.a.B(AbstractC0171y1.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream flatMapToLong(Function function) {
        return C0126p0.g(this.a.s(AbstractC0171y1.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator2();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream map(Function function) {
        return g(this.a.map(function));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return B.g(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.Wrapper.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(ToLongFunction toLongFunction) {
        return C0126p0.g(this.a.mapToLong(toLongFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return j$.desugar.sun.nio.fs.g.F(this.a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return j$.desugar.sun.nio.fs.g.F(this.a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(Runnable runnable) {
        return C0080g.g(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return C0080g.g(this.a.parallel());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream peek(Consumer consumer) {
        return g(this.a.peek(consumer));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return C0080g.g(this.a.sequential());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted() {
        return g(this.a.sorted());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Z.a(this.a.spliterator2());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream takeWhile(Predicate predicate) {
        return g(this.a.takeWhile(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return C0080g.g(this.a.unordered());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object collect(java.util.stream.Collector collector) {
        return this.a.collect(collector == null ? null : collector instanceof C0090i ? ((C0090i) collector).a : new C0085h(collector));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
        return g(this.a.sorted(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.desugar.sun.nio.fs.g.F(this.a.reduce(binaryOperator));
    }
}
