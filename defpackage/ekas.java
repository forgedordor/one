package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekas extends eklz {
    final /* synthetic */ ekau a;

    public ekas(ekau ekauVar) {
        this.a = ekauVar;
    }

    @Override // defpackage.eklz
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.eklz, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ekcz.b(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new ekat(this.a);
    }

    @Override // defpackage.eklz, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        ekau ekauVar = this.a;
        Object key = entry.getKey();
        ekbi ekbiVar = ekauVar.b;
        Map map = ekbiVar.a;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        ekbiVar.b -= size;
        return true;
    }
}
