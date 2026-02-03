package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bufd {
    public static dqsq a() {
        return new dqry(bufg.c, "sticker_sets_localization", new dqrx() { // from class: bufc
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bufg.a;
                numValueOf.getClass();
                if (i != 13010) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_set_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("locale TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("display_name TEXT");
                sb.insert(0, "CREATE TABLE sticker_sets_localization (");
                sb.append(", FOREIGN KEY (sticker_set_id) REFERENCES sticker_sets (sticker_set_id) ON DELETE CASCADE PRIMARY KEY (sticker_set_id,locale));");
                dqsyVar.v(sb.toString());
                for (String str : (String[]) new ArrayList().toArray(new String[0])) {
                    dqsyVar.v(str);
                }
            }
        });
    }
}
