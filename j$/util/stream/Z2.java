package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes9.dex */
public abstract class Z2 extends AbstractC0060c implements Iterable, j$.lang.a {
    public Object e;
    public Object[] f;

    public Z2(int i) {
        super(i);
        this.e = newArray(1 << this.a);
    }

    public abstract Object[] A();

    public final void B() {
        long jW;
        if (this.b == w(this.e)) {
            if (this.f == null) {
                Object[] objArrA = A();
                this.f = objArrA;
                this.d = new long[8];
                objArrA[0] = this.e;
            }
            int i = this.c;
            int i2 = i + 1;
            Object[] objArr = this.f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    jW = w(this.e);
                } else {
                    jW = w(objArr[i]) + this.d[i];
                }
                y(jW + 1);
            }
            this.b = 0;
            int i3 = this.c + 1;
            this.c = i3;
            this.e = this.f[i3];
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        c(0, objNewArray);
        return objNewArray;
    }

    public void c(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > w(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, obj, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object obj2 = this.f[i2];
            System.arraycopy(obj2, 0, obj, i, w(obj2));
            i += w(this.f[i2]);
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, obj, i, i3);
        }
    }

    @Override // j$.util.stream.AbstractC0060c
    public final void clear() {
        Object[] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            this.f = null;
            this.d = null;
        }
        this.b = 0;
        this.c = 0;
    }

    public void d(Object obj) {
        for (int i = 0; i < this.c; i++) {
            Object obj2 = this.f[i];
            v(obj2, 0, w(obj2), obj);
        }
        v(this.e, 0, this.b, obj);
    }

    public abstract Object newArray(int i);

    public abstract void v(Object obj, int i, int i2, Object obj2);

    public abstract int w(Object obj);

    public final int x(long j) {
        if (this.c == 0) {
            if (j < this.b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.c; i++) {
            if (j < this.d[i] + w(this.f[i])) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    public final void y(long j) {
        long jW;
        int i = this.c;
        if (i == 0) {
            jW = w(this.e);
        } else {
            jW = w(this.f[i]) + this.d[i];
        }
        if (j > jW) {
            if (this.f == null) {
                Object[] objArrA = A();
                this.f = objArrA;
                this.d = new long[8];
                objArrA[0] = this.e;
            }
            int i2 = this.c + 1;
            while (j > jW) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f = Arrays.copyOf(objArr, length);
                    this.d = Arrays.copyOf(this.d, length);
                }
                int iMin = this.a;
                if (i2 != 0 && i2 != 1) {
                    iMin = Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                this.f[i2] = newArray(i3);
                long[] jArr = this.d;
                jArr[i2] = jArr[i2 - 1] + w(this.f[r6]);
                jW += i3;
                i2++;
            }
        }
    }

    public Z2() {
        this.e = newArray(16);
    }
}
