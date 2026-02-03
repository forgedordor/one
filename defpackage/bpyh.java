package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpyh extends dqsi {
    public static final String[] a = {"linked_account.account_id"};
    public static final ekgp b = new ekgi().c();
    public static final bpxt c;
    public static final int[] d;

    static {
        new ekgi().c();
        c = new bpxt();
        d = new int[]{35080};
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
        sb.append("account_id INT PRIMARY KEY");
        sb.insert(0, "CREATE TABLE linked_account (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
