package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekbd implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ ekbe c;

    public ekbd(ekbe ekbeVar, Iterator it) {
        this.c = ekbeVar;
        this.b = ekbeVar.b;
        this.a = it;
    }

    final void a() {
        ekbe ekbeVar = this.c;
        ekbeVar.b();
        if (ekbeVar.b != this.b) {
            throw new ConcurrentModificationException();
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
        this.a.remove();
        ekbe ekbeVar = this.c;
        ekbi ekbiVar = ekbeVar.e;
        ekbiVar.b--;
        ekbeVar.c();
    }

    public ekbd(ekbe ekbeVar) {
        this.c = ekbeVar;
        this.b = ekbeVar.b;
        Collection collection = ekbeVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
