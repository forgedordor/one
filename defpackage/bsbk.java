package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbk {
    public static dqsq a() {
        return new dqry(ParticipantsTable.d, "participants", new dqrx() { // from class: bsbh
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ParticipantsTable.a;
                numValueOf.getClass();
                switch (i) {
                    case 1000:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN color_type INT DEFAULT(0);");
                        return;
                    case 2000:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN sim_slot_id INT DEFAULT(-1);");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN subscription_name TEXT;");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN subscription_color INT DEFAULT(0);");
                        return;
                    case 4000:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN contact_destination TEXT;");
                        return;
                    case 10027:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN extended_color INT DEFAULT(0);");
                        return;
                    case 12001:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN participant_type INT DEFAULT(0);");
                        return;
                    case 13050:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN video_reachability INT DEFAULT(0);");
                        return;
                    case 20060:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN alias TEXT;");
                        return;
                    case 24060:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN is_spam INT DEFAULT(0);");
                        return;
                    case 29030:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN is_rcs_available INT DEFAULT(0);");
                        return;
                    case 30000:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN is_spam_source INT DEFAULT(0);");
                        return;
                    case 31020:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN cms_id TEXT;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_participants_cms_id ON participants(cms_id);");
                        return;
                    case 31030:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN latest_verification_status INT DEFAULT(0);");
                        return;
                    case 33000:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN profile_photo_blob_id TEXT;");
                        return;
                    case 33060:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN profile_photo_encryption_key BLOB;");
                        return;
                    case 35010:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN directory_id INT DEFAULT(-1);");
                        return;
                    case 54040:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN comparable_destination TEXT;");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN country_code TEXT;");
                        return;
                    case 55010:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN is_check_constraint_enabled_via_phenotype INT;");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN is_valid_phone_number_data INT DEFAULT(1);");
                        return;
                    case 58090:
                        if (dqru.a(ParticipantsTable.g()) < 58090) {
                            throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                        }
                        dqsyVar.v("DROP INDEX IF EXISTS index_participants_comparable_destination");
                        dqsyVar.v("CREATE UNIQUE INDEX index_participants_comparable_destination ON participants(comparable_destination);");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN recipient_id INTEGER;");
                        dqsyVar.v("CREATE UNIQUE INDEX index_participants_recipient_id ON participants(recipient_id);");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN recipient_canonical_address TEXT;");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN duplicate_of INTEGER REFERENCES participants(_id)  ;");
                        return;
                    case 58190:
                        dqsyVar.v("DROP INDEX IF EXISTS index_participants_latest_verification_status_is_not_zero");
                        dqsyVar.v("CREATE INDEX index_participants_latest_verification_status_is_not_zero ON participants(latest_verification_status) WHERE latest_verification_status <> 0;");
                        return;
                    case 58200:
                        dqsyVar.v("DROP INDEX IF EXISTS index_participants_blocked_is_one");
                        dqsyVar.v("CREATE INDEX index_participants_blocked_is_one ON participants(blocked) WHERE blocked = 1;");
                        return;
                    case 58210:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN cms_life_cycle INT DEFAULT(0);");
                        return;
                    case 58620:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN norm_ui_status INT DEFAULT(1);");
                        return;
                    case 59160:
                        dqsyVar.v("DROP INDEX IF EXISTS index_participants_duplicate_of");
                        dqsyVar.v("CREATE INDEX index_participants_duplicate_of ON participants(duplicate_of) WHERE duplicate_of NOT NULL;");
                        return;
                    case 59300:
                        dqsyVar.v("DROP INDEX IF EXISTS index_participants_sub_id");
                        dqsyVar.v("CREATE INDEX index_participants_sub_id ON participants(sub_id);");
                        return;
                    case 59440:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN last_modified_by_key TEXT;");
                        return;
                    case 59550:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN name_source INT DEFAULT(1);");
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN photo_source INT DEFAULT(1);");
                        return;
                    case 59850:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN contact_photo_uri TEXT;");
                        return;
                    case 59930:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN my_identity_token TEXT;");
                        dqsyVar.v("CREATE INDEX index_participants_my_identity_token ON participants(my_identity_token);");
                        return;
                    case 60060:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN profile_photo_user_preference INT DEFAULT(1);");
                        return;
                    case 60070:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN contact_metadata BLOB;");
                        return;
                    case 60160:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN my_identity_token_foreign_key TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE;");
                        dqsyVar.v("CREATE INDEX index_participants_my_identity_token_foreign_key ON participants(my_identity_token_foreign_key);");
                        return;
                    case 60640:
                        dqsyVar.v("ALTER TABLE participants ADD COLUMN is_enterprise_contact INT;");
                        dqsyVar.v("CREATE INDEX index_participants_is_enterprise_contact ON participants(is_enterprise_contact);");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(ParticipantsTable.e, true, "participants", new dqrx() { // from class: bsbi
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ParticipantsTable.a;
                numValueOf.getClass();
                if (i != 57070) {
                    return;
                }
                ParticipantsTable.n(dqsyVar, 57070);
            }
        });
    }

    public static dqpo[] c() {
        return ParticipantsTable.c.U;
    }
}
