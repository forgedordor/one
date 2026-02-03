package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    LongStream a();

    C asDoubleStream();

    j$.util.B average();

    LongStream b();

    Stream boxed();

    LongStream c(j$.desugar.sun.nio.fs.h hVar);

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d();

    LongStream distinct();

    OptionalLong findAny();

    OptionalLong findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.BaseStream
    /* renamed from: iterator */
    Iterator<Long> iterator2();

    C j();

    LongStream limit(long j);

    LongStream map(LongUnaryOperator longUnaryOperator);

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    OptionalLong max();

    OptionalLong min();

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    OptionalLong reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    Spliterator<Long> spliterator2();

    long sum();

    j$.util.A summaryStatistics();

    long[] toArray();

    boolean u();

    boolean x();

    IntStream z();
}
