package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
public interface G0 {
    G0 a(int i);

    long count();

    G0 e(long j, long j2, IntFunction intFunction);

    void f(Object[] objArr, int i);

    void forEach(Consumer consumer);

    Object[] j(IntFunction intFunction);

    int r();

    Spliterator spliterator();
}
