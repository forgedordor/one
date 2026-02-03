package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bukt extends dqsi {
    public static final String[] a = {"supersort_labels._id", "supersort_labels.name", "supersort_labels.status"};
    public static final bukd b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bukd();
        c = new int[]{53020};
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
        sb.append("name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER");
        sb.insert(0, "CREATE TABLE supersort_labels (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
