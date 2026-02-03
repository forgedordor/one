package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqua extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bqtz(this);
    }

    public final void b(String str) {
        ap(new dqpj("message_status.message_id", 1, String.valueOf(str)));
    }

    public final void c(long j) {
        ap(new dqty("message_status.timestamp", 8, Long.valueOf(j)));
    }
}
