package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class v implements Iterable, j$.lang.a {
    public final Iterable a;

    public v(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, new t(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }
}
