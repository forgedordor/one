package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvs implements ecgu {
    public final dtro a;
    private final Context b;
    private final duru c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public duvs(Context context, duru duruVar, dtro dtroVar) {
        this.b = context;
        this.c = duruVar;
        this.a = dtroVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    @Override // defpackage.ecgu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r8) {
        /*
            r7 = this;
            java.lang.String r0 = "NetworkUsageMonitor"
            android.content.Context r1 = r7.b
            r2 = 0
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.SecurityException -> Le
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.SecurityException -> Le
            goto L14
        Le:
            java.lang.String r1 = "%s: Couldn't retrieve ConnectivityManager."
            defpackage.durt.g(r1, r0)
            r1 = r2
        L14:
            if (r1 != 0) goto L17
            goto L1b
        L17:
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()
        L1b:
            r1 = 1
            r3 = 0
            if (r2 != 0) goto L26
            java.lang.String r2 = "%s: Fail to get network type "
            defpackage.durt.g(r2, r0)
        L24:
            r2 = r3
            goto L3e
        L26:
            int r4 = r2.getType()
            if (r4 == r1) goto L24
            int r4 = r2.getType()
            r5 = 9
            if (r4 == r5) goto L24
            int r2 = r2.getType()
            r4 = 17
            if (r2 != r4) goto L3d
            goto L24
        L3d:
            r2 = r1
        L3e:
            if (r2 == 0) goto L46
            java.util.concurrent.atomic.AtomicLong r4 = r7.e
            r4.getAndAdd(r8)
            goto L4b
        L46:
            java.util.concurrent.atomic.AtomicLong r4 = r7.d
            r4.getAndAdd(r8)
        L4b:
            if (r1 == r2) goto L50
            java.lang.String r2 = "wifi"
            goto L52
        L50:
            java.lang.String r2 = "cellular"
        L52:
            dtro r4 = r7.a
            dtrw r4 = r4.c
            if (r4 != 0) goto L5a
            dtrw r4 = defpackage.dtrw.a
        L5a:
            java.lang.String r4 = r4.c
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.concurrent.atomic.AtomicLong r9 = r7.d
            long r5 = r9.get()
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            java.util.concurrent.atomic.AtomicLong r5 = r7.e
            long r5 = r5.get()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            r6[r1] = r2
            r0 = 2
            r6[r0] = r4
            r0 = 3
            r6[r0] = r8
            r8 = 4
            r6[r8] = r9
            r8 = 5
            r6[r8] = r5
            java.lang.String r8 = "%s: Received data (%s) for fileGroup = %s, len = %d, wifiCounter = %d, cellularCounter = %d"
            defpackage.durt.m(r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duvs.a(long):void");
    }

    @Override // defpackage.ecgu
    public final void b() {
        dtrn dtrnVar = (dtrn) this.a.toBuilder();
        long andSet = this.e.getAndSet(0L);
        dtrnVar.copyOnWrite();
        dtro dtroVar = (dtro) dtrnVar.instance;
        dtroVar.b |= 16;
        dtroVar.g = andSet;
        long andSet2 = this.d.getAndSet(0L);
        dtrnVar.copyOnWrite();
        dtro dtroVar2 = (dtro) dtrnVar.instance;
        dtroVar2.b |= 32;
        dtroVar2.h = andSet2;
        eika.l(this.c.g((dtro) dtrnVar.build()), new duvr(this), eoqg.a);
    }
}
