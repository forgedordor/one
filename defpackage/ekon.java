package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekon extends ekhx {
    public static final ekon a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new ekon(objArr, 0, objArr, 0, 0);
    }

    public ekon(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.ekhx
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ekfn
    public final int c(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.e;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ekfn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int iB = ekfh.b(obj);
                while (true) {
                    int i = iB & this.g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ekfn
    public final int e() {
        return this.e;
    }

    @Override // defpackage.ekfn
    public final int f() {
        return 0;
    }

    @Override // defpackage.ekhx
    public final ekgb h() {
        return ekgb.i(this.b, this.e);
    }

    @Override // defpackage.ekhx, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.ekhx, defpackage.ekfn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final ekqg listIterator() {
        return g().iterator();
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ekfn
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.ekhx, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
