package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrd {
    private final ConcurrentMap a = new ConcurrentHashMap();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final ConcurrentMap c = new ConcurrentHashMap();
    private final ConcurrentMap d = new ConcurrentHashMap();
    private final Context e;
    private final dwhr f;
    private final ejwi g;
    private final ejwi h;

    public dvrd(Context context, dwhr dwhrVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.e = context;
        this.f = dwhrVar;
        this.g = ejwiVar;
        this.h = ejwiVar2;
    }

    public final synchronized dvrc a(long j) {
        ConcurrentMap concurrentMap = this.d;
        Long lValueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(lValueOf)) {
            return (dvrc) concurrentMap.get(lValueOf);
        }
        dvrc dvrcVar = new dvrc(this.e, j);
        return (dvrc) ejwi.i((dvrc) concurrentMap.putIfAbsent(lValueOf, dvrcVar)).e(dvrcVar);
    }

    public final synchronized dwws b(dwje dwjeVar) {
        long jA = dwjeVar.a();
        Long lValueOf = Long.valueOf(jA);
        ConcurrentMap concurrentMap = this.a;
        if (concurrentMap.containsKey(lValueOf)) {
            return (dwws) concurrentMap.get(lValueOf);
        }
        Context context = this.e;
        dwhr dwhrVar = this.f;
        lValueOf.getClass();
        dvrc dvrcVarA = a(jA);
        lValueOf.getClass();
        dvtm dvtmVarC = c(jA);
        lValueOf.getClass();
        dvte dvteVar = new dvte(context, dwjeVar, dwhrVar, dvrcVarA, dvtmVarC, jA, this.h);
        return (dwws) ejwi.i((dwws) concurrentMap.putIfAbsent(lValueOf, dvteVar)).e(dvteVar);
    }

    public final synchronized dvtm c(long j) {
        ConcurrentMap concurrentMap = this.c;
        Long lValueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(lValueOf)) {
            return (dvtm) concurrentMap.get(lValueOf);
        }
        dvtm dvtmVar = new dvtm(a(j));
        return (dvtm) ejwi.i((dvtm) concurrentMap.putIfAbsent(lValueOf, dvtmVar)).e(dvtmVar);
    }

    public final synchronized dvrf d(dwje dwjeVar) {
        long jA = dwjeVar.a();
        Long lValueOf = Long.valueOf(jA);
        ConcurrentMap concurrentMap = this.b;
        if (concurrentMap.containsKey(lValueOf)) {
            return (dvrf) concurrentMap.get(lValueOf);
        }
        Context context = this.e;
        lValueOf.getClass();
        dvtm dvtmVarC = c(jA);
        lValueOf.getClass();
        dvrf dvrfVar = new dvrf(context, dvtmVarC, jA);
        return (dvrf) ejwi.i((dvrf) concurrentMap.putIfAbsent(lValueOf, dvrfVar)).e(dvrfVar);
    }
}
