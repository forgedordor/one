package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgs {
    public static dqsq a() {
        return new dqry(btgv.c, "recent_stickers", new dqrx() { // from class: btgr
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btgv.a;
                numValueOf.getClass();
                if (i != 4010) {
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
                sb.append("sticker_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("last_used_timestamp INT DEFAULT(0)");
                sb.insert(0, "CREATE TABLE recent_stickers (");
                sb.append(", UNIQUE(sticker_id) ON CONFLICT FAIL);");
                dqsyVar.v(sb.toString());
                for (String str : (String[]) new ArrayList().toArray(new String[0])) {
                    dqsyVar.v(str);
                }
            }
        });
    }
}
