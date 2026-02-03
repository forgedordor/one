package j$.util.concurrent.atomic;

import j$.desugar.sun.nio.fs.g;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes9.dex */
public class DesugarAtomicReference {
    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        do {
            v = atomicReference.get();
        } while (!g.P(atomicReference, v, unaryOperator.apply(v)));
        return v;
    }

    public static <V> V updateAndGet(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        V v2;
        do {
            v = atomicReference.get();
            v2 = (V) unaryOperator.apply(v);
        } while (!g.P(atomicReference, v, v2));
        return v2;
    }
}
