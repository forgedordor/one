package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqgy {
    public static dqsq a() {
        return new dqry(bqhf.d, "message_labels", new dqrx() { // from class: bqgw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bqhf.a;
                numValueOf.getClass();
                switch (i) {
                    case 53050:
                        bqhf.d(dqsyVar, 53050);
                        dqsyVar.v("DROP INDEX IF EXISTS unique_idx_message_label");
                        dqsyVar.v("CREATE UNIQUE INDEX unique_idx_message_label ON message_labels(message_id, label);");
                        break;
                    case 53060:
                        dqsyVar.v("ALTER TABLE message_labels ADD COLUMN confidence INTEGER;");
                        break;
                    case 58550:
                        dqsyVar.v("DROP INDEX IF EXISTS index_message_labels_label");
                        dqsyVar.v("CREATE INDEX index_message_labels_label ON message_labels(label);");
                        break;
                    case 58590:
                        dqsyVar.v("ALTER TABLE message_labels ADD COLUMN intent TEXT DEFAULT('');");
                        break;
                    case 59240:
                        dqsyVar.v("DROP INDEX IF EXISTS index_message_labels_intent");
                        dqsyVar.v("CREATE INDEX index_message_labels_intent ON message_labels(intent) WHERE intent = 'Otp';");
                        break;
                }
            }
        });
    }
}
