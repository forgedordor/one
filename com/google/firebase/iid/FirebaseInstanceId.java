package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.dcdb;
import defpackage.dclh;
import defpackage.dcnq;
import defpackage.deeq;
import defpackage.defb;
import defpackage.defn;
import defpackage.defv;
import defpackage.degc;
import defpackage.erzj;
import defpackage.esfz;
import defpackage.esgf;
import defpackage.esgg;
import defpackage.esgh;
import defpackage.esgn;
import defpackage.esgp;
import defpackage.esgq;
import defpackage.esgs;
import defpackage.esgu;
import defpackage.eshc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class FirebaseInstanceId {
    public static esgq a;
    static ScheduledExecutorService b;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern j = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor c;
    public final erzj d;
    public final esgh e;
    public final esgf f;
    public final esgn g;
    private final eshc k;
    private boolean l = false;
    public final List h = new ArrayList();

    public FirebaseInstanceId(erzj erzjVar, esgh esghVar, Executor executor, Executor executor2, esgu esguVar, esgu esguVar2, eshc eshcVar) {
        if (esgh.e(erzjVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (a == null) {
                a = new esgq(erzjVar.a());
            }
        }
        this.d = erzjVar;
        this.e = esghVar;
        this.f = new esgf(erzjVar, esghVar, new dcdb(erzjVar.a()), esguVar, esguVar2, eshcVar);
        this.c = executor2;
        this.g = new esgn(executor);
        this.k = eshcVar;
    }

    public static FirebaseInstanceId b() {
        return getInstance(erzj.b());
    }

    public static FirebaseInstanceId getInstance(erzj erzjVar) {
        k(erzjVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) erzjVar.f(FirebaseInstanceId.class);
        dclh.n(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static String j(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public static void k(erzj erzjVar) {
        dclh.l(erzjVar.e().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        dclh.l(erzjVar.e().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        dclh.l(erzjVar.e().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        dclh.b(erzjVar.e().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dclh.b(j.matcher(erzjVar.e().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static boolean p() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    public static final void r(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new dcnq("FirebaseInstanceId"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final defn a(final String str, String str2) {
        final String strJ = j(str2);
        return degc.c(null).e(this.c, new deeq() { // from class: esfy
            @Override // defpackage.deeq
            public final Object a(defn defnVar) throws InterruptedException, NumberFormatException {
                FirebaseInstanceId firebaseInstanceId = this.a;
                String strF = firebaseInstanceId.f();
                String str3 = str;
                String str4 = strJ;
                esgp esgpVarD = firebaseInstanceId.d(str3, str4);
                return !firebaseInstanceId.q(esgpVarD) ? degc.c(new esgg(esgpVarD.b)) : firebaseInstanceId.g.a(str3, str4, new esgb(firebaseInstanceId, strF, str3, str4, esgpVarD));
            }
        });
    }

    public final esgp c() {
        return d(esgh.e(this.d), "*");
    }

    public final esgp d(String str, String str2) {
        return a.a(g(), str, str2);
    }

    public final Object e(defn defnVar) throws IOException {
        try {
            return degc.g(defnVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    l();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final String f() throws InterruptedException, NumberFormatException {
        try {
            a.g(this.d.h());
            defn defnVarA = this.k.a();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            defnVarA.o(new esfz(), new defb() { // from class: esga
                @Override // defpackage.defb
                public final void a(defn defnVar) {
                    esgq esgqVar = FirebaseInstanceId.a;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (defnVarA.m()) {
                return (String) defnVarA.i();
            }
            if (((defv) defnVarA).d) {
                throw new CancellationException("Task is already canceled");
            }
            if (defnVarA.l()) {
                throw new IllegalStateException(defnVarA.h());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String g() {
        erzj erzjVar = this.d;
        return "[DEFAULT]".equals(erzjVar.g()) ? "" : erzjVar.h();
    }

    @Deprecated
    public final String h() {
        k(this.d);
        esgp esgpVarC = c();
        if (q(esgpVarC)) {
            n();
        }
        long j2 = esgp.a;
        if (esgpVarC == null) {
            return null;
        }
        return esgpVarC.b;
    }

    @Deprecated
    public final String i(String str, String str2) throws IOException {
        k(this.d);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((esgg) e(a(str, str2))).a;
        }
        throw new IOException("MAIN_THREAD");
    }

    final synchronized void l() {
        a.b();
    }

    public final synchronized void m(boolean z) {
        this.l = z;
    }

    public final synchronized void n() {
        if (this.l) {
            return;
        }
        o(0L);
    }

    public final synchronized void o(long j2) {
        r(new esgs(this, Math.min(Math.max(30L, j2 + j2), i)), j2);
        this.l = true;
    }

    public final boolean q(esgp esgpVar) {
        if (esgpVar == null) {
            return true;
        }
        return System.currentTimeMillis() > esgpVar.d + esgp.a || !this.e.c().equals(esgpVar.c);
    }
}
