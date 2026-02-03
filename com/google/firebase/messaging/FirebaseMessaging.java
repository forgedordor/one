package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.a;
import defpackage.dbgu;
import defpackage.dcdb;
import defpackage.dclh;
import defpackage.dcnq;
import defpackage.defh;
import defpackage.defn;
import defpackage.degc;
import defpackage.erzj;
import defpackage.esfi;
import defpackage.esgt;
import defpackage.esgu;
import defpackage.eshc;
import defpackage.esis;
import defpackage.esix;
import defpackage.esiy;
import defpackage.esja;
import defpackage.esje;
import defpackage.esjg;
import defpackage.esjk;
import defpackage.esjp;
import defpackage.esjx;
import defpackage.eskc;
import defpackage.eskd;
import defpackage.eskf;
import defpackage.eskj;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseMessaging {
    static dbgu a;
    static ScheduledExecutorService b;
    private static final long h = TimeUnit.HOURS.toSeconds(8);
    private static eskd i;
    public final erzj c;
    public final Context d;
    public final esjk e;
    public final Executor f;
    public final esjp g;
    private final esgt j;
    private final esjx k;
    private final esjg l;
    private final Executor m;
    private final defn n;
    private boolean o;
    private final Application.ActivityLifecycleCallbacks p;

    public FirebaseMessaging(erzj erzjVar, esgt esgtVar, esgu esguVar, esgu esguVar2, eshc eshcVar, dbgu dbguVar, esfi esfiVar) {
        final esjp esjpVar = new esjp(erzjVar.a());
        final esjk esjkVar = new esjk(erzjVar, esjpVar, new dcdb(erzjVar.a()), esguVar, esguVar2, eshcVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new dcnq("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new dcnq("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dcnq("Firebase-Messaging-File-Io"));
        this.o = false;
        a = dbguVar;
        this.c = erzjVar;
        this.j = esgtVar;
        this.l = new esjg(this, esfiVar);
        final Context contextA = erzjVar.a();
        this.d = contextA;
        esiy esiyVar = new esiy();
        this.p = esiyVar;
        this.g = esjpVar;
        this.e = esjkVar;
        this.k = new esjx(executorServiceNewSingleThreadExecutor);
        this.m = scheduledThreadPoolExecutor;
        this.f = threadPoolExecutor;
        Context contextA2 = erzjVar.a();
        if (contextA2 instanceof Application) {
            ((Application) contextA2).registerActivityLifecycleCallbacks(esiyVar);
        } else {
            Log.w("FirebaseMessaging", a.b(contextA2, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (esgtVar != null) {
            esgtVar.b(new esja(this));
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: esjb
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = this.a;
                if (firebaseMessaging.i()) {
                    firebaseMessaging.g();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new dcnq("Firebase-Messaging-Topics-Io"));
        int i2 = eskj.e;
        defn defnVarA = degc.a(scheduledThreadPoolExecutor2, new Callable() { // from class: eski
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i3 = eskj.e;
                Context context = contextA;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                return new eskj(this, esjpVar, eskh.b(context, scheduledExecutorService), esjkVar, context, scheduledExecutorService);
            }
        });
        this.n = defnVarA;
        defnVarA.q(scheduledThreadPoolExecutor, new defh() { // from class: esjc
            @Override // defpackage.defh
            public final void e(Object obj) {
                eskj eskjVar = (eskj) obj;
                if (!this.a.i() || eskjVar.d.a() == null || eskjVar.f()) {
                    return;
                }
                eskjVar.d(0L);
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: esjd
            @Override // java.lang.Runnable
            public final void run() {
                ApplicationInfo applicationInfo;
                final Context context = this.a.d;
                if (esjt.a(context).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                Executor executor = new Executor() { // from class: esjr
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                };
                final boolean z = true;
                try {
                    Context applicationContext = context.getApplicationContext();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (!dcni.b()) {
                    degc.c(null);
                } else {
                    final defr defrVar = new defr();
                    executor.execute(new Runnable() { // from class: esjs
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            defr defrVar2 = defrVar;
                            try {
                                if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                                    SharedPreferences.Editor editorEdit = esjt.a(context2).edit();
                                    editorEdit.putBoolean("proxy_notification_initialized", true);
                                    editorEdit.apply();
                                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                    if (z) {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                        notificationManager.setNotificationDelegate(null);
                                    }
                                } else {
                                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                }
                            } finally {
                                defrVar2.d(null);
                            }
                        }
                    });
                }
            }
        });
    }

    public static synchronized eskd b(Context context) {
        if (i == null) {
            i = new eskd(context);
        }
        return i;
    }

    static synchronized FirebaseMessaging getInstance(erzj erzjVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) erzjVar.f(FirebaseMessaging.class);
        dclh.n(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static final void k(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new dcnq("TAG"));
            }
            b.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    private final synchronized void l() {
        if (this.o) {
            return;
        }
        h(0L);
    }

    final eskc a() {
        return b(this.d).a(d(), esjp.e(this.c));
    }

    public final String c() throws IOException {
        esgt esgtVar = this.j;
        if (esgtVar != null) {
            try {
                return (String) degc.f(esgtVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        eskc eskcVarA = a();
        if (!j(eskcVarA)) {
            return eskcVarA.b;
        }
        erzj erzjVar = this.c;
        esjx esjxVar = this.k;
        String strE = esjp.e(erzjVar);
        try {
            return (String) degc.f(esjxVar.a(strE, new esje(this, strE, eskcVarA)));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final String d() {
        erzj erzjVar = this.c;
        return "[DEFAULT]".equals(erzjVar.g()) ? "" : erzjVar.h();
    }

    public final void e(String str) {
        erzj erzjVar = this.c;
        if ("[DEFAULT]".equals(erzjVar.g())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: ".concat(String.valueOf(erzjVar.g())));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            esix.b(intent, this.d, new esis());
        }
    }

    public final synchronized void f(boolean z) {
        this.o = z;
    }

    public final void g() {
        esgt esgtVar = this.j;
        if (esgtVar != null) {
            esgtVar.c();
        } else if (j(a())) {
            l();
        }
    }

    public final synchronized void h(long j) {
        k(new eskf(this, Math.min(Math.max(30L, j + j), h)), j);
        this.o = true;
    }

    public final boolean i() {
        return this.l.b();
    }

    final boolean j(eskc eskcVar) {
        if (eskcVar == null) {
            return true;
        }
        return System.currentTimeMillis() > eskcVar.d + eskc.a || !this.g.c().equals(eskcVar.c);
    }
}
