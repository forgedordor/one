package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btwx extends dqsi {
    public static final String[] a = {"satellite_emergency_details.message_id", "satellite_emergency_details.help_state"};
    public static final btwl b;
    public static final int[] c;
    public static final int[] d;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_id", "index_satellite_emergency_details_message_id");
        ekgiVar.c();
        b = new btwl();
        c = new int[]{59950};
        d = new int[]{59960};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("help_state INT DEFAULT(1) NOT NULL");
        sb.insert(0, "CREATE TABLE satellite_emergency_details (");
        sb.append(");");
        String string = i >= 59960 ? null : sb.toString();
        if (string == null) {
            return;
        }
        dqsyVar.v(string);
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_satellite_emergency_details_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_satellite_emergency_details_message_id ON satellite_emergency_details(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
