package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esvt extends ekuc {
    public static final /* synthetic */ int c = 0;
    private static final long d = TimeUnit.HOURS.toSeconds(1);
    public final Context a;
    public final dcai b;
    private final esvu e;
    private final fcsu f;
    private final eswa g;
    private final fcsu h;

    public esvt(Context context, esvu esvuVar, dcai dcaiVar, fcsu fcsuVar, String str) {
        super(null);
        this.g = new eswa(d);
        this.a = context;
        this.e = esvuVar;
        this.b = dcaiVar;
        this.h = fcsuVar;
        this.f = new esvq(context, str, fcsuVar);
    }

    private final void e(eswn eswnVar, ListenableFuture listenableFuture) {
        ListenableFuture listenableFutureI;
        long serializedSize = eswnVar.getSerializedSize();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = (-86400000) + jElapsedRealtime;
        ehqd ehqdVar = (ehqd) this.e;
        ehqc ehqcVar = ehqdVar.c;
        if (j > 0) {
            ConcurrentLinkedQueue concurrentLinkedQueue = ehqcVar.a;
            for (ehqb ehqbVar = (ehqb) concurrentLinkedQueue.peek(); ehqbVar != null && ehqbVar.b() <= j; ehqbVar = (ehqb) concurrentLinkedQueue.peek()) {
                if (concurrentLinkedQueue.remove(ehqbVar)) {
                    ehqcVar.b.addAndGet(-ehqbVar.a());
                }
            }
        }
        AtomicLong atomicLong = ehqcVar.b;
        long j2 = atomicLong.get();
        for (int i = 0; i < 10 && j2 + serializedSize < 1048576; i++) {
            j2 = atomicLong.get();
            if (atomicLong.compareAndSet(j2, j2 + serializedSize)) {
                ehqcVar.a.offer(new ehpy(jElapsedRealtime, serializedSize));
                esvw esvwVar = ehqdVar.a;
                dzwt dzwtVar = esvwVar.b;
                if (dzwtVar == null) {
                    synchronized (esvwVar) {
                        dzwtVar = esvwVar.b;
                        if (dzwtVar == null) {
                            dzwtVar = new dzwt();
                            esvwVar.b = dzwtVar;
                        }
                    }
                }
                listenableFutureI = dzwtVar.a(esvwVar.a, esvwVar.d, true);
                eork.r(listenableFutureI, eiid.h(new esvs(this, listenableFuture, eswnVar)), eoqg.a);
            }
        }
        Log.w("TikTokClientLogging", "Log rate too high, dropping logs.");
        listenableFutureI = eork.i(false);
        eork.r(listenableFutureI, eiid.h(new esvs(this, listenableFuture, eswnVar)), eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [esvf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [esvf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [esvf, java.lang.Object] */
    @Override // defpackage.ekta
    public final void b(eksx eksxVar) {
        esvn esvnVar;
        esvq esvqVar;
        ArrayList<esvy> arrayList;
        this.h.b().e();
        ehqd ehqdVar = (ehqd) this.e;
        esvw esvwVar = ehqdVar.a;
        String str = (String) esvk.a(eksxVar, esvm.a);
        ejwi ejwiVarJ = str == null ? ejud.a : ejwi.j(eork.i(str));
        if (!ejwiVarJ.g()) {
            eygg eyggVar = ehqdVar.b;
            ejwi ejwiVarI = ejwi.i((efwo) esvk.a(eksxVar, ehpx.a));
            if (!ejwiVarI.g()) {
                eiev eievVarC = eiiy.c(efwp.a);
                if (eievVarC.b()) {
                    ejwiVarI = ejwi.j((efwo) eievVarC.a());
                }
            }
            ejwiVarJ = ejwiVarI.g() ? ejwi.j(eooh.f(((egej) eyggVar.b()).b((efwo) ejwiVarI.c()), egdj.class, eiid.a(new ejvr() { // from class: egei
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return null;
                }
            }), eoqg.a)) : ejud.a;
        }
        ListenableFuture listenableFuture = (ListenableFuture) ejwiVarJ.e(eork.i(null));
        esvq esvqVar2 = (esvq) this.f;
        esvy esvyVar = new esvy(esvqVar2.b().b(eksxVar, 3, esvk.b), listenableFuture, eksxVar.d());
        String str2 = eksxVar.j() != null ? eksxVar.j().b : null;
        eswa eswaVar = this.g;
        esvn esvnVar2 = new esvn(eksxVar.e(), str2);
        synchronized (eswaVar) {
            long j = esvyVar.c;
            if (j >= eswaVar.b || eswaVar.c.size() >= 1000) {
                LinkedHashMap linkedHashMap = eswaVar.c;
                Collection collectionValues = linkedHashMap.values();
                long nanos = TimeUnit.SECONDS.toNanos(eswaVar.a);
                Iterator it = collectionValues.iterator();
                int size = linkedHashMap.size();
                while (it.hasNext()) {
                    esvy esvyVar2 = (esvy) it.next();
                    esvnVar = esvnVar2;
                    long j2 = esvyVar2.c + nanos;
                    if (j2 >= j) {
                        esvqVar = esvqVar2;
                        if (size <= 1000) {
                            eswaVar.b = j2;
                            break;
                        }
                    } else {
                        esvqVar = esvqVar2;
                    }
                    if (esvyVar2.d > 0 && eswaVar.d.size() < 1000) {
                        eswaVar.d.add(esvyVar2);
                    }
                    it.remove();
                    size--;
                    esvnVar2 = esvnVar;
                    esvqVar2 = esvqVar;
                }
                esvqVar = esvqVar2;
                esvnVar = esvnVar2;
            } else {
                esvqVar = esvqVar2;
                esvnVar = esvnVar2;
            }
            LinkedHashMap linkedHashMap2 = eswaVar.c;
            esvn esvnVar3 = esvnVar;
            esvy esvyVar3 = (esvy) linkedHashMap2.get(esvnVar3);
            if (esvyVar3 != null) {
                esvyVar3.d++;
                synchronized (eswaVar) {
                    arrayList = eswaVar.d;
                    eswaVar.d = new ArrayList();
                }
                for (esvy esvyVar4 : arrayList) {
                    eswj eswjVar = esvyVar4.a;
                    long j3 = esvyVar4.d;
                    eswjVar.copyOnWrite();
                    eswn eswnVar = (eswn) eswjVar.instance;
                    eswn eswnVar2 = eswn.a;
                    eswnVar.b |= 2;
                    eswnVar.d = j3;
                    e((eswn) eswjVar.build(), esvyVar4.b);
                }
                return;
            }
            linkedHashMap2.put(esvnVar3, esvyVar);
            esvk esvkVarB = esvqVar.b();
            esvi esviVarD = esvj.d();
            esviVarD.b(true);
            esviVarD.c(true);
            esviVarD.d(true);
            eswj eswjVarB = esvkVarB.b(eksxVar, 2, esviVarD.a());
            Throwable th = (Throwable) esvk.a(eksxVar, ekrl.a);
            fcsu fcsuVar = esvwVar.c;
            fcsuVar.b().d();
            if (eksxVar.m().intValue() >= Integer.MAX_VALUE && !(th instanceof ekru)) {
                eoid eoidVar = ((eswn) eswjVarB.instance).g;
                if (eoidVar == null) {
                    eoidVar = eoid.a;
                }
                eoic eoicVar = (eoic) eoidVar.toBuilder();
                fcsuVar.b().d();
                eoii eoiiVarC = eoli.c(new esvv(th));
                eoicVar.copyOnWrite();
                eoid eoidVar2 = (eoid) eoicVar.instance;
                eoin eoinVar = (eoin) eoiiVarC.build();
                eoinVar.getClass();
                eoidVar2.k = eoinVar;
                eoidVar2.b |= 1024;
                eoid eoidVar3 = (eoid) eoicVar.build();
                eswjVarB.copyOnWrite();
                eswn eswnVar3 = (eswn) eswjVarB.instance;
                eoidVar3.getClass();
                eswnVar3.g = eoidVar3;
                eswnVar3.b |= 32;
            }
            eswn eswnVar4 = (eswn) eswjVarB.build();
            boolean z = eidc.a;
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            for (eifn eifnVarC = eidc.c(); eifnVarC != null; eifnVarC = eifnVarC.a()) {
                ekfwVar.h(eifnVarC.d());
            }
            List listF = ekjz.f(ekfwVar.g());
            if (!listF.isEmpty()) {
                eswj eswjVar2 = (eswj) eswnVar4.toBuilder();
                eswf eswfVar = (eswf) eswg.a.createBuilder();
                eswfVar.copyOnWrite();
                eswg eswgVar = (eswg) eswfVar.instance;
                evtg evtgVar = eswgVar.b;
                if (!evtgVar.c()) {
                    eswgVar.b = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(listF, eswgVar.b);
                eswjVar2.copyOnWrite();
                eswn eswnVar5 = (eswn) eswjVar2.instance;
                eswg eswgVar2 = (eswg) eswfVar.build();
                eswgVar2.getClass();
                eswnVar5.h = eswgVar2;
                eswnVar5.b |= 64;
                eswnVar4 = (eswn) eswjVar2.build();
            }
            e(eswnVar4, listenableFuture);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [esvf, java.lang.Object] */
    @Override // defpackage.ekta
    public final boolean c(Level level) {
        return this.h.b().c(level);
    }

    @Override // defpackage.ekuc, defpackage.ekta
    public final void g(RuntimeException runtimeException, eksx eksxVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }
}
