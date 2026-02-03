package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eskl implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final eskj b;
    private final esjp f;
    private final PowerManager.WakeLock g;
    private final long h;

    public eskl(eskj eskjVar, Context context, esjp esjpVar, long j) {
        this.b = eskjVar;
        this.a = context;
        this.h = j;
        this.f = esjpVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean b() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (c) {
            Boolean bool = d;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? d(context, "android.permission.WAKE_LOCK") : bool.booleanValue());
            d = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean d(Context context, String str) {
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", a.a(str, "Missing Permission: ", ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"));
        return false;
    }

    public final synchronized boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r4 = r2.b;
        r5 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r5 == 83) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r5 == 85) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r4.equals("U") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r4.equals("S") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        r4 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
    
        if (r4 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c3, code lost:
    
        if (r4 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
    
        if (defpackage.eskj.e() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.b(r2, "Unknown topic operation", "."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        r4 = r2.a;
        r5 = r0.a;
        r6 = r0.b.c();
        r7 = new android.os.Bundle();
        r7.putString("gcm.topic", "/topics/".concat(r4));
        r7.putString("delete", "1");
        defpackage.eskj.a(defpackage.esjk.b(r5.a(r6, "/topics/".concat(r4), r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        if (defpackage.eskj.e() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0112, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.a(r4, "Unsubscribe from topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0120, code lost:
    
        r4 = r2.a;
        r5 = r0.a;
        r6 = r0.b.c();
        r7 = new android.os.Bundle();
        r7.putString("gcm.topic", "/topics/".concat(r4));
        defpackage.eskj.a(defpackage.esjk.b(r5.a(r6, "/topics/".concat(r4), r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
    
        if (defpackage.eskj.e() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0151, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.a(r4, "Subscribe to topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        r0.d.c(r2);
        r4 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0166, code lost:
    
        r2 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        if (r4.containsKey(r2) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
    
        r5 = (java.util.ArrayDeque) r4.get(r2);
        r6 = (defpackage.defr) r5.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        if (r6 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017f, code lost:
    
        r6.b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
    
        if (r5.isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0189, code lost:
    
        r4.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0192, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
    
        if ("SERVICE_NOT_AVAILABLE".equals(r0.getMessage()) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b0, code lost:
    
        if (r0.getMessage() == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r0.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        r10.b.d(r10.h);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eskl.run():void");
    }
}
