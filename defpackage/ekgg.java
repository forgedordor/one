package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgg extends ekqg {
    final /* synthetic */ ekqg a;

    public ekgg(ekqg ekqgVar) {
        this.a = ekqgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getKey();
    }
}
