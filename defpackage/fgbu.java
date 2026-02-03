package defpackage;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbu implements UrlRequest$StatusListener {
    private final UrlRequest.StatusListener a;

    public fgbu(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
