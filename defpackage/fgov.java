package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgov extends fgoo {
    private final fgna a;
    final long b;

    public fgov(fgmu fgmuVar, long j) {
        super(fgmuVar);
        this.b = j;
        this.a = new fgou(this, ((fgmt) fgmuVar).a);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna q() {
        return this.a;
    }

    public abstract long x(long j, long j2);
}
