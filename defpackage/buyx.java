package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buyx extends dqsi {
    public static final String[] a = {"user_references._id", "user_references.message_id", "user_references.user_ref_id", "user_references.user_ref_datetime"};
    public static final ekgp b = new ekgi().c();
    public static final buyd c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_user_references_message_id");
        ekgiVar.c();
        c = new buyd();
        d = new int[]{10014};
        e = new int[]{57030};
    }

    public static buxr a() {
        buxs buxsVar = new buxs();
        buxsVar.aF();
        return buxsVar;
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static dqxa c() {
        return b().M();
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("user_ref_id INTEGER NOT NULL REFERENCES participants(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("user_ref_datetime INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(message_id,user_ref_id) ON CONFLICT FAIL);");
        return sb.toString();
    }

    static String[] e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_user_references_message_id");
        arrayList.add("CREATE INDEX index_user_references_message_id ON user_references(message_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void f(dqsy dqsyVar) {
        dqsyVar.v(d("user_references"));
        for (String str : e()) {
            dqsyVar.v(str);
        }
    }
}
