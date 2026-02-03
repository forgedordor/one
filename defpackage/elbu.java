package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbu extends ekqg {
    final /* synthetic */ Iterator a;
    final /* synthetic */ elbv b;

    public elbu(elbv elbvVar, Iterator it) {
        this.a = it;
        this.b = elbvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b.a.b = entry;
        return entry.getKey();
    }
}
