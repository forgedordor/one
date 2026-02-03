package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgoz extends fgoo {
    final long a;
    private final fgna b;

    public fgoz(fgmu fgmuVar, fgna fgnaVar) {
        super(fgmuVar);
        if (!fgnaVar.e()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long jC = fgnaVar.c();
        this.a = jC;
        if (jC < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.b = fgnaVar;
    }

    @Override // defpackage.fgms
    public int d() {
        return 0;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public long f(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public long g(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public long h(long j, int i) {
        fgot.c(this, i, d(), x(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna q() {
        return this.b;
    }

    protected int x(long j, int i) {
        return w(j);
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
