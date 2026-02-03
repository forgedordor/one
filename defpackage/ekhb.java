package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekhb extends ekfn {
    private static final long serialVersionUID = 0;
    final ekhe a;

    public ekhb(ekhe ekheVar) {
        this.a = ekheVar;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.y(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return new ekgy(this.a);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
