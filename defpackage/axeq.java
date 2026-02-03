package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axeq extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new axep(this);
    }

    public final void b() {
        int iIntValue = axer.c().intValue();
        if (iIntValue < 60160) {
            dqru.x("my_identity_token_with_foreign_key", iIntValue);
        }
        ap(new dqpn("subscriptions.my_identity_token_with_foreign_key", 6));
    }

    public final void c(String str) {
        ap(new dqpj("subscriptions.sim_serial_number", 1, String.valueOf(str)));
    }

    public final void d(int i) {
        ap(new dqty("subscriptions.sub_id", 1, Integer.valueOf(i)));
    }
}
