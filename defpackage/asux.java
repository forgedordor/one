package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asux extends dqsi {
    public static final String[] a = {"rcs_remote_capabilities_cache.msisdn", "rcs_remote_capabilities_cache.last_refresh_timestamp", "rcs_remote_capabilities_cache.rcs_capabilities"};
    public static final asug b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("msisdn", "index_rcs_remote_capabilities_cache_msisdn");
        ekgiVar.c();
        b = new asug();
        c = new int[]{58110, 58420};
        d = new int[]{58130};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar, int i) {
        dqsyVar.v(d("rcs_remote_capabilities_cache"));
        for (String str : c(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 58420) {
            arrayList.add("DROP INDEX IF EXISTS index_rcs_remote_capabilities_cache_msisdn");
            arrayList.add("CREATE INDEX index_rcs_remote_capabilities_cache_msisdn ON rcs_remote_capabilities_cache(msisdn);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("msisdn TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_refresh_timestamp INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_capabilities BLOB NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }
}
