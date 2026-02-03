package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btkh extends dqsi {
    public static final String[] a = {"remote_instances._id", "remote_instances.remote_instance_id", "remote_instances.etouffee", "remote_instances.tachyon_id", "remote_instances.last_modified_timestamp", "remote_instances.identity_key", "remote_instances.updated_at_hash", "remote_instances.guaranteed_fresh_as_of_timestamp", "remote_instances.is_updated_at_hash_valid"};
    public static final btjl b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("remote_instances.last_modified_timestamp", 35040);
        ekgiVar.i("remote_instances.identity_key", 38010);
        ekgiVar.i("remote_instances.updated_at_hash", 39040);
        ekgiVar.i("remote_instances.guaranteed_fresh_as_of_timestamp", 40010);
        ekgiVar.i("remote_instances.is_updated_at_hash_valid", 40030);
        ekgiVar.c();
        new ekgi().c();
        b = new btjl();
        c = new int[]{34010, 35040, 38010, 39040, 40010, 40030};
    }

    public static final btke a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("remote_instances._id");
            ekfwVar.h("remote_instances.remote_instance_id");
            ekfwVar.h("remote_instances.etouffee");
            ekfwVar.h("remote_instances.tachyon_id");
            if (numC.intValue() >= 35040) {
                ekfwVar.h("remote_instances.last_modified_timestamp");
            }
            if (numC.intValue() >= 38010) {
                ekfwVar.h("remote_instances.identity_key");
            }
            if (numC.intValue() >= 39040) {
                ekfwVar.h("remote_instances.updated_at_hash");
            }
            if (numC.intValue() >= 40010) {
                ekfwVar.h("remote_instances.guaranteed_fresh_as_of_timestamp");
            }
            if (numC.intValue() >= 40030) {
                ekfwVar.h("remote_instances.is_updated_at_hash_valid");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new btke(strArr);
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_instance_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachyon_id TEXT");
        if (i >= 35040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 38010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("identity_key BLOB");
        }
        if (i >= 39040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("updated_at_hash INTEGER DEFAULT(0)");
        }
        if (i >= 40010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 40030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_updated_at_hash_valid INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE remote_instances (");
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
