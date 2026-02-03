package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eknt {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    public eknt() {
        o(3);
    }

    private static int q(long j) {
        return (int) (j >>> 32);
    }

    private final int r() {
        return this.e.length - 1;
    }

    private static long s(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    private final void t(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Alert.DURATION_SHOW_INDEFINITELY;
            return;
        }
        float f = i * this.g;
        int[] iArrU = u(i);
        long[] jArr = this.f;
        int length = iArrU.length;
        for (int i2 = 0; i2 < this.c; i2++) {
            int iQ = q(jArr[i2]);
            int i3 = (length - 1) & iQ;
            int i4 = iArrU[i3];
            iArrU[i3] = i2;
            jArr[i2] = (iQ << 32) | (i4 & 4294967295L);
        }
        this.h = ((int) f) + 1;
        this.e = iArrU;
    }

    private static int[] u(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public int a() {
        return this.c == 0 ? -1 : 0;
    }

    public final int b(Object obj) {
        int iD = d(obj);
        if (iD == -1) {
            return 0;
        }
        return this.b[iD];
    }

    final int c(int i) {
        ejwl.v(i, this.c);
        return this.b[i];
    }

    final int d(Object obj) {
        int iB = ekfh.b(obj);
        int i = this.e[r() & iB];
        while (i != -1) {
            long j = this.f[i];
            if (q(j) == iB && ejwh.a(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public int e(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    public final int f(Object obj, int i) {
        int iR = r() & i;
        int i2 = this.e[iR];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (q(this.f[i2]) == i && ejwh.a(obj, this.a[i2])) {
                int i4 = this.b[i2];
                if (i3 == -1) {
                    this.e[iR] = (int) this.f[i2];
                } else {
                    long[] jArr = this.f;
                    jArr[i3] = s(jArr[i3], (int) jArr[i2]);
                }
                l(i2);
                this.c--;
                this.d++;
                return i4;
            }
            int i5 = (int) this.f[i2];
            if (i5 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i5;
        }
    }

    final int g(int i) {
        return f(this.a[i], q(this.f[i]));
    }

    final eknh h(int i) {
        ejwl.v(i, this.c);
        return new ekns(this, i);
    }

    final Object i(int i) {
        ejwl.v(i, this.c);
        return this.a[i];
    }

    final void j(int i) {
        if (i > this.f.length) {
            m(i);
        }
        if (i >= this.h) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            t(Math.max(2, iHighestOneBit + iHighestOneBit));
        }
    }

    public void k(int i, Object obj, int i2, int i3) {
        this.f[i] = (i3 << 32) | 4294967295L;
        this.a[i] = obj;
        this.b[i] = i2;
    }

    public void l(int i) {
        int i2 = this.c - 1;
        if (i >= i2) {
            this.a[i] = null;
            this.b[i] = 0;
            this.f[i] = -1;
            return;
        }
        Object[] objArr = this.a;
        objArr[i] = objArr[i2];
        int[] iArr = this.b;
        iArr[i] = iArr[i2];
        objArr[i2] = null;
        iArr[i2] = 0;
        long[] jArr = this.f;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int iQ = q(j) & r();
        int[] iArr2 = this.e;
        int i3 = iArr2[iQ];
        if (i3 == i2) {
            iArr2[iQ] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = s(j2, i);
                return;
            }
            i3 = i4;
        }
    }

    public void m(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f = jArrCopyOf;
    }

    final void n(int i, int i2) {
        ejwl.v(i, this.c);
        this.b[i] = i2;
    }

    public void o(int i) {
        ejwl.b(i >= 0, "Initial capacity must be non-negative");
        ejwl.b(true, "Illegal load factor");
        int iC = ekfh.c(i);
        this.e = u(iC);
        this.g = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, iC);
    }

    public final void p(Object obj, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.g(i, "count must be positive but was: "));
        }
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int iB = ekfh.b(obj);
        int iR = r() & iB;
        int i2 = this.c;
        int[] iArr2 = this.e;
        int i3 = iArr2[iR];
        if (i3 == -1) {
            iArr2[iR] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (q(j) == iB && ejwh.a(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                } else {
                    int i5 = (int) j;
                    if (i5 == -1) {
                        jArr[i3] = s(j, i2);
                        break;
                    }
                    i3 = i5;
                }
            }
        }
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i2 + 1;
        int length = this.f.length;
        if (i7 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax >= 0) {
                i6 = iMax;
            }
            if (i6 != length) {
                m(i6);
            }
        }
        k(i2, obj, i, iB);
        this.c = i7;
        if (i2 >= this.h) {
            int length2 = this.e.length;
            t(length2 + length2);
        }
        this.d++;
    }

    public eknt(int i) {
        this(i, null);
    }

    public eknt(int i, byte[] bArr) {
        o(i);
    }

    public eknt(eknt ekntVar) {
        o(ekntVar.c);
        int iA = ekntVar.a();
        while (iA != -1) {
            p(ekntVar.i(iA), ekntVar.c(iA));
            iA = ekntVar.e(iA);
        }
    }
}
