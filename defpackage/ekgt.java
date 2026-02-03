package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgt extends ekim {
    private final ekgp a;

    public ekgt(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    @Override // defpackage.ekim
    public final Object a(int i) {
        return ((Map.Entry) this.a.entrySet().g().get(i)).getKey();
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ekim, defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* bridge */ /* synthetic */ Iterator listIterator() {
        return listIterator();
    }

    @Override // defpackage.ekim, defpackage.ekhx, defpackage.ekfn
    /* renamed from: k */
    public final ekqg listIterator() {
        return this.a.hr();
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ekim, defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return new ekgs(this.a);
    }
}
