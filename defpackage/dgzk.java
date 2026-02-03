package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgzk implements dgvo {
    final /* synthetic */ dgzn a;
    private final String b;

    public dgzk(dgzn dgznVar, String str) {
        this.a = dgznVar;
        this.b = str;
    }

    @Override // defpackage.dgvo
    public final void a(dgvm dgvmVar) {
        dhja.d(dgzn.B, "Reference accepted", new Object[0]);
    }

    @Override // defpackage.dgvo
    public final void c(dgvm dgvmVar, dgvn dgvnVar) {
        dhja.d(dgzn.B, "Reference delivery failed", new Object[0]);
        this.a.aK(this.b, new dgzc(dgvnVar.a, dgvnVar.getMessage()));
    }

    @Override // defpackage.dgvo
    public final void d(dgvm dgvmVar, int i, String str) {
        dhja.d(dgzn.B, "Reference delivery failed", new Object[0]);
        this.a.aK(this.b, new dgzc(i, str));
    }

    @Override // defpackage.dgvo
    public final void e() {
        dhja.d(dgzn.B, "ConferenceInvitationListener.referenceNotify", new Object[0]);
    }

    @Override // defpackage.dgvo
    public final void f() {
        dhja.d(dgzn.B, "ConferenceInvitationListener.referenceTerminated", new Object[0]);
    }
}
