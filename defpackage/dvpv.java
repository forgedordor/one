package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvpv implements dviy {
    public final dvqa a;
    public final dvrd b;
    public final Handler f = new Handler(Looper.getMainLooper());
    private final Map g = new HashMap();
    private final Map h = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final eosc c = dvie.b().a;

    public dvpv(dvqa dvqaVar, dvrd dvrdVar) {
        this.a = dvqaVar;
        this.b = dvrdVar;
    }

    private final synchronized ekgb h(dwpx dwpxVar) {
        Map map = this.h;
        if (!map.containsKey(dwpxVar)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (Map.Entry entry : ((Map) map.get(dwpxVar)).entrySet()) {
            if (((Boolean) ((Pair) entry.getValue()).first).booleanValue()) {
                ekfwVar.h((dwpk) entry.getKey());
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dviy
    public final synchronized dwwy a(dwpx dwpxVar) {
        Map map = this.g;
        if (map.containsKey(dwpxVar)) {
            return (dwwy) map.get(dwpxVar);
        }
        dwxe dwxeVar = new dwxe(h(dwpxVar));
        map.put(dwpxVar, dwxeVar);
        return dwxeVar;
    }

    @Override // defpackage.dviy
    public final synchronized void b(dwpx dwpxVar, dwpk dwpkVar, long j) {
        Map map = this.h;
        if (!map.containsKey(dwpxVar)) {
            map.put(dwpxVar, new LinkedHashMap());
        }
        if (!((Map) map.get(dwpxVar)).containsKey(dwpkVar) || ((Long) ((Pair) ((Map) map.get(dwpxVar)).get(dwpkVar)).second).longValue() <= j) {
            ((Map) map.get(dwpxVar)).put(dwpkVar, Pair.create(true, Long.valueOf(j)));
            Map map2 = this.g;
            if (map2.containsKey(dwpxVar)) {
                ((dwxe) map2.get(dwpxVar)).c(h(dwpxVar));
            }
        }
    }

    @Override // defpackage.dviy
    public final synchronized void c(dwpx dwpxVar) {
        this.d.remove(dwpxVar);
    }

    @Override // defpackage.dviy
    public final synchronized void d(dwpx dwpxVar, dwpk dwpkVar, long j) {
        Map map = this.h;
        if (!map.containsKey(dwpxVar)) {
            map.put(dwpxVar, new LinkedHashMap());
        }
        if (!((Map) map.get(dwpxVar)).containsKey(dwpkVar) || ((Long) ((Pair) ((Map) map.get(dwpxVar)).get(dwpkVar)).second).longValue() <= j) {
            ((Map) map.get(dwpxVar)).put(dwpkVar, Pair.create(false, Long.valueOf(j)));
            Map map2 = this.g;
            if (map2.containsKey(dwpxVar)) {
                ((dwxe) map2.get(dwpxVar)).c(h(dwpxVar));
            }
        }
    }

    @Override // defpackage.dviy
    public final synchronized void e(final dwje dwjeVar, final dwpx dwpxVar) {
        this.c.submit(new Runnable() { // from class: dvps
            @Override // java.lang.Runnable
            public final void run() {
                final dwje dwjeVar2;
                boolean z;
                final dvpv dvpvVar = this.a;
                final dwpx dwpxVar2 = dwpxVar;
                long jB = fbfj.b();
                synchronized (dvpvVar) {
                    Map map = dvpvVar.d;
                    boolean zContainsKey = map.containsKey(dwpxVar2);
                    dwjeVar2 = dwjeVar;
                    if (zContainsKey) {
                        Map map2 = dvpvVar.e;
                        z = false;
                        if (map2.containsKey(dwpxVar2)) {
                            dvhn.a();
                            if (System.currentTimeMillis() - ((Long) map2.get(dwpxVar2)).longValue() > fbfj.a() - 2000) {
                            }
                        }
                        dvhn.a();
                        map.put(dwpxVar2, Long.valueOf(System.currentTimeMillis()));
                    } else {
                        dvpvVar.f.postDelayed(new Runnable() { // from class: dvpq
                            @Override // java.lang.Runnable
                            public final void run() {
                                dvpvVar.g(dwjeVar2, dwpxVar2);
                            }
                        }, jB);
                    }
                    z = true;
                    dvhn.a();
                    map.put(dwpxVar2, Long.valueOf(System.currentTimeMillis()));
                }
                if (z) {
                    dvpvVar.f(dwjeVar2, dwpxVar2, true, 342);
                }
            }
        });
    }

    public final void f(final dwje dwjeVar, final dwpx dwpxVar, final boolean z, final int i) {
        final long micros = TimeUnit.MILLISECONDS.toMicros(fbfj.a());
        this.b.b(dwjeVar).q(dwpxVar).k(new dwwx() { // from class: dvpr
            @Override // defpackage.dwwx
            public final void a(Object obj) {
                if (((ejwi) obj).g()) {
                    final int i2 = i;
                    final long j = micros;
                    final boolean z2 = z;
                    final dwpx dwpxVar2 = dwpxVar;
                    final dwje dwjeVar2 = dwjeVar;
                    final dvpv dvpvVar = this.a;
                    dvpvVar.c.submit(new Runnable() { // from class: dvpo
                        @Override // java.lang.Runnable
                        public final void run() {
                            final dvpv dvpvVar2 = dvpvVar;
                            final dwpx dwpxVar3 = dwpxVar2;
                            synchronized (dvpvVar2) {
                                Map map = dvpvVar2.e;
                                dvhn.a();
                                map.put(dwpxVar3, Long.valueOf(System.currentTimeMillis()));
                            }
                            final int i3 = i2;
                            final long j2 = j;
                            final boolean z3 = z2;
                            final dwje dwjeVar3 = dwjeVar2;
                            dvxe dvxeVarC = dvxf.c();
                            ((dvxa) dvxeVarC).a = "send typing indicator";
                            dvxeVarC.b(dvxj.g);
                            final dvxf dvxfVarA = dvxeVarC.a();
                            dvrd dvrdVar = dvpvVar2.b;
                            final SettableFuture settableFutureCreate = SettableFuture.create();
                            dvrdVar.b(dwjeVar3).q(dwpxVar3).k(new dwwx() { // from class: dvpp
                                @Override // defpackage.dwwx
                                public final void a(Object obj2) {
                                    settableFutureCreate.set((ejwi) obj2);
                                }
                            });
                            eooq.g(settableFutureCreate, new eooz() { // from class: dvpt
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    ejwi ejwiVar = (ejwi) obj2;
                                    evqs evqsVarN = ejwiVar.g() ? ((dwpo) ejwiVar.c()).n() : evqs.b;
                                    dvpv dvpvVar3 = dvpvVar2;
                                    int i4 = i3;
                                    dvxf dvxfVar = dvxfVarA;
                                    long j3 = j2;
                                    boolean z4 = z3;
                                    dwpx dwpxVar4 = dwpxVar3;
                                    dwje dwjeVar4 = dwjeVar3;
                                    dwdo dwdoVar = (dwdo) dvpvVar3.a;
                                    dwgj dwgjVar = new dwgj(dwdoVar.b, dwjeVar4, dwpxVar4, evqsVarN, z4, j3, dwdo.d(dwpxVar4));
                                    dwhp dwhpVarR = dwhq.r();
                                    dwhpVarR.g(18);
                                    dwhpVarR.n(dwjeVar4.c().f());
                                    dwhpVarR.o(dwjeVar4.d().E());
                                    String str = dwgjVar.a;
                                    dwhpVarR.p(str);
                                    dwhpVarR.d(dwpxVar4);
                                    dwhq dwhqVarA = dwhpVarR.a();
                                    dvyx dvyxVar = dwdoVar.c;
                                    dvyxVar.b(dwhqVarA);
                                    dwhp dwhpVarR2 = dwhq.r();
                                    dwhpVarR2.g(46);
                                    dwhpVarR2.f(i4);
                                    dwhpVarR2.n(dwjeVar4.c().f());
                                    dwhpVarR2.o(dwjeVar4.d().E());
                                    dwhpVarR2.p(str);
                                    dwhpVarR2.d(dwpxVar4);
                                    dvyxVar.b(dwhpVarR2.a());
                                    UUID uuidRandomUUID = UUID.randomUUID();
                                    dwcm dwcmVar = dwdoVar.a;
                                    ListenableFuture listenableFutureB = dwcmVar.b(uuidRandomUUID, dwgjVar, dwcmVar.d.b(), dwjeVar4, dvxfVar, true);
                                    eork.r(listenableFutureB, new dwdl(dwdoVar, dwjeVar4, dwgjVar, dwpxVar4), eoqg.a);
                                    return listenableFutureB;
                                }
                            }, dvpvVar2.c);
                        }
                    });
                }
            }
        });
    }

    public final void g(final dwje dwjeVar, final dwpx dwpxVar) {
        long jCurrentTimeMillis;
        boolean z;
        long jB = fbfj.b();
        synchronized (this) {
            Map map = this.d;
            if (map.containsKey(dwpxVar)) {
                long jLongValue = ((Long) map.get(dwpxVar)).longValue();
                dvhn.a();
                if (jLongValue <= System.currentTimeMillis() - jB) {
                    map.remove(dwpxVar);
                    z = true;
                } else {
                    z = false;
                }
                dvhn.a();
                jCurrentTimeMillis = (jLongValue + jB) - System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = -1;
                z = false;
            }
        }
        if (z) {
            f(dwjeVar, dwpxVar, false, 344);
        } else if (jCurrentTimeMillis > 0) {
            this.f.postDelayed(new Runnable() { // from class: dvpu
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g(dwjeVar, dwpxVar);
                }
            }, jCurrentTimeMillis);
        }
    }
}
