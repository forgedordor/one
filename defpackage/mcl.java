package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mcl {
    public static final mcl a = new mci();

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
    }

    protected mcl() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract mcj d(int i, mcj mcjVar, boolean z);

    public abstract mck e(int i, mck mckVar, long j);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcl)) {
            return false;
        }
        mcl mclVar = (mcl) obj;
        if (mclVar.c() == c() && mclVar.b() == b()) {
            mck mckVar = new mck();
            mcj mcjVar = new mcj();
            mck mckVar2 = new mck();
            mcj mcjVar2 = new mcj();
            for (int i = 0; i < c(); i++) {
                if (!p(i, mckVar).equals(mclVar.p(i, mckVar2))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < b(); i2++) {
                if (!d(i2, mcjVar, true).equals(mclVar.d(i2, mcjVar2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == mclVar.g(true) && (iH = h(true)) == mclVar.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != mclVar.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return q() ? -1 : 0;
    }

    public int h(boolean z) {
        if (q()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        mck mckVar = new mck();
        mcj mcjVar = new mcj();
        int iC = c() + 217;
        int i2 = 0;
        while (true) {
            i = iC * 31;
            if (i2 >= c()) {
                break;
            }
            iC = i + p(i2, mckVar).hashCode();
            i2++;
        }
        int iB = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            iB = (iB * 31) + d(i3, mcjVar, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i, mcj mcjVar, mck mckVar, int i2, boolean z) {
        int i3 = n(i, mcjVar).c;
        if (p(i3, mckVar).o != i) {
            return i + 1;
        }
        int iJ = j(i3, i2, z);
        if (iJ == -1) {
            return -1;
        }
        return p(iJ, mckVar).n;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == h(z) ? g(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == g(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == g(z) ? h(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public final Pair l(mck mckVar, mcj mcjVar, int i, long j) {
        Pair pairM = m(mckVar, mcjVar, i, j, 0L);
        mee.f(pairM);
        return pairM;
    }

    public final Pair m(mck mckVar, mcj mcjVar, int i, long j, long j2) {
        mee.e(i, c());
        e(i, mckVar, j2);
        if (j == -9223372036854775807L) {
            j = mckVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = mckVar.n;
        n(i2, mcjVar);
        while (i2 < mckVar.o && mcjVar.e != j) {
            int i3 = i2 + 1;
            if (n(i3, mcjVar).e > j) {
                break;
            }
            i2 = i3;
        }
        d(i2, mcjVar, true);
        long jMin = j - mcjVar.e;
        long j3 = mcjVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = mcjVar.b;
        mee.f(obj);
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final mcj n(int i, mcj mcjVar) {
        return d(i, mcjVar, false);
    }

    public mcj o(Object obj, mcj mcjVar) {
        return d(a(obj), mcjVar, true);
    }

    public final mck p(int i, mck mckVar) {
        return e(i, mckVar, 0L);
    }

    public final boolean q() {
        return c() == 0;
    }
}
