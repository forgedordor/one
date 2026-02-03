package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgkz extends dfnb {
    final /* synthetic */ dgng d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgkz(dgng dgngVar) {
        super("ProvisioningStateMachine");
        this.d = dgngVar;
    }

    @Override // defpackage.dfnb
    protected final void h(String str) {
        this.d.z.b(str, new Object[0]);
    }

    @Override // defpackage.dfnb
    protected final void i(String str) {
        this.d.z.d(str, new Object[0]);
    }

    @Override // defpackage.dfnb
    protected final void j() {
        this.d.z.e("onHalting", new Object[0]);
    }

    @Override // defpackage.dfnb
    protected final void k() {
        dgng dgngVar = this.d;
        dgngVar.z.e("onQuitting", new Object[0]);
        dgngVar.aq(4);
    }

    @Override // defpackage.dfnb
    public final void l() {
        dgng dgngVar = this.d;
        dgngVar.z.d("onTransitionRequested %s", dgngVar.p());
        dgngVar.B();
    }
}
