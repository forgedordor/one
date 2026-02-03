package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erfl implements Iterator {
    private final Iterator a;
    private final Iterator b;

    public erfl(Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.a;
        return it.hasNext() ? it.next() : this.b.next();
    }
}
