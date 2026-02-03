package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfh {
    private int a;
    private int b;
    private int c;
    private long[] d;
    private int e;

    public mfh() {
        this(16);
    }

    public final long a() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.d;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.e & (i2 + 1);
        this.c = i - 1;
        return j;
    }

    public final void c(long j) {
        int i = this.c;
        long[] jArr = this.d;
        int length = jArr.length;
        if (i == length) {
            int i2 = length + length;
            if (i2 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i2];
            int i3 = this.a;
            int i4 = length - i3;
            System.arraycopy(jArr, i3, jArr2, 0, i4);
            System.arraycopy(this.d, 0, jArr2, i4, i3);
            this.a = 0;
            this.b = this.c - 1;
            this.d = jArr2;
            this.e = jArr2.length - 1;
            jArr = jArr2;
        }
        int i5 = (this.b + 1) & this.e;
        this.b = i5;
        jArr[i5] = j;
        this.c++;
    }

    public final void d() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public final boolean e() {
        return this.c == 0;
    }

    public mfh(int i) {
        mee.a(true);
        i = i == 0 ? 1 : i;
        if (Integer.bitCount(i) != 1) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        this.d = new long[i];
        this.e = r3.length - 1;
    }
}
