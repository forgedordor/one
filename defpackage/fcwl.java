package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcwl<T> extends fcuh<T> implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public fcwl(Object[] objArr, int i) {
        objArr.getClass();
        this.a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "ring buffer filled size should not be negative but it is "));
        }
        int length = objArr.length;
        if (i > length) {
            throw new IllegalArgumentException(a.s(length, i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
        }
        this.b = length;
        this.d = i;
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.d;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, "n shouldn't be negative but it is "));
        }
        int i2 = this.d;
        if (i > i2) {
            throw new IllegalArgumentException(a.s(i2, i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
        }
        if (i > 0) {
            int i3 = this.c;
            int i4 = this.b;
            int i5 = (i3 + i) % i4;
            if (i3 > i5) {
                Object[] objArr = this.a;
                fcur.d(objArr, null, i3, i4);
                fcur.d(objArr, null, 0, i5);
            } else {
                fcur.d(this.a, null, i3, i5);
            }
            this.c = i5;
            this.d -= i;
        }
    }

    public final boolean c() {
        return this.d == this.b;
    }

    @Override // defpackage.fcuh, java.util.List
    public final T get(int i) {
        fcud.b(i, this.d);
        return (T) this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.fcuh, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new fcwk(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcub, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[this.d]);
    }

    @Override // defpackage.fcub, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.d;
        if (length < i) {
            tArr = (T[]) Arrays.copyOf(tArr, i);
            tArr.getClass();
        }
        int i2 = this.d;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.c; i4 < i2 && i5 < this.b; i5++) {
            tArr[i4] = this.a[i5];
            i4++;
        }
        while (i4 < i2) {
            tArr[i4] = this.a[i3];
            i4++;
            i3++;
        }
        fcva.d(i2, tArr);
        return tArr;
    }
}
