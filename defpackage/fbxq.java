package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxq implements fbzc {
    final /* synthetic */ fbxs a;

    public fbxq(fbxs fbxsVar) {
        this.a = fbxsVar;
    }

    @Override // defpackage.fbzc
    public final void a(Status status) {
        int i = fbxr.i;
        fbxs fbxsVar = this.a;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            if (fbxrVar.d) {
                return;
            }
            fbxrVar.d = true;
            fbxrVar.e = status;
            Collection collection = fbxrVar.b;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((fbxp) it.next()).a.clear();
            }
            collection.clear();
            BidirectionalStream bidirectionalStream = fbxsVar.k;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                fbxsVar.i.a(fbxsVar, status);
            }
        }
    }

    @Override // defpackage.fbzc
    public final void b(fcmv fcmvVar, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        int i2 = fbxr.i;
        fbxs fbxsVar = this.a;
        fbxr fbxrVar = fbxsVar.o;
        synchronized (fbxrVar.a) {
            if (fbxrVar.d) {
                return;
            }
            if (fcmvVar != null) {
                byteBuffer = ((fbxw) fcmvVar).a;
                byteBuffer.flip();
            } else {
                byteBuffer = fbxs.a;
            }
            fbxsVar.w(byteBuffer.remaining());
            if (fbxrVar.c) {
                fbxsVar.t(byteBuffer, z, z2);
            } else {
                fbxrVar.b.add(new fbxp(byteBuffer, z, z2));
            }
        }
    }

    @Override // defpackage.fbzc
    public final void c(fbrg fbrgVar) {
        fbxs fbxsVar = this.a;
        fbxsVar.j.run();
        fbxl fbxlVar = fbxsVar.p;
        if (fbxlVar == null) {
            return;
        }
        fbxo fbxoVar = new fbxo(fbxsVar);
        String str = fbxsVar.d;
        Executor executor = fbxsVar.g;
        fbxm fbxmVar = (fbxm) fbxlVar;
        boolean z = fbxmVar.b;
        BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = fbxmVar.a.newBidirectionalStreamBuilder(str, fbxoVar, executor);
        if (z) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(fbxmVar.c);
        }
        if (fbxmVar.d) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(fbxmVar.e);
        }
        if (fbxsVar.l) {
            builderNewBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
        }
        Object obj = fbxsVar.m;
        if (obj != null || fbxsVar.n != null) {
            if (obj != null) {
                builderNewBidirectionalStreamBuilder.addRequestAnnotation(obj);
            }
            Collection collection = fbxsVar.n;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    builderNewBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                }
            }
        }
        String str2 = fcdy.j.a;
        builderNewBidirectionalStreamBuilder.addHeader(str2, fbxsVar.e);
        String str3 = fcdy.h.a;
        builderNewBidirectionalStreamBuilder.addHeader(str3, "application/grpc");
        builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
        byte[][] bArrA = fcmr.a(fbxsVar.h);
        for (int i = 0; i < bArrA.length; i += 2) {
            String str4 = new String(bArrA[i], StandardCharsets.UTF_8);
            if (!str3.equalsIgnoreCase(str4) && !str2.equalsIgnoreCase(str4) && !fcdy.i.a.equalsIgnoreCase(str4)) {
                builderNewBidirectionalStreamBuilder.addHeader(str4, new String(bArrA[i + 1], StandardCharsets.UTF_8));
            }
        }
        fbxsVar.k = builderNewBidirectionalStreamBuilder.build();
        fbxsVar.k.start();
    }
}
