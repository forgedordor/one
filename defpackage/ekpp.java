package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpp extends ekpx {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;

    public ekpp(Map map, Object obj) {
        super(map, obj);
    }

    @Override // defpackage.ekpx, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.ekpx, java.util.Map
    public final Set entrySet() {
        Set set;
        Object obj = this.g;
        synchronized (obj) {
            if (this.a == null) {
                this.a = new ekps(a().entrySet(), obj);
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.ekpx, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collectionA;
        Object obj2 = this.g;
        synchronized (obj2) {
            Collection collection = (Collection) super.get(obj);
            collectionA = collection == null ? null : ekqd.a(collection, obj2);
        }
        return collectionA;
    }

    @Override // defpackage.ekpx, java.util.Map
    public final Collection values() {
        Collection collection;
        Object obj = this.g;
        synchronized (obj) {
            if (this.b == null) {
                this.b = new ekpu(a().values(), obj);
            }
            collection = this.b;
        }
        return collection;
    }
}
