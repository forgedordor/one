package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpth {
    public static dqsq a() {
        return new dqry(bpto.d, "lighter_conversations_table", new dqrx() { // from class: bpte
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpto.a;
                numValueOf.getClass();
                switch (i) {
                    case 58660:
                        bpto.e(dqsyVar, 58660);
                        break;
                    case 58700:
                        dqsyVar.v("ALTER TABLE lighter_conversations_table ADD COLUMN read INTEGER DEFAULT(1);");
                        break;
                    case 58760:
                        dqsyVar.v("DROP INDEX IF EXISTS index_lighter_conversation_read_0");
                        dqsyVar.v("CREATE INDEX index_lighter_conversation_read_0 ON lighter_conversations_table(read) WHERE read == 0;");
                        break;
                    case 58810:
                        dqsyVar.v("ALTER TABLE lighter_conversations_table ADD COLUMN is_last_message_outgoing INTEGER;");
                        break;
                    case 58930:
                        dqsyVar.v("DROP INDEX IF EXISTS index_lighter_conversations_table_conversation_id");
                        dqsyVar.v("CREATE INDEX index_lighter_conversations_table_conversation_id ON lighter_conversations_table(conversation_id);");
                        break;
                    case 59030:
                        dqsyVar.v("ALTER TABLE lighter_conversations_table ADD COLUMN conversation_status INTEGER;");
                        break;
                    case 59040:
                        dqsyVar.v("ALTER TABLE lighter_conversations_table ADD COLUMN last_action_timestamp INT DEFAULT(0);");
                        break;
                    case 59100:
                        dqsyVar.v("ALTER TABLE lighter_conversations_table ADD COLUMN sync_timestamp_ms INT DEFAULT(0);");
                        break;
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(bpto.e, true, "lighter_conversations_table", new dqrx() { // from class: bptf
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpto.a;
                numValueOf.getClass();
                if (i != 59110) {
                    return;
                }
                dqru.K(dqsyVar, "lighter_conversations_table", bpto.d(59110, "TEMP___lighter_conversations_table"), bpto.a, bpto.f(59110));
            }
        });
    }
}
