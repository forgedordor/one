package defpackage;

import android.os.Trace;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdn implements Runnable {
    final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;

    public fgdn(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener) {
        this.a = versionSafeCallbacks$UrlRequestStatusListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ffyu("CronetUrlRequest#getStatus running callback");
        try {
            this.a.onStatus(-1);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
