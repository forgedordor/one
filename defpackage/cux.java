package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cux implements Iterator, fdcn {
    public int a = -1;
    final /* synthetic */ cuy b;
    private final Iterator c;

    public cux(cuy cuyVar) {
        this.b = cuyVar;
        this.c = fdey.a(new cuw(cuyVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        if (i != -1) {
            this.b.a.c(i);
            this.a = -1;
        }
    }
}
