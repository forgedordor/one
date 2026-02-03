package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azru extends dqsi {
    public static final String[] a = {"my_identities_backup.token", "my_identities_backup.address_type", "my_identities_backup.phone_number", "my_identities_backup.display_name"};
    public static final azrd b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new azrd();
        c = new int[]{110};
    }

    public static dqsy a() {
        return dqru.e("backup");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("token TEXT PRIMARY KEY NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("address_type INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("phone_number TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("display_name TEXT");
        sb.insert(0, "CREATE TABLE my_identities_backup (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
