package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import j$.nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghf extends UrlRequest.Callback {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/net/cronet/AttachmentCallBack");
    private final ByteBuffer b = ByteBuffer.allocateDirect(32768);
    private final Uri c;
    private final SettableFuture d;
    private final Context e;
    private FileOutputStream f;
    private final appu g;

    public aghf(Uri uri, SettableFuture settableFuture, Context context, appu appuVar) {
        this.c = uri;
        this.d = settableFuture;
        this.e = context;
        this.g = appuVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onCanceled", 106, "AttachmentCallBack.java")).D("onCanceled %s with status code %s", this.c, urlResponseInfo == null ? "unknown" : Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
        if (!this.g.a()) {
            if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() != 401) {
                this.d.setException(new CancellationException("UrlRequest was cancelled."));
                return;
            } else {
                this.d.setException(new fbtf(Status.j.withDescription("UrlRequest was cancelled with a 401 UNAUTHORIZED error.")));
                return;
            }
        }
        if (urlResponseInfo == null) {
            this.d.setException(new fbtf(Status.c));
            return;
        }
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        int i = esnw.a;
        int i2 = 1;
        if (httpStatusCode != 200) {
            if (httpStatusCode == 409) {
                i2 = 11;
            } else if (httpStatusCode == 416) {
                i2 = 12;
            } else if (httpStatusCode == 429) {
                i2 = 9;
            } else if (httpStatusCode == 499) {
                i2 = 2;
            } else if (httpStatusCode == 501) {
                i2 = 13;
            } else if (httpStatusCode == 400) {
                i2 = 4;
            } else if (httpStatusCode == 401) {
                i2 = 17;
            } else if (httpStatusCode == 403) {
                i2 = 8;
            } else if (httpStatusCode == 404) {
                i2 = 6;
            } else if (httpStatusCode == 503) {
                i2 = 15;
            } else if (httpStatusCode == 504) {
                i2 = 5;
            } else if (httpStatusCode < 200 || httpStatusCode >= 300) {
                i2 = (httpStatusCode < 400 || httpStatusCode >= 500) ? (httpStatusCode < 500 || httpStatusCode >= 600) ? 3 : 14 : 10;
            }
        }
        this.d.setException(new fbtf(Status.fromCodeValue(i2 - 1)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) throws IOException {
        CronetException cronetException2;
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(cronetException)).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onFailed", 93, "AttachmentCallBack.java")).t("onFailed %s", this.c);
        try {
            FileOutputStream fileOutputStream = this.f;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            cronetException2 = cronetException;
        } catch (IOException unused) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleNetwork");
            cronetException2 = cronetException;
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(cronetException2)).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onFailed", 'c', "AttachmentCallBack.java")).q("Error closing file output stream");
        }
        this.d.setException(cronetException2);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws IOException {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onReadCompleted", 73, "AttachmentCallBack.java")).t("onReadCompleted %s", this.c);
        byteBuffer.flip();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.f.getChannel()).write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onResponseStarted", 59, "AttachmentCallBack.java");
        Uri uri = this.c;
        ekrdVar.B("onResponseStarted %s %s", uri, httpStatusCode);
        if (httpStatusCode != 200) {
            urlRequest.cancel();
        } else {
            this.f = new FileOutputStream(bxlf.h(uri, this.e));
            urlRequest.read(this.b);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws IOException {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onSucceeded", 82, "AttachmentCallBack.java")).t("onSucceeded %s", this.c);
        try {
            this.f.close();
        } catch (IOException e) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/net/cronet/AttachmentCallBack", "onSucceeded", 'V', "AttachmentCallBack.java")).q("Error closing file output stream");
        }
        this.d.set(this.c);
    }
}
