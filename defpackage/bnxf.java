package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnxf {
    public static dqsq a() {
        return new dqry(bnxi.c, "conversation_labels", new dqrx() { // from class: bnxd
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bnxi.a;
                numValueOf.getClass();
                switch (i) {
                    case 51000:
                        bnxi.d(dqsyVar, 51000);
                        break;
                    case 53010:
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN snippet_text TEXT;");
                        break;
                    case 53020:
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN label INTEGER REFERENCES supersort_labels(_id) ON DELETE CASCADE ON UPDATE CASCADE;");
                        dqsyVar.v("DROP INDEX IF EXISTS unique_idx_conversation_label");
                        dqsyVar.v("CREATE UNIQUE INDEX unique_idx_conversation_label ON conversation_labels(conversation_id, label);");
                        break;
                    case 55040:
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN preview_uri TEXT;");
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN preview_content_type TEXT;");
                        break;
                    case 57050:
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN message_status INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN read INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN received_timestamp INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN message_protocol INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversation_labels ADD COLUMN raw_telephony_status INTEGER DEFAULT(0);");
                        break;
                    case 58430:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversation_labels_label");
                        dqsyVar.v("CREATE INDEX index_conversation_labels_label ON conversation_labels(label);");
                        break;
                    case 58920:
                        dqsyVar.v("DROP INDEX IF EXISTS index_conversation_labels_message_id");
                        dqsyVar.v("CREATE INDEX index_conversation_labels_message_id ON conversation_labels(message_id);");
                        break;
                }
            }
        });
    }
}
