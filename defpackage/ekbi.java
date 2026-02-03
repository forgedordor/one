package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekbi extends ekbr implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected ekbi(Map map) {
        ejwl.a(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    public Collection b() {
        throw null;
    }

    @Override // defpackage.ekmj
    public Collection c(Object obj) {
        Collection collectionA = (Collection) this.a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return f(obj, collectionA);
    }

    @Override // defpackage.ekmj
    public Collection d(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return b();
        }
        Collection collectionA = a();
        collectionA.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return e(collectionA);
    }

    public Collection e(Collection collection) {
        throw null;
    }

    public Collection f(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.ekmj
    public final int i() {
        return this.b;
    }

    @Override // defpackage.ekbr
    public final Collection j() {
        return this instanceof ekot ? new ekbp(this) : new ekbo(this);
    }

    @Override // defpackage.ekbr
    public final Collection k() {
        return new ekbq(this);
    }

    @Override // defpackage.ekbr
    public final Iterator l() {
        return new ekar(this);
    }

    @Override // defpackage.ekbr
    public final Iterator m() {
        return new ekaq(this);
    }

    final List n(Object obj, List list, ekbe ekbeVar) {
        return list instanceof RandomAccess ? new ekba(this, obj, list, ekbeVar) : new ekbg(this, obj, list, ekbeVar);
    }

    @Override // defpackage.ekbr
    public Map o() {
        return new ekau(this, this.a);
    }

    @Override // defpackage.ekbr
    public Set p() {
        return new ekax(this, this.a);
    }

    @Override // defpackage.ekmj
    public final void q() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void r(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            ejwl.a(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.ekmj
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean t(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.b++;
            return true;
        }
        Collection collectionA = a();
        if (!collectionA.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.b++;
        this.a.put(obj, collectionA);
        return true;
    }
}
