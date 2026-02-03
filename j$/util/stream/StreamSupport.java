package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes9.dex */
public final class StreamSupport {
    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        spliterator.getClass();
        return new C0083g2(spliterator, EnumC0094i3.o(spliterator), z);
    }
}
