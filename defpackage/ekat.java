package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekat implements Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ ekau c;

    public ekat(ekau ekauVar) {
        this.c = ekauVar;
        this.a = ekauVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        return this.c.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        ejwl.m(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
