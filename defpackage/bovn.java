package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bovn extends dqsi {
    public static final String[] a = {"data_upgrade_workers._id", "data_upgrade_workers.last_update_version"};
    public static final bouw b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bouw();
        c = new int[]{58240};
    }

    public static bouo a(bvdj bvdjVar) {
        bovi boviVar = new bovi(a);
        boviVar.A("data_upgrade_workers.queryOnId");
        boviVar.q();
        bovm bovmVar = new bovm();
        bovmVar.b(bvdjVar);
        boviVar.k(new bovl(bovmVar));
        return (bouo) dqru.c(boviVar.b());
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_update_version INT DEFAULT(0)");
        sb.insert(0, "CREATE TABLE data_upgrade_workers (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
