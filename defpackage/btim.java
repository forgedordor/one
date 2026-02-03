package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btim extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new btil(this);
    }

    public final void b(dqxe dqxeVar) {
        int iIntValue = btin.e().intValue();
        if (iIntValue < 35070) {
            dqru.x("conversation_id", iIntValue);
        }
        ap(new dqpk("reminders.conversation_id", 1, dqxeVar));
    }

    public final void c(String str) {
        ap(new dqpj("reminders._id", 1, String.valueOf(str)));
    }

    public final void d(bvdw bvdwVar) {
        ap(new dqty("reminders.status", 1, Integer.valueOf(bvdwVar == null ? 0 : bvdwVar.ordinal())));
    }

    public final void e(long j) {
        ap(new dqty("reminders.trigger_time", 8, Long.valueOf(j)));
    }
}
