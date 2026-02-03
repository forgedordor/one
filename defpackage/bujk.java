package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bujk {
    public static dqsq a() {
        return new dqry(bujn.c, "stickers", new dqrx() { // from class: bujj
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bujn.a;
                numValueOf.getClass();
                if (i != 5000) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_set_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("icon_uri_static TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("icon_uri_animated TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("display_name TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("display_order INT DEFAULT(0)");
                sb.insert(0, "CREATE TABLE stickers (");
                sb.append(", FOREIGN KEY (sticker_set_id) REFERENCES sticker_sets (sticker_set_id) ON DELETE CASCADE);");
                dqsyVar.v(sb.toString());
                for (String str : (String[]) new ArrayList().toArray(new String[0])) {
                    dqsyVar.v(str);
                }
            }
        });
    }
}
