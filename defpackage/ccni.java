package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccni extends dqsi {
    public static final String[] a = {"mls_zinnia_states.identity_id", "mls_zinnia_states.group_id", "mls_zinnia_states.zinnia_state"};
    public static final ccms b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new ccms();
        c = new int[]{60670};
        d = new int[]{60770, 60780};
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
        sb.append("zinnia_state BLOB NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", PRIMARY KEY (identity_id,group_id));");
        if (i < 60770 || i >= 60780) {
            return sb.toString();
        }
        return null;
    }

    public static void c(dqsy dqsyVar, int i) {
        String strB = b(i, "mls_zinnia_states");
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
