package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmcs extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new cmcr(this);
    }

    public final void b(dqxe dqxeVar) {
        ap(new dqpk("scheduled_send.conversation_id", 1, dqxeVar));
    }

    public final void c(String str) {
        ap(new dqpj("scheduled_send._id", 1, str));
    }

    public final void d(cmct cmctVar) {
        ap(new dqty("scheduled_send.status", 1, Integer.valueOf(cmctVar == null ? 0 : cmctVar.ordinal())));
    }
}
