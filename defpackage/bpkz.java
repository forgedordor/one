package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpkz extends dqsi {
    public static final String[] a = {"extension_messages.message_id", "extension_messages.extension_id", "extension_messages.extension_package_name"};
    public static final bpkn b;
    public static final int[] c;

    static {
        new ekgi().c();
        new ekgi().c();
        b = new bpkn();
        c = new int[]{60980};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER PRIMARY KEY NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extension_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("extension_package_name TEXT NOT NULL");
        sb.insert(0, "CREATE TABLE extension_messages (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
