package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjq {
    public final Bundle a;

    public esjq(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static String f(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean i(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(j("gcm.n.e")));
    }

    private static String j(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public final Bundle a() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final Integer b(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strE));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + f(str) + "(" + strE + ") into an int");
            return null;
        }
    }

    public final String c(Resources resources, String str, String str2) {
        String[] strArr;
        String strE = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        int identifier = resources.getIdentifier(strE, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", f(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayG = g(str2.concat("_loc_args"));
        if (jSONArrayG == null) {
            strArr = null;
        } else {
            int length = jSONArrayG.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayG.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + f(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public final String d(Resources resources, String str, String str2) {
        String strE = e(str2);
        return !TextUtils.isEmpty(strE) ? strE : c(resources, str, str2);
    }

    public final String e(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strJ = j(str);
            if (bundle.containsKey(strJ)) {
                str = strJ;
            }
        }
        return bundle.getString(str);
    }

    public final JSONArray g(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return new JSONArray(strE);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + f(str) + ": " + strE + ", falling back to default");
            return null;
        }
    }

    public final boolean h(String str) {
        String strE = e(str);
        return "1".equals(strE) || Boolean.parseBoolean(strE);
    }
}
