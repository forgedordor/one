package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btbt extends dqsi {
    public static final String[] a = {"read_reports._id", "read_reports.message_id", "read_reports.participant_id", "read_reports.receive_time", "read_reports.read_time", "read_reports.ftd_time"};
    public static final ekgp b;
    public static final btba c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("read_reports.ftd_time", 58880);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("message_id", "index_read_reports_message_id");
        ekgiVar2.c();
        c = new btba();
        d = new int[]{10008, 58880};
    }

    public static btak a() {
        btal btalVar = new btal();
        btalVar.aF();
        return btalVar;
    }

    public static final btbo b() {
        String[] strArr;
        Integer numD = d();
        if (numD.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("read_reports._id");
            ekfwVar.h("read_reports.message_id");
            ekfwVar.h("read_reports.participant_id");
            ekfwVar.h("read_reports.receive_time");
            ekfwVar.h("read_reports.read_time");
            if (numD.intValue() >= 58880) {
                ekfwVar.h("read_reports.ftd_time");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new btbo(strArr);
    }

    public static dqsy c() {
        return dqru.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(f().a());
    }

    public static void e(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("receive_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read_time INT DEFAULT(0)");
        if (i >= 58880) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("ftd_time INTEGER DEFAULT(-1)");
        }
        sb.insert(0, "CREATE TABLE read_reports (");
        sb.append(", UNIQUE(message_id,participant_id) ON CONFLICT FAIL FOREIGN KEY (message_id) REFERENCES messages (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE SET NULL);");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_read_reports_message_id");
        arrayList.add("CREATE INDEX index_read_reports_message_id ON read_reports(message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa f() {
        return c().M();
    }
}
