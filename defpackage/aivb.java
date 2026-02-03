package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivb implements aiuy {
    private final fdjx a;
    private final Context b;
    private final cgbn c;
    private final ekrg d;
    private final ConcurrentHashMap e;
    private final ConcurrentHashMap f;
    private final AtomicInteger g;

    public aivb(fdjx fdjxVar, Context context, cgbn cgbnVar) {
        fdjxVar.getClass();
        context.getClass();
        cgbnVar.getClass();
        this.a = fdjxVar;
        this.b = context;
        this.c = cgbnVar;
        this.d = ekrg.c("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl");
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new AtomicInteger(1);
    }

    @Override // defpackage.aiuy
    public final aiuz a(long j) {
        int andIncrement = this.g.getAndIncrement();
        aiuz aiuzVar = new aiuz(this, andIncrement);
        this.e.put(Integer.valueOf(andIncrement), aiuzVar);
        this.f.put(Integer.valueOf(aiuzVar.a), auvw.k(this.a, null, null, new aiva(j, this, aiuzVar, null), 3));
        return aiuzVar;
    }

    public final void b(aiuz aiuzVar, int i) {
        ConcurrentHashMap concurrentHashMap = this.f;
        Integer numValueOf = Integer.valueOf(aiuzVar.a);
        fdlr fdlrVar = (fdlr) concurrentHashMap.remove(numValueOf);
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        if (this.e.remove(numValueOf) == null) {
            return;
        }
        if (i != 2) {
            ekrw ekrwVarH = this.d.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl", "stopDetector", 86, "LatencyDetectionAgentImpl.kt")).q("LatencyDetectionAgent has not detected a slowness latency or got cancelled.");
            return;
        }
        ekrw ekrwVarH2 = this.d.h();
        ekrwVarH2.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl", "stopDetector", 75, "LatencyDetectionAgentImpl.kt")).q("LatencyDetectionAgent has detected a slowness latency, push notification.");
        cgbn cgbnVar = this.c;
        Context context = this.b;
        emgm emgmVar = emgm.SLOW_PERFORMANCE;
        String string = context.getString(R.string.report_issue_slow_performance);
        string.getClass();
        cgbnVar.Q(emgmVar, 0L, string);
    }
}
