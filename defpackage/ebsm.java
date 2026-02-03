package defpackage;

import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebsm {
    private static final eksp a = eksp.c("UrlChecker");
    private static final Pattern b = Pattern.compile("(\\.|%2e){2,}|%u", 2);

    protected abstract boolean a(String str);

    public final boolean b(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        Pattern pattern = ebsl.a;
        Uri.Builder builderEncodedFragment = uri.buildUpon().encodedFragment(null);
        if (uri.isHierarchical()) {
            builderEncodedFragment.clearQuery();
        }
        String string = builderEncodedFragment.build().toString();
        if (b.matcher(string).find()) {
            ((eksl) a.n().h("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 78, "UrlChecker.java")).t("'..' and '%%u' are not allowed in '%s'", ebsl.a(uri));
            return false;
        }
        if ((!ejwk.c(uri.getHost()) && "https".equalsIgnoreCase(uri.getScheme())) || URLUtil.isAssetUrl(string) || URLUtil.isAboutUrl(string) || string.startsWith("file:///android_res/")) {
            return a(string);
        }
        ((eksl) a.n().h("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 88, "UrlChecker.java")).t("Url '%s' is not allowed (empty host/non-https or non resource/asset/about url)", ebsl.a(uri));
        return false;
    }
}
