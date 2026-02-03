package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekoi extends ekgb {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public ekoi(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ejwl.v(i, this.c);
        Object obj = this.a[i + i + this.b];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
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
