package j$.util.stream;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0060c {
    public final int a;
    public int b;
    public int c;
    public long[] d;

    public AbstractC0060c() {
        this.a = 4;
    }

    public abstract void clear();

    public final long count() {
        int i = this.c;
        return i == 0 ? this.b : this.d[i] + this.b;
    }

    public AbstractC0060c(int i) {
        if (i >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
    }
}
