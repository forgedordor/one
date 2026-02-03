package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsmm {
    public static dqsq a() {
        return new dqry(bsmv.d, "pending_incoming_message_rcs_table", new dqrx() { // from class: bsmk
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bsmv.a;
                numValueOf.getClass();
                switch (i) {
                    case 39050:
                        bsmv.d(dqsyVar, 39050);
                        break;
                    case 44020:
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN custom_headers BLOB;");
                        break;
                    case 58820:
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_group INTEGER;");
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN conversation_id TEXT;");
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN conference_uri TEXT;");
                        break;
                    case 58870:
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_delivery_report_requested INTEGER DEFAULT(0) NOT NULL;");
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_display_report_requested INTEGER DEFAULT(0) NOT NULL;");
                        break;
                    case 59270:
                        dqsyVar.v("DROP INDEX IF EXISTS index_pending_incoming_message_rcs_table_received_timestamp");
                        dqsyVar.v("CREATE INDEX IF NOT EXISTS index_pending_incoming_message_rcs_table_received_timestamp ON pending_incoming_message_rcs_table(received_timestamp);");
                        break;
                    case 59410:
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN self_identity TEXT;");
                        break;
                    case 60560:
                        dqsyVar.v("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_negative_delivery_report_requested INTEGER DEFAULT(0) NOT NULL;");
                        break;
                }
            }
        });
    }
}
