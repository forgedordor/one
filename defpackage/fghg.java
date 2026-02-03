package defpackage;

import android.os.Trace;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fghg extends UrlRequest.Callback {
    final /* synthetic */ fghh a;

    public fghg(fghh fghhVar) {
        this.a = fghhVar;
    }

    private final void a(IOException iOException) {
        fghh fghhVar = this.a;
        fghhVar.f = iOException;
        fghj fghjVar = fghhVar.c;
        if (fghjVar != null) {
            fghjVar.c = iOException;
            fghjVar.a = true;
            fghjVar.b = null;
        }
        fghk fghkVar = fghhVar.d;
        if (fghkVar != null) {
            fghkVar.d = iOException;
            fghkVar.f = true;
        }
        fghhVar.o = true;
        fghhVar.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new ffyu("CronetHttpURLConnection.CronetUrlRequestCallback#onCanceled");
        try {
            this.a.e = urlResponseInfo;
            a(new IOException("disconnect() called"));
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        new ffyu("CronetHttpURLConnection.CronetUrlRequestCallback#onFailed");
        try {
            if (cronetException == null) {
                throw new IllegalStateException("Exception cannot be null in onFailed.");
            }
            this.a.e = urlResponseInfo;
            a(cronetException);
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        new ffyu("CronetHttpURLConnection.CronetUrlRequestCallback#onReadCompleted");
        try {
            fghh fghhVar = this.a;
            fghhVar.e = urlResponseInfo;
            fghhVar.a.c();
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        boolean zEquals;
        new ffyu("CronetHttpURLConnection.CronetUrlRequestCallback#onRedirectReceived");
        try {
            fghh fghhVar = this.a;
            fghhVar.g = true;
            try {
                URL url = new URL(str);
                zEquals = url.getProtocol().equals(fghhVar.url.getProtocol());
                if (fghhVar.instanceFollowRedirects) {
                    fghhVar.url = url;
                }
            } catch (MalformedURLException unused) {
            }
            if (fghhVar.instanceFollowRedirects && zEquals) {
                fghhVar.b.followRedirect();
            } else {
                fghh fghhVar2 = this.a;
                fghhVar2.e = urlResponseInfo;
                fghhVar2.b.cancel();
                a(null);
            }
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new ffyu("CronetHttpURLConnection.CronetUrlRequestCallback#onResponseStarted");
        try {
            fghh fghhVar = this.a;
            fghhVar.e = urlResponseInfo;
            fghhVar.o = true;
            fghhVar.a.c();
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        new ffyu("CronetHttpURLConnection.CronetUrlRequestCallback#onSucceeded");
        try {
            this.a.e = urlResponseInfo;
            a(null);
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
