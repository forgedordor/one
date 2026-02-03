package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmvh extends dqsi {
    public static final String[] a = {"cms_media_notifications._id", "cms_media_notifications.message_cms_id", "cms_media_notifications.blob_id", "cms_media_notifications.blob_type"};
    public static final bmuq b;
    public static final int[] c;

    static {
        new ekgi().c();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_cms_id", "index_cms_media_notifications_message_cms_id");
        ekgiVar.c();
        b = new bmuq();
        c = new int[]{45010};
    }

    public static dqsy a() {
        return dqru.e("$primary");
    }

    public static void b(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("blob_type INT");
        sb.insert(0, "CREATE TABLE cms_media_notifications (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_cms_media_notifications_message_cms_id");
        arrayList.add("CREATE INDEX index_cms_media_notifications_message_cms_id ON cms_media_notifications(message_cms_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
