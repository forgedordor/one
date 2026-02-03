package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hzg {
    public hzn h;
    public long i;
    public boolean j;
    public int k;

    public hzg(long j, hzn hznVar) {
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        this.h = hznVar;
        this.i = j;
        fdap fdapVar = hzt.a;
        if (j != 0) {
            hzn hznVarX = x();
            long[] jArr = hznVarX.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = hznVarX.c;
                if (j3 != 0) {
                    j2 = hznVarX.d;
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = hznVarX.b;
                    if (j4 != 0) {
                        j2 = hznVarX.d + 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + iNumberOfTrailingZeros;
            }
            synchronized (hzt.c) {
                hzk hzkVar = hzt.f;
                int i2 = hzkVar.a + 1;
                long[] jArr2 = hzkVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length + length;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    fcur.m(jArr2, jArr3, 0, 0, jArr2.length);
                    fcur.q(hzkVar.c, iArr, 0, 0, 14);
                    hzkVar.b = jArr3;
                    hzkVar.c = iArr;
                }
                int i4 = hzkVar.a;
                hzkVar.a = i4 + 1;
                int length2 = hzkVar.d.length;
                if (hzkVar.e >= length2) {
                    int i5 = length2 + length2;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    fcur.q(hzkVar.d, iArr2, 0, 0, 14);
                    hzkVar.d = iArr2;
                }
                i = hzkVar.e;
                int[] iArr3 = hzkVar.d;
                hzkVar.e = iArr3[i];
                hzkVar.b[i4] = j;
                hzkVar.c[i4] = i;
                iArr3[i] = i4;
                hzkVar.b(i4);
            }
        } else {
            i = -1;
        }
        this.k = i;
    }

    public static final void E(hzg hzgVar) {
        hzt.b.b(hzgVar);
    }

    public void A(hzn hznVar) {
        this.h = hznVar;
    }

    public void B(long j) {
        this.i = j;
    }

    public final void C() {
        if (this.j) {
            hpq.a("Cannot use a disposed snapshot");
        }
    }

    public final void D() {
        this.j = true;
    }

    public abstract hzg b(fdap fdapVar);

    public void d() {
        this.j = true;
        synchronized (hzt.c) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract fdap k();

    public abstract fdap m();

    public void o() {
        hzt.d = hzt.d.b(v());
    }

    public abstract void p(iaw iawVar);

    public void r() {
        z();
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean u();

    public long v() {
        return this.i;
    }

    public final hzg w() {
        hxn hxnVar = hzt.b;
        hzg hzgVar = (hzg) hxnVar.a();
        hxnVar.b(this);
        return hzgVar;
    }

    public hzn x() {
        return this.h;
    }

    public final void y() {
        synchronized (hzt.c) {
            o();
            r();
        }
    }

    public final void z() {
        int i = this.k;
        if (i >= 0) {
            hzt.v(i);
            this.k = -1;
        }
    }
}
