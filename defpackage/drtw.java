package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drtw implements drly {
    public static final drtw a = new drtw();
    private volatile drty e;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final Map d = new HashMap();
    public final Map c = new WeakHashMap();

    public drtw() {
        drlx.a.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.drtv a(java.lang.Class r5, java.lang.String r6, java.lang.Object r7) {
        /*
            r4 = this;
            j$.util.concurrent.ConcurrentHashMap r0 = r4.b
            java.lang.Object r1 = r0.get(r6)
            drtv r1 = (defpackage.drtv) r1
            if (r1 == 0) goto L25
            java.lang.Class r2 = r1.b
            if (r2 != r5) goto Lf
            goto L75
        Lf:
            boolean r1 = defpackage.drxl.a
            if (r1 != 0) goto L17
            r0.remove(r6)
            goto L25
        L17:
            java.lang.String r5 = "Flag ["
            java.lang.String r7 = "] with different type already exists: "
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = defpackage.a.G(r6, r2, r5, r7)
            r0.<init>(r5)
            throw r0
        L25:
            boolean r1 = defpackage.drxl.a
            if (r1 == 0) goto L46
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L38
            java.lang.String r1 = "^[a-zA-Z0-9_]*$"
            boolean r1 = r6.matches(r1)
            if (r1 == 0) goto L38
            goto L46
        L38:
            java.lang.String r5 = "Invalid flag name ["
            java.lang.String r7 = "]"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = defpackage.a.a(r6, r5, r7)
            r0.<init>(r5)
            throw r0
        L46:
            drtv r1 = new drtv
            r1.<init>(r6, r5)
            java.util.Map r5 = r4.d
            monitor-enter(r5)
            java.lang.Object r2 = r5.remove(r6)     // Catch: java.lang.Throwable -> L79
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L6a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L79
        L5a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L79
            drtz r3 = (defpackage.drtz) r3     // Catch: java.lang.Throwable -> L79
            r1.g(r3)     // Catch: java.lang.Throwable -> L79
            goto L5a
        L6a:
            java.lang.Object r6 = r0.putIfAbsent(r6, r1)     // Catch: java.lang.Throwable -> L79
            drtv r6 = (defpackage.drtv) r6     // Catch: java.lang.Throwable -> L79
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            if (r6 != 0) goto L74
            goto L75
        L74:
            r1 = r6
        L75:
            r1.i(r7)
            return r1
        L79:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drtw.a(java.lang.Class, java.lang.String, java.lang.Object):drtv");
    }
}
