package defpackage;

import j$.util.Set;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvz<K, V> extends fcuo<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>>, hut {
    private final hvp a;

    public hvz(hvp hvpVar) {
        this.a = hvpVar;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.b();
    }

    @Override // defpackage.fcub, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        hvp hvpVar = this.a;
        Object obj2 = hvpVar.get(entry.getKey());
        return obj2 != null ? fdbq.f(obj2, entry.getValue()) : entry.getValue() == null && hvpVar.containsKey(entry.getKey());
    }

    @Override // defpackage.fcuo, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new hwa(this.a.b);
    }
}
