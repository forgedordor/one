package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public interface PrimitiveIterator<T, T_CONS> extends Iterator<T> {

    public interface OfDouble extends PrimitiveIterator<Double, DoubleConsumer> {
        @Override // java.util.Iterator, j$.util.InterfaceC0185z
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(DoubleConsumer doubleConsumer);

        @Override // java.util.Iterator
        Double next();

        double nextDouble();
    }

    public interface OfInt extends PrimitiveIterator<Integer, IntConsumer> {
        @Override // java.util.Iterator, j$.util.InterfaceC0185z
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(IntConsumer intConsumer);

        @Override // java.util.Iterator
        Integer next();

        int nextInt();
    }

    public interface OfLong extends PrimitiveIterator<Long, LongConsumer> {
        @Override // java.util.Iterator, j$.util.InterfaceC0185z
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(LongConsumer longConsumer);

        @Override // java.util.Iterator
        Long next();

        long nextLong();
    }

    void forEachRemaining(Object obj);
}
