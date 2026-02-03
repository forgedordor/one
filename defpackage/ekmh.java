package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ekmh extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.a = setB;
        return setB;
    }

    public Set g() {
        return new ekmd(this);
    }

    public Collection hq() {
        return new ekmg(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.b = setG;
        return setG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection collectionHq = hq();
        this.c = collectionHq;
        return collectionHq;
    }
}
