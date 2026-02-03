package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpbc extends dqsi {
    public static final String[] a = {"disambiguations.lookup_key", "disambiguations.normalized_destination"};
    public static final bpan b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bpan();
        c = new int[]{10015};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("lookup_key TEXT UNIQUE ON CONFLICT REPLACE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("normalized_destination TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static String[] c() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void d(dqsy dqsyVar) {
        dqsyVar.v(b("disambiguations"));
        for (String str : c()) {
            dqsyVar.v(str);
        }
    }
}
