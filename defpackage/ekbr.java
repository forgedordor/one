package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekbr<K, V> implements ekmj<K, V> {
    private transient Collection a;
    private transient Set b;
    private transient Collection c;
    private transient Map d;

    @Override // defpackage.ekmj
    public boolean A() {
        return i() == 0;
    }

    @Override // defpackage.ekmj
    public boolean B(Object obj, Object obj2) {
        Collection collection = (Collection) w().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // defpackage.ekmj
    public void C(ekmj ekmjVar) {
        for (Map.Entry entry : ekmjVar.u()) {
            t(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.ekmj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekmj) {
            return w().equals(((ekmj) obj).w());
        }
        return false;
    }

    @Override // defpackage.ekmj
    public final int hashCode() {
        return w().hashCode();
    }

    public abstract Collection j();

    public abstract Collection k();

    public abstract Iterator l();

    public Iterator m() {
        throw null;
    }

    public abstract Map o();

    public abstract Set p();

    @Override // defpackage.ekmj
    public boolean t(Object obj, Object obj2) {
        throw null;
    }

    public final String toString() {
        return w().toString();
    }

    @Override // defpackage.ekmj
    public Collection u() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection collectionJ = j();
        this.a = collectionJ;
        return collectionJ;
    }

    @Override // defpackage.ekmj
    public Collection v() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection collectionK = k();
        this.c = collectionK;
        return collectionK;
    }

    @Override // defpackage.ekmj
    public Map w() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapO = o();
        this.d = mapO;
        return mapO;
    }

    @Override // defpackage.ekmj
    public Set x() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setP = p();
        this.b = setP;
        return setP;
    }

    @Override // defpackage.ekmj
    public final boolean y(Object obj, Object obj2) {
        Collection collection = (Collection) w().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.ekmj
    public boolean z(Object obj) {
        Iterator<V> it = w().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
