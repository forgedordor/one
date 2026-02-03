package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqlu {
    public static dqsq a() {
        return new dqry(bqmc.d, "message_replies", new dqrx() { // from class: bqls
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bqmc.a;
                numValueOf.getClass();
                if (i == 58330) {
                    bqmc.b(dqsyVar, 58330);
                } else {
                    if (i != 58900) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_message_replies_replied_to_rcs_message_id");
                    dqsyVar.v("CREATE INDEX index_message_replies_replied_to_rcs_message_id ON message_replies(replied_to_rcs_message_id);");
                    dqsyVar.v("DROP INDEX IF EXISTS index_replied_to_message_id");
                    dqsyVar.v("CREATE INDEX index_replied_to_message_id ON message_replies(replied_to_message_id, replied_to_message_id_null_reason);");
                }
            }
        });
    }

    public static dqpo[] b() {
        return bqmc.c.e;
    }
}
