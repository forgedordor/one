package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekim extends ekhx {
    public abstract Object a(int i);

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.ekhx
    public final ekgb h() {
        return new ekil(this);
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public ekqg listIterator() {
        return g().iterator();
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
