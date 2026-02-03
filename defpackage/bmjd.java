package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmjd extends dqsi {
    public static final String[] a = {"add_contact_banner._id", "add_contact_banner.conversation_id", "add_contact_banner.banner_status"};
    public static final bmim b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bmim();
        c = new int[]{26020};
        d = new int[]{58160};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER UNIQUE ON CONFLICT FAIL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("banner_status INT DEFAULT(0)");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    static String[] c() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }

    public static void d(dqsy dqsyVar) {
        dqsyVar.v(b("add_contact_banner"));
        for (String str : c()) {
            dqsyVar.v(str);
        }
    }
}
