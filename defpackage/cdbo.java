package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdbo extends dqsi {
    public static final String[] a = {"external_capabilities.external_application", "external_capabilities.capability_key", "external_capabilities.capability_value", "external_capabilities.expiry"};
    public static final cdbc b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new cdbc();
        c = new int[]{60860};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("external_application INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("capability_key TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("capability_value TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiry INTEGER NOT NULL");
        sb.insert(0, "CREATE TABLE external_capabilities (");
        sb.append(", PRIMARY KEY (external_application,capability_key)");
        sb.append(", CHECK (" + new dqxl("length($R) > 0 ", new Object[]{"capability_key"}).ai(dqxp.b()) + ")");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
