package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekir extends ekeh {
    final /* synthetic */ Iterable a;

    public ekir(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        ejwl.b(true, "limit is negative");
        return new ekiw(it);
    }
}
