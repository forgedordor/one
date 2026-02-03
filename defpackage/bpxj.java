package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpxj extends dqsi {
    public static final String[] a = {"link_preview._id", "link_preview.message_id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed", "link_preview.deferred"};
    public static final ekgp b;
    public static final bpwi c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("link_preview.link_preview_prevented", 21010);
        ekgiVar.i("link_preview.link_preview_failed", 22020);
        ekgiVar.i("link_preview.deferred", 61000);
        b = ekgiVar.c();
        new ekgi().c();
        c = new bpwi();
        d = new int[]{21010, 22020, 61000};
    }

    public static bpvh a() {
        bpvi bpviVar = new bpvi();
        bpviVar.aF();
        return bpviVar;
    }

    public static final bpxe b() {
        String[] strArr;
        Integer numD = d();
        if (numD.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("link_preview._id");
            ekfwVar.h("link_preview.message_id");
            ekfwVar.h("link_preview.trigger_url");
            ekfwVar.h("link_preview.expiration_time_millis");
            ekfwVar.h("link_preview.link_title");
            ekfwVar.h("link_preview.link_description");
            ekfwVar.h("link_preview.link_image_url");
            ekfwVar.h("link_preview.link_domain");
            ekfwVar.h("link_preview.link_canonical_url");
            if (numD.intValue() >= 21010) {
                ekfwVar.h("link_preview.link_preview_prevented");
            }
            if (numD.intValue() >= 22020) {
                ekfwVar.h("link_preview.link_preview_failed");
            }
            if (numD.intValue() >= 61000) {
                ekfwVar.h("link_preview.deferred");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bpxe(strArr);
    }

    public static dqsy c() {
        return dqru.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(g().a());
    }

    public static String e(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages(_id) ON DELETE CASCADE ");
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
        if (i >= 21010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("link_preview_prevented INTEGER DEFAULT(0)");
        }
        if (i >= 22020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("link_preview_failed INTEGER DEFAULT(0)");
        }
        if (i >= 61000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("deferred INTEGER DEFAULT(0)");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void f(dqsy dqsyVar, int i) {
        dqru.K(dqsyVar, "link_preview", e(i, "TEMP___link_preview"), a, h());
    }

    public static dqxa g() {
        return c().M();
    }

    static String[] h() {
        return (String[]) new ArrayList().toArray(new String[0]);
    }
}
