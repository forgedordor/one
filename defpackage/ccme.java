package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccme extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new ccmd(this);
    }

    public final void b(basd basdVar) {
        ap(new dqpj("mls_processed_results.rcs_message_id", 1, basd.d(basdVar)));
    }

    public final void c(String str) {
        ap(new dqpj("mls_processed_results.self_identity", 1, String.valueOf(str)));
    }

    public final void d(ccnk ccnkVar) {
        ap(new dqty("mls_processed_results.stage", 1, Integer.valueOf(ccnkVar == null ? 0 : ccnkVar.ordinal())));
    }
}
