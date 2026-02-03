package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bspe extends dqsi {
    public static final String[] a = {"pii_hash._id", "pii_hash.timestamp", "pii_hash.hash_value", "pii_hash.hash_key"};
    public static final ekgp b = new ekgi().c();
    public static final bson c;
    public static final int[] d;

    static {
        new ekgi().c();
        c = new bson();
        d = new int[]{57080};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static dqxa b() {
        return a().M();
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hash_value TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("hash_key TEXT");
        sb.insert(0, "CREATE TABLE pii_hash (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
