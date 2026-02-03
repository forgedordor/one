package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekoh extends ekhx {
    private final transient ekgp a;
    private final transient ekgb b;

    public ekoh(ekgp ekgpVar, ekgb ekgbVar) {
        this.a = ekgpVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        return this.b.c(objArr, i);
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public final ekgb g() {
        return this.b;
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return this.b.iterator();
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
