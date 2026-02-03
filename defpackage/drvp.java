package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drvp {
    private static final ekrg b = ekrg.c("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager");
    private static final Map c = new ConcurrentHashMap();
    public static final Map a = new ConcurrentHashMap();

    static {
        dryh.b();
    }

    private drvp() {
    }

    public static void a(drvl drvlVar) {
        if (drxl.a) {
            drvo drvoVar = (drvo) a.get(drvlVar.getClass());
            if (drvoVar == null || drvoVar.b != drvlVar) {
                throw new IllegalArgumentException(String.valueOf(String.valueOf(drvlVar)).concat(" is not a valid component tag"));
            }
        }
    }

    public static void b(String str, boolean z) {
        if (drxl.a && z) {
            throw new IllegalStateException(str);
        }
        ((ekrd) ((ekrd) b.j()).h("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager", "logErrorMessage", 616, "ComponentsReadinessManager.java")).t("%s", str);
    }

    public static void c(String str, drvl drvlVar) {
        synchronized (drvp.class) {
            Class<?> cls = drvlVar.getClass();
            Map map = c;
            drvo drvoVar = (drvo) map.get(str);
            Map map2 = a;
            drvo drvoVar2 = (drvo) map2.get(cls);
            if (drvoVar == null && drvoVar2 == null) {
                drvo drvoVar3 = new drvo(str, drvlVar);
                map.put(str, drvoVar3);
                map2.put(cls, drvoVar3);
            } else if (drvoVar != drvoVar2 || (drvoVar2 != null && drvoVar2.b != drvlVar)) {
                throw new IllegalArgumentException(a.x(str, " component is already registered with a different value."));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x0094, TryCatch #0 {, blocks: (B:11:0x002d, B:13:0x0033, B:16:0x0037, B:18:0x003f, B:21:0x0046, B:22:0x0056, B:24:0x005c, B:25:0x0076, B:29:0x0081), top: B:45:0x002d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(final defpackage.drvl r11) {
        /*
            a(r11)
            drvv r0 = defpackage.drvv.a()
            java.lang.Class r1 = r11.getClass()
            java.lang.String r2 = defpackage.drxu.a(r1)
            java.lang.String r2 = defpackage.drxu.b(r2)
            drxt r2 = defpackage.drvv.b(r2)
            boolean r3 = r11 instanceof defpackage.drvr     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L21
            drvu r3 = new drvu     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            goto L22
        L21:
            r3 = 0
        L22:
            r4 = r1
        L23:
            j$.util.concurrent.ConcurrentHashMap r5 = r0.c     // Catch: java.lang.Throwable -> L97
            drvt r6 = new drvt     // Catch: java.lang.Throwable -> L97
            r6.<init>()     // Catch: java.lang.Throwable -> L97
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L37
            boolean r5 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r3, r4)     // Catch: java.lang.Throwable -> L94
            if (r5 != 0) goto L37
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L94
            if (r4 == r1) goto L90
            goto L82
        L37:
            java.lang.Object r5 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r6, r4)     // Catch: java.lang.Throwable -> L94
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L81
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L46
            goto L81
        L46:
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L94
            drvx[] r6 = new defpackage.drvx[r6]     // Catch: java.lang.Throwable -> L94
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L94
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L94
            r7 = 0
            r8 = r7
        L56:
            boolean r9 = r5.hasNext()     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L76
            java.lang.Object r9 = r5.next()     // Catch: java.lang.Throwable -> L94
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> L94
            java.lang.Object r10 = r9.getValue()     // Catch: java.lang.Throwable -> L94
            drvx r10 = (defpackage.drvx) r10     // Catch: java.lang.Throwable -> L94
            r6[r8] = r10     // Catch: java.lang.Throwable -> L94
            java.lang.Object r9 = r9.getKey()     // Catch: java.lang.Throwable -> L94
            drvw r9 = (defpackage.drvw) r9     // Catch: java.lang.Throwable -> L94
            r10.a(r1, r11, r9)     // Catch: java.lang.Throwable -> L94
            int r8 = r8 + 1
            goto L56
        L76:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L94
        L77:
            if (r7 >= r8) goto L82
            r5 = r6[r7]     // Catch: java.lang.Throwable -> L97
            r5.b()     // Catch: java.lang.Throwable -> L97
            int r7 = r7 + 1
            goto L77
        L81:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L94
        L82:
            java.lang.Class r4 = r4.getSuperclass()     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto L90
            java.lang.Class<drvq> r5 = defpackage.drvq.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L97
            if (r5 != 0) goto L23
        L90:
            r2.close()
            return
        L94:
            r11 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L94
            throw r11     // Catch: java.lang.Throwable -> L97
        L97:
            r11 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r0 = move-exception
            r11.addSuppressed(r0)
        La0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drvp.d(drvl):void");
    }
}
