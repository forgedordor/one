package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iyl implements ixq {
    public int a;
    public int b;
    public long c = 0;
    public long d = iyn.b;
    public long e = 0;

    private final void ex() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = fddu.i((int) j, kil.d(j2), kil.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        this.b = fddu.i((int) j3, kil.c(j4), kil.a(j4));
        int i = this.a;
        long j5 = this.c;
        this.e = (((i - ((int) (j5 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j5 & 4294967295L))) / 2));
    }

    protected abstract void ef(long j, float f, fdap fdapVar);

    public /* synthetic */ Object f() {
        return null;
    }

    public int v() {
        return (int) (this.c & 4294967295L);
    }

    public int w() {
        return (int) (this.c >> 32);
    }

    public void x(long j, float f, ini iniVar) {
        ef(j, f, null);
    }

    protected final void y(long j) {
        if (kjg.e(this.c, j)) {
            return;
        }
        this.c = j;
        ex();
    }

    protected final void z(long j) {
        if (kil.g(this.d, j)) {
            return;
        }
        this.d = j;
        ex();
    }
}
