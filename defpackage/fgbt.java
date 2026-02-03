package defpackage;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbt implements UrlRequest$Callback {
    public final UrlRequest.Callback a;
    public fgbv b;

    public fgbt(UrlRequest.Callback callback) {
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        fgbw fgbwVarB = fgbw.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, fgbwVarB);
        } finally {
            this.b.a(2, fgbwVarB, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        fgbw fgbwVarB = fgbw.b(urlResponseInfo);
        CronetException cronetExceptionB = fgcq.b(httpException);
        try {
            this.a.onFailed(this.b, fgbwVarB, cronetExceptionB);
        } finally {
            this.b.a(1, fgbwVarB, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) throws Exception {
        fgcq.a(new fgcp() { // from class: fgbr
            @Override // defpackage.fgcp
            public final Object a() {
                fgbt fgbtVar = this.a;
                fgbtVar.a.onReadCompleted(fgbtVar.b, fgbw.b(urlResponseInfo), byteBuffer);
                return null;
            }
        }, Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String str) throws Exception {
        fgcq.a(new fgcp() { // from class: fgbs
            @Override // defpackage.fgcp
            public final Object a() {
                fgbt fgbtVar = this.a;
                fgbtVar.a.onRedirectReceived(fgbtVar.b, fgbw.b(urlResponseInfo), str);
                return null;
            }
        }, Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) throws Exception {
        fgcq.a(new fgcp() { // from class: fgbq
            @Override // defpackage.fgcp
            public final Object a() {
                fgbt fgbtVar = this.a;
                fgbtVar.a.onResponseStarted(fgbtVar.b, fgbw.b(urlResponseInfo));
                return null;
            }
        }, Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        fgbw fgbwVarB = fgbw.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, fgbwVarB);
        } finally {
            this.b.a(0, fgbwVarB, null);
        }
    }
}
