package defpackage;

import android.util.Log;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbn extends fggi {
    private static final String b = fggi.class.getSimpleName();
    private static boolean c;

    private fgbn(String str, Collection collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(str, collection, metrics, i, urlResponseInfo, cronetException);
    }

    static void a(fgbj fgbjVar, String str, Collection collection, fggr fggrVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        fgbjVar.c(new fgbn(str, collection, new fgde(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, -1L, -1L), i, urlResponseInfo, cronetException), fggrVar);
    }

    @Override // defpackage.fggi, org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!c) {
            Log.i(b, "RequestFinishedInfo.getMetrics() is unsupported when HttpEngineNativeProvider is used. The Metrics object will return null values.");
            c = true;
        }
        return this.a;
    }
}
