package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eolz<K, V> extends ekei<Map.Entry<K, V>> {
    final Collection a;

    public eolz(Collection collection) {
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
        return ekjc.j(this.a.iterator(), new ejvr() { // from class: eolx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new eoly(entry);
            }
        });
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
