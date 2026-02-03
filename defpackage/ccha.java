package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccha extends dqsi {
    public static final String[] a = {"mls_key_packages._id", "mls_key_packages.key_package", "mls_key_packages.expiration_timestamp"};
    public static final ccgk b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new ccgk();
        c = new int[]{60520};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id BLOB PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("key_package BLOB NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiration_timestamp INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE mls_key_packages (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
