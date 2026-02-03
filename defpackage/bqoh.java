package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqoh {
    public static dqsq a() {
        return new dqry(bqoo.c, "message_send_receive_attempt", new dqrx() { // from class: bqof
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bqoo.a;
                numValueOf.getClass();
                if (i != 59360) {
                    return;
                }
                bqoo.b(dqsyVar);
                dqsyVar.v("DROP INDEX IF EXISTS message_id_and_message_sending_attempt_index");
                dqsyVar.v("CREATE UNIQUE INDEX message_id_and_message_sending_attempt_index ON message_send_receive_attempt(message_id, message_sending_attempt);");
            }
        });
    }
}
