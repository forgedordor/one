package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkxc {
    public static final String[] a = {"remote_user_id_to_registration_id.remote_user_id", "remote_user_id_to_registration_id.tachyon_registration_id", "remote_registrations_table.tachyon_registration_id", "remote_registrations_table.etouffee", "remote_registrations_table.better_etouffee", "remote_registrations_table.messages_feature_hash", "remote_registrations_table.last_modified_timestamp", "remote_registrations_table.identity_key", "remote_registrations_table.updated_at_hash", "remote_registrations_table.guaranteed_fresh_as_of_timestamp", "remote_registrations_table.is_updated_at_hash_valid"};
    public static final ekgp b;
    public static final bkwv c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("remote_registrations_table.better_etouffee", 46000);
        ekgiVar.i("remote_registrations_table.messages_feature_hash", 58800);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("tachyon_registration_id", "index_null_tachyon_registration_id");
        ekgiVar2.c();
        c = new bkwv();
    }

    public static final bkwz a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("remote_user_id_to_registration_id.remote_user_id");
            ekfwVar.h("remote_user_id_to_registration_id.tachyon_registration_id");
            ekfwVar.h("remote_registrations_table.tachyon_registration_id");
            ekfwVar.h("remote_registrations_table.etouffee");
            if (numC.intValue() >= 46000) {
                ekfwVar.h("remote_registrations_table.better_etouffee");
            }
            if (numC.intValue() >= 58800) {
                ekfwVar.h("remote_registrations_table.messages_feature_hash");
            }
            ekfwVar.h("remote_registrations_table.last_modified_timestamp");
            ekfwVar.h("remote_registrations_table.identity_key");
            ekfwVar.h("remote_registrations_table.updated_at_hash");
            ekfwVar.h("remote_registrations_table.guaranteed_fresh_as_of_timestamp");
            ekfwVar.h("remote_registrations_table.is_updated_at_hash_valid");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bkwz(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().M().a());
    }
}
