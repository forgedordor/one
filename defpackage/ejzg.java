package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzg extends ejyt {
    final /* synthetic */ ekak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejzg(ekak ekakVar) {
        super(ekakVar);
        this.b = ekakVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        ekak ekakVar;
        Object obj2;
        if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (ekakVar = this.b).get(key)) != null) {
            if (ekakVar.i.c(entry.getValue(), obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new ejzf(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.b.remove(key, entry.getValue());
    }
}
