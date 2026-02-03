package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqhd {
    public static final eksp a = eksp.c("BugleConnectivity");
    public final eosc b;
    public final fcsu c;
    public final fcsu d;
    public final Context e;
    public final cqem f;
    public final IntentFilter g;
    public final Map h = new csq();
    public final Map i = new csq();
    public final Object j = new Object();
    private final fcsu k;

    public cqhd(Context context, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.e = context;
        this.b = eoscVar2;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.k = fcsuVar3;
        IntentFilter intentFilter = new IntentFilter();
        this.g = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f = new cqem(eoscVar, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r8 >= ((defpackage.crny) r7.d.b()).f()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.cqgl a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.j
            monitor-enter(r0)
            java.util.Map r1 = r7.h     // Catch: java.lang.Throwable -> L80
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L80
            cqgm r3 = (defpackage.cqgm) r3     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "NetworkStateMonitorManager.java"
            if (r3 != 0) goto L5f
            fcsu r3 = r7.k     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L80
            aqsa r3 = (defpackage.aqsa) r3     // Catch: java.lang.Throwable -> L80
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L24
            if (r8 < 0) goto L42
            goto L32
        L24:
            fcsu r3 = r7.d     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> L80
            crny r3 = (defpackage.crny) r3     // Catch: java.lang.Throwable -> L80
            int r3 = r3.f()     // Catch: java.lang.Throwable -> L80
            if (r8 < r3) goto L42
        L32:
            cqha r3 = new cqha     // Catch: java.lang.Throwable -> L80
            r3.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.Object r1 = j$.util.Map.EL.computeIfAbsent(r1, r2, r3)     // Catch: java.lang.Throwable -> L80
            r3 = r1
            cqgm r3 = (defpackage.cqgm) r3     // Catch: java.lang.Throwable -> L80
            r3.b()     // Catch: java.lang.Throwable -> L80
            goto L5f
        L42:
            eksp r1 = defpackage.cqhd.a     // Catch: java.lang.Throwable -> L80
            ekrw r1 = r1.j()     // Catch: java.lang.Throwable -> L80
            eksl r1 = (defpackage.eksl) r1     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager"
            java.lang.String r3 = "getNetworkState"
            r5 = 209(0xd1, float:2.93E-43)
            ekrw r1 = r1.h(r2, r3, r5, r4)     // Catch: java.lang.Throwable -> L80
            eksl r1 = (defpackage.eksl) r1     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "getNetworkState: NetworkStateMonitor can't be registered for invalid subId %d."
            r1.r(r2, r8)     // Catch: java.lang.Throwable -> L80
            cqgl r8 = defpackage.cqgl.UNKNOWN     // Catch: java.lang.Throwable -> L80
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return r8
        L5f:
            eksp r1 = defpackage.cqhd.a     // Catch: java.lang.Throwable -> L80
            ekrw r1 = r1.n()     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager"
            java.lang.String r5 = "getNetworkState"
            r6 = 216(0xd8, float:3.03E-43)
            ekrw r1 = r1.h(r2, r5, r6, r4)     // Catch: java.lang.Throwable -> L80
            eksl r1 = (defpackage.eksl) r1     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "getNetworkState for subId %d: %s."
            cqgl r4 = r3.a()     // Catch: java.lang.Throwable -> L80
            r1.w(r2, r8, r4)     // Catch: java.lang.Throwable -> L80
            cqgl r8 = r3.a()     // Catch: java.lang.Throwable -> L80
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return r8
        L80:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqhd.a(int):cqgl");
    }

    public final void b(cqew cqewVar, int i) {
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = new ArrayList();
        Map map = this.i;
        Map.EL.putIfAbsent(map, numValueOf, arrayList);
        List list = (List) map.get(numValueOf);
        if (list == null || list.contains(cqewVar)) {
            return;
        }
        list.add(cqewVar);
    }

    public final void c(int i) {
        ((cqgm) Map.EL.computeIfAbsent(this.h, Integer.valueOf(i), new Function() { // from class: cqgx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqhd cqhdVar = this.a;
                return ((cqgn) cqhdVar.c.b()).a(new cqhc(cqhdVar), ((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).b();
    }

    public final boolean d() {
        synchronized (this.j) {
            java.util.Map map = this.i;
            if (!map.isEmpty()) {
                ekqg ekqgVarListIterator = ekhx.o(map.keySet()).listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    if (!e(((Integer) ekqgVarListIterator.next()).intValue())) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public final boolean e(int i) {
        List list = (List) this.i.get(Integer.valueOf(i));
        return list == null || list.isEmpty();
    }
}
