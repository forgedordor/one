package j$.util.stream;

import j$.util.C0183x;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes9.dex */
public final /* synthetic */ class A implements C {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ A(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ C g(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof B ? ((B) doubleStream).a : new A(doubleStream);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean A() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C a() {
        return g(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.B average() {
        return j$.desugar.sun.nio.fs.g.B(this.a.average());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C b() {
        return g(this.a.filter(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream boxed() {
        return C0074e3.g(this.a.boxed());
    }

    @Override // j$.util.stream.C
    public final C c(j$.desugar.sun.nio.fs.h hVar) {
        DoubleStream doubleStream = this.a;
        j$.desugar.sun.nio.fs.h hVar2 = new j$.desugar.sun.nio.fs.h(15);
        hVar2.b = hVar;
        return g(doubleStream.flatMap(hVar2));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C d() {
        return g(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C distinct() {
        return g(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.B findAny() {
        return j$.desugar.sun.nio.fs.g.B(this.a.findAny());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.B findFirst() {
        return j$.desugar.sun.nio.fs.g.B(this.a.findFirst());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.C, j$.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ PrimitiveIterator.OfDouble iterator2() {
        PrimitiveIterator.OfDouble it = this.a.iterator();
        if (it == null) {
            return null;
        }
        return it instanceof j$.util.E ? ((j$.util.E) it).a : new j$.util.D(it);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C limit(long j) {
        return g(this.a.limit(j));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C map(DoubleUnaryOperator doubleUnaryOperator) {
        return g(this.a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C0074e3.g(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.B max() {
        return j$.desugar.sun.nio.fs.g.B(this.a.max());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.B min() {
        return j$.desugar.sun.nio.fs.g.B(this.a.min());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean o() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0075f.g(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return C0075f.g(this.a.parallel());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C peek(DoubleConsumer doubleConsumer) {
        return g(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return C0075f.g(this.a.sequential());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C skip(long j) {
        return g(this.a.skip(j));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C sorted() {
        return g(this.a.sorted());
    }

    @Override // j$.util.stream.C, j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator.OfDouble spliterator2() {
        return j$.util.N.a(this.a.spliterator());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.C
    public final C0183x summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return C0075f.g(this.a.unordered());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean v() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ LongStream w() {
        return C0121o0.g(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ IntStream y() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator */
    public final /* synthetic */ Iterator iterator2() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.C, j$.util.stream.BaseStream
    public final /* synthetic */ C parallel() {
        return g(this.a.parallel());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.desugar.sun.nio.fs.g.B(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.C, j$.util.stream.BaseStream
    public final /* synthetic */ C sequential() {
        return g(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator spliterator2() {
        return j$.util.Y.a(this.a.spliterator());
    }
}
