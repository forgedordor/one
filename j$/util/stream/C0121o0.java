package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0121o0 implements LongStream {
    public final /* synthetic */ java.util.stream.LongStream a;

    public /* synthetic */ C0121o0(java.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ LongStream g(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C0126p0 ? ((C0126p0) longStream).a : new C0121o0(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream a() {
        return g(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ C asDoubleStream() {
        return A.g(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.B average() {
        return j$.desugar.sun.nio.fs.g.B(this.a.average());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream b() {
        return g(this.a.filter(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return C0074e3.g(this.a.boxed());
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c(j$.desugar.sun.nio.fs.h hVar) {
        java.util.stream.LongStream longStream = this.a;
        j$.desugar.sun.nio.fs.h hVar2 = new j$.desugar.sun.nio.fs.h(16);
        hVar2.b = hVar;
        return g(longStream.flatMap(hVar2));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream d() {
        return g(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return g(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.LongStream longStream = this.a;
        if (obj instanceof C0121o0) {
            obj = ((C0121o0) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong findAny() {
        return j$.desugar.sun.nio.fs.g.D(this.a.findAny());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong findFirst() {
        return j$.desugar.sun.nio.fs.g.D(this.a.findFirst());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator<Long> iterator2() {
        PrimitiveIterator.OfLong it = this.a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof j$.util.L ? ((j$.util.L) it).a : new j$.util.K(it);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ C j() {
        return A.g(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return g(this.a.map(longUnaryOperator));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C0074e3.g(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong max() {
        return j$.desugar.sun.nio.fs.g.D(this.a.max());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong min() {
        return j$.desugar.sun.nio.fs.g.D(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0075f.g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C0075f.g(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return g(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean q() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C0075f.g(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return g(this.a.sorted());
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return j$.util.T.a(this.a.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.A summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean u() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0075f.g(this.a.unordered());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean x() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream z() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Iterator<Long> iterator2() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return j$.desugar.sun.nio.fs.g.D(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return g(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return j$.util.Y.a(this.a.spliterator());
    }
}
