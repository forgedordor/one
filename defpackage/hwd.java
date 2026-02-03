package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwd<K, V> extends fcub<V> implements Collection<V>, j$.util.Collection<V>, fdcn {
    private final hvp a;

    public hwd(hvp hvpVar) {
        this.a = hvpVar;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.b();
    }

    @Override // defpackage.fcub, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new hwe(this.a.b);
    }
}
