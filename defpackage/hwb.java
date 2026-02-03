package defpackage;

import j$.util.Set;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwb<K, V> extends fcuo<K> implements Set<K>, hut {
    private final hvp a;

    public hwb(hvp hvpVar) {
        this.a = hvpVar;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.b();
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.fcuo, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new hwc(this.a.b);
    }
}
