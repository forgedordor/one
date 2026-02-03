package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccem extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new ccel(this);
    }

    public final void b(long j) {
        ap(new dqty("mls_epoch_records.epoch_id", 1, Long.valueOf(j)));
    }

    public final void c(String str) {
        ap(new dqpj("mls_epoch_records.group_id", 1, String.valueOf(str)));
    }

    public final void d(String str) {
        ap(new dqpj("mls_epoch_records.identity_id", 1, String.valueOf(str)));
    }
}
