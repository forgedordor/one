package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Collection;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpo {
    public static Stream a(Iterable iterable) {
        return iterable instanceof Collection ? Collection.EL.stream((java.util.Collection) iterable) : StreamSupport.stream(Iterable$EL.spliterator(iterable), false);
    }

    public static Stream b(final Stream stream, final Stream stream2, BiFunction biFunction) {
        stream.getClass();
        stream2.getClass();
        boolean z = true;
        if (!stream.isParallel() && !stream2.isParallel()) {
            z = false;
        }
        Spliterator<T> spliterator = stream.spliterator2();
        Spliterator<T> spliterator2 = stream2.spliterator2();
        return StreamSupport.stream(new ekpn(Math.min(spliterator.estimateSize(), spliterator2.estimateSize()), spliterator.characteristics() & spliterator2.characteristics() & 80, Spliterators.iterator(spliterator), Spliterators.iterator(spliterator2), biFunction), z).onClose(new Runnable() { // from class: ekpm
            @Override // java.lang.Runnable
            public final void run() {
                stream.close();
            }
        }).onClose(new Runnable() { // from class: ekpm
            @Override // java.lang.Runnable
            public final void run() {
                stream2.close();
            }
        });
    }
}
