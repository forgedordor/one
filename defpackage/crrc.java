package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crrc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/prefs/common/BuglePrefsPrinter");
    private static final ekhx g = ekhx.v("assistant_request_id", "ditto_active_desktop_id", "ditto_active_desktop_request_id", "firebase_instance_id", "rcs_msisdn", "usage_stats_hash_salt", "UPSELL_PROMPT_SIM_ID");
    private static final ekhx h = ekhx.s("is_fi_device_", "msisdn_for_iccid_", "rcs_user_id_");
    public final Context b;
    public final crmx c;
    public final crny d;
    public final crqv e;
    public final crqu f;

    public crrc(Context context, crmx crmxVar, crny crnyVar, crqv crqvVar, crqu crquVar) {
        this.b = context;
        this.c = crmxVar;
        this.d = crnyVar;
        this.e = crqvVar;
        this.f = crquVar;
    }

    public static void a(String str, Context context, StringBuilder sb) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        sb.append(a.a(str, "Prefs for \"", "\":\n"));
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            ekqg ekqgVarListIterator = h.listIterator();
            while (true) {
                if (!ekqgVarListIterator.hasNext()) {
                    break;
                }
                String str2 = (String) ekqgVarListIterator.next();
                if (key.startsWith(str2)) {
                    key = String.valueOf(str2).concat("[Redacted]");
                    break;
                }
            }
            sb.append(String.valueOf(key).concat(": "));
            if (value == null) {
                sb.append("null");
            } else if (value instanceof Set) {
                sb.append("is a Set");
            } else if (g.contains(key)) {
                sb.append("Redacted");
            } else if ((value instanceof String) && key.contains("phone_number")) {
                sb.append(cqcv.b(value.toString()));
            } else {
                sb.append(value);
            }
            sb.append("\n");
        }
    }
}
