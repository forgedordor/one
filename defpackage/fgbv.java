package defpackage;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbv extends ExperimentalUrlRequest {
    private final UrlRequest a;
    private final fgbj b;
    private final String c;
    private final Collection d;
    private final fggr e;

    public fgbv(UrlRequest urlRequest, fgbj fgbjVar, String str, Collection collection, RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = fgbjVar;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new fggr(listener);
    }

    final void a(int i, fgbw fgbwVar, CronetException cronetException) {
        fgbn.a(this.b, this.c, this.d, this.e, i, fgbwVar, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new fgbu(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
