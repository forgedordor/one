package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekph extends ekhx {
    final transient Object a;

    public ekph(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public final ekgb g() {
        return ekgb.r(this.a);
    }

    @Override // defpackage.ekhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return new ekjb(this.a);
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
