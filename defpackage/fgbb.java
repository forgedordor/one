package defpackage;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbb implements BidirectionalStream$Callback {
    public fgbc a;
    private final BidirectionalStream.Callback b;

    public fgbb(BidirectionalStream.Callback callback) {
        this.b = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        fgbw fgbwVarA = fgbw.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, fgbwVarA);
        } finally {
            this.a.a(2, fgbwVarA, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        fgbw fgbwVarA = fgbw.a(urlResponseInfo);
        CronetException cronetExceptionB = fgcq.b(httpException);
        try {
            this.b.onFailed(this.a, fgbwVarA, cronetExceptionB);
        } finally {
            this.a.a(1, fgbwVarA, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, fgbw.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, fgbw.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, fgbw.a(urlResponseInfo), new fgbe(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        fgbw fgbwVarA = fgbw.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, fgbwVarA);
        } finally {
            this.a.a(0, fgbwVarA, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, fgbw.a(urlResponseInfo), byteBuffer, z);
    }
}
