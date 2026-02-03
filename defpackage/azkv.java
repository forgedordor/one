package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azkv {
    public static dqsq a() {
        return new dqry(azlc.d, "messages_backup", new dqrx() { // from class: azks
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azlc.a;
                numValueOf.getClass();
                if (i == 50) {
                    dqsyVar.v("ALTER TABLE messages_backup ADD COLUMN custom_headers BLOB;");
                    dqsyVar.v("CREATE INDEX index_messages_backup_custom_headers ON messages_backup(custom_headers);");
                    return;
                }
                if (i == 80) {
                    dqsyVar.v("ALTER TABLE messages_backup ADD COLUMN sender_send_destination TEXT;");
                    dqsyVar.v("ALTER TABLE messages_backup ADD COLUMN msisdn_receiving_rcs_message TEXT;");
                } else if (i == 110) {
                    dqsyVar.v("ALTER TABLE messages_backup ADD COLUMN my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                    dqsyVar.v("CREATE INDEX index_messages_backup_my_identity ON messages_backup(my_identity);");
                } else {
                    if (i != 120) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE messages_backup ADD COLUMN message_persistence_id TEXT;");
                    dqsyVar.v("CREATE UNIQUE INDEX index_messages_backup_message_persistence_id ON messages_backup(message_persistence_id) WHERE message_persistence_id NOT NULL;");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(azlc.e, true, "messages_backup", new dqrx() { // from class: azkt
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azlc.a;
                numValueOf.getClass();
                if (i == 90) {
                    azlc.e(dqsyVar, 90);
                } else {
                    if (i != 110) {
                        return;
                    }
                    azlc.e(dqsyVar, 110);
                }
            }
        });
    }

    public static dqpo[] c() {
        return azlc.c.E;
    }
}
