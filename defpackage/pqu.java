package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pqu extends pqb {
    private final Pattern b = Pattern.compile("\\A\\d+");

    @Override // defpackage.pqc
    public final boolean d() {
        boolean zD = super.d();
        if (!zD || Build.VERSION.SDK_INT >= 29) {
            return zD;
        }
        Uri uri = pps.a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.b.matcher(currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
