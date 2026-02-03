package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esku implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private eskq e;
    private boolean f;

    public esku(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new dcnq("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (true) {
            Queue queue = this.d;
            if (queue.isEmpty()) {
                return;
            } else {
                ((eskt) queue.poll()).b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        android.util.Log.d("FirebaseMessaging", "binder is dead. start connection? " + (!r5.f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r5.f == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r5.f = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (defpackage.dcmt.a().c(r5.a, r5.b, r5, 65) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        android.util.Log.e("FirebaseMessaging", "binding to the service failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Exception while binding the service", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void c() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> Ld6
        L12:
            java.util.Queue r0 = r5.d     // Catch: java.lang.Throwable -> Ld6
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            if (r2 != 0) goto Ld4
            java.lang.String r2 = "FirebaseMessaging"
            boolean r2 = android.util.Log.isLoggable(r2, r1)     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto L29
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "found intent to be delivered"
            android.util.Log.d(r2, r3)     // Catch: java.lang.Throwable -> Ld6
        L29:
            eskq r2 = r5.e     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto L83
            boolean r2 = r2.isBinderAlive()     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto L83
            java.lang.String r2 = "FirebaseMessaging"
            boolean r2 = android.util.Log.isLoggable(r2, r1)     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto L42
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "binder is alive, sending the intent."
            android.util.Log.d(r2, r3)     // Catch: java.lang.Throwable -> Ld6
        L42:
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> Ld6
            eskt r0 = (defpackage.eskt) r0     // Catch: java.lang.Throwable -> Ld6
            eskq r2 = r5.e     // Catch: java.lang.Throwable -> Ld6
            int r3 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> Ld6
            int r4 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> Ld6
            if (r3 != r4) goto L7b
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r1)     // Catch: java.lang.Throwable -> Ld6
            if (r3 == 0) goto L63
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r4 = "service received new intent via bind strategy"
            android.util.Log.d(r3, r4)     // Catch: java.lang.Throwable -> Ld6
        L63:
            esiq r2 = r2.a     // Catch: java.lang.Throwable -> Ld6
            android.content.Intent r3 = r0.a     // Catch: java.lang.Throwable -> Ld6
            esir r2 = r2.a     // Catch: java.lang.Throwable -> Ld6
            defn r2 = r2.d(r3)     // Catch: java.lang.Throwable -> Ld6
            esko r3 = new esko     // Catch: java.lang.Throwable -> Ld6
            r3.<init>()     // Catch: java.lang.Throwable -> Ld6
            eskp r4 = new eskp     // Catch: java.lang.Throwable -> Ld6
            r4.<init>()     // Catch: java.lang.Throwable -> Ld6
            r2.o(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            goto L12
        L7b:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = "Binding only allowed within app"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        L83:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            r1 = 1
            if (r0 == 0) goto La5
            boolean r0 = r5.f     // Catch: java.lang.Throwable -> Ld6
            r0 = r0 ^ r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r2.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = "binder is dead. start connection? "
            r2.append(r3)     // Catch: java.lang.Throwable -> Ld6
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = "FirebaseMessaging"
            android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> Ld6
        La5:
            boolean r0 = r5.f     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Laa
            goto Ld4
        Laa:
            r5.f = r1     // Catch: java.lang.Throwable -> Ld6
            dcmt r0 = defpackage.dcmt.a()     // Catch: java.lang.SecurityException -> Lc4 java.lang.Throwable -> Ld6
            android.content.Context r1 = r5.a     // Catch: java.lang.SecurityException -> Lc4 java.lang.Throwable -> Ld6
            android.content.Intent r2 = r5.b     // Catch: java.lang.SecurityException -> Lc4 java.lang.Throwable -> Ld6
            r3 = 65
            boolean r0 = r0.c(r1, r2, r5, r3)     // Catch: java.lang.SecurityException -> Lc4 java.lang.Throwable -> Ld6
            if (r0 != 0) goto Ld4
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "binding to the service failed"
            android.util.Log.e(r0, r1)     // Catch: java.lang.SecurityException -> Lc4 java.lang.Throwable -> Ld6
            goto Lcc
        Lc4:
            r0 = move-exception
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld6
        Lcc:
            r0 = 0
            r5.f = r0     // Catch: java.lang.Throwable -> Ld6
            r5.b()     // Catch: java.lang.Throwable -> Ld6
            monitor-exit(r5)
            return
        Ld4:
            monitor-exit(r5)
            return
        Ld6:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Ld6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esku.c():void");
    }

    final synchronized defn a(Intent intent) {
        final eskt esktVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        esktVar = new eskt(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: eskr
            @Override // java.lang.Runnable
            public final void run() {
                eskt esktVar2 = esktVar;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + esktVar2.a.getAction() + " finishing.");
                esktVar2.b();
            }
        }, 20L, TimeUnit.SECONDS);
        esktVar.a().o(scheduledExecutorService, new defb() { // from class: esks
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                scheduledFutureSchedule.cancel(false);
            }
        });
        this.d.add(esktVar);
        c();
        return esktVar.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        this.f = false;
        if (iBinder instanceof eskq) {
            this.e = (eskq) iBinder;
            c();
        } else {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(iBinder))));
            b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        c();
    }
}
