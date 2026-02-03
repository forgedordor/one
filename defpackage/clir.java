package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clir implements egsc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker");
    public final clii b;
    public final cqbm c;
    public final egsh d;
    public final Duration e;
    public final fcyh f;
    private final awlc g;
    private final awzf h;
    private final awyu i;
    private final fdjx j;
    private final asal k;

    public clir(awlc awlcVar, clii cliiVar, awzf awzfVar, awyu awyuVar, cqbm cqbmVar, egsh egshVar, Duration duration, fdjx fdjxVar, fcyh fcyhVar, asal asalVar) {
        awlcVar.getClass();
        awzfVar.getClass();
        awyuVar.getClass();
        cqbmVar.getClass();
        egshVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.g = awlcVar;
        this.b = cliiVar;
        this.h = awzfVar;
        this.i = awyuVar;
        this.c = cqbmVar;
        this.d = egshVar;
        this.e = duration;
        this.j = fdjxVar;
        this.f = fcyhVar;
        this.k = asalVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        return auvw.c(this.j, fcyi.a, fdjz.a, new cliq(workerParameters, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clir.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.clip
            if (r0 == 0) goto L13
            r0 = r8
            clip r0 = (defpackage.clip) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            clip r0 = new clip
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axcm r7 = r0.d
            defpackage.fctl.b(r8)
            goto L6d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fctl.b(r8)
            if (r7 != 0) goto L5c
            ekrg r7 = defpackage.clir.a
            ekrw r7 = r7.j()
            ekrz r8 = defpackage.eksq.a
            java.lang.String r0 = "BugleSatellite"
            r7.X(r8, r0)
            r8 = 87
            java.lang.String r0 = "NotifySatelliteConnectionChangeWorker.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker"
            java.lang.String r2 = "notifyOnNewInServiceTerrestrialConnection"
            ekrw r7 = r7.h(r1, r2, r8, r0)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r8 = "Serialized MyIdentityToken was null"
            r7.q(r8)
            qam r7 = new qam
            r7.<init>()
            return r7
        L5c:
            awzf r8 = r6.h
            axcm r7 = defpackage.axcm.a(r7)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r8.g(r7, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            awlc r0 = r6.g
            awxn r8 = (defpackage.awxn) r8
            clik r1 = new clik
            r1.<init>()
            r0.d(r1)
            clii r7 = r6.b
            r8.getClass()
            awyu r0 = r7.b
            awyv r0 = r0.a(r8)
            ekhx r0 = r0.a()
            ekqg r0 = r0.listIterator()
            r0.getClass()
        L8f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            android.net.ConnectivityManager r2 = r7.a
            axcm r3 = r8.b()
            java.lang.String r4 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_WIFI_CONNECTION"
            r5 = 2
            android.app.PendingIntent r3 = defpackage.clii.d(r7, r3, r4, r5)
            r2.unregisterNetworkCallback(r3)
            axcm r3 = r8.b()
            java.lang.String r4 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_CELLULAR_CONNECTION"
            android.app.PendingIntent r1 = r7.a(r3, r1, r4)
            r2.unregisterNetworkCallback(r1)
            goto L8f
        Lb9:
            r7.b()
            qao r7 = new qao
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clir.e(java.lang.String, fcxy):java.lang.Object");
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
