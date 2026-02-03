package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccen extends dqsi {
    public static final String[] a = {"mls_epoch_records.identity_id", "mls_epoch_records.group_id", "mls_epoch_records.epoch_id", "mls_epoch_records.epoch_data", "mls_epoch_records.creation_timestamp"};
    public static final ccdq b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new ccdq();
        c = new int[]{60620};
        d = new int[]{60660, 60670};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("identity_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("group_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("epoch_id INTEGER NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("epoch_data BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("creation_timestamp INTEGER NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (identity_id,group_id,epoch_id));");
        if (i < 60660 || i >= 60670) {
            return sb.toString();
        }
        return null;
    }

    public static void c(dqsy dqsyVar, int i) {
        String strB = b(i, "mls_epoch_records");
        if (strB == null) {
            return;
        }
        dqsyVar.v(strB);
        for (String str : d()) {
            dqsyVar.v(str);
        }
    }

    static String[] d() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }
}
