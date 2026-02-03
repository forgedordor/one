package defpackage;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihg implements eiha, eibe {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final diep b;
    public final fcsu c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final eiec h;
    private final fcsu i;
    private final eidg j;

    public eihg(eiec eiecVar, diep diepVar, fcsu fcsuVar, fcsu fcsuVar2, eidg eidgVar, Map map, Map map2) {
        this.h = eiecVar;
        this.b = diepVar;
        this.c = fcsuVar;
        this.i = fcsuVar2;
        this.j = eidgVar;
        if (map.isEmpty()) {
            this.f = 500;
        } else {
            ejwl.b(((ekoj) map).d == 1, "Please only specify the max number of spans once.");
            ((eids) ekis.l(((ekgp) map).keySet())).a();
            this.f = 1500;
        }
        if (map2.isEmpty()) {
            this.g = 900000;
        } else {
            ejwl.b(((ekoj) map2).d == 1, "Please only specify the trace deadline limit once.");
            this.g = ((eigs) ekis.l(((ekgp) map2).keySet())).a();
        }
        this.e = new AtomicLong(this.g);
    }

    private static final void f(eifn eifnVar, String str) {
        eicl eiclVar;
        if (eifnVar == null || eifnVar == eieo.a || (eifnVar instanceof eied) || eick.a == 1) {
            return;
        }
        if (eifnVar instanceof eicp) {
            String strO = eidc.o(eifnVar);
            if (!"".equals(strO)) {
                strO = ": ".concat(String.valueOf(strO));
            }
            eiclVar = new eicl(strO, str, ((eicp) eifnVar).c());
        } else {
            eiclVar = new eicl(str);
        }
        eicl eiclVar2 = eiclVar;
        eiclVar2.addSuppressed(eiip.c());
        if (eick.a != 3) {
            throw eiclVar2;
        }
        ekrw ekrwVarI = eigz.a.i();
        ekrwVarI.X(eksq.a, "TraceManager");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(eiclVar2)).h("com/google/apps/tiktok/tracing/TraceManager", "reportDuplicateTraceException", (char) 133, "TraceManager.java")).q("Duplicate trace");
    }

    private final eifn g(String str, eiez eiezVar, long j, long j2, int i, int i2) {
        UUID uuidB = this.j.b();
        String strHo = eibd.ho(uuidB);
        boolean zA = eiil.a(uuidB.getLeastSignificantBits(), 0.0f);
        eiif eiifVar = (eiif) eiii.a.createBuilder();
        long leastSignificantBits = uuidB.getLeastSignificantBits();
        eiifVar.copyOnWrite();
        eiii eiiiVar = (eiii) eiifVar.instance;
        eiiiVar.b |= 2;
        eiiiVar.d = leastSignificantBits;
        long mostSignificantBits = uuidB.getMostSignificantBits();
        eiifVar.copyOnWrite();
        eiii eiiiVar2 = (eiii) eiifVar.instance;
        eiiiVar2.b |= 1;
        eiiiVar2.c = mostSignificantBits;
        eiifVar.copyOnWrite();
        eiii eiiiVar3 = (eiii) eiifVar.instance;
        eiiiVar3.b |= 4;
        eiiiVar3.f = j;
        eiifVar.copyOnWrite();
        eiii eiiiVar4 = (eiii) eiifVar.instance;
        eiiiVar4.b |= 8;
        eiiiVar4.g = j2 / 1000000;
        eiifVar.copyOnWrite();
        eiii eiiiVar5 = (eiii) eiifVar.instance;
        if (i2 == 0) {
            throw null;
        }
        eiiiVar5.j = i2 - 1;
        eiiiVar5.b |= 64;
        eiii eiiiVar6 = (eiii) eiifVar.build();
        long millis = i2 == 2 ? j2 : this.b.e().toMillis() * 1000000;
        eije eijeVar = new eije(str, eiezVar, i);
        eijg eijgVar = new eijg(this, uuidB, strHo, eiiiVar6, eijeVar, millis, zA, this.b);
        eifi eifiVarB = eidc.b();
        eief eiefVar = new eief(eijeVar, eijgVar, eifiVarB);
        eiec eiecVar = this.h;
        if (eiecVar.d.compareAndSet(false, true)) {
            eiecVar.c.execute(new eidz(eiecVar));
        }
        eieb eiebVar = new eieb(eiefVar, eiecVar.b);
        eiec.a.put(eiebVar, Boolean.TRUE);
        eiea eieaVar = eiebVar.a;
        Executor executor = (Executor) this.c.b();
        eijgVar.g = eieaVar;
        eieaVar.b(eijgVar, executor);
        this.d.put(uuidB, eijgVar);
        eidc.h(eifiVarB, eiefVar);
        return eiefVar;
    }

    @Override // defpackage.eibe
    public final /* bridge */ /* synthetic */ List a() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            ekfwVar.h(((eijg) ((Map.Entry) it.next()).getValue()).b());
        }
        return ekfwVar.g();
    }

    @Override // defpackage.eiha
    public final eieh b(String str, eiez eiezVar, int i, String str2, String str3) {
        final eifn eifnVarC = eidc.c();
        f(eifnVarC, str);
        diep diepVar = this.b;
        final eifn eifnVarG = g(str, eiezVar, diepVar.f().toEpochMilli(), diepVar.b(), 1, i);
        return eifnVarC == ((eief) eifnVarG).a ? eifnVarG : new eieh() { // from class: eihb
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eifnVarG.close();
                eidc.g(eifnVarC);
            }
        };
    }

    @Override // defpackage.eiha
    public final eieh c(eiez eiezVar, long j, long j2, int i, String str, String str2) {
        final eifn eifnVarC = eidc.c();
        f(eifnVarC, "Application creation");
        final eifn eifnVarG = g("Application creation", eiezVar, j, j2, 1, i);
        return eifnVarC == ((eief) eifnVarG).a ? eifnVarG : new eieh() { // from class: eihc
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eifnVarG.close();
                eidc.g(eifnVarC);
            }
        };
    }

    @Override // defpackage.eiha
    public final eifm d(String str, eiez eiezVar, int i, String str2, String str3) {
        eifn eifnVarC = eidc.c();
        f(eifnVarC, str);
        diep diepVar = this.b;
        return new eihf(new eieu(g(str, eiezVar, diepVar.f().toEpochMilli(), diepVar.b(), 2, i), false), eifnVarC);
    }

    public final void e(eiii eiiiVar, SparseArray sparseArray, String str) {
        RuntimeException runtimeException;
        eifi eifiVarB = eidc.b();
        eifn eifnVar = eifiVarB.c;
        eidc.g(new eidy(str, eidy.a, eidy.b, eiey.a, eifiVarB));
        try {
            Iterator it = ((Set) this.i.b()).iterator();
            RuntimeException e = null;
            loop0: while (true) {
                runtimeException = e;
                while (it.hasNext()) {
                    try {
                        ((eigy) it.next()).b(eiiiVar, sparseArray);
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (runtimeException != null) {
                            runtimeException.addSuppressed(e);
                        }
                    }
                }
            }
            if (runtimeException == null) {
            } else {
                throw runtimeException;
            }
        } finally {
            eidc.h(eifiVarB, eifnVar);
        }
    }
}
