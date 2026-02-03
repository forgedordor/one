package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bulp extends dqsi {
    public static final String[] a = {"trigger_flags._id", "trigger_flags.enabled"};
    public static final bule b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bule();
        c = new int[]{58220};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("enabled INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE trigger_flags (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
