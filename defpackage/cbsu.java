package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbsu {
    public static dqsq a() {
        return new dqry(cbtb.d, "conversation_encryption", new dqrx() { // from class: cbss
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = cbtb.a;
                numValueOf.getClass();
                switch (i) {
                    case 60870:
                        cbtb.d(dqsyVar, 60870);
                        break;
                    case 60890:
                        dqsyVar.v("ALTER TABLE conversation_encryption ADD COLUMN conv_type INTEGER DEFAULT(0);");
                        break;
                    case 60920:
                        dqsyVar.v("ALTER TABLE conversation_encryption ADD COLUMN added_to_mls_group_timestamp INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversation_encryption ADD COLUMN mls_last_unexpected_downgrade_timestamp INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE conversation_encryption ADD COLUMN mls_reupgrade_after_unexpected_downgrade_attempt_count INTEGER DEFAULT(0);");
                        break;
                    case 61010:
                        dqsyVar.v("ALTER TABLE conversation_encryption ADD COLUMN destination_token TEXT REFERENCES destinations(token) ON DELETE RESTRICT ON UPDATE CASCADE;");
                        dqsyVar.v("DROP INDEX IF EXISTS index_destination_and_self_identity");
                        dqsyVar.v("CREATE UNIQUE INDEX index_destination_and_self_identity ON conversation_encryption(destination_token, self_id);");
                        break;
                }
            }
        });
    }
}
