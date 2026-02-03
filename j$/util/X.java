package j$.util;

/* loaded from: classes9.dex */
public interface X extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    X trySplit();
}
