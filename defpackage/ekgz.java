package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgz extends ekqg {
    final Iterator a;
    Iterator b = ekix.a;
    final /* synthetic */ ekhe c;

    public ekgz(ekhe ekheVar) {
        this.c = ekheVar;
        this.a = ekheVar.map.values().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((ekfn) this.a.next()).listIterator();
        }
        return this.b.next();
    }
}
