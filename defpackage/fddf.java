package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fddf {
    public static final fdde a = new fdde();
    public static final fddf b;

    static {
        Integer num = fczj.a;
        b = (num == null || num.intValue() >= 34) ? new fddi() : new fddc();
    }

    public abstract int a(int i);

    public int b() {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public long d() {
        return (b() << 32) + b();
    }

    public int f(int i) {
        int iB;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(fddg.c(0, Integer.valueOf(i)));
        }
        if (((-i) & i) == i) {
            return a(fddg.a(i));
        }
        do {
            iB = b() >>> 1;
            i2 = iB % i;
        } while ((iB - i2) + (i - 1) < 0);
        return i2;
    }

    public long g(long j) {
        long jD;
        long j2;
        if (j <= 0) {
            throw new IllegalArgumentException(fddg.c(0L, Long.valueOf(j)));
        }
        if (((-j) & j) != j) {
            do {
                jD = d() >>> 1;
                j2 = jD % j;
            } while ((jD - j2) + (-1) + j < 0);
            return j2;
        }
        long j3 = j >>> 32;
        if (((int) j) != 0) {
            return a(fddg.a(r11)) & 4294967295L;
        }
        return ((int) j3) == 1 ? b() & 4294967295L : (a(fddg.a(r11)) << 32) + (b() & 4294967295L);
    }

    public long hw(long j) {
        return g(j);
    }
}
