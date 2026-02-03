package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmxa extends dqsi {
    public static final String[] a = {"cms_notifications.cms_id", "cms_notifications.cms_last_mod_seq", "cms_notifications.cms_correlation_id", "cms_notifications.from_address", "cms_notifications.to_address", "cms_notifications.correlation_text", "cms_notifications.modified_at_timestamp", "cms_notifications.message_received_timestamp"};
    public static final bmwf b;
    public static final int[] c;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("cms_notifications.message_received_timestamp", 46040);
        ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("correlation_text", "index_cms_notifications_correlation_text");
        ekgiVar2.c();
        b = new bmwf();
        c = new int[]{38000, 46040};
    }

    public static final bmwx a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("cms_notifications.cms_id");
            ekfwVar.h("cms_notifications.cms_last_mod_seq");
            ekfwVar.h("cms_notifications.cms_correlation_id");
            ekfwVar.h("cms_notifications.from_address");
            ekfwVar.h("cms_notifications.to_address");
            ekfwVar.h("cms_notifications.correlation_text");
            ekfwVar.h("cms_notifications.modified_at_timestamp");
            if (numC.intValue() >= 46040) {
                ekfwVar.h("cms_notifications.message_received_timestamp");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bmwx(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dqsy dqsyVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT PRIMARY KEY");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_last_mod_seq INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("from_address TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("to_address TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("correlation_text TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("modified_at_timestamp INTEGER DEFAULT(0)");
        if (i >= 46040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_received_timestamp INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE cms_notifications (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_notifications_correlation_text");
        arrayList.add("CREATE INDEX index_cms_notifications_correlation_text ON cms_notifications(correlation_text);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
