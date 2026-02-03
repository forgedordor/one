package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsul {
    public static dqsq a() {
        return new dqry(ProfilesTable.d, "profiles_table", new dqrx() { // from class: bsuj
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ProfilesTable.a;
                numValueOf.getClass();
                switch (i) {
                    case 59710:
                        ProfilesTable.e(dqsyVar, 59710);
                        break;
                    case 59730:
                        dqsyVar.v("DROP INDEX IF EXISTS index_profiles_table_participant_id");
                        dqsyVar.v("CREATE INDEX index_profiles_table_participant_id ON profiles_table(participant_id) WHERE participant_id NOT NULL;");
                        break;
                    case 59940:
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN belongs_to_self_gaia INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN gaia_update_timestamp INT DEFAULT(0);");
                        break;
                    case 60170:
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN person_id TEXT;");
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN profile_access_token TEXT;");
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN sender_last_updated_time TEXT;");
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN has_shared_access_token_with_user INTEGER DEFAULT(0);");
                        break;
                    case 60200:
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN sending_self_profile_interaction_state INTEGER DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN sender_last_updated_time_from_rcs TEXT;");
                        break;
                    case 60340:
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN self_profile_sharing_metadata BLOB;");
                        break;
                    case 60400:
                        dqsyVar.v("ALTER TABLE profiles_table ADD COLUMN is_self_profile_shareable INT DEFAULT(1);");
                        break;
                }
            }
        });
    }
}
