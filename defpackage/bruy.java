package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bruy {
    public static dqsq a() {
        return new dqry(brvd.d, "participants_audit_log", new dqrx() { // from class: bruv
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = brvd.a;
                numValueOf.getClass();
                switch (i) {
                    case 59440:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN last_modified_by_key TEXT;");
                        break;
                    case 59550:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN name_source INT;");
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN photo_source INT;");
                        break;
                    case 59850:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN contact_photo_uri TEXT;");
                        break;
                    case 59930:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN my_identity_token TEXT;");
                        break;
                    case 60060:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN profile_photo_user_preference INT;");
                        break;
                    case 60070:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN contact_metadata BLOB;");
                        break;
                    case 60160:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dqsyVar.v("CREATE INDEX index_participants_audit_log_my_identity_token_foreign_key ON participants_audit_log(my_identity_token_foreign_key);");
                        break;
                    case 60640:
                        dqsyVar.v("ALTER TABLE participants_audit_log ADD COLUMN is_enterprise_contact INT;");
                        break;
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(brvd.e, true, "participants_audit_log", new dqrx() { // from class: bruw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = brvd.a;
                numValueOf.getClass();
                if (i != 59380) {
                    return;
                }
                dqru.K(dqsyVar, "participants_audit_log", brvd.d(59380, "TEMP___participants_audit_log"), brvd.a, brvd.e(59380));
            }
        });
    }
}
