package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csu {
    public Object[] a;
    public int b;
    public int c;
    public int d;

    public csu() {
        this(8);
    }

    public final int a() {
        return (this.c - this.b) & this.d;
    }

    public final Object b(int i) {
        if (i < 0 || i >= a()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.a[this.d & (this.b + i)];
        obj.getClass();
        return obj;
    }

    public csu(int i) {
        if (Integer.bitCount(i) != 1) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.d = i - 1;
        this.a = new Object[i];
    }
}
