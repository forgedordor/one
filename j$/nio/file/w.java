package j$.nio.file;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class w implements Iterator {
    public final Iterator a;

    public w(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return C.b(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
