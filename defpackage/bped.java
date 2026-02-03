package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bped extends dqsi {
    public static final String[] a = {"emergency_questionnaire_option.message_id", "emergency_questionnaire_option.option_id"};
    public static final bpdn b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_emergency_questionnaire_option_message_id");
        ekgiVar.c();
        b = new bpdn();
        c = new int[]{60800, 60900};
        d = new int[]{60970};
    }

    public static final bpdy a(String str) {
        bpdy bpdyVar = new bpdy(a);
        bpdyVar.A(str);
        return bpdyVar;
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static void c(dqsy dqsyVar, int i) {
        dqsyVar.v(e("emergency_questionnaire_option"));
        for (String str : d(i)) {
            dqsyVar.v(str);
        }
    }

    static String[] d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 60900) {
            arrayList.add("DROP INDEX IF EXISTS index_emergency_questionnaire_option_message_id");
            arrayList.add("CREATE INDEX index_emergency_questionnaire_option_message_id ON emergency_questionnaire_option(message_id);");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("option_id TEXT NOT NULL");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(message_id,option_id) ON CONFLICT FAIL);");
        return sb.toString();
    }
}
