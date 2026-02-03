package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqx extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new btqw(this);
    }

    public final void b(Optional optional) {
        ap(new dqpj("restore_workflow_executions.session_id", 1, basg.b(optional)));
    }

    public final void c(aiaf aiafVar) {
        ap(new dqty("restore_workflow_executions.status", 1, Integer.valueOf(aiafVar == null ? 0 : aiafVar.q)));
    }
}
