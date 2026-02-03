package defpackage;

import android.content.Context;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dewf implements Runnable {
    private static final int a = Math.max(2, eonc.a(((Long) dfnr.a().b.i.a()).longValue()));
    public final String b;
    public final Context c;
    public dewi d;
    private int e = 0;
    private int f = 1;

    public dewf(String str, Context context, dewi dewiVar) {
        this.b = str;
        this.c = context;
        this.d = dewiVar;
    }

    private static int g() {
        return Math.max(1, eonc.a(((Long) dfnr.a().b.j.a()).longValue()));
    }

    private final void h(Integer num) {
        if (e()) {
            int iIntValue = num != null ? num.intValue() : -1;
            if (!dhia.h()) {
                dhja.d(dhia.a, "Analytics are disabled. Ignoring UMA histogram %s", "RcsEngine.BusinessInfo.Retrieval.Failed.Counts");
                return;
            }
            dbzq dbzqVar = dhia.b;
            dbzqVar.getClass();
            dbzqVar.d("RcsEngine.BusinessInfo.Retrieval.Failed.Counts").a(iIntValue, 1L, dbzq.b);
            dhia.f();
        }
    }

    private final void i(int i, Integer num) {
        if (!e() || i == Integer.MIN_VALUE) {
            return;
        }
        if (num == null || num.intValue() != 200) {
            dhia.c(i);
        } else {
            dhia.g(i);
        }
    }

    protected abstract dewi a(HttpsURLConnection httpsURLConnection);

    public abstract String b();

    public abstract String c();

    protected abstract void d(HttpsURLConnection httpsURLConnection);

    protected abstract boolean e();

    public HttpsURLConnection f(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setDoInput(true);
        return httpsURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dewf.run():void");
    }
}
