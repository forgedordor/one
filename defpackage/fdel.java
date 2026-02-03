package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdel implements Iterator, fdcn {
    private final Iterator a;
    private int b;

    public fdel(fdem fdemVar) {
        this.a = fdemVar.a.a();
        this.b = fdemVar.b;
    }

    private final void a() {
        while (this.b > 0) {
            Iterator it = this.a;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.b--;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
