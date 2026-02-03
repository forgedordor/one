package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqqv {
    public static dqsq a() {
        return new dqry(bqrg.c, "message_spam", new dqrx() { // from class: bqqt
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bqrg.a;
                numValueOf.getClass();
                switch (i) {
                    case 30000:
                        bqrg.e(dqsyVar, 30000);
                        break;
                    case 45040:
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN score REAL DEFAULT(0.0);");
                        break;
                    case 58030:
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN outcome INT DEFAULT(1);");
                        break;
                    case 58100:
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN ares_initiated_by TEXT DEFAULT('');");
                        break;
                    case 58350:
                        dqsyVar.v("DROP INDEX IF EXISTS index_message_spam_message_id");
                        dqsyVar.v("CREATE INDEX index_message_spam_message_id ON message_spam(message_id);");
                        break;
                    case 59190:
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN classification_timestamp INTEGER DEFAULT(0);");
                        break;
                    case 59200:
                        dqsyVar.v("DROP INDEX IF EXISTS index_message_spam_classification_timestamp");
                        dqsyVar.v("CREATE INDEX index_message_spam_classification_timestamp ON message_spam(classification_timestamp);");
                        break;
                    case 59460:
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                        dqsyVar.v("CREATE INDEX index_message_spam_conversation_id ON message_spam(conversation_id);");
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN trigger INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN action_type INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN action_contributors INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN error_code INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE message_spam ADD COLUMN reclassification_index INT DEFAULT(0);");
                        break;
                }
            }
        });
    }
}
