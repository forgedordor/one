package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evur<E> extends evqc<E> implements RandomAccess {
    public static final Object[] a;
    public static final evur b;
    private Object[] c;
    private int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new evur(objArr, 0, false);
    }

    evur() {
        this(a, 0, true);
    }

    private static int f(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        hu();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[f(length)];
            System.arraycopy(this.c, 0, objArr2, 0, i);
            System.arraycopy(this.c, i, objArr2, i3, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = e;
        this.d++;
        this.modCount++;
    }

    final void d(int i) {
        int length = this.c.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.c = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = f(length);
        }
        this.c = Arrays.copyOf(this.c, length);
    }

    @Override // defpackage.evtg
    public final /* bridge */ /* synthetic */ evtg e(int i) {
        if (i >= this.d) {
            return new evur(i == 0 ? a : Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        h(i);
        return (E) this.c[i];
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        hu();
        h(i);
        Object[] objArr = this.c;
        E e = (E) objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        hu();
        h(i);
        Object[] objArr = this.c;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public evur(Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.evqc, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        hu();
        int i = this.d;
        int length = this.c.length;
        if (i == length) {
            this.c = Arrays.copyOf(this.c, f(length));
        }
        Object[] objArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr[i2] = e;
        this.modCount++;
        return true;
    }
}
