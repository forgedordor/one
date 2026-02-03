package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eolu<K, V> extends eket<Map.Entry<K, Collection<V>>> {
    private final Set a;

    public eolu(Set set) {
        this.a = set;
    }

    @Override // defpackage.eket, defpackage.ekei
    /* renamed from: b */
    protected final /* synthetic */ Collection hp() {
        return this.a;
    }

    @Override // defpackage.eket
    /* renamed from: c */
    protected final Set b() {
        return this.a;
    }

    @Override // defpackage.ekei, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekei, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return ekjc.j(this.a.iterator(), new ejvr() { // from class: eols
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new eolt(entry);
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
