package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdft implements Iterator, fdcn {
    final /* synthetic */ fdfu a;
    private final Iterator b;

    public fdft(fdfu fdfuVar) {
        this.a = fdfuVar;
        this.b = fdfuVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.invoke(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
