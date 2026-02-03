package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekhd extends ekfn {
    private static final long serialVersionUID = 0;
    private final transient ekhe a;

    public ekhd(ekhe ekheVar) {
        this.a = ekheVar;
    }

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        ekqg ekqgVarListIterator = this.a.map.values().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            i = ((ekfn) ekqgVarListIterator.next()).c(objArr, i);
        }
        return i;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.z(obj);
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return new ekgz(this.a);
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
