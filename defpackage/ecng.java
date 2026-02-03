package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class ecng implements ComponentCallbacks2 {
    public static final ekrg a = ekrg.c("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final ecnf d;
    public final ejwi e;
    public final List f;
    public final List g;
    public final ecnm h;
    public final Executor k;
    public ListenableFuture l;
    public boolean o;
    private final eooy q;
    private ScheduledFuture t;
    public final Set i = new HashSet();
    public final Object j = new Object();
    public final ecmy p = new ecmy(this);
    private final eora r = new ecmz(this);
    public int m = 0;
    private boolean s = false;
    public boolean n = false;

    @Deprecated
    public ecng(Context context, ScheduledExecutorService scheduledExecutorService, ecnf ecnfVar, eooy eooyVar, ecnr ecnrVar) {
        this.q = eooyVar;
        this.c = scheduledExecutorService;
        this.d = ecnfVar;
        this.k = new eoss(scheduledExecutorService);
        this.b = context;
        this.e = ecnrVar.a;
        this.f = ecnrVar.b;
        this.g = ecnrVar.c;
        this.h = ecnrVar.d;
    }

    public static SQLiteDatabase a(Context context, File file, ecnm ecnmVar, ejwi ejwiVar, List list, List list2) {
        SQLiteDatabase sQLiteDatabaseG = g(context, ecnmVar, file);
        try {
            if (!h(sQLiteDatabaseG, ecnmVar, ejwiVar, list, list2)) {
                return sQLiteDatabaseG;
            }
            sQLiteDatabaseG.close();
            SQLiteDatabase sQLiteDatabaseG2 = g(context, ecnmVar, file);
            try {
                eieu eieuVarK = eiiy.k("Configuring reopened database.");
                try {
                    ejwl.m(!h(sQLiteDatabaseG2, ecnmVar, ejwiVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                    eieuVarK.close();
                    return sQLiteDatabaseG2;
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                sQLiteDatabaseG2.close();
                throw new ecnb("Failed to open database.", e);
            } catch (IllegalStateException e2) {
                e = e2;
                sQLiteDatabaseG2.close();
                throw new ecnb("Failed to open database.", e);
            } catch (Throwable th3) {
                sQLiteDatabaseG2.close();
                throw th3;
            }
        } catch (SQLiteException e3) {
            sQLiteDatabaseG.close();
            throw new ecnb("Failed to open database.", e3);
        } catch (Throwable th4) {
            sQLiteDatabaseG.close();
            throw th4;
        }
    }

    public static eopy b(final ListenableFuture listenableFuture, final Closeable... closeableArr) {
        listenableFuture.getClass();
        eopn eopnVar = new eopn() { // from class: ecmw
            @Override // defpackage.eopn
            public final Object a(eopt eoptVar) {
                for (int i = 0; i <= 0; i++) {
                    eoptVar.a(closeableArr[i], eoqg.a);
                }
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eopy.c(eopnVar, eoqgVar).f(new eopl() { // from class: ecmx
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                return new eopy(listenableFuture);
            }
        }, eoqgVar);
    }

    public static boolean f(Context context, ecnm ecnmVar) {
        int i = ecnmVar.b;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static SQLiteDatabase g(Context context, ecnm ecnmVar, File file) {
        boolean zF = f(context, ecnmVar);
        int i = zF ? 805306368 : VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (zF) {
                sQLiteDatabaseOpenDatabase.enableWriteAheadLogging();
            }
            return sQLiteDatabaseOpenDatabase;
        } catch (Throwable th) {
            throw new ecnb("Failed to open database.", th);
        }
    }

    private static boolean h(SQLiteDatabase sQLiteDatabase, ecnm ecnmVar, ejwi ejwiVar, List list, List list2) throws SQLException {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = ecnmVar.a.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String) it.next())));
        }
        return i(sQLiteDatabase, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean i(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        int version = sQLiteDatabase.getVersion();
        ((ekrd) ((ekrd) a.e()).h("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 747, "AsyncSQLiteOpenHelper.java")).r("Database version is %d", version);
        int i = ((ekoe) list).c;
        ejwl.q(version <= i, "Can't downgrade from version %s to version %s", version, i);
        ecoa ecoaVar = new ecoa(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            if (version != i) {
                try {
                    try {
                        eieu eieuVarK = eiiy.k("Applying upgrade steps");
                        try {
                            Iterator<E> it = ((ekgb) list).subList(version, i).iterator();
                            while (it.hasNext()) {
                                ((ecnq) it.next()).a(ecoaVar);
                            }
                            eieuVarK.close();
                            sQLiteDatabase.setVersion(i);
                        } catch (Throwable th) {
                            try {
                                eieuVarK.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (SQLiteFullException e) {
                        e = e;
                        throw new ecne("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (SQLiteOutOfMemoryException e2) {
                        e = e2;
                        throw new ecne("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (Throwable th3) {
                        throw new ecnd(th3);
                    }
                } catch (SQLiteDatabaseLockedException e3) {
                    e = e3;
                    throw new ecne("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteDiskIOException e4) {
                    e = e4;
                    throw new ecne("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteTableLockedException e5) {
                    e = e5;
                    throw new ecne("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (InterruptedException e6) {
                    throw new ecne("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e6);
                }
            }
            ekqh it2 = ((ekgb) list2).iterator();
            while (it2.hasNext()) {
                ecnp ecnpVar = (ecnp) it2.next();
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                ecoaVar.b.execSQL(ecnpVar.a);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return version != sQLiteDatabase.getVersion();
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x007f, TryCatch #2 {, blocks: (B:5:0x0007, B:10:0x0017, B:11:0x0022, B:15:0x0044, B:14:0x0040, B:16:0x0046, B:18:0x004c, B:19:0x004f), top: B:39:0x0007, outer: #1, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eopy c() {
        /*
            r8 = this;
            defpackage.eiiy.e()
            r0 = 0
            java.lang.Object r1 = r8.j     // Catch: java.lang.Throwable -> L7d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7d
            int r2 = r8.m     // Catch: java.lang.Throwable -> L7f
            r3 = 1
            int r2 = r2 + r3
            r8.m = r2     // Catch: java.lang.Throwable -> L7f
            com.google.common.util.concurrent.ListenableFuture r4 = r8.l     // Catch: java.lang.Throwable -> L7f
            r5 = 0
            if (r4 != 0) goto L46
            if (r2 != r3) goto L16
            r2 = r3
            goto L17
        L16:
            r2 = r5
        L17:
            java.lang.String r4 = "DB was null with nonzero refcount"
            defpackage.ejwl.m(r2, r4)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "Opening database"
            eieu r0 = defpackage.eiiy.k(r2)     // Catch: java.lang.Throwable -> L7f
            eooy r2 = r8.q     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            java.util.concurrent.Executor r4 = r8.k     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            com.google.common.util.concurrent.ListenableFuture r2 = defpackage.eork.n(r2, r4)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            eora r6 = r8.r     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            java.util.concurrent.ScheduledExecutorService r7 = r8.c     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            defpackage.eork.r(r2, r6, r7)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            ecms r6 = new ecms     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            r6.<init>()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            ejvr r6 = defpackage.eiid.a(r6)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            com.google.common.util.concurrent.ListenableFuture r2 = defpackage.eooq.f(r2, r6, r4)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7f
            goto L44
        L3f:
            r2 = move-exception
            com.google.common.util.concurrent.ListenableFuture r2 = defpackage.eork.h(r2)     // Catch: java.lang.Throwable -> L7f
        L44:
            r8.l = r2     // Catch: java.lang.Throwable -> L7f
        L46:
            com.google.common.util.concurrent.ListenableFuture r2 = r8.l     // Catch: java.lang.Throwable -> L7f
            java.util.concurrent.ScheduledFuture r4 = r8.t     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L4f
            r4.cancel(r3)     // Catch: java.lang.Throwable -> L7f
        L4f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            com.google.common.util.concurrent.ListenableFuture r1 = defpackage.eork.j(r2)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L59
            r0.b(r1)     // Catch: java.lang.Throwable -> L7d
        L59:
            java.io.Closeable[] r2 = new java.io.Closeable[r3]     // Catch: java.lang.Throwable -> L7d
            ecmu r3 = new ecmu     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            r2[r5] = r3     // Catch: java.lang.Throwable -> L7d
            eopy r1 = b(r1, r2)     // Catch: java.lang.Throwable -> L7d
            ecmv r2 = new ecmv     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            eopl r2 = defpackage.eiid.e(r2)     // Catch: java.lang.Throwable -> L7d
            eoqg r3 = defpackage.eoqg.a     // Catch: java.lang.Throwable -> L7d
            eopy r1 = r1.f(r2, r3)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L7a
            r0.close()
        L7a:
            return r1
        L7b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7f
            throw r2     // Catch: java.lang.Throwable -> L7d
        L7d:
            r1 = move-exception
            goto L81
        L7f:
            r2 = move-exception
            goto L7b
        L81:
            if (r0 == 0) goto L86
            r0.close()
        L86:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecng.c():eopy");
    }

    public final void d() {
        if (this.m != 0 || this.l == null) {
            return;
        }
        if (this.s) {
            e();
            return;
        }
        this.t = this.c.schedule(new Runnable() { // from class: ecmr
            @Override // java.lang.Runnable
            public final void run() {
                ecng ecngVar = this.a;
                synchronized (ecngVar.j) {
                    if (ecngVar.m == 0) {
                        ecngVar.e();
                    }
                }
            }
        }, 60L, TimeUnit.SECONDS);
        if (this.o) {
            return;
        }
        eork.r(this.l, new ecna(this), this.k);
    }

    public final void e() {
        this.k.execute(new Runnable() { // from class: ecmt
            @Override // java.lang.Runnable
            public final void run() {
                ecng ecngVar = this.a;
                synchronized (ecngVar.j) {
                    ListenableFuture listenableFuture = ecngVar.l;
                    if (ecngVar.m == 0 && listenableFuture != null) {
                        ecngVar.l = null;
                        if (!listenableFuture.cancel(true)) {
                            try {
                                ((SQLiteDatabase) eork.q(listenableFuture)).close();
                            } catch (ExecutionException unused) {
                            }
                        }
                        ecngVar.b.unregisterComponentCallbacks(ecngVar);
                        Iterator it = ecngVar.i.iterator();
                        while (it.hasNext()) {
                            if (((WeakReference) it.next()).get() == null) {
                                it.remove();
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.j) {
            this.s = i >= 40;
            d();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
