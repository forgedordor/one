package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcrr extends eooi {
    public final fbnh a;

    public fcrr(fbnh fbnhVar) {
        this.a = fbnhVar;
    }

    @Override // defpackage.eooi
    protected final String gu() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("clientCall", this.a);
        return ejwfVarB.toString();
    }

    @Override // defpackage.eooi
    protected final void l() {
        this.a.c("GrpcFuture was cancelled", null);
    }
}
