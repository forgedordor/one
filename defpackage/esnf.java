package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esnf implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ esni b;

    public esnf(esni esniVar, UrlResponseInfo urlResponseInfo) {
        this.a = urlResponseInfo;
        this.b = esniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBufferAllocateDirect;
        esni esniVar = this.b;
        List<ByteBuffer> list = esniVar.b.a;
        int iRemaining = 0;
        if (list.isEmpty()) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        } else if (list.size() == 1) {
            byteBufferAllocateDirect = (ByteBuffer) list.get(0);
            if (byteBufferAllocateDirect.hasRemaining()) {
                byteBufferAllocateDirect.flip();
            }
            byteBufferAllocateDirect.position(0);
        } else {
            for (ByteBuffer byteBuffer : list) {
                byteBuffer.flip();
                iRemaining += byteBuffer.remaining();
            }
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iRemaining);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byteBufferAllocateDirect2.put((ByteBuffer) it.next());
            }
            byteBufferAllocateDirect2.flip();
            byteBufferAllocateDirect = byteBufferAllocateDirect2;
        }
        eksl ekslVar = (eksl) esnj.a.n().h("com/google/frameworks/client/data/android/HttpClientImpl$HttpClientUrlRequestListener$1", "run", 264, "HttpClientImpl.java");
        UrlResponseInfo urlResponseInfo = this.a;
        ekslVar.u("Initial buffer guess was %d, actual size was %d", esniVar.a(urlResponseInfo), byteBufferAllocateDirect.remaining());
        SettableFuture settableFuture = esniVar.a;
        esnu esnuVar = new esnu();
        esnuVar.a(esni.b(urlResponseInfo.getAllHeaders()));
        esnuVar.b(byteBufferAllocateDirect);
        esnuVar.d = urlResponseInfo.getHttpStatusCode();
        esnuVar.b.addAll(esniVar.d);
        settableFuture.set(new esnv(esnuVar));
    }
}
