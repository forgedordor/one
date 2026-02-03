package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekmf<K, V> extends ekei<Map.Entry<K, V>> {
    private final Collection a;

    public ekmf(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.ekei
    /* renamed from: b */
    protected final Collection hp() {
        return this.a;
    }

    @Override // defpackage.ekei, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekei, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new eklu(this.a.iterator());
    }

    @Override // defpackage.ekei, java.util.Collection
    public final Object[] toArray() {
        return e();
    }

    @Override // defpackage.ekei, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) eknr.d(this, tArr);
    }
}
