package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekpx extends ekpz implements Map {
    private static final long serialVersionUID = 0;
    transient Set c;
    transient Collection d;
    transient Set e;

    public ekpx(Map map, Object obj) {
        super(map, obj);
    }

    final Map a() {
        return (Map) this.f;
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.g) {
            zContainsKey = a().containsKey(obj);
        }
        return zContainsKey;
    }

    public boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.g) {
            zContainsValue = a().containsValue(obj);
        }
        return zContainsValue;
    }

    public Set entrySet() {
        Set set;
        Object obj = this.g;
        synchronized (obj) {
            if (this.e == null) {
                this.e = new ekqb(a().entrySet(), obj);
            }
            set = this.e;
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    public Object get(Object obj) {
        Object obj2;
        synchronized (this.g) {
            obj2 = a().get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.g) {
            zIsEmpty = a().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set set;
        Object obj = this.g;
        synchronized (obj) {
            if (this.c == null) {
                this.c = new ekqb(a().keySet(), obj);
            }
            set = this.c;
        }
        return set;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.g) {
            objPut = a().put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.g) {
            a().putAll(map);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.g) {
            objRemove = a().remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    public Collection values() {
        Collection collection;
        Object obj = this.g;
        synchronized (obj) {
            if (this.d == null) {
                this.d = new ekpv(a().values(), obj);
            }
            collection = this.d;
        }
        return collection;
    }
}
