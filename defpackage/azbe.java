package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azbe extends dqsi {
    public static final String[] a = {"link_preview_backup._id", "link_preview_backup.message_id", "link_preview_backup.trigger_url", "link_preview_backup.expiration_time_millis", "link_preview_backup.link_title", "link_preview_backup.link_description", "link_preview_backup.link_image_url", "link_preview_backup.link_domain", "link_preview_backup.link_canonical_url"};
    public static final ekgp b = new ekgi().c();
    public static final azai c;
    public static final int[] d;

    static {
        new ekgi().c();
        c = new azai();
        d = new int[]{120};
    }

    public static dqsy a() {
        return dqru.e("backup");
    }

    public static dqxa b() {
        return a().M();
    }

    public static void c(dqsy dqsyVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("trigger_url TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("expiration_time_millis INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_title TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_description TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_image_url TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_domain TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("link_canonical_url TEXT");
        sb.insert(0, "CREATE TABLE link_preview_backup (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }
}
