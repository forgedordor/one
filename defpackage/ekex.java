package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekex extends AbstractMap implements Serializable, ekcb {
    private final ekfd a;
    private transient Set b;

    public ekex(ekfd ekfdVar) {
        this.a = ekfdVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        ekey ekeyVar = new ekey(this.a);
        this.b = ekeyVar;
        return ekeyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        ekfd ekfdVar = this.a;
        int iD = ekfdVar.d(obj);
        if (iD == -1) {
            return null;
        }
        return ekfdVar.a[iD];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.ekcb
    public final Object put(Object obj, Object obj2) {
        return this.a.j(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iB = ekfh.b(obj);
        ekfd ekfdVar = this.a;
        int iE = ekfdVar.e(obj, iB);
        if (iE == -1) {
            return null;
        }
        Object obj2 = ekfdVar.a[iE];
        ekfdVar.h(iE, iB);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
