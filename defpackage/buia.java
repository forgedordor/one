package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buia {
    public static dqsq a() {
        return new dqry(buid.c, "stickers_localization", new dqrx() { // from class: buhz
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = buid.a;
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
                sb.append("sticker_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("locale TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("display_name TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_local_id INTEGER");
                sb.insert(0, "CREATE TABLE stickers_localization (");
                sb.append(", FOREIGN KEY (sticker_set_id) REFERENCES sticker_sets (sticker_set_id) ON DELETE SET DEFAULT FOREIGN KEY (sticker_local_id) REFERENCES sticker_sets (_id) ON DELETE CASCADE PRIMARY KEY (sticker_set_id,sticker_id,locale));");
                dqsyVar.v(sb.toString());
                for (String str : (String[]) new ArrayList().toArray(new String[0])) {
                    dqsyVar.v(str);
                }
            }
        });
    }
}
