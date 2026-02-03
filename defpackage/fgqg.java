package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgqg {
    public final long a;
    public final fgmz b;
    fgqg c;
    private String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public fgqg(fgmz fgmzVar, long j) {
        this.a = j;
        this.b = fgmzVar;
    }

    public final int a(long j) {
        fgqg fgqgVar = this.c;
        if (fgqgVar != null && j >= fgqgVar.a) {
            return fgqgVar.a(j);
        }
        int i = this.e;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iA = this.b.a(this.a);
        this.e = iA;
        return iA;
    }

    public final int b(long j) {
        fgqg fgqgVar = this.c;
        if (fgqgVar != null && j >= fgqgVar.a) {
            return fgqgVar.b(j);
        }
        int i = this.f;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iC = this.b.c(this.a);
        this.f = iC;
        return iC;
    }

    public final String c(long j) {
        fgqg fgqgVar = this.c;
        if (fgqgVar != null && j >= fgqgVar.a) {
            return fgqgVar.c(j);
        }
        if (this.d == null) {
            this.d = this.b.g(this.a);
        }
        return this.d;
    }
}
