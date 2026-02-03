package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddqp {
    private static final String a = "ddqp";
    private static boolean b = false;
    private static ddqo c = ddqo.LEGACY;

    private ddqp() {
    }

    public static synchronized void a(Context context) {
        b(context, null, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:50|10|45|11|(1:13)|14|15|(8:17|(1:(0)(1:21))|47|23|(1:25)|26|30|(3:32|33|34))|22|47|23|(0)|26|30|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        android.util.Log.e(defpackage.ddqp.a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: RemoteException -> 0x0069, all -> 0x009a, TryCatch #1 {RemoteException -> 0x0069, blocks: (B:23:0x0057, B:25:0x005d, B:26:0x0061), top: B:47:0x0057, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x0021, B:10:0x0028, B:11:0x002c, B:13:0x003d, B:15:0x0045, B:17:0x004b, B:23:0x0057, B:25:0x005d, B:26:0x0061, B:30:0x0071, B:32:0x0088, B:29:0x006a, B:38:0x0092, B:39:0x0097), top: B:49:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void b(android.content.Context r5, defpackage.ddqo r6, defpackage.czdt r7) {
        /*
            java.lang.Class<ddqp> r0 = defpackage.ddqp.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            defpackage.dclh.n(r5, r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = defpackage.ddqp.a     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L9a
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L9a
            boolean r1 = defpackage.ddqp.b     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L28
            if (r7 == 0) goto L8f
            ddqo r5 = defpackage.ddqp.c     // Catch: java.lang.Throwable -> L9a
            r7.a(r5)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r0)
            return
        L28:
            com.google.android.gms.maps.internal.ICreator r1 = defpackage.ddrb.b(r5, r6)     // Catch: defpackage.dcen -> L98 java.lang.Throwable -> L9a
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r2 = r1.newCameraUpdateFactoryDelegate()     // Catch: android.os.RemoteException -> L91 java.lang.Throwable -> L9a
            defpackage.dclh.m(r2)     // Catch: android.os.RemoteException -> L91 java.lang.Throwable -> L9a
            defpackage.ddqe.a = r2     // Catch: android.os.RemoteException -> L91 java.lang.Throwable -> L9a
            com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate r2 = r1.newBitmapDescriptorFactoryDelegate()     // Catch: android.os.RemoteException -> L91 java.lang.Throwable -> L9a
            com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate r3 = defpackage.ddrd.a     // Catch: android.os.RemoteException -> L91 java.lang.Throwable -> L9a
            if (r3 != 0) goto L44
            java.lang.String r3 = "delegate must not be null"
            defpackage.dclh.n(r2, r3)     // Catch: android.os.RemoteException -> L91 java.lang.Throwable -> L9a
            defpackage.ddrd.a = r2     // Catch: android.os.RemoteException -> L91 java.lang.Throwable -> L9a
        L44:
            r2 = 1
            defpackage.ddqp.b = r2     // Catch: java.lang.Throwable -> L9a
            r3 = 2
            r4 = 0
            if (r6 == 0) goto L56
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L57
            if (r6 == r2) goto L54
            goto L56
        L54:
            r2 = r3
            goto L57
        L56:
            r2 = r4
        L57:
            int r6 = r1.getRendererType()     // Catch: android.os.RemoteException -> L69 java.lang.Throwable -> L9a
            if (r6 != r3) goto L61
            ddqo r6 = defpackage.ddqo.LATEST     // Catch: android.os.RemoteException -> L69 java.lang.Throwable -> L9a
            defpackage.ddqp.c = r6     // Catch: android.os.RemoteException -> L69 java.lang.Throwable -> L9a
        L61:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L69 java.lang.Throwable -> L9a
            r1.logInitialization(r5, r2)     // Catch: android.os.RemoteException -> L69 java.lang.Throwable -> L9a
            goto L71
        L69:
            r5 = move-exception
            java.lang.String r6 = defpackage.ddqp.a     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L9a
        L71:
            java.lang.String r5 = defpackage.ddqp.a     // Catch: java.lang.Throwable -> L9a
            ddqo r6 = defpackage.ddqp.c     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L9a
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L9a
            if (r7 == 0) goto L8f
            ddqo r5 = defpackage.ddqp.c     // Catch: java.lang.Throwable -> L9a
            r7.a(r5)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r0)
            return
        L8f:
            monitor-exit(r0)
            return
        L91:
            r5 = move-exception
            ddrw r6 = new ddrw     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L9a
            throw r6     // Catch: java.lang.Throwable -> L9a
        L98:
            monitor-exit(r0)
            return
        L9a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddqp.b(android.content.Context, ddqo, czdt):void");
    }
}
