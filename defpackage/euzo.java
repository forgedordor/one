package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketListCallback;
import com.google.mediapipe.tasks.core.ModelResourcesCache;
import com.google.mediapipe.tasks.core.ModelResourcesCacheService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzo implements AutoCloseable {
    public static final /* synthetic */ int d = 0;
    private static final String e = "euzo";
    public final Graph a;
    public final AndroidPacketCreator b;
    public euzb c;
    private final euze f;
    private final AtomicBoolean g;
    private final ModelResourcesCache h;
    private long i;

    private euzo(Graph graph, ModelResourcesCache modelResourcesCache, euze euzeVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.g = atomicBoolean;
        this.i = Long.MIN_VALUE;
        this.f = euzeVar;
        this.a = graph;
        this.h = modelResourcesCache;
        this.b = new AndroidPacketCreator(graph);
        atomicBoolean.set(true);
    }

    public static euzo b(Context context, euzg euzgVar, final euze euzeVar) throws Throwable {
        AndroidAssetUtil.a(context);
        Graph graph = new Graph();
        erxv erxvVar = (erxv) erxy.a.createBuilder();
        euyv euyvVar = (euyv) euzgVar;
        euzl euzlVar = euyvVar.b;
        erxu erxuVarG = euzlVar.g();
        if (erxuVarG == null) {
            throw new MediaPipeException(euxa.INVALID_ARGUMENT.ordinal(), "Only one of convertTo*Proto() method should be implemented for ".concat(String.valueOf(String.valueOf(euzlVar.getClass()))));
        }
        erxw erxwVar = (erxw) erxx.a.createBuilder();
        String str = euyvVar.a;
        erxwVar.copyOnWrite();
        ((erxx) erxwVar.instance).d = str;
        erxwVar.copyOnWrite();
        erxx erxxVar = (erxx) erxwVar.instance;
        erxxVar.g = erxuVarG;
        erxxVar.b |= 1;
        List<String> list = euyvVar.d;
        for (String str2 : list) {
            erxwVar.copyOnWrite();
            erxx erxxVar2 = (erxx) erxwVar.instance;
            str2.getClass();
            evtg evtgVar = erxxVar2.f;
            if (!evtgVar.c()) {
                erxxVar2.f = evsn.mutableCopy(evtgVar);
            }
            erxxVar2.f.add(str2);
            erxvVar.copyOnWrite();
            erxy erxyVar = (erxy) erxvVar.instance;
            str2.getClass();
            evtg evtgVar2 = erxyVar.d;
            if (!evtgVar2.c()) {
                erxyVar.d = evsn.mutableCopy(evtgVar2);
            }
            erxyVar.d.add(str2);
        }
        for (String str3 : euyvVar.c) {
            erxwVar.copyOnWrite();
            erxx erxxVar3 = (erxx) erxwVar.instance;
            str3.getClass();
            evtg evtgVar3 = erxxVar3.e;
            if (!evtgVar3.c()) {
                erxxVar3.e = evsn.mutableCopy(evtgVar3);
            }
            erxxVar3.e.add(str3);
            erxvVar.copyOnWrite();
            erxy erxyVar2 = (erxy) erxvVar.instance;
            str3.getClass();
            evtg evtgVar4 = erxyVar2.c;
            if (!evtgVar4.c()) {
                erxyVar2.c = evsn.mutableCopy(evtgVar4);
            }
            erxyVar2.c.add(str3);
        }
        erxx erxxVar4 = (erxx) erxwVar.build();
        erxvVar.copyOnWrite();
        erxy erxyVar3 = (erxy) erxvVar.instance;
        erxxVar4.getClass();
        evtg evtgVar5 = erxyVar3.b;
        if (!evtgVar5.c()) {
            erxyVar3.b = evsn.mutableCopy(evtgVar5);
        }
        erxyVar3.b.add(erxxVar4);
        graph.f((erxy) erxvVar.build());
        ModelResourcesCache modelResourcesCache = new ModelResourcesCache();
        graph.i(new ModelResourcesCacheService(), modelResourcesCache);
        ArrayList arrayList = new ArrayList(list.size());
        for (String str4 : list) {
            arrayList.add(str4.substring(str4.lastIndexOf(58) + 1));
        }
        graph.n(arrayList, new PacketListCallback() { // from class: euzn
            @Override // com.google.mediapipe.framework.PacketListCallback
            public final void process(List list2) {
                int i = euzo.d;
                euze euzeVar2 = euzeVar;
                try {
                    euzm euzmVarA = euzeVar2.a.a(list2);
                    if (euzeVar2.b == null) {
                        euzeVar2.d = euzmVarA;
                        euzeVar2.e = ((Packet) list2.get(0)).a();
                    } else {
                        euzeVar2.a.b(list2);
                        euzeVar2.b.a();
                    }
                } catch (MediaPipeException e2) {
                    euzb euzbVar = euzeVar2.c;
                    if (euzbVar != null) {
                        euzbVar.c(e2);
                    } else {
                        Log.e("OutputHandler", "Error occurs when getting MediaPipe task result. ".concat(e2.toString()));
                    }
                }
                ((Packet) list2.get(0)).a();
            }
        });
        graph.j();
        graph.m();
        return new euzo(graph, modelResourcesCache, euzeVar);
    }

    private final synchronized void c(Map map, long j) {
        if (!this.g.get()) {
            d(new MediaPipeException(euxa.FAILED_PRECONDITION.ordinal(), "The task graph hasn't been successfully started or error occurs during graph initializaton."));
        }
        try {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    this.a.d((String) entry.getKey(), (Packet) entry.getValue(), j);
                    entry.setValue(null);
                }
                for (Packet packet : map.values()) {
                    if (packet != null) {
                        packet.release();
                    }
                }
            } catch (MediaPipeException e2) {
                if (this.c != null) {
                    throw e2;
                }
                Log.e(e, "Mediapipe error: ", e2);
                for (Packet packet2 : map.values()) {
                    if (packet2 != null) {
                        packet2.release();
                    }
                }
            }
        } catch (Throwable th) {
            for (Packet packet3 : map.values()) {
                if (packet3 != null) {
                    packet3.release();
                }
            }
            throw th;
        }
    }

    private final void d(MediaPipeException mediaPipeException) {
        euzb euzbVar = this.c;
        if (euzbVar == null) {
            throw mediaPipeException;
        }
        euzbVar.c(mediaPipeException);
    }

    public final synchronized euzm a(Map map) {
        euzm euzmVar;
        long j = this.i;
        long j2 = j == Long.MIN_VALUE ? 0L : j + 1000000;
        this.i = j2;
        c(map, j2);
        this.a.m();
        euze euzeVar = this.f;
        this.i = euzeVar.e;
        euzmVar = euzeVar.d;
        euzeVar.d = null;
        return euzmVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.g;
        if (atomicBoolean.get()) {
            try {
                atomicBoolean.set(false);
                Graph graph = this.a;
                graph.e();
                graph.l();
                ModelResourcesCache modelResourcesCache = this.h;
                if (modelResourcesCache.b.compareAndSet(true, false)) {
                    modelResourcesCache.nativeReleaseModelResourcesCache(modelResourcesCache.a);
                }
            } catch (MediaPipeException e2) {
                d(e2);
            }
            try {
                this.a.k();
            } catch (MediaPipeException e3) {
                d(e3);
            }
        }
    }
}
