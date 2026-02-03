package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekog extends ekhx {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient ekgp d;

    public ekog(ekgp ekgpVar, Object[] objArr, int i, int i2) {
        this.d = ekgpVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ekhx
    public final ekgb h() {
        return new ekof(this);
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return g().iterator();
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
