package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npl {
    public final npk a;
    public final nox b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long[] l;
    public int[] m;
    private final long n;

    public npl(int i, npk npkVar, nox noxVar) {
        this.a = npkVar;
        int iB = npkVar.b();
        boolean z = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z = false;
            }
        }
        mee.a(z);
        this.c = d(i, iB == 2 ? 1667497984 : 1651965952);
        this.n = npkVar.c();
        this.b = noxVar;
        this.d = iB == 2 ? d(i, 1650720768) : -1;
        this.k = -1L;
        this.l = new long[512];
        this.m = new int[512];
        this.e = npkVar.d;
    }

    private static int d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final nor e(int i) {
        return new nor(this.m[i] * b(), this.l[i]);
    }

    public final long a(int i) {
        return (this.n * i) / this.e;
    }

    public final long b() {
        return a(1);
    }

    public final noo c(long j) {
        if (this.j == 0) {
            nor norVar = new nor(0L, this.k);
            return new noo(norVar, norVar);
        }
        int iB = (int) (j / b());
        int iB2 = mgb.b(this.m, iB, true, true);
        if (this.m[iB2] == iB) {
            nor norVarE = e(iB2);
            return new noo(norVarE, norVarE);
        }
        nor norVarE2 = e(iB2);
        int i = iB2 + 1;
        return i < this.l.length ? new noo(norVarE2, e(i)) : new noo(norVarE2, norVarE2);
    }
}
