package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auwu {
    public static final cqce a = cqce.g("Bugle", "ThreadUtilizationLogger");
    public final fcsu b;
    private final fcsu c;
    private final eosc d;

    public auwu(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eoscVar;
    }

    public final eiju a(final String str) {
        final dqne dqneVar = (dqne) this.c.b();
        return eiju.g(eork.m(new Callable() { // from class: dqnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = dqneVar.a;
                HashMap mapH = ekmi.h(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    mapH.put(((dqmu) entry.getKey()).c(), ((dqnb) entry.getValue()).a());
                }
                return mapH.values();
            }
        }, dqneVar.b)).h(new ejvr() { // from class: auwt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Collection<dqmz> collection = (Collection) obj;
                cqce cqceVar = auwu.a;
                String str2 = str;
                cqceVar.m("takeSnapshot at ".concat(str2));
                if (collection.isEmpty()) {
                    return null;
                }
                aill aillVar = (aill) this.a.b.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.THREAD_UTILIZATION;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                int i = 1;
                ellhVar.b |= 1;
                enju enjuVar = (enju) enjv.a.createBuilder();
                enjuVar.copyOnWrite();
                enjv enjvVar = (enjv) enjuVar.instance;
                enjvVar.b |= 1;
                enjvVar.c = str2;
                enjuVar.copyOnWrite();
                enjv enjvVar2 = (enjv) enjuVar.instance;
                enjvVar2.d = 1;
                enjvVar2.b |= 2;
                for (dqmz dqmzVar : collection) {
                    cqceVar.m("ThreadPoolStatsSnapshot(" + enjx.a() + ") at " + str2 + ": " + String.valueOf(dqmzVar));
                    enjs enjsVar = (enjs) enjt.a.createBuilder();
                    String str3 = dqmzVar.a;
                    enjsVar.copyOnWrite();
                    enjt enjtVar = (enjt) enjsVar.instance;
                    enjtVar.b = enjtVar.b | i;
                    enjtVar.c = str3;
                    dqmn dqmnVar = (dqmn) dqmzVar.a();
                    long j = dqmnVar.b;
                    long millis = TimeUnit.NANOSECONDS.toMillis(j);
                    enjsVar.copyOnWrite();
                    enjt enjtVar2 = (enjt) enjsVar.instance;
                    enjtVar2.b |= 2;
                    enjtVar2.d = millis;
                    long j2 = dqmnVar.a;
                    long j3 = j + j2;
                    int iF = j3 == 0 ? 0 : eonc.f((j2 * 100) / j3);
                    enjsVar.copyOnWrite();
                    enjt enjtVar3 = (enjt) enjsVar.instance;
                    enjtVar3.b |= 4;
                    enjtVar3.e = iF;
                    cqceVar.m("ThreadPoolStats(" + enjx.a() + ") at " + str2 + ": " + String.valueOf(enjsVar.build()));
                    enjt enjtVar4 = (enjt) enjsVar.build();
                    enjuVar.copyOnWrite();
                    enjv enjvVar3 = (enjv) enjuVar.instance;
                    enjtVar4.getClass();
                    evtg evtgVar = enjvVar3.e;
                    if (!evtgVar.c()) {
                        enjvVar3.e = evsn.mutableCopy(evtgVar);
                    }
                    enjvVar3.e.add(enjtVar4);
                    i = 1;
                }
                cqceVar.m("ThreadUtilization(" + enjx.a() + ") at " + str2 + ": " + String.valueOf(enjuVar.build()));
                enjv enjvVar4 = (enjv) enjuVar.build();
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                enjvVar4.getClass();
                ellhVar2.bw = enjvVar4;
                ellhVar2.g = ellhVar2.g | 64;
                aillVar.j(ellgVar);
                return null;
            }
        }, this.d);
    }
}
