package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgu extends ekqg {
    final ekqg a;
    final /* synthetic */ ekgx b;

    public ekgu(ekgx ekgxVar) {
        this.b = ekgxVar;
        this.a = ekgxVar.a.entrySet().listIterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
