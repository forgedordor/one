package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eskf implements Runnable {
    public final FirebaseMessaging a;
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dcnq("firebase-iid-executor"));
    private final long c;
    private final PowerManager.WakeLock d;

    public eskf(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean b() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    final Context a() {
        return this.a.d;
    }

    final boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (esjz.a().c(a())) {
            this.d.acquire();
        }
        try {
            try {
                FirebaseMessaging firebaseMessaging = this.a;
                boolean z = true;
                firebaseMessaging.f(true);
                if (firebaseMessaging.g.f()) {
                    esjz esjzVarA = esjz.a();
                    Context contextA = a();
                    if (esjzVarA.b == null) {
                        if (contextA.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        esjzVarA.b = Boolean.valueOf(z);
                    }
                    if (!esjzVarA.a.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                    }
                    if (!esjzVarA.b.booleanValue() || c()) {
                        try {
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                            } else {
                                if (e.getMessage() != null) {
                                    throw e;
                                }
                                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                            }
                        } catch (SecurityException unused) {
                            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                        if (firebaseMessaging.c() == null) {
                            Log.e("FirebaseMessaging", "Token retrieval failed: null");
                            this.a.h(this.c);
                        } else {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Token successfully retrieved");
                            }
                            this.a.f(false);
                        }
                    } else {
                        eske eskeVar = new eske(this);
                        if (b()) {
                            Log.d("FirebaseMessaging", "Connectivity change received registered");
                        }
                        eskeVar.a.a().registerReceiver(eskeVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    }
                } else {
                    firebaseMessaging.f(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.f(false);
            }
        } finally {
            if (esjz.a().c(a())) {
                this.d.release();
            }
        }
    }
}
