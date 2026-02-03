package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdfn implements Iterator, fdcn {
    final /* synthetic */ fdfo a;
    private final Iterator b;
    private int c;

    public fdfn(fdfo fdfoVar) {
        this.a = fdfoVar;
        this.b = fdfoVar.a.a();
    }

    private final void a() {
        while (this.c < this.a.b) {
            Iterator it = this.b;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.c++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.c < this.a.c && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        int i = this.c;
        if (i >= this.a.c) {
            throw new NoSuchElementException();
        }
        this.c = i + 1;
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
