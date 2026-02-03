package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lec implements Iterator, fdcn {
    private final fdap a;
    private final List b = new ArrayList();
    private Iterator c;

    public lec(Iterator it, fdap fdapVar) {
        this.a = fdapVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        ?? Invoke = this.a.invoke(next);
        if (Invoke != 0 && Invoke.hasNext()) {
            this.b.add(this.c);
            this.c = Invoke;
            return next;
        }
        while (!this.c.hasNext()) {
            List list = this.b;
            if (list.isEmpty()) {
                break;
            }
            this.c = (Iterator) fcva.S(list);
            fcva.u(list);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
