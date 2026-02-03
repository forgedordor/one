package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyo {
    public long a;
    public boolean b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    private final nox m;

    public nyo(nox noxVar) {
        this.m = noxVar;
    }

    public final void a(int i) {
        long j = this.k;
        if (j != -9223372036854775807L) {
            long j2 = this.a;
            long j3 = this.j;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.m.o(j, this.l ? 1 : 0, i2, i, null);
        }
    }
}
