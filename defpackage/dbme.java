package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbme {
    public final AtomicLong a = new AtomicLong(-1);
    private final ejxr b;

    private dbme(final Context context) {
        final dcls dclsVar = new dcls("auth:gau");
        this.b = ejxx.a(new ejxr() { // from class: dbmc
            @Override // defpackage.ejxr
            public final Object get() {
                return new dcma(context, dclsVar);
            }
        });
    }

    public static dbme a(Context context) {
        dzzh.f(context);
        return new dbme(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if ((r2 - r0.get()) > java.util.concurrent.TimeUnit.MINUTES.toMillis(30)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(int r19, int r20, long r21, long r23, long r25) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L81
            fazt r0 = defpackage.fazt.a     // Catch: java.lang.Throwable -> L81
            fazu r0 = r0.get()     // Catch: java.lang.Throwable -> L81
            double r4 = r0.a()     // Catch: java.lang.Throwable -> L81
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L81
            r0.<init>()     // Catch: java.lang.Throwable -> L81
            float r0 = r0.nextFloat()     // Catch: java.lang.Throwable -> L81
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L81
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L20
            goto L7f
        L20:
            java.util.concurrent.atomic.AtomicLong r0 = r1.a     // Catch: java.lang.Throwable -> L81
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L81
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L2d
            goto L3f
        L2d:
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L81
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L81
            r6 = 30
            long r6 = r0.toMillis(r6)     // Catch: java.lang.Throwable -> L81
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L7f
        L3f:
            ejxr r0 = r1.b     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L81
            dclr r0 = (defpackage.dclr) r0     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L81
            r5 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L81
            com.google.android.gms.common.internal.MethodInvocation r6 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L81
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L81
            long r7 = r7 - r25
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L81
            r9 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r8 = r20
            r10 = r21
            r12 = r23
            r17 = r7
            r7 = r19
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L81
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L81
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L81
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L81
            defn r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L81
            dbmd r4 = new dbmd     // Catch: java.lang.Throwable -> L81
            r4.<init>()     // Catch: java.lang.Throwable -> L81
            r0.t(r4)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r18)
            return
        L7f:
            monitor-exit(r18)
            return
        L81:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L81
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbme.b(int, int, long, long, long):void");
    }
}
