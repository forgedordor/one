package j$.util.stream;

import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* loaded from: classes9.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;
    public static final Set c;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        c = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> collector, Function<R, RR> function) {
        Set setCharacteristics = collector.characteristics();
        Collector.Characteristics characteristics = Collector.Characteristics.IDENTITY_FINISH;
        if (setCharacteristics.contains(characteristics)) {
            if (setCharacteristics.size() == 1) {
                setCharacteristics = c;
            } else {
                EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setCharacteristics);
                enumSetCopyOf.remove(characteristics);
                setCharacteristics = Collections.unmodifiableSet(enumSetCopyOf);
            }
        }
        return new C0110m(collector.supplier(), collector.accumulator(), collector.combiner(), collector.finisher().mo536andThen(function), setCharacteristics);
    }

    public static <T> Collector<T, ?, Long> counting() {
        return new C0110m(new C0105l(11), new j$.desugar.sun.nio.fs.h(13, new C0105l(9)), new C0105l(12), new C0105l(13), c);
    }

    public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> function) {
        return groupingBy(function, toList());
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new C0110m(new j$.desugar.sun.nio.fs.h(12, charSequence), new C0105l(5), new C0105l(6), new C0105l(7), c);
    }

    public static <T, U, A, R> Collector<T, ?, R> mapping(Function<? super T, ? extends U> function, Collector<? super U, A, R> collector) {
        return new C0110m(collector.supplier(), new j$.nio.file.B(5, collector.accumulator(), function), collector.combiner(), collector.finisher(), collector.characteristics());
    }

    public static <T> Collector<T, ?, Integer> summingInt(ToIntFunction<? super T> toIntFunction) {
        return new C0110m(new j$.desugar.sun.nio.fs.n(19), new j$.desugar.sun.nio.fs.h(10, toIntFunction), new j$.desugar.sun.nio.fs.n(20), new j$.desugar.sun.nio.fs.n(21), c);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new C0110m(supplier, new j$.desugar.sun.nio.fs.n(23), new j$.desugar.sun.nio.fs.n(24), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0110m(new j$.desugar.sun.nio.fs.n(25), new j$.desugar.sun.nio.fs.n(26), new C0105l(3), a);
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C0110m(new C0105l(10), new j$.util.function.e(function, function2, 2), new j$.desugar.sun.nio.fs.n(18), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new C0110m(new C0105l(0), new C0105l(1), new C0105l(8), b);
    }

    public static <T> Collector<T, ?, List<T>> toUnmodifiableList() {
        return new C0110m(new j$.desugar.sun.nio.fs.n(25), new j$.desugar.sun.nio.fs.n(26), new j$.desugar.sun.nio.fs.n(27), new j$.desugar.sun.nio.fs.n(28), c);
    }

    public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> function, Collector<? super T, A, D> collector) {
        return groupingBy(function, new C0105l(10), collector);
    }

    public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> function, Supplier<M> supplier, Collector<? super T, A, D> collector) {
        C0100k c0100k = new C0100k(function, collector.supplier(), collector.accumulator(), 1);
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h(14, collector.combiner());
        if (collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return new C0110m(supplier, c0100k, hVar, a);
        }
        return new C0110m(supplier, c0100k, hVar, new C0095j(collector.finisher(), 1), c);
    }

    public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new C0110m(supplier, new C0100k(function, function2, binaryOperator, 0), new j$.desugar.sun.nio.fs.h(14, binaryOperator), a);
    }
}
