package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iau extends iat implements Iterator, fdcn {
    public iau(iaf iafVar, Iterator it) {
        super(iafVar, it);
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = this.d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getKey();
    }
}
