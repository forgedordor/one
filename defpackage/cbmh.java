package defpackage;

import android.app.Notification;
import android.os.Build;
import com.google.android.apps.messaging.shared.datamodel.workqueue.foregroundservice.BugleDataSyncForegroundService;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmh {
    private static final cqce b = cqce.g("BugleWorkQueue", "WorkQueueWorkerRunner");
    public final cbod a;
    private final cogw c;
    private final cbmx d;
    private final caxe e;
    private final fdjx f;
    private final feav g;
    private final feav h;
    private final Map i;
    private final Map j;

    public cbmh(cogw cogwVar, cbod cbodVar, cbmx cbmxVar, caxe caxeVar, fdjx fdjxVar) {
        cogwVar.getClass();
        cbmxVar.getClass();
        caxeVar.getClass();
        fdjxVar.getClass();
        this.c = cogwVar;
        this.a = cbodVar;
        this.d = cbmxVar;
        this.e = caxeVar;
        this.f = fdjxVar;
        this.g = new feaz();
        this.h = new feaz();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
    }

    private final void g(eiju eijuVar, caya cayaVar) {
        caxl caxlVar = (caxl) cayaVar;
        Notification notification = caxlVar.g;
        if (notification == null) {
            throw new IllegalStateException("ForegroundServiceNotification cannot be null.");
        }
        Optional optional = caxlVar.k;
        if (optional == null || optional.isEmpty()) {
            throw new IllegalStateException("Foreground service type cannot be null or empty.");
        }
        int iIntValue = ((Number) optional.get()).intValue();
        Class<BugleDataSyncForegroundService> cls = null;
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2048) {
                    throw new IllegalStateException(a.g(iIntValue, "Unexpected foreground service type: "));
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                cls = BugleDataSyncForegroundService.class;
            }
        }
        if (cls == null) {
            this.e.e(eijuVar, notification, 13);
        } else {
            this.e.g(eijuVar, notification, cls, ((Number) optional.get()).intValue());
        }
    }

    private final void h(fdkf fdkfVar, caya cayaVar) {
        caze cazeVar = ((caxl) cayaVar).b;
        eiju eijuVarA = auvw.a(fdkfVar);
        if (cazeVar != null) {
            int iOrdinal = cazeVar.ordinal();
            if (iOrdinal == 0) {
                Objects.toString(cazeVar);
                throw new IllegalStateException("Unexpected value: ".concat(cazeVar.toString()));
            }
            if (iOrdinal == 1 || iOrdinal == 2) {
                try {
                    caxe caxeVar = this.e;
                    caxeVar.c(eijuVarA);
                    caxeVar.a(eijuVarA);
                    return;
                } catch (IllegalStateException unused) {
                    b.p("unable to attach service - probably in background already");
                    if (cazeVar == caze.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE) {
                        g(eijuVarA, cayaVar);
                        return;
                    }
                    return;
                }
            }
            if (iOrdinal == 3) {
                this.e.c(eijuVarA);
                g(eijuVarA, cayaVar);
                return;
            }
        }
        b.p("Unspecified KeepAliveStrategy.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:31:0x0086, B:33:0x0091, B:35:0x0097, B:36:0x00a5, B:38:0x00af), top: B:60:0x0086, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #1 {all -> 0x00d9, blocks: (B:31:0x0086, B:33:0x0091, B:35:0x0097, B:36:0x00a5, B:38:0x00af), top: B:60:0x0086, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #3 {all -> 0x00de, blocks: (B:41:0x00be, B:43:0x00c3, B:51:0x00da, B:52:0x00dd, B:28:0x006e, B:31:0x0086, B:33:0x0091, B:35:0x0097, B:36:0x00a5, B:38:0x00af), top: B:63:0x006e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, defpackage.fcxy r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmh.a(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cblw
            if (r0 == 0) goto L13
            r0 = r6
            cblw r0 = (defpackage.cblw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cblw r0 = new cblw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            feaz r5 = r0.e
            java.lang.String r0 = r0.d
            defpackage.fctl.b(r6)
            r6 = r5
            r5 = r0
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            feav r6 = r4.h
            r0.d = r5
            r2 = r6
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L82
        L49:
            java.util.Map r0 = r4.j     // Catch: java.lang.Throwable -> L7d
            r0.remove(r5)     // Catch: java.lang.Throwable -> L7d
            java.util.Map r0 = r4.i     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.remove(r5)     // Catch: java.lang.Throwable -> L7d
            fdkf r0 = (defpackage.fdkf) r0     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L6f
            boolean r1 = r0.v()     // Catch: java.lang.Throwable -> L7d
            if (r1 != r3) goto L6f
            cqce r0 = defpackage.cbmh.b     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = " work has completed."
            java.lang.String r5 = defpackage.a.x(r5, r1)     // Catch: java.lang.Throwable -> L7d
            r0.p(r5)     // Catch: java.lang.Throwable -> L7d
            fctx r5 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L7d
            r6.d()
            return r5
        L6f:
            java.lang.String r5 = "Invalid state: "
            java.lang.String r1 = " is not active when being completed"
            java.lang.String r5 = defpackage.a.h(r0, r5, r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L7d
            throw r0     // Catch: java.lang.Throwable -> L7d
        L7d:
            r5 = move-exception
            r6.d()
            throw r5
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmh.b(java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.cblu r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cblx
            if (r0 == 0) goto L13
            r0 = r7
            cblx r0 = (defpackage.cblx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cblx r0 = new cblx
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            feaz r5 = r0.f
            cblu r6 = r0.e
            java.lang.String r0 = r0.d
            defpackage.fctl.b(r7)
            r7 = r5
            r5 = r0
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.fctl.b(r7)
            feav r7 = r4.h
            r0.d = r5
            r0.e = r6
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.f = r2
            r0.c = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto L65
        L4d:
            java.util.Map r0 = r4.j     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L60
            java.util.EnumSet r5 = (java.util.EnumSet) r5     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L5a
            r5.remove(r6)     // Catch: java.lang.Throwable -> L60
        L5a:
            fctx r5 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L60
            r7.d()
            return r5
        L60:
            r5 = move-exception
            r7.d()
            throw r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmh.c(java.lang.String, cblu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:25:0x0096, B:27:0x009e, B:28:0x00aa, B:30:0x00b2, B:32:0x00ba, B:35:0x00d9, B:40:0x0121, B:36:0x00eb, B:39:0x0115, B:44:0x0131, B:45:0x0136), top: B:54:0x0096, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:25:0x0096, B:27:0x009e, B:28:0x00aa, B:30:0x00b2, B:32:0x00ba, B:35:0x00d9, B:40:0x0121, B:36:0x00eb, B:39:0x0115, B:44:0x0131, B:45:0x0136), top: B:54:0x0096, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131 A[Catch: all -> 0x0137, TRY_ENTER, TryCatch #0 {all -> 0x0137, blocks: (B:25:0x0096, B:27:0x009e, B:28:0x00aa, B:30:0x00b2, B:32:0x00ba, B:35:0x00d9, B:40:0x0121, B:36:0x00eb, B:39:0x0115, B:44:0x0131, B:45:0x0136), top: B:54:0x0096, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.cblu r9, java.lang.Runnable r10, defpackage.caya r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmh.d(java.lang.String, cblu, java.lang.Runnable, caya, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r0 != r7) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, defpackage.cblu r12, java.lang.Runnable r13, defpackage.caya r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r2 = r15 instanceof defpackage.cbmb
            if (r2 == 0) goto L13
            r2 = r15
            cbmb r2 = (defpackage.cbmb) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.d = r3
            goto L18
        L13:
            cbmb r2 = new cbmb
            r2.<init>(r10, r15)
        L18:
            r6 = r2
            java.lang.Object r0 = r6.b
            fcyl r7 = defpackage.fcyl.a
            int r2 = r6.d
            r8 = 3
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L51
            if (r2 == r3) goto L47
            if (r2 == r9) goto L3b
            if (r2 == r8) goto L32
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L32:
            java.lang.Object r2 = r6.a
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
            defpackage.fctl.b(r0)
            goto Lad
        L3b:
            cblu r2 = r6.e
            java.lang.Object r3 = r6.a
            java.lang.String r3 = (java.lang.String) r3
            defpackage.fctl.b(r0)     // Catch: java.util.concurrent.CancellationException -> L45
            goto L75
        L45:
            r0 = move-exception
            goto L78
        L47:
            cblu r2 = r6.e
            java.lang.Object r3 = r6.a
            java.lang.String r3 = (java.lang.String) r3
            defpackage.fctl.b(r0)
            goto L67
        L51:
            defpackage.fctl.b(r0)
            r6.a = r11
            r6.e = r12
            r6.d = r3
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.Object r0 = r1.d(r2, r3, r4, r5, r6)
            if (r0 == r7) goto Lae
            r3 = r11
            r2 = r12
        L67:
            fdkf r0 = (defpackage.fdkf) r0
            r6.a = r3     // Catch: java.util.concurrent.CancellationException -> L45
            r6.e = r2     // Catch: java.util.concurrent.CancellationException -> L45
            r6.d = r9     // Catch: java.util.concurrent.CancellationException -> L45
            java.lang.Object r0 = r0.c(r6)     // Catch: java.util.concurrent.CancellationException -> L45
            if (r0 == r7) goto Lae
        L75:
            qap r0 = (defpackage.qap) r0     // Catch: java.util.concurrent.CancellationException -> L45
            return r0
        L78:
            cqce r4 = defpackage.cbmh.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Runner "
            r5.<init>(r9)
            r5.append(r2)
            java.lang.String r9 = " cancelled for "
            r5.append(r9)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.p(r5)
            fdmk r4 = defpackage.fdmk.a
            fcyh r4 = defpackage.eicg.a(r4)
            cbma r5 = new cbma
            r9 = 0
            r5.<init>(r9, r10, r3, r2)
            r6.a = r0
            r6.e = r9
            r6.d = r8
            java.lang.Object r2 = defpackage.fdin.a(r4, r5, r6)
            if (r2 != r7) goto Lac
            goto Lae
        Lac:
            r2 = r0
        Lad:
            throw r2
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmh.e(java.lang.String, cblu, java.lang.Runnable, caya, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r17, java.lang.Runnable r18, defpackage.fcxy r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbmh.f(java.lang.String, java.lang.Runnable, fcxy):java.lang.Object");
    }
}
