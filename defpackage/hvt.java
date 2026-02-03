package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvt<K, V> extends hvm<Map.Entry<K, V>, K, V> {
    private final hvr a;

    public hvt(hvr hvrVar) {
        this.a = hvrVar;
    }

    @Override // defpackage.hvm
    public final boolean a(Map.Entry entry) {
        hvr hvrVar = this.a;
        Object obj = hvrVar.get(entry.getKey());
        return obj != null ? fdbq.f(obj, entry.getValue()) : entry.getValue() == null && hvrVar.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hvm
    public final boolean b(Map.Entry entry) {
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.fcun
    public final int c() {
        return this.a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new hvu(this.a);
    }
}
