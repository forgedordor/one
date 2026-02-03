package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgdp implements eblu {
    final /* synthetic */ ebqr a;
    final /* synthetic */ dgfg b;

    public dgdp(dgfg dgfgVar, ebqr ebqrVar) {
        this.a = ebqrVar;
        this.b = dgfgVar;
    }

    @Override // defpackage.eblu
    public final void a(eblm eblmVar) {
        dgfg dgfgVar = this.b;
        dgfgVar.p(3);
        ebqr ebqrVar = this.a;
        dhja.h(dgfgVar.m, "SIP request canceled. method=%s, callId=%s", ebqrVar.z(), ebqrVar.y().h());
        dgfgVar.s(2, new ebmn("SIP request canceled."));
    }

    @Override // defpackage.eblu
    public final void b(eblm eblmVar) {
        dgfg dgfgVar = this.b;
        dgfgVar.p(3);
        ebqq ebqqVar = eblmVar.b;
        if (ebqqVar != null) {
            dgfgVar.s(2, ebqqVar);
        }
    }

    @Override // defpackage.eblu
    public final void c(eblm eblmVar) {
        dgfg dgfgVar = this.b;
        dgfgVar.p(3);
        ebqr ebqrVar = this.a;
        dhja.h(dgfgVar.m, "SIP request timeout. method=%s, callId=%s", ebqrVar.z(), ebqrVar.y().h());
        dgfgVar.s(3, eblmVar);
    }
}
