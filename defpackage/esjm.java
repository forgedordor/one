package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjm implements Closeable {
    public final URL a;
    public volatile Future b;
    public defn c;

    private esjm(URL url) {
        this.a = url;
    }

    public static esjm a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new esjm(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }
}
