package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eydj extends UrlRequest.Callback {
    public final eosa a;
    private final ExecutorService b;
    private final eydi c;
    private final eydg d;

    public eydj(ExecutorService executorService) {
        eydg eydgVar = new eydg();
        this.b = executorService;
        eydi eydiVar = new eydi();
        this.c = eydiVar;
        this.a = new eosa(eydiVar);
        this.d = eydgVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.a = new eycy(new eycx(eycw.CANCELED, ""));
        this.b.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        boolean z = cronetException instanceof NetworkException;
        eycw eycwVar = eycw.UNKNOWN;
        if (z) {
            switch (((NetworkException) cronetException).getErrorCode()) {
                case 1:
                    eycwVar = eycw.BAD_URL;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    eycwVar = eycw.CONNECTION_ERROR;
                    break;
            }
        }
        eycx eycxVar = new eycx(eycwVar, cronetException);
        this.c.a = new eycy(eycxVar);
        this.b.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        eydg eydgVar = this.d;
        ejwl.l(!eydgVar.b);
        ArrayDeque arrayDeque = eydgVar.a;
        if (byteBuffer != arrayDeque.peekLast()) {
            arrayDeque.addLast(byteBuffer);
        }
        if (!byteBuffer.hasRemaining()) {
            byteBuffer = ByteBuffer.allocateDirect(8192);
        }
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponseStarted(org.chromium.net.UrlRequest r10, org.chromium.net.UrlResponseInfo r11) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            eydg r0 = r9.d
            boolean r0 = r0.b
            r1 = 1
            r0 = r0 ^ r1
            defpackage.ejwl.l(r0)
            java.util.Map r11 = r11.getAllHeaders()
            java.lang.String r0 = "content-length"
            boolean r2 = r11.containsKey(r0)
            r3 = 524288(0x80000, double:2.590327E-318)
            if (r2 == 0) goto L5d
            r2 = 0
            r5 = 0
            java.lang.Object r0 = r11.get(r0)     // Catch: java.lang.NumberFormatException -> L2c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.NumberFormatException -> L2c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L2c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L2c
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L2c
            goto L2d
        L2c:
            r7 = r5
        L2d:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L5d
            java.lang.String r0 = "content-encoding"
            boolean r5 = r11.containsKey(r0)
            if (r5 == 0) goto L59
            java.lang.Object r5 = r11.get(r0)
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r5 != r1) goto L57
            java.lang.Object r11 = r11.get(r0)
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r0 = "identity"
            boolean r11 = j$.util.Objects.equals(r11, r0)
            if (r11 != 0) goto L59
        L57:
            long r7 = r7 + r7
            goto L5e
        L59:
            r0 = 1
            long r7 = r7 + r0
            goto L5e
        L5d:
            r7 = r3
        L5e:
            long r0 = java.lang.Math.min(r7, r3)
            int r11 = (int) r0
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r11)
            r10.read(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eydj.onResponseStarted(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBufferAllocateDirect;
        eyce eyceVar = new eyce();
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            eyceVar.d(entry.getKey(), entry.getValue());
        }
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        eydg eydgVar = this.d;
        ejwl.l(!eydgVar.b);
        eydgVar.b = true;
        ArrayDeque arrayDeque = eydgVar.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((ByteBuffer) it.next()).flip();
        }
        if (arrayDeque.isEmpty()) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        } else if (arrayDeque.size() == 1) {
            byteBufferAllocateDirect = (ByteBuffer) arrayDeque.remove();
        } else {
            Iterator it2 = arrayDeque.iterator();
            int iRemaining = 0;
            while (it2.hasNext()) {
                iRemaining += ((ByteBuffer) it2.next()).remaining();
            }
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iRemaining);
            while (!arrayDeque.isEmpty()) {
                byteBufferAllocateDirect2.put((ByteBuffer) arrayDeque.remove());
            }
            byteBufferAllocateDirect2.flip();
            byteBufferAllocateDirect = byteBufferAllocateDirect2;
        }
        byteBufferAllocateDirect.position(0);
        this.c.a = new eycy(new eycf(httpStatusCode, eyceVar, new eceg(byteBufferAllocateDirect)));
        this.b.execute(this.a);
    }
}
