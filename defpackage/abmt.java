package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmt {
    public static final cczi f;
    public static final cczi g;
    public static final cczi h;
    public static final cczv i;
    public static final cczv j;
    public static final cczi k;
    private static final ekgp l = ekgp.o("prod", "https://messages.google.com/web/", "preprod", "https://messages-web-preprod.sandbox.google.com/web/", "staging", "https://messages-web-staging.sandbox.google.com/web/", "autopush", "https://messages-web-autopush.sandbox.google.com/web/");
    public static final cczi a = cdag.l(cdag.b, "ditto_satellite_env", "prod");
    public static final cczi b = cdag.l(cdag.b, "ditto_sandbox_test_key", "");
    public static final cczv c = cdag.m(cdag.b, "ditto_satellite_enabled", false);
    public static final cczv d = cdag.m(cdag.b, "ditto_satellite_force_disabled", false);
    public static final cczv e = cdag.m(cdag.b, "ditto_satellite_force_wifi_only_mode", false);

    static {
        cdag.m(cdag.b, "ditto_satellite_chrome_debugging_enabled", false);
        f = cdag.f(cdag.b, "fail_to_load_timeout_millis", TimeUnit.SECONDS.toMillis(5L));
        g = cdag.f(cdag.b, "js_bridge_default_timeout_millis", 500L);
        h = cdag.f(cdag.b, "js_bridge_long_timeout_millis", TimeUnit.SECONDS.toMillis(5L));
        i = cdag.m(cdag.b, "is_tablet_form_factor", false);
        j = cdag.m(cdag.b, "is_phone_form_factor", false);
        k = cdag.f(cdag.b, "ditto_satellite_attachments_size_limit", 5242880L);
    }

    public static Uri.Builder a() {
        String str = (String) a.e();
        ekgp ekgpVar = l;
        if (ekgpVar.containsKey(str)) {
            return Uri.parse((String) ekgpVar.get(str)).buildUpon();
        }
        throw new abms(str);
    }

    public static Uri.Builder b(Uri.Builder builder) {
        cczi ccziVar = b;
        return TextUtils.isEmpty((CharSequence) ccziVar.e()) ? builder : builder.appendQueryParameter("test_key", (String) ccziVar.e());
    }

    public static Uri c(abgl abglVar) {
        Uri.Builder builderA = a();
        if (!abglVar.b()) {
            builderA = builderA.appendPath("conversations").appendPath(abglVar.a());
        }
        return b(builderA).build();
    }

    public static String d() {
        return e(new abgl(""));
    }

    public static String e(abgl abglVar) {
        return c(abglVar).toString();
    }

    public static int f() {
        if (((Boolean) i.e()).booleanValue()) {
            return 3;
        }
        return ((Boolean) j.e()).booleanValue() ? 2 : 1;
    }
}
