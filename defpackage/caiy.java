package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caiy {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsListItemsPrefetchCache");
    private final fdjx b;
    private final Map c;
    private final Map d;
    private final Map e;

    public caiy(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.b = fdjxVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    private final Map e(Class cls) {
        Map map;
        if (fdbq.f(cls, eqnd.class)) {
            map = this.c;
        } else if (fdbq.f(cls, eqjv.class)) {
            map = this.d;
        } else {
            if (!fdbq.f(cls, eqnl.class)) {
                throw new UnsupportedOperationException("Unrecognized entity type.");
            }
            map = this.e;
        }
        fdcm.g(map);
        return map;
    }

    public final eiju a(eiju eijuVar, fdap fdapVar, Class cls) {
        return auvw.c(this.b, fcyi.a, fdjz.a, new caix(this, eijuVar, fdapVar, cls, null));
    }

    public final eiju b(String str, Class cls) {
        eiju eijuVar;
        str.getClass();
        Map mapE = e(cls);
        synchronized (mapE) {
            eijuVar = (eiju) mapE.remove(str);
        }
        return eijuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eiju r6, defpackage.fdap r7, java.lang.Class r8, defpackage.fcxy r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.caiw
            if (r0 == 0) goto L13
            r0 = r9
            caiw r0 = (defpackage.caiw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            caiw r0 = new caiw
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Class r8 = r0.e
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r9)
            r0.a = r7
            r0.e = r8
            r0.d = r3
            java.lang.Object r9 = defpackage.fdxs.c(r6, r0)
            if (r9 == r1) goto L8d
        L42:
            cpvs r9 = (defpackage.cpvs) r9
            java.lang.String r6 = r9.b
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L89
            ekrg r0 = defpackage.caiy.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleCms"
            r0.X(r1, r2)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsListItemsPrefetchCache"
            java.lang.String r2 = "prefetchNextPage"
            r3 = 85
            java.lang.String r4 = "CmsListItemsPrefetchCache.kt"
            ekrw r0 = r0.h(r1, r2, r3, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Prefetching page %s"
            r0.t(r1, r6)
            java.util.Map r8 = r5.e(r8)
            monitor-enter(r8)
            caiu r0 = new caiu     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            caiv r7 = new caiv     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r6 = j$.util.Map.EL.computeIfAbsent(r8, r6, r7)     // Catch: java.lang.Throwable -> L86
            eiju r6 = (defpackage.eiju) r6     // Catch: java.lang.Throwable -> L86
            monitor-exit(r8)
            r6.getClass()
            goto L89
        L86:
            r6 = move-exception
            monitor-exit(r8)
            throw r6
        L89:
            r9.getClass()
            return r9
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caiy.c(eiju, fdap, java.lang.Class, fcxy):java.lang.Object");
    }

    public final void d() {
        Map map = this.c;
        synchronized (map) {
            map.clear();
        }
        Map map2 = this.d;
        synchronized (map2) {
            map2.clear();
        }
        Map map3 = this.e;
        synchronized (map3) {
            map3.clear();
        }
    }
}
