package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import j$.util.Optional;
import java.lang.Thread;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class aoll extends ehnm implements Thread.UncaughtExceptionHandler, pzc, dbyt {
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/app/BugleApplicationBase");
    public static final cczv d = cdag.q(12345, "observable_query_on_read_kill_switch");
    private Executor a;
    protected Thread.UncaughtExceptionHandler e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public fcsu j;
    public fcsu k;
    public fcsu l;
    public fcsu m;
    public eigp n;
    public fcsu o;
    public fcsu p;
    public fcsu q;

    private final void eZ(final Thread thread, final Throwable th) {
        Runnable runnable = new Runnable() { // from class: aolb
            @Override // java.lang.Runnable
            public final void run() {
                ekrw ekrwVarH = UncaughtExceptionReceiver.c.h();
                ekrwVarH.X(eksq.a, "Bugle");
                Throwable th2 = th;
                ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(th2)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "reportUncaughtException", '$', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: throwing exception to UncaughtExceptionReceiver");
                aoll aollVar = this.a;
                Intent intent = new Intent(aollVar, (Class<?>) UncaughtExceptionReceiver.class);
                intent.putExtra("throwable", th2);
                try {
                    aollVar.sendBroadcast(intent);
                } catch (Throwable th3) {
                    ekrw ekrwVarI = UncaughtExceptionReceiver.c.i();
                    ekrwVarI.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th3)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "reportUncaughtException", ',', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: unable to reportUncaughtException due to exception while sending broadcast");
                }
                aollVar.e(thread, th2);
            }
        };
        if (getMainLooper().getThread() != thread) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "reportException", 252, "BugleApplicationBase.java")).t("BugleApplicationBase: Uncaught exception in background thread %s", thread);
            new Handler(getMainLooper()).post(runnable);
            fcsu fcsuVar = this.i;
            if (fcsuVar != null) {
                ((aiwq) fcsuVar.b()).f(aiwp.EXCEPTION, Optional.of("Uncaught exception in background thread"));
                return;
            }
            return;
        }
        ekrw ekrwVarI2 = c.i();
        ekrwVarI2.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "reportException", 263, "BugleApplicationBase.java")).t("BugleApplicationBase: Uncaught exception in primary thread %s", thread);
        runnable.run();
        fcsu fcsuVar2 = this.i;
        if (fcsuVar2 != null) {
            ((aiwq) fcsuVar2.b()).f(aiwp.EXCEPTION, Optional.of("Uncaught exception in primary thread"));
        }
    }

    @Override // defpackage.pzc
    public final pzd a() {
        pzb pzbVar = new pzb();
        pzbVar.a((Executor) this.m.b());
        pzbVar.b((Executor) this.m.b());
        int i = 2;
        if (!Log.isLoggable("BugleAction", 2)) {
            i = 3;
            if (!Log.isLoggable("BugleAction", 3)) {
                i = 4;
            }
        }
        pzbVar.h = i;
        String packageName = getApplicationContext().getPackageName();
        packageName.getClass();
        pzbVar.g = packageName;
        pzbVar.c((qbx) this.o.b());
        pzbVar.f = new lbz() { // from class: aolc
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                ekrw ekrwVarI = aoll.c.i();
                ekrwVarI.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "handleWorkManagerDatabaseCorruption", 186, "BugleApplicationBase.java")).q("BugleApplicationBase: work manager corruption detected, wiping app data");
                fcsu fcsuVar = this.a.p;
                if (fcsuVar != null) {
                    ((cqji) fcsuVar.b()).a("Bugle.Datamodel.WorkManagerCorrupted.Counts");
                }
            }
        };
        pzbVar.i = 1000;
        pzbVar.j = 3000;
        return new pzd(pzbVar);
    }

    @Override // defpackage.ehnm, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        cqtf.a = this;
        eotp.a = this;
        dfdr.b(this);
        dzzh.f(this);
    }

    @Override // defpackage.dbyt
    public final dbyw d() {
        return dbyw.c(86129221, eyen.CPS_APP_PROCESS_GLOBAL_PROVIDER);
    }

    public final void e(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Override // defpackage.ehnm, android.app.Application
    public void onCreate() throws PackageManager.NameNotFoundException {
        Supplier supplier;
        Supplier supplier2;
        Supplier supplier3;
        Supplier supplier4;
        Supplier supplier5;
        Supplier supplier6;
        Supplier supplier7;
        Supplier supplier8;
        Supplier supplier9;
        Supplier supplier10;
        Supplier supplier11;
        Supplier supplier12;
        Supplier supplier13;
        Supplier supplier14;
        Supplier supplier15;
        Supplier supplier16;
        elvg elvgVar;
        String str;
        super.onCreate();
        dbhq.a = this;
        dbhd.b(this);
        dqoi dqoiVar = new dqoi();
        dqoiVar.a = new Supplier() { // from class: dqqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.b = new Supplier() { // from class: dqqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.c = new Supplier() { // from class: dqqy
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.d = new Supplier() { // from class: dqqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.e = new Supplier() { // from class: dqql
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.f = new Supplier() { // from class: dqqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.g = new Supplier() { // from class: dqqn
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.i = new Supplier() { // from class: dqqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.j = new Supplier() { // from class: dqqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return true;
            }
        };
        dqoiVar.m = new Supplier() { // from class: dqqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return eoqg.a;
            }
        };
        dqoiVar.k = new Supplier() { // from class: dqqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return eoqg.a;
            }
        };
        dqoiVar.l = new Supplier() { // from class: dqqs
            @Override // java.util.function.Supplier
            public final Object get() {
                return eoqg.a;
            }
        };
        dqoiVar.b(true);
        dqoiVar.h = new Supplier() { // from class: dqqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return false;
            }
        };
        dqoiVar.o = new Supplier() { // from class: dqqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return false;
            }
        };
        dqoiVar.a();
        dqoiVar.c();
        dqoiVar.p = new Supplier() { // from class: dqqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return 10;
            }
        };
        elvg elvgVar2 = elvg.ROBOLECTRIC_BUILD;
        if (elvgVar2 == null) {
            throw new NullPointerException("Null buildFlavor");
        }
        dqoiVar.r = elvgVar2;
        dqoiVar.q = new Supplier() { // from class: dqqw
            @Override // java.util.function.Supplier
            public final Object get() {
                return 0L;
            }
        };
        dqoiVar.a = new Supplier() { // from class: aold
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = aoll.c;
                return Boolean.valueOf(cqbe.c());
            }
        };
        dqoiVar.b = new Supplier() { // from class: aolg
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Boolean) this.a.q.b();
            }
        };
        dqoiVar.c = new Supplier() { // from class: aolh
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = aoll.c;
                return true;
            }
        };
        dqoiVar.f = new Supplier() { // from class: aoli
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = aoll.c;
                return true;
            }
        };
        dqoiVar.g = new Supplier() { // from class: aolj
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = aoll.c;
                return false;
            }
        };
        dqoiVar.j = new Supplier() { // from class: aolk
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = aoll.c;
                return true;
            }
        };
        dqoiVar.i = new Supplier() { // from class: aokx
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = aoll.c;
                return true;
            }
        };
        dqoiVar.k = new Supplier() { // from class: aoky
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Executor) this.a.k.b();
            }
        };
        dqoiVar.l = new Supplier() { // from class: aokz
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Executor) this.a.l.b();
            }
        };
        dqoiVar.m = new Supplier() { // from class: aola
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Executor) this.a.m.b();
            }
        };
        dqoiVar.h = new Supplier() { // from class: aole
            @Override // java.util.function.Supplier
            public final Object get() {
                return (Boolean) aoll.d.e();
            }
        };
        dqoiVar.b(craf.g(getApplicationContext()));
        dqoiVar.o = new Supplier() { // from class: aolf
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrg ekrgVar = aoll.c;
                return false;
            }
        };
        dqoiVar.c();
        dqoiVar.a();
        if (dqoiVar.s == 7 && (supplier = dqoiVar.a) != null && (supplier2 = dqoiVar.b) != null && (supplier3 = dqoiVar.c) != null && (supplier4 = dqoiVar.d) != null && (supplier5 = dqoiVar.e) != null && (supplier6 = dqoiVar.f) != null && (supplier7 = dqoiVar.g) != null && (supplier8 = dqoiVar.h) != null && (supplier9 = dqoiVar.i) != null && (supplier10 = dqoiVar.j) != null && (supplier11 = dqoiVar.k) != null && (supplier12 = dqoiVar.l) != null && (supplier13 = dqoiVar.m) != null && (supplier14 = dqoiVar.o) != null && (supplier15 = dqoiVar.p) != null && (supplier16 = dqoiVar.q) != null && (elvgVar = dqoiVar.r) != null) {
            dqoj dqojVar = new dqoj(supplier, supplier2, supplier3, supplier4, supplier5, supplier6, supplier7, supplier8, supplier9, supplier10, supplier11, supplier12, supplier13, dqoiVar.n, supplier14, supplier15, supplier16, elvgVar);
            dqru.b = this;
            dqru.c = dqojVar;
            dqru.d.set(dqojVar);
            if (craf.g(this)) {
                Iterator it = ((Set) this.h.b()).iterator();
                while (it.hasNext()) {
                    registerActivityLifecycleCallbacks((cqax) it.next());
                }
            } else {
                dzzh.f(this);
                dfoc.m();
            }
            cczg.a.set(true);
            auvh.h(((cmwj) this.f.b()).b());
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onCreate", 150, "BugleApplicationBase.java");
            int i = cpge.a;
            try {
                PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                str = "Bugle version: " + (TextUtils.isEmpty(packageInfo.versionName) ? "unknown_app_version" : packageInfo.versionName.toLowerCase(Locale.US)) + " , Bugle version code: " + (Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
            } catch (Exception e) {
                e.printStackTrace();
                str = "Error getting app version information.";
            }
            ekrdVar.t("BugleApplicationBase: %s", str);
            cqdk.a(getApplicationContext(), cpge.d(getApplicationContext()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dqoiVar.a == null) {
            sb.append(" enforceCheckInitializedSupplier");
        }
        if (dqoiVar.b == null) {
            sb.append(" enforceThreadChecksOnCursorsSupplier");
        }
        if (dqoiVar.c == null) {
            sb.append(" omitUnchangedRowsFromUpdatesByDefaultSupplier");
        }
        if (dqoiVar.d == null) {
            sb.append(" throwOnExtractBindDatasArrayLengthCheckSupplier");
        }
        if (dqoiVar.e == null) {
            sb.append(" enforceConcurrentCursorModificationDurinBindSupplier");
        }
        if (dqoiVar.f == null) {
            sb.append(" suppressPhantomRowsByDefaultSupplier");
        }
        if (dqoiVar.g == null) {
            sb.append(" catchBulkInsertThrowablesSupplier");
        }
        if (dqoiVar.h == null) {
            sb.append(" observableQueryOnReadyKillSwitch");
        }
        if (dqoiVar.i == null) {
            sb.append(" addIdsToBindDataInBulkInsertSupplier");
        }
        if (dqoiVar.j == null) {
            sb.append(" enableDbOverridesSupplier");
        }
        if (dqoiVar.k == null) {
            sb.append(" readExecutor");
        }
        if (dqoiVar.l == null) {
            sb.append(" writeExecutor");
        }
        if (dqoiVar.m == null) {
            sb.append(" blockingExecutor");
        }
        if ((dqoiVar.s & 1) == 0) {
            sb.append(" isPrimaryProcess");
        }
        if (dqoiVar.o == null) {
            sb.append(" enableQueryCaching");
        }
        if (dqoiVar.p == null) {
            sb.append(" queryCacheSize");
        }
        if (dqoiVar.q == null) {
            sb.append(" timeNanosSupplier");
        }
        if (dqoiVar.r == null) {
            sb.append(" buildFlavor");
        }
        if ((dqoiVar.s & 2) == 0) {
            sb.append(" moveObservableQueryTriggeringToDatabaseInterface");
        }
        if ((dqoiVar.s & 4) == 0) {
            sb.append(" enableObservableQueryTrackerV2");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        eieh eiehVarC = this.n.c("BugleApplicationBase#onTrimMemory", "com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onTrimMemory", 159);
        try {
            super.onTrimMemory(i);
            if (craf.g(this)) {
                ekrw ekrwVarE = c.e();
                ekrwVarE.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onTrimMemory", 162, "BugleApplicationBase.java")).q("BugleApplicationBase: onTrimMemory");
                if (this.a == null) {
                    this.a = new eoss((Executor) this.j.b());
                }
                auwa.a(new Runnable() { // from class: aokw
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((cpeo) this.a.g.b()).a(i, 2);
                    }
                }, this.a);
                if (cpcj.a.get()) {
                    try {
                        raw.b(this).i(i);
                    } catch (NoSuchFieldError | OutOfMemoryError e) {
                        ekrw ekrwVarJ = c.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "onTrimMemory", 175, "BugleApplicationBase.java")).q("BugleApplicationBase: Exception clearing glide memory");
                    }
                }
                ((aiwq) this.i.b()).f(aiwp.TRIM_MEMORY, Optional.of(String.valueOf(i)));
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (craf.g(this)) {
            eZ(thread, th);
            return;
        }
        if (!craf.a(this).equals(getPackageName().concat(":crash_report"))) {
            eZ(thread, th);
            return;
        }
        ekrw ekrwVarI = c.i();
        ekrwVarI.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(th)).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "uncaughtException", 224, "BugleApplicationBase.java")).t("BugleApplicationBase: Reporting disabled for background process. Dropping for %s", thread);
        e(thread, th);
    }
}
