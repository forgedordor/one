package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buat extends dqsi {
    public static final String[] a = {"self_profiles._id", "self_profiles.my_identity_token", "self_profiles.limited_profile_display_name", "self_profiles.photo_uri", "self_profiles.is_self_profile_shareable", "self_profiles.belongs_to_self_gaia", "self_profiles.update_timestamp"};
    public static final btzw b;
    public static final int[] c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("self_profiles.is_self_profile_shareable", 60400);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("my_identity_token", "index_self_profiles_my_identity_token");
        ekgiVar2.c();
        b = new btzw();
        c = new int[]{59920, 60400};
        d = new int[]{60140};
    }

    public static final buao a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("self_profiles._id");
            ekfwVar.h("self_profiles.my_identity_token");
            ekfwVar.h("self_profiles.limited_profile_display_name");
            ekfwVar.h("self_profiles.photo_uri");
            if (numC.intValue() >= 60400) {
                ekfwVar.h("self_profiles.is_self_profile_shareable");
            }
            ekfwVar.h("self_profiles.belongs_to_self_gaia");
            ekfwVar.h("self_profiles.update_timestamp");
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new buao(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(f().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("my_identity_token TEXT REFERENCES my_identities(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("limited_profile_display_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("photo_uri TEXT");
        if (i >= 60400) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_self_profile_shareable INT DEFAULT(1)");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("belongs_to_self_gaia INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("update_timestamp INT DEFAULT(0)");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "self_profiles"));
        for (String str : g()) {
            dqsyVar.v(str);
        }
    }

    public static dqxa f() {
        return b().M();
    }

    static String[] g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_self_profiles_my_identity_token");
        arrayList.add("CREATE INDEX index_self_profiles_my_identity_token ON self_profiles(my_identity_token);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
