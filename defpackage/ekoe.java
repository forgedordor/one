package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekoe<E> extends ekgb<E> {
    public static final ekgb a = new ekoe(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public ekoe(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.c;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ekfn
    public final int e() {
        return this.c;
    }

    @Override // defpackage.ekfn
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i) {
        ejwl.v(i, this.c);
        E e = (E) this.b[i];
        e.getClass();
        return e;
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ekfn
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
