package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpu<V> extends ekpv<Collection<V>> {
    private static final long serialVersionUID = 0;

    public ekpu(Collection collection, Object obj) {
        super(collection, obj);
    }

    @Override // defpackage.ekpv, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Collection<V>> iterator() {
        return new ekpt(this, super.iterator());
    }
}
