package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgy extends ekqg {
    final Iterator a;
    Object b = null;
    Iterator c = ekix.a;
    final /* synthetic */ ekhe d;

    public ekgy(ekhe ekheVar) {
        this.d = ekheVar;
        this.a = ekheVar.map.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((ekfn) entry.getValue()).listIterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new ekfo(obj, this.c.next());
    }
}
