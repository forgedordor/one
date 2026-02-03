package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmf extends dqsi {
    public static final String[] a = {"remote_registrations_table.tachyon_registration_id", "remote_registrations_table.etouffee", "remote_registrations_table.better_etouffee", "remote_registrations_table.messages_feature_hash", "remote_registrations_table.last_modified_timestamp", "remote_registrations_table.identity_key", "remote_registrations_table.updated_at_hash", "remote_registrations_table.guaranteed_fresh_as_of_timestamp", "remote_registrations_table.is_updated_at_hash_valid"};
    public static final btlj b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("remote_registrations_table.better_etouffee", 46000);
        ekgiVar.i("remote_registrations_table.messages_feature_hash", 58800);
        ekgiVar.c();
        new ekgi().c();
        b = new btlj();
        c = new int[]{45000, 46000, 58800};
    }

    public static final btma a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
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
        return new btma(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachyon_registration_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee INT DEFAULT(0)");
        if (i >= 46000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("better_etouffee INT DEFAULT(0)");
        }
        if (i >= 58800) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("messages_feature_hash INTEGER DEFAULT(0)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("identity_key BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("updated_at_hash INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_updated_at_hash_valid INTEGER DEFAULT(0)");
        sb.insert(0, "CREATE TABLE remote_registrations_table (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
