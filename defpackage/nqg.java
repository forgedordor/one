package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqg extends nod {
    private final long a;

    public nqg(nns nnsVar, long j) {
        super(nnsVar);
        mee.a(((nni) nnsVar).b >= j);
        this.a = j;
    }

    @Override // defpackage.nod, defpackage.nns
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.nod, defpackage.nns
    public final long e() {
        return super.e() - this.a;
    }

    @Override // defpackage.nod, defpackage.nns
    public final long f() {
        return super.f() - this.a;
    }
}
