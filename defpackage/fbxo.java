package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxo extends BidirectionalStream.Callback {
    final /* synthetic */ fbxs a;
    private List b;

    public fbxo(fbxs fbxsVar) {
        this.a = fbxsVar;
    }

    private final void a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(StandardCharsets.UTF_8);
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(StandardCharsets.UTF_8);
        }
        byte[][] bArrB = fcmr.b(bArr);
        Charset charset = fbpp.a;
        fbrg fbrgVar = new fbrg(bArrB);
        fbxs fbxsVar = this.a;
        int i3 = fbxr.i;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            if (z) {
                fbxrVar.q(fbrgVar);
            } else {
                fbxrVar.p(fbrgVar);
            }
        }
    }

    private static final Status b(UrlResponseInfo urlResponseInfo) {
        return fcdy.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        Status statusB;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onCanceled");
        }
        fbxs fbxsVar = this.a;
        int i = fbxr.i;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            statusB = fbxrVar.e;
            if (statusB == null) {
                statusB = urlResponseInfo != null ? b(urlResponseInfo) : Status.c.withDescription("stream cancelled without reason");
            }
        }
        this.a.s(statusB);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onFailed");
        }
        this.a.s(Status.p.d(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onReadCompleted. Size=" + byteBuffer.remaining());
        }
        fbxs fbxsVar = this.a;
        int i = fbxr.i;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            fbxrVar.f = z;
            if (byteBuffer.remaining() != 0) {
                fbxr.f(fbxrVar, byteBuffer);
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseHeadersReceived. Header=".concat(String.valueOf(String.valueOf(urlResponseInfo.getAllHeadersAsList()))));
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List<Map.Entry<String, String>> asList = headerBlock.getAsList();
        this.b = asList;
        int i = fbxr.i;
        fbxr fbxrVar = this.a.o;
        synchronized (fbxrVar.a) {
            z = fbxrVar.f;
        }
        if (z) {
            a(asList, true);
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseTrailersReceived. Trailer=".concat(String.valueOf(asList.toString())));
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onStreamReady");
        }
        fbxs fbxsVar = this.a;
        int i = fbxr.i;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            fbxrVar.d();
            fbxrVar.c = true;
            Collection<fbxp> collection = fbxrVar.b;
            for (fbxp fbxpVar : collection) {
                fbxrVar.h.t(fbxpVar.a, fbxpVar.b, fbxpVar.c);
            }
            collection.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onSucceeded");
        }
        fbxs fbxsVar = this.a;
        int i = fbxr.i;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            z = false;
            if (this.b != null && fbxrVar.f) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else {
                if (urlResponseInfo == null) {
                    throw new AssertionError("No response header or trailer");
                }
                a(urlResponseInfo.getAllHeadersAsList(), true);
            }
        }
        this.a.s(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onWriteCompleted");
        }
        fbxs fbxsVar = this.a;
        int i = fbxr.i;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            if (!fbxrVar.g) {
                fbxrVar.g = true;
                fbxsVar.f.a();
            }
            fbxrVar.m(byteBuffer.position());
        }
    }
}
