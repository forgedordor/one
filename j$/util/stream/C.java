package j$.util.stream;

import j$.util.C0183x;
import j$.util.PrimitiveIterator;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public interface C extends BaseStream {
    boolean A();

    C a();

    j$.util.B average();

    C b();

    Stream boxed();

    C c(j$.desugar.sun.nio.fs.h hVar);

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    C d();

    C distinct();

    j$.util.B findAny();

    j$.util.B findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator */
    PrimitiveIterator.OfDouble iterator2();

    C limit(long j);

    C map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.B max();

    j$.util.B min();

    boolean o();

    @Override // j$.util.stream.BaseStream
    C parallel();

    C peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.BaseStream
    C sequential();

    C skip(long j);

    C sorted();

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    Spliterator.OfDouble spliterator2();

    double sum();

    C0183x summaryStatistics();

    double[] toArray();

    boolean v();

    LongStream w();

    IntStream y();
}
