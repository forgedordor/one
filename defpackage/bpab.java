package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpab extends dqsi {
    public static final String[] a = {"desktop._id", "desktop.desktop_id", "desktop.last_connection_time", "desktop.last_wakeup_time", "desktop.wakeup_attempts_count", "desktop.fingerprint", "desktop.force_refresh", "desktop.client_info", "desktop.operating_system", "desktop.operating_system_version", "desktop.browser_type", "desktop.encryption_key", "desktop.hmac_key", "desktop.backend_type", "desktop.is_active", "desktop.request_id", "desktop.is_persistent", "desktop.desktop_type", "desktop.pairing_type", "desktop.destination_registration_id", "desktop.gaia_email", "desktop.creation_time", "desktop.get_updates_request_time_millis"};
    public static final ekgp b;
    public static final boyn c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("desktop.operating_system", 22040);
        ekgiVar.i("desktop.operating_system_version", 22040);
        ekgiVar.i("desktop.browser_type", 18020);
        ekgiVar.i("desktop.encryption_key", 21030);
        ekgiVar.i("desktop.hmac_key", 21030);
        ekgiVar.i("desktop.backend_type", 41010);
        ekgiVar.i("desktop.is_active", 58010);
        ekgiVar.i("desktop.request_id", 58010);
        ekgiVar.i("desktop.is_persistent", 58010);
        ekgiVar.i("desktop.desktop_type", 58010);
        ekgiVar.i("desktop.pairing_type", 58960);
        ekgiVar.i("desktop.destination_registration_id", 59290);
        ekgiVar.i("desktop.gaia_email", 59560);
        ekgiVar.i("desktop.creation_time", 59870);
        ekgiVar.i("desktop.get_updates_request_time_millis", 60540);
        b = ekgiVar.c();
        new ekgi().c();
        c = new boyn();
        d = new int[]{15020, 18020, 20020, 21030, 22040, 41010, 58010, 58960, 59290, 59560, 59870, 60540};
    }

    public static final bozw a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("desktop._id");
            ekfwVar.h("desktop.desktop_id");
            ekfwVar.h("desktop.last_connection_time");
            ekfwVar.h("desktop.last_wakeup_time");
            ekfwVar.h("desktop.wakeup_attempts_count");
            ekfwVar.h("desktop.fingerprint");
            ekfwVar.h("desktop.force_refresh");
            ekfwVar.h("desktop.client_info");
            if (numC.intValue() >= 22040) {
                ekfwVar.h("desktop.operating_system");
            }
            if (numC.intValue() >= 22040) {
                ekfwVar.h("desktop.operating_system_version");
            }
            if (numC.intValue() >= 18020) {
                ekfwVar.h("desktop.browser_type");
            }
            if (numC.intValue() >= 21030) {
                ekfwVar.h("desktop.encryption_key");
            }
            if (numC.intValue() >= 21030) {
                ekfwVar.h("desktop.hmac_key");
            }
            if (numC.intValue() >= 41010) {
                ekfwVar.h("desktop.backend_type");
            }
            if (numC.intValue() >= 58010) {
                ekfwVar.h("desktop.is_active");
            }
            if (numC.intValue() >= 58010) {
                ekfwVar.h("desktop.request_id");
            }
            if (numC.intValue() >= 58010) {
                ekfwVar.h("desktop.is_persistent");
            }
            if (numC.intValue() >= 58010) {
                ekfwVar.h("desktop.desktop_type");
            }
            if (numC.intValue() >= 58960) {
                ekfwVar.h("desktop.pairing_type");
            }
            if (numC.intValue() >= 59290) {
                ekfwVar.h("desktop.destination_registration_id");
            }
            if (numC.intValue() >= 59560) {
                ekfwVar.h("desktop.gaia_email");
            }
            if (numC.intValue() >= 59870) {
                ekfwVar.h("desktop.creation_time");
            }
            if (numC.intValue() >= 60540) {
                ekfwVar.h("desktop.get_updates_request_time_millis");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bozw(strArr);
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
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("desktop_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_connection_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_wakeup_time INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("wakeup_attempts_count INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("fingerprint TEXT DEFAULT('') NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("force_refresh INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("client_info BLOB");
        if (i >= 22040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("operating_system TEXT DEFAULT('') NOT NULL");
        }
        if (i >= 22040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("operating_system_version TEXT DEFAULT('') NOT NULL");
        }
        if (i >= 18020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("browser_type INT DEFAULT(0)");
        }
        if (i >= 20020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("needs_unpairing INT DEFAULT(0)");
        }
        if (i >= 21030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("encryption_key BLOB");
        }
        if (i >= 21030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("hmac_key BLOB");
        }
        if (i >= 41010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("backend_type INT");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_active INT DEFAULT(0)");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("request_id TEXT DEFAULT('')");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_persistent INT DEFAULT(0)");
        }
        if (i >= 58010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("desktop_type INT DEFAULT(0)");
        }
        if (i >= 58960) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("pairing_type INT DEFAULT(0)");
        }
        if (i >= 59290) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("destination_registration_id BLOB");
        }
        if (i >= 59560) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("gaia_email TEXT");
        }
        if (i >= 59870) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("creation_time INT DEFAULT(0)");
        }
        if (i >= 60540) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("get_updates_request_time_millis INT DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE desktop (");
        sb.append(");");
        dqsyVar.v(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dqsyVar.v(str);
        }
    }

    public static dqxa e() {
        return b().M();
    }
}
