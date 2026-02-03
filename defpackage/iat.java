package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class iat {
    public final iaf a;
    public int b;
    public Map.Entry c;
    public Map.Entry d;
    private final Iterator e;

    public iat(iaf iafVar, Iterator it) {
        this.a = iafVar;
        this.e = it;
        this.b = iafVar.a();
        a();
    }

    protected final void a() {
        this.c = this.d;
        Iterator it = this.e;
        this.d = ((hvq) it).c ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.d != null;
    }

    public final void remove() {
        iaf iafVar = this.a;
        if (iafVar.a() != this.b) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.c;
        if (entry == null) {
            throw new IllegalStateException();
        }
        iafVar.remove(entry.getKey());
        this.c = null;
        this.b = iafVar.a();
    }
}
