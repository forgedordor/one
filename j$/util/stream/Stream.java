package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.Spliterators;
import java.util.Comparator;
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
import java.util.function.UnaryOperator;

/* loaded from: classes9.dex */
public interface Stream<T> extends BaseStream<T, Stream<T>> {

    /* renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static <T> Builder<T> builder() {
            return new Q3();
        }

        public static <T> Stream<T> concat(Stream<? extends T> stream, Stream<? extends T> stream2) {
            stream.getClass();
            stream2.getClass();
            return StreamSupport.stream(new O3(stream.spliterator2(), stream2.spliterator2()), stream.isParallel() || stream2.isParallel()).onClose(new M3(1, stream, stream2));
        }

        public static <T> Stream<T> empty() {
            return StreamSupport.stream(Spliterators.a, false);
        }

        public static <T> Stream<T> iterate(T t, Predicate<? super T> predicate, UnaryOperator<T> unaryOperator) {
            unaryOperator.getClass();
            predicate.getClass();
            return StreamSupport.stream(new C0059b3(t, predicate, unaryOperator), false);
        }

        public static <T> Stream<T> of(T t) {
            return StreamSupport.stream(new Q3(t), false);
        }

        public static <T> Stream<T> ofNullable(T t) {
            return t == null ? empty() : StreamSupport.stream(new Q3(t), false);
        }

        public static <T> Stream<T> of(T... tArr) {
            return DesugarArrays.stream(tArr);
        }
    }

    public interface Builder<T> extends Consumer<T> {
        Builder<T> add(T t);

        Stream<T> build();
    }

    IntStream B(C0095j c0095j);

    boolean allMatch(Predicate<? super T> predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    long count();

    Stream<T> distinct();

    Stream dropWhile(Predicate predicate);

    C f(C0095j c0095j);

    Stream<T> filter(Predicate<? super T> predicate);

    Optional<T> findAny();

    Optional<T> findFirst();

    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(Consumer<? super T> consumer);

    void forEachOrdered(Consumer<? super T> consumer);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    C mapToDouble(ToDoubleFunction toDoubleFunction);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    LongStream mapToLong(ToLongFunction toLongFunction);

    Optional<T> max(Comparator<? super T> comparator);

    Optional<T> min(Comparator<? super T> comparator);

    boolean noneMatch(Predicate<? super T> predicate);

    Stream<T> peek(Consumer<? super T> consumer);

    Optional reduce(BinaryOperator binaryOperator);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    T reduce(T t, BinaryOperator<T> binaryOperator);

    LongStream s(C0095j c0095j);

    Stream<T> skip(long j);

    Stream<T> sorted();

    Stream<T> sorted(Comparator<? super T> comparator);

    Stream takeWhile(Predicate predicate);

    Object[] toArray();

    <A> A[] toArray(IntFunction<A[]> intFunction);

    List toList();
}
