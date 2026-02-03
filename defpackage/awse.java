package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awse extends dqsi {
    public static final String[] a = {"groups.token", "groups.group_type", "groups.rcs_conference_uri", "groups.name", "groups.rcs_icon_url", "groups.rcs_group_state", "groups.tachygram_group_routing_token", "groups.rcs_group_capabilities", "groups.rcs_group_last_sync_timestamp", "groups.rcs_name_last_change_timestamp", "groups.rcs_join_link_url"};
    public static final awrh b;
    public static final int[] c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("groups.rcs_name_last_change_timestamp", 60850);
        ekgiVar.i("groups.rcs_join_link_url", 60940);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("group_type", "index_groups_group_type");
        ekgiVar2.c();
        b = new awrh();
        c = new int[]{60430, 60850, 60940};
        d = new int[]{60460};
    }

    public static final awsb a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("groups.token");
            ekfwVar.h("groups.group_type");
            ekfwVar.h("groups.rcs_conference_uri");
            ekfwVar.h("groups.name");
            ekfwVar.h("groups.rcs_icon_url");
            ekfwVar.h("groups.rcs_group_state");
            ekfwVar.h("groups.tachygram_group_routing_token");
            ekfwVar.h("groups.rcs_group_capabilities");
            ekfwVar.h("groups.rcs_group_last_sync_timestamp");
            if (numC.intValue() >= 60850) {
                ekfwVar.h("groups.rcs_name_last_change_timestamp");
            }
            if (numC.intValue() >= 60940) {
                ekfwVar.h("groups.rcs_join_link_url");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new awsb(strArr);
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
        sb.append("token TEXT PRIMARY KEY REFERENCES destinations(token) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_type INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_conference_uri TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_icon_url TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_state INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachygram_group_routing_token BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_capabilities INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_last_sync_timestamp INTEGER DEFAULT(0)");
        if (i >= 60850) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_name_last_change_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 60940) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("rcs_join_link_url TEXT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "groups"));
        for (String str : g()) {
            dqsyVar.v(str);
        }
    }

    public static dqxa f() {
        return b().M();
    }

    static String[] g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_groups_group_type");
        arrayList.add("CREATE INDEX index_groups_group_type ON groups(group_type);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
