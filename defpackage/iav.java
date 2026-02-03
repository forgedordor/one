package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iav extends iat implements Iterator, fdcn {
    public iav(iaf iafVar, Iterator it) {
        super(iafVar, it);
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = this.d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getValue();
    }
}
