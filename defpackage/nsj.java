package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsj extends nnh implements nso {
    public final long a;
    public final int b;
    public final int c;
    private final long d;

    public nsj(long j, long j2, int i, int i2) {
        super(j, j2, i, i2);
        long j3 = j;
        this.a = j2;
        this.b = i;
        this.c = i2;
        this.d = j3 == -1 ? -1L : j3;
    }

    @Override // defpackage.nso
    public final int e() {
        return this.b;
    }

    @Override // defpackage.nso
    public final long f() {
        return this.d;
    }

    @Override // defpackage.nso
    public final long g(long j) {
        return d(j);
    }
}
