package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcue implements Iterator, fdcn {
    public int a;
    final /* synthetic */ fcuh b;

    public fcue(fcuh fcuhVar) {
        this.b = fcuhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        fcuh fcuhVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return fcuhVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
