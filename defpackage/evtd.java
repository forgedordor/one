package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evtd implements Iterator {
    final /* synthetic */ evtf a;
    private final Iterator b;

    public evtd(evtf evtfVar, Iterator it) {
        this.a = evtfVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new evtc(this.a, (Map.Entry) this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
