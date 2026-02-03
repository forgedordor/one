package com.google.mediapipe.framework;

import com.google.mediapipe.tasks.core.ModelResourcesCache;
import com.google.mediapipe.tasks.core.ModelResourcesCacheService;
import defpackage.ejwl;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.erxy;
import defpackage.euwz;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class Graph {
    private static final ekrg a = ekrg.c("com/google/mediapipe/framework/Graph");
    private final List c = new ArrayList();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private boolean f = false;
    private boolean g = false;
    private final Map h = new HashMap();
    private final Object i = new Object();
    private long b = nativeCreateGraph();

    private native void nativeAddMultiStreamCallback(long j, List<String> list, PacketListCallback packetListCallback, boolean z);

    private native void nativeCloseAllPacketSources(long j);

    private native long nativeCreateGraph();

    private native byte[] nativeGetCalculatorGraphConfig(long j);

    private native void nativeLoadBinaryGraphBytes(long j, byte[] bArr);

    private native void nativeMovePacketToInputStream(long j, String str, long j2, long j3);

    private native void nativeReleaseGraph(long j);

    private native void nativeSetParentGlContext(long j, long j2);

    private native void nativeStartRunningGraph(long j, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

    private native void nativeWaitUntilGraphDone(long j);

    private native void nativeWaitUntilGraphIdle(long j);

    private static void o(Map map, String[] strArr, long[] jArr) {
        if (map.size() != strArr.length || map.size() != jArr.length) {
            throw new RuntimeException("Input array length doesn't match the map size!");
        }
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = (String) entry.getKey();
            jArr[i] = ((Packet) entry.getValue()).getNativeHandle();
            i++;
        }
    }

    public final synchronized long a() {
        return this.b;
    }

    public final synchronized erxy b() {
        int i = ProtoUtil.b;
        return c(evrr.a());
    }

    public final synchronized erxy c(evrr evrrVar) {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called already.");
        byte[] bArrNativeGetCalculatorGraphConfig = nativeGetCalculatorGraphConfig(this.b);
        if (bArrNativeGetCalculatorGraphConfig == null) {
            return null;
        }
        try {
            return (erxy) evsn.parseFrom(erxy.a, bArrNativeGetCalculatorGraphConfig, evrrVar);
        } catch (evtj e) {
            throw new RuntimeException(e);
        }
    }

    public final synchronized void d(String str, Packet packet, long j) throws Throwable {
        Throwable th;
        try {
            try {
                ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called.");
                if (this.g) {
                    nativeMovePacketToInputStream(this.b, str, packet.getNativeHandle(), j);
                    packet.release();
                    return;
                }
                try {
                    Packet packet2 = new Packet(packet.nativeCopyPacket(packet.a));
                    Map map = this.h;
                    if (!map.containsKey(str)) {
                        map.put(str, new ArrayList());
                    }
                    List list = (List) map.get(str);
                    if (list.size() <= 20) {
                        list.add(new euwz(packet2, Long.valueOf(j)));
                        packet.release();
                        return;
                    }
                    for (Map.Entry entry : this.e.entrySet()) {
                        if (entry.getValue() == null) {
                            ((ekrd) ((ekrd) a.i()).h("com/google/mediapipe/framework/Graph", "addPacketToBuffer", 578, "Graph.java")).t("Stream: %s might be missing.", entry.getKey());
                        }
                    }
                    throw new RuntimeException("Graph is not started because of missing streams");
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void e() {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called.");
        nativeCloseAllPacketSources(this.b);
    }

    public final synchronized void f(erxy erxyVar) {
        g(erxyVar.toByteArray());
    }

    public final synchronized void g(byte[] bArr) {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called already.");
        nativeLoadBinaryGraphBytes(this.b, bArr);
    }

    public final synchronized void h(long j) {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called already.");
        ejwl.l(!this.g);
        nativeSetParentGlContext(this.b, j);
    }

    public final synchronized void i(GraphService graphService, Object obj) {
        ((ModelResourcesCacheService) graphService).nativeInstallServiceObject(this.b, ((ModelResourcesCache) obj).b.get() ? ((ModelResourcesCache) obj).a : 0L);
    }

    public final synchronized void j() {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called.");
        this.f = true;
        Map map = this.e;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == null) {
                ((ekrd) ((ekrd) a.h()).h("com/google/mediapipe/framework/Graph", "startRunningGraph", 333, "Graph.java")).q("MediaPipe graph won't start until all stream headers are available.");
                return;
            }
        }
        Map map2 = this.d;
        String[] strArr = new String[map2.size()];
        long[] jArr = new long[map2.size()];
        o(map2, strArr, jArr);
        String[] strArr2 = new String[map.size()];
        long[] jArr2 = new long[map.size()];
        o(map, strArr2, jArr2);
        nativeStartRunningGraph(this.b, strArr, jArr, strArr2, jArr2);
        this.g = true;
        Map map3 = this.h;
        if (map3.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map3.entrySet()) {
            ArrayList arrayList = (ArrayList) entry.getValue();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                euwz euwzVar = (euwz) arrayList.get(i);
                try {
                    long j = this.b;
                    String str = (String) entry.getKey();
                    Packet packet = euwzVar.a;
                    nativeMovePacketToInputStream(j, str, packet.getNativeHandle(), euwzVar.b.longValue());
                    packet.release();
                } catch (MediaPipeException e) {
                    ((ekrd) ((ekrd) a.i()).h("com/google/mediapipe/framework/Graph", "moveBufferedPacketsToInputStream", 597, "Graph.java")).D("AddPacket for stream: %s failed: %s.", entry.getKey(), e.getMessage());
                    throw e;
                }
            }
        }
        this.h.clear();
    }

    public final synchronized void k() {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called already.");
        Map map = this.d;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Packet) ((Map.Entry) it.next()).getValue()).release();
        }
        map.clear();
        Map map2 = this.e;
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() != null) {
                ((Packet) entry.getValue()).release();
            }
        }
        map2.clear();
        Map map3 = this.h;
        Iterator it2 = map3.entrySet().iterator();
        while (it2.hasNext()) {
            ArrayList arrayList = (ArrayList) ((Map.Entry) it2.next()).getValue();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((euwz) arrayList.get(i)).a.release();
            }
        }
        map3.clear();
        synchronized (this.i) {
            long j = this.b;
            if (j != 0) {
                nativeReleaseGraph(j);
                this.b = 0L;
            }
        }
        this.c.clear();
    }

    public final synchronized void l() {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called.");
        nativeWaitUntilGraphDone(this.b);
    }

    public final synchronized void m() {
        ejwl.m(this.b != 0, "Invalid context, tearDown() might have been called.");
        nativeWaitUntilGraphIdle(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void n(java.util.List r8, com.google.mediapipe.framework.PacketListCallback r9) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.b     // Catch: java.lang.Throwable -> L34
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            java.lang.String r3 = "Invalid context, tearDown() might have been called already."
            defpackage.ejwl.m(r0, r3)     // Catch: java.lang.Throwable -> L34
            boolean r0 = r7.g     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L20
            boolean r0 = r7.f     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L20
            goto L21
        L1c:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L37
        L20:
            r1 = r2
        L21:
            defpackage.ejwl.l(r1)     // Catch: java.lang.Throwable -> L34
            java.util.List r0 = r7.c     // Catch: java.lang.Throwable -> L34
            r0.add(r9)     // Catch: java.lang.Throwable -> L34
            long r2 = r7.b     // Catch: java.lang.Throwable -> L34
            r6 = 0
            r1 = r7
            r4 = r8
            r5 = r9
            r1.nativeAddMultiStreamCallback(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r7)
            return
        L34:
            r0 = move-exception
            r1 = r7
        L36:
            r8 = r0
        L37:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L39
            throw r8
        L39:
            r0 = move-exception
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mediapipe.framework.Graph.n(java.util.List, com.google.mediapipe.framework.PacketListCallback):void");
    }
}
