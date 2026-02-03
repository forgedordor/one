package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bofk {
    public static dqsq a() {
        return new dqry(bofr.c, "conversation_suggestions", new dqrx() { // from class: bofh
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bofr.a;
                numValueOf.getClass();
                if (i == 11001) {
                    dqsyVar.v("ALTER TABLE conversation_suggestions ADD COLUMN rcs_message_id TEXT;");
                    return;
                }
                if (i == 12000) {
                    dqsyVar.v("ALTER TABLE conversation_suggestions ADD COLUMN target_rcs_message_id TEXT;");
                    dqsyVar.v("ALTER TABLE conversation_suggestions ADD COLUMN read INT DEFAULT(0);");
                    dqsyVar.v("ALTER TABLE conversation_suggestions ADD COLUMN received_timestamp INT DEFAULT(0);");
                } else {
                    if (i != 17000) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_conversation_suggestions_target_rcs_message_id");
                    dqsyVar.v("CREATE INDEX index_conversation_suggestions_target_rcs_message_id ON conversation_suggestions(target_rcs_message_id);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(bofr.d, true, "conversation_suggestions", new dqrx() { // from class: bofi
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bofr.a;
                numValueOf.getClass();
                if (i == 55020) {
                    bofr.g(dqsyVar);
                } else {
                    if (i != 56010) {
                        return;
                    }
                    bofr.g(dqsyVar);
                }
            }
        });
    }
}
