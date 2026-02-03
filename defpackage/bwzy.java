package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwzy implements dqsy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl");
    public static final eksp b = eksp.p();
    static final ThreadLocal c = new bwzn();
    public final cogw d;
    public final dqrs e;
    public final bxam[] f;
    public final Context i;
    private final fcsu k;
    public final ReentrantLock g = new ReentrantLock(true);
    public final bwzw h = new bwzw(this);
    public final bwzt j = new bwzt();
    private final dqxa l = new dqxa(new Supplier() { // from class: bwxj
        @Override // java.util.function.Supplier
        public final Object get() {
            final bwzy bwzyVar = this.a;
            Integer num = (Integer) bwzyVar.R(new bwzu() { // from class: bwxy
                @Override // defpackage.bwzu
                public final Object a() {
                    return Integer.valueOf(bwzyVar.i().getVersion());
                }
            }, bwzy.k(dqus.READ, new dqsb("DatabasePlugin#getVersion"), new ejxr() { // from class: bwxz
                @Override // defpackage.ejxr
                public final Object get() {
                    ekrg ekrgVar = bwzy.a;
                    return null;
                }
            }, bwzyVar));
            num.intValue();
            return num;
        }
    });

    public bwzy(Context context, fcsu fcsuVar, cogw cogwVar, dqrs dqrsVar, ekgb ekgbVar) {
        this.i = context;
        this.k = fcsuVar;
        this.d = cogwVar;
        this.e = dqrsVar;
        this.f = (bxam[]) ekgbVar.toArray(new bxam[0]);
    }

    public static void V(dqxq dqxqVar) {
        r().addLast(dqxqVar);
    }

    private static dqtx aa(dqus dqusVar, String str, dqsb dqsbVar, ejxr ejxrVar, dqsy dqsyVar) {
        dqtw dqtwVarO = dqtx.o();
        dqou dqouVar = (dqou) dqtwVarO;
        dqouVar.a = dqsbVar;
        dqouVar.i = str;
        dqtwVarO.d(dqusVar);
        dqouVar.d = ejxrVar;
        dqtwVarO.b(dqsyVar);
        return dqtwVarO.a();
    }

    private static dqtx ab(dqus dqusVar, String str, dqsb dqsbVar, ejxr ejxrVar, ejxr ejxrVar2, dqsy dqsyVar, boolean z, ContentValues contentValues) {
        dqtw dqtwVarO = dqtx.o();
        dqou dqouVar = (dqou) dqtwVarO;
        dqouVar.a = dqsbVar;
        dqouVar.i = str;
        dqtwVarO.d(dqusVar);
        dqouVar.b = ejxrVar;
        dqouVar.d = ejxrVar2;
        dqtwVarO.b(dqsyVar);
        dqtwVarO.c(z);
        dqouVar.j = contentValues;
        return dqtwVarO.a();
    }

    private final dqtx ac(dqsb dqsbVar, final dqqf dqqfVar) {
        dqus dqusVar = dqus.READ;
        ejxr ejxrVar = new ejxr() { // from class: bwye
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                dqwl dqwlVar = dqqfVar.b;
                if (dqwlVar == null) {
                    return dqxc.c(null, null);
                }
                ArrayList arrayList = new ArrayList();
                return dqxc.c(dqwlVar.K(arrayList), (String[]) arrayList.toArray(new String[0]));
            }
        };
        dqtw dqtwVarO = dqtx.o();
        dqou dqouVar = (dqou) dqtwVarO;
        dqouVar.a = dqsbVar;
        dqouVar.i = null;
        dqtwVarO.d(dqusVar);
        dqouVar.d = ejxrVar;
        dqtwVarO.b(this);
        dqtwVarO.c(false);
        dqouVar.k = dqqfVar.b;
        return dqtwVarO.a();
    }

    private static dqxq ad() {
        return (dqxq) r().removeLast();
    }

    private static Throwable ae(Closeable[] closeableArr, int i) {
        Closeable closeable = closeableArr[i];
        if (closeable != null) {
            try {
                closeableArr[i] = null;
                closeable.close();
            } catch (Throwable th) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleDatabase");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "closePluginStack", (char) 732, "DatabaseInterfaceImpl.java")).q("Caught exception closing DatabasePlugin Closeable");
                return th;
            }
        }
        return null;
    }

    private final void af() {
        List list = (List) R(new bwzu() { // from class: bwxk
            @Override // defpackage.bwzu
            public final Object a() {
                return this.a.Y(false);
            }
        }, k(dqus.END_SCOPE, new dqsb("DatabasePlugin#endScope"), new ejxr() { // from class: bwxl
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this));
        if (eotp.a("bugle.enable_runnables_execution_in_silo_batches", "bugle")) {
            dqru.s(this, list);
            return;
        }
        if (list != null) {
            eieu eieuVarK = eiiy.k("DatabaseWrapperImpl.deferredRunnables");
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((dqsv) it.next()).b();
                }
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static void ag(bxam[] bxamVarArr, Closeable[] closeableArr, int i, dqtx dqtxVar) {
        while (i < bxamVarArr.length) {
            closeableArr[i] = bxamVarArr[i].m(dqtxVar);
            i++;
        }
    }

    public static dqtx k(dqus dqusVar, dqsb dqsbVar, ejxr ejxrVar, dqsy dqsyVar) {
        dqtw dqtwVarO = dqtx.o();
        dqou dqouVar = (dqou) dqtwVarO;
        dqouVar.a = dqsbVar;
        dqouVar.i = null;
        dqtwVarO.d(dqusVar);
        dqouVar.d = ejxrVar;
        dqtwVarO.b(dqsyVar);
        dqtwVarO.c(false);
        return dqtwVarO.a();
    }

    static dqxc l(String str, final ContentValues contentValues, int i) {
        String strJ = dqru.j(i);
        return dqxc.c("INSERT" + (strJ != null ? a.a(strJ, " ", " ") : " ") + "INTO " + str + " (" + ((String) Collection.EL.stream(contentValues.keySet()).sorted().collect(Collectors.joining(","))) + ") VALUES (" + ((String) Collection.EL.stream(contentValues.keySet()).sorted().map(new Function() { // from class: bwyv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                ekrg ekrgVar = bwzy.a;
                Object obj2 = contentValues.get(str2);
                return (obj2 == null ? "NULL" : obj2 instanceof Boolean ? true != ((Boolean) obj2).booleanValue() ? "0" : "1" : obj2 instanceof Number ? obj2.toString() : DatabaseUtils.sqlEscapeString(obj2.toString())) + " -- " + str2 + "\n";
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","))) + ")", null);
    }

    static Deque r() {
        Deque deque = (Deque) c.get();
        deque.getClass();
        return deque;
    }

    @Override // defpackage.dqsy
    public final void A(final Uri uri, final String str) {
        Deque dequeR = r();
        if (str != null) {
            ekrw ekrwVarN = b.n();
            ekrwVarN.X(eksq.a, "BugleDatabase");
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "notifyChangeAfterCommit", 974, "DatabaseInterfaceImpl.java")).I("%s notifying change. stack %d; uri %s", str, Integer.valueOf(dequeR.size()), uri);
        }
        if (!dequeR.isEmpty()) {
            dqsr.a(this, uri.toString(), eiid.k(new Runnable() { // from class: bwxg
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    Uri uri2 = uri;
                    bwzy bwzyVar = this.a;
                    if (str2 != null) {
                        ekrw ekrwVarN2 = bwzy.b.n();
                        ekrwVarN2.X(eksq.a, "BugleDatabase");
                        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "notifyChangeAfterCommit", 990, "DatabaseInterfaceImpl.java")).D("%s notifying change after commit. uri %s", str2, uri2);
                    }
                    eieu eieuVarK = eiiy.k("DatabaseWrapperImpl#notifyChangeAfterCommit");
                    try {
                        bwzyVar.i.getContentResolver().notifyChange(uri2, null);
                        eieuVarK.close();
                    } catch (Throwable th) {
                        try {
                            eieuVarK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }));
            return;
        }
        eieu eieuVarK = eiiy.k("DatabaseWrapperImpl#notifyChangeAfterCommit");
        try {
            this.i.getContentResolver().notifyChange(uri, null);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dqsy
    public final /* synthetic */ void B(String str, Runnable runnable) {
        dqsr.a(this, str, runnable);
    }

    @Override // defpackage.dqsy
    public final void C(final boolean z) {
        x(new Runnable() { // from class: bwyx
            @Override // java.lang.Runnable
            public final void run() {
                dqxq dqxqVar = (dqxq) bwzy.r().peekLast();
                dqxqVar.getClass();
                if (dqxqVar.e()) {
                    ekrw ekrwVarJ = bwzy.b.j();
                    ekrwVarJ.X(eksq.a, "BugleDatabase");
                    eksl ekslVar = (eksl) ekrwVarJ;
                    ekslVar.Z(eksk.MEDIUM);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "setTransactionSuccessful", 847, "DatabaseInterfaceImpl.java")).q("setTransactionSuccessful called twice.");
                }
                boolean z2 = z;
                dqxqVar.g();
                dqxqVar.c(z2);
                if (z2 && (dqxqVar instanceof dqxs)) {
                    this.a.i().setTransactionSuccessful();
                }
            }
        }, k(dqus.WRITE, new dqsb("DatabasePlugin#setTransactionSuccessful"), new ejxr() { // from class: bwyy
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this));
    }

    @Override // defpackage.dqsy
    public final void D(final int i) {
        ((Integer) T(new bwzu() { // from class: bwyq
            @Override // defpackage.bwzu
            public final Object a() {
                bwzy bwzyVar = this.a;
                ejwl.l(bwzyVar.L());
                bwzyVar.i().setVersion(i);
                dqru.L();
                return 1;
            }
        }, k(dqus.WRITE, new dqsb("DatabasePlugin#setVersion"), new ejxr() { // from class: bwyr
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this))).intValue();
    }

    public final void E(Exception exc, String str) {
        Context context = this.i;
        boolean zDelete = context.getDatabasePath(str).delete();
        ekrw ekrwVarI = b.i();
        ekrz ekrzVar = eksq.a;
        ekrwVarI.X(ekrzVar, "BugleDatabase");
        ((eksl) ((eksl) ((eksl) ekrwVarI).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "wipeDbOnFailedUpgrade", 1192, "DatabaseInterfaceImpl.java")).t("got DatabaseUpgradeException; File.delete returned %b", Boolean.valueOf(zDelete));
        for (bxzx bxzxVar : (Set) this.k.b()) {
            if (zDelete) {
                if (((aqdi) bxzxVar.b.b()).a()) {
                    auvh.h(((bxrh) bxzxVar.c.b()).a());
                } else {
                    ((bxzf) bxzxVar.d.b()).f();
                }
                ekrw ekrwVarH = bxzx.a.h();
                ekrwVarH.X(ekrzVar, "BugleSearch");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingOnDatabaseUpgradeFailedListener", "onDatabaseUpgradeFailed", 54, "IcingOnDatabaseUpgradeFailedListener.java")).q("On database upgrade failed. All the search indexes on the device are removed.");
            }
        }
        try {
            dqle.a(((qbb) qbq.a(context).a("verified_sms_work_manager_tag")).c);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.dqsy
    public final /* synthetic */ boolean F() {
        return dqsr.b(this);
    }

    @Override // defpackage.dqsy
    public final boolean G(final dqqf dqqfVar) {
        return ((Boolean) R(new bwzu() { // from class: bwxi
            @Override // defpackage.bwzu
            public final Object a() {
                ekrg ekrgVar = bwzy.a;
                return Boolean.valueOf(dqqfVar.dl());
            }
        }, ac(new dqsb("DatabasePlugin#moveCursorToFirst"), dqqfVar))).booleanValue();
    }

    @Override // defpackage.dqsy
    public final boolean H(final dqqf dqqfVar) {
        return ((Boolean) R(new bwzu() { // from class: bwyg
            @Override // defpackage.bwzu
            public final Object a() {
                ekrg ekrgVar = bwzy.a;
                return Boolean.valueOf(dqqfVar.dm());
            }
        }, ac(new dqsb("DatabasePlugin#moveCursorToLast"), dqqfVar))).booleanValue();
    }

    @Override // defpackage.dqsy
    public final boolean I(final dqqf dqqfVar) {
        return ((Boolean) R(new bwzu() { // from class: bwwy
            @Override // defpackage.bwzu
            public final Object a() {
                ekrg ekrgVar = bwzy.a;
                return Boolean.valueOf(dqqfVar.dn());
            }
        }, ac(new dqsb("DatabasePlugin#moveCursorToNext"), dqqfVar))).booleanValue();
    }

    @Override // defpackage.dqsy
    public final boolean J(final dqqf dqqfVar, final int i) {
        return ((Boolean) R(new bwzu() { // from class: bwyj
            @Override // defpackage.bwzu
            public final Object a() {
                ekrg ekrgVar = bwzy.a;
                return Boolean.valueOf(dqqfVar.m434do(i));
            }
        }, k(dqus.READ, new dqsb("DatabasePlugin#moveCursorToPosition"), new ejxr() { // from class: bwyk
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this))).booleanValue();
    }

    @Override // defpackage.dqsy
    public final boolean K(final dqqf dqqfVar) {
        return ((Boolean) R(new bwzu() { // from class: bwya
            @Override // defpackage.bwzu
            public final Object a() {
                ekrg ekrgVar = bwzy.a;
                return Boolean.valueOf(dqqfVar.dp());
            }
        }, ac(new dqsb("DatabasePlugin#moveCursorToPrevious"), dqqfVar))).booleanValue();
    }

    public final boolean L() {
        return this.g.isHeldByCurrentThread();
    }

    @Override // defpackage.dqsy
    public final dqxa M() {
        return this.l;
    }

    @Override // defpackage.dqsy
    public final dqsc N(dqsb dqsbVar) {
        SQLiteDatabase sQLiteDatabaseI = i();
        ReentrantLock reentrantLock = this.g;
        boolean z = false;
        ejwl.l(reentrantLock.isHeldByCurrentThread() || !sQLiteDatabaseI.inTransaction());
        int i = 0;
        while (true) {
            try {
                try {
                } catch (InterruptedException unused) {
                    ekrw ekrwVarJ = b.j();
                    ekrwVarJ.X(eksq.a, "BugleDatabase");
                    ((eksl) ((eksl) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "acquireWriteLock", 260, "DatabaseInterfaceImpl.java")).q("interruped while locking the write lock");
                    z = true;
                }
                if (reentrantLock.tryLock(5L, TimeUnit.SECONDS)) {
                    if (reentrantLock.getHoldCount() != 1) {
                        break;
                    }
                    bwzw bwzwVar = this.h;
                    bwzwVar.a = new bwwp(Thread.currentThread(), dqsbVar, bwzwVar.b.d.f().toEpochMilli());
                    bwzwVar.a(dqsbVar, true);
                    dqru.L();
                    break;
                }
                bwzw bwzwVar2 = this.h;
                bwzx bwzxVar = bwzwVar2.a;
                if (bwzxVar != null) {
                    Level level = cqbe.j() ? Level.INFO : Level.WARNING;
                    String str = ((bwwp) bwzxVar).b.toString() + " " + bwzwVar2.b.d.f().minusMillis(((bwwp) bwzxVar).c).toEpochMilli() + " ms " + ((String) DesugarArrays.stream(((bwwp) bwzxVar).a.getStackTrace()).map(new Function() { // from class: bwzv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return "   ".concat(String.valueOf(((StackTraceElement) obj).toString()));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining("\n")));
                    String string = dqsbVar.toString();
                    ekrd ekrdVarA = a.a(level);
                    ekrdVarA.X(eksq.a, "BugleDatabase");
                    int i2 = i + 1;
                    ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl$WriteLockHistory", "emitLoggingForSlowToAcquireWriteLock", 193, "DatabaseInterfaceImpl.java")).I("kind of slow getting the write lock; wait seconds %s; blocked [%s];blocked by: [%s]", Integer.valueOf(i2 * 5), string, str);
                    i = i2;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return new dqsc() { // from class: bwyf
            @Override // defpackage.dqsc
            public final void a() {
                bwzy bwzyVar = this.a;
                ReentrantLock reentrantLock2 = bwzyVar.g;
                if (reentrantLock2.getHoldCount() == 1) {
                    bwzw bwzwVar3 = bwzyVar.h;
                    bwzx bwzxVar2 = bwzwVar3.a;
                    if (bwzxVar2 != null) {
                        bwzwVar3.a = null;
                        bwzwVar3.a(((bwwp) bwzxVar2).b, false);
                    }
                    Context context = dqru.b;
                    dqwl.a.remove();
                    dqru.L();
                }
                reentrantLock2.unlock();
            }
        };
    }

    @Override // defpackage.dqsy
    public final long O(final String str, final dqst dqstVar) {
        return U(new bwzu() { // from class: bwyt
            @Override // defpackage.bwzu
            public final Object a() {
                dqst dqstVar2 = dqstVar;
                String str2 = str;
                bwzy bwzyVar = this.a;
                try {
                    Context context = dqru.b;
                    return Long.valueOf(bwzyVar.i().insertWithOnConflict(str2, null, dqstVar2.a(), 0));
                } catch (SQLiteException e) {
                    ekrw ekrwVarI = bwzy.a.i();
                    ekrwVarI.X(eksq.a, "BugleDatabase");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "insert", (char) 1401, "DatabaseInterfaceImpl.java")).q("Error inserting ");
                    return -1L;
                }
            }
        }, aa(dqus.INSERT, str, new dqsb("insert-", str), new ejxr() { // from class: bwyu
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return bwzy.l(str, dqstVar.a(), 0);
            }
        }, this));
    }

    @Override // defpackage.dqsy
    public final long P(final String str, final dqst dqstVar) {
        return U(new bwzu() { // from class: bwxu
            @Override // defpackage.bwzu
            public final Object a() {
                Context context = dqru.b;
                return Long.valueOf(this.a.i().insertOrThrow(str, null, dqstVar.a()));
            }
        }, aa(dqus.INSERT, str, new dqsb("insertOrThrow-", str), new ejxr() { // from class: bwxv
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return bwzy.l(str, dqstVar.a(), 0);
            }
        }, this));
    }

    @Override // defpackage.dqsy
    public final long Q(final String str, final dqst dqstVar, final int i) {
        return U(new bwzu() { // from class: bwxd
            @Override // defpackage.bwzu
            public final Object a() {
                Context context = dqru.b;
                return Long.valueOf(this.a.i().insertWithOnConflict(str, null, dqstVar.a(), i));
            }
        }, aa(dqus.INSERT, str, new dqsb("insertWithOnConflict-", str), new ejxr() { // from class: bwxe
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return bwzy.l(str, dqstVar.a(), i);
            }
        }, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r8[r10] = r8[r10] + 1;
        ag(r0, r4, r10, r18);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[LOOP:3: B:35:0x00b8->B:36:0x00ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(defpackage.bwzu r17, defpackage.dqtx r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwzy.R(bwzu, dqtx):java.lang.Object");
    }

    final Cursor S(bwzu bwzuVar, dqtx dqtxVar) {
        Cursor cursorA = (Cursor) R(bwzuVar, dqtxVar);
        cursorA.getCount();
        bxam[] bxamVarArr = this.f;
        int length = bxamVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return cursorA;
            }
            cursorA = bxamVarArr[length].a(cursorA, dqtxVar);
        }
    }

    public final Number T(final bwzu bwzuVar, final dqtx dqtxVar) {
        return (Number) R(new bwzu() { // from class: bwxx
            @Override // defpackage.bwzu
            public final Object a() {
                bwzy bwzyVar = this.a;
                bwzyVar.s();
                bwzu bwzuVar2 = bwzuVar;
                try {
                    bwzy.V(new dqys(bwzyVar, ((dqov) dqtxVar).a));
                    try {
                        Number number = (Number) bwzuVar2.a();
                        bwzy.ad().h();
                        return number;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new ejyc(e);
                }
            }
        }, dqtxVar);
    }

    public final long U(final bwzu bwzuVar, final dqtx dqtxVar) {
        return ((Long) R(new bwzu() { // from class: bwzh
            @Override // defpackage.bwzu
            public final Object a() {
                bwzy bwzyVar = this.a;
                bwzyVar.s();
                dqtx dqtxVar2 = dqtxVar;
                bwzu bwzuVar2 = bwzuVar;
                try {
                    bwzy.V(new dqys(bwzyVar, ((dqov) dqtxVar2).a));
                    try {
                        Long l = (Long) bwzuVar2.a();
                        l.longValue();
                        bwzy.ad().h();
                        return l;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new ejyc(e);
                }
            }
        }, dqtxVar)).longValue();
    }

    @Override // defpackage.dqsy
    public final void W(String str, final Runnable runnable, final dqss dqssVar) {
        Integer num;
        dqxq dqxqVar = dqssVar == dqss.NO_TXN_EXCLUDING_SCOPE ? (dqxq) Collection.EL.stream(r()).filter(new Predicate() { // from class: bwys
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ekrg ekrgVar = bwzy.a;
                return !((dqxq) obj).d();
            }
        }).findFirst().orElse(null) : (dqxq) r().peekFirst();
        if (dqxqVar == null) {
            runnable.run();
            eijx.e(null);
            return;
        }
        final dqsz dqszVarB = dqxqVar.b();
        if (str != null && (num = (Integer) dqszVarB.c.get(str)) != null) {
            ((dqsv) dqszVarB.a.get(num.intValue())).a();
        }
        if (str != null) {
            dqszVarB.c.put(str, Integer.valueOf(dqszVarB.a.size()));
        }
        eiju.g(kol.a(new koi() { // from class: bwzj
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                ekrg ekrgVar = bwzy.a;
                dqszVarB.a.add(new dqsv(eiid.k(runnable), kogVar, dqssVar));
                return "DatabaseWrapperImpl.runAfterCommit (completer)";
            }
        }));
    }

    @Override // defpackage.dqsy
    public final int X(final String str, final String str2, final String[] strArr, dqtd dqtdVar) {
        dqor dqorVar = (dqor) dqtdVar;
        return ((Integer) T(new bwzu() { // from class: bwxr
            @Override // defpackage.bwzu
            public final Object a() {
                Context context = dqru.b;
                return Integer.valueOf(this.a.i().delete(str, str2, strArr));
            }
        }, ab(dqus.DELETE, str, dqorVar.c, new ejxr() { // from class: bwxs
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, new ejxr() { // from class: bwxt
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return dqxc.c("DELETE FROM " + str + " WHERE " + str2, strArr);
            }
        }, this, dqorVar.b, null))).intValue();
    }

    public final ekgb Y(boolean z) {
        Object objB;
        dqxq dqxqVarAd = ad();
        boolean zIsEmpty = r().isEmpty();
        boolean zAllMatch = Collection.EL.stream(r()).allMatch(new Predicate() { // from class: bwym
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ekrg ekrgVar = bwzy.a;
                return ((dqxq) obj).d();
            }
        });
        ejyb.e(dqxqVarAd);
        if (zIsEmpty) {
            eieu eieuVarK = eiiy.k("DatabaseWrapperImpl.inTransactionDeferredRunnableList");
            try {
                Context context = dqru.b;
                HashMap map = new HashMap();
                Iterator it = dqxqVarAd.b().d.entrySet().iterator();
                while (it.hasNext()) {
                    dquw dquwVar = (dquw) ((Map.Entry) it.next()).getValue();
                    if (dquwVar != null && (objB = dquwVar.b()) != null) {
                        map.put(Integer.valueOf(dquwVar.a()), objB);
                    }
                }
                List list = dqxqVarAd.b().b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dqsu dqsuVar = (dqsu) list.get(i);
                    map.get(Integer.valueOf(i));
                    dqsuVar.a();
                }
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (z) {
            i().endTransaction();
        }
        dqxqVarAd.h();
        dqxqVarAd.getClass();
        if (!dqxqVarAd.e()) {
            eksp ekspVar = b;
            ekrw ekrwVarJ = ekspVar.j();
            ekrz ekrzVar = eksq.a;
            ekrwVarJ.X(ekrzVar, "BugleDatabase");
            ((eksl) ((eksl) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "endExecutionScopeAndReturnDeferredRunnables", 904, "DatabaseInterfaceImpl.java")).q("endTransaction without setting successful.");
            ekrw ekrwVarJ2 = ekspVar.j();
            ekrwVarJ2.X(ekrzVar, "BugleDatabase");
            eksl ekslVar = (eksl) ekrwVarJ2;
            ekslVar.Z(eksk.MEDIUM);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseInterfaceImpl", "endExecutionScopeAndReturnDeferredRunnables", 905, "DatabaseInterfaceImpl.java")).q("endTransaction called at");
        }
        if (zIsEmpty) {
            dqsz dqszVarB = dqxqVarAd.b();
            if (dqxqVarAd.f()) {
                List list2 = dqszVarB.a;
                if (!list2.isEmpty()) {
                    return ekgb.n(list2);
                }
            } else {
                Iterator it2 = dqszVarB.a.iterator();
                while (it2.hasNext()) {
                    ((dqsv) it2.next()).a();
                }
            }
        } else if (zAllMatch) {
            dqsz dqszVarB2 = dqxqVarAd.b();
            if (dqxqVarAd.f()) {
                Stream streamFilter = Collection.EL.stream(dqszVarB2.a).filter(new Predicate() { // from class: bwyw
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        ekrg ekrgVar = bwzy.a;
                        return ((dqsv) obj).a == dqss.NO_TXN_EXCLUDING_SCOPE;
                    }
                });
                int i2 = ekgb.d;
                return (ekgb) streamFilter.collect(ekcv.a);
            }
        }
        return ekgb.n(new ArrayList());
    }

    @Override // defpackage.dqsy
    public final int Z(final String str, final ContentValues contentValues, final String str2, final String[] strArr, final dqyh dqyhVar) {
        bwzu bwzuVar = new bwzu() { // from class: bwzd
            @Override // defpackage.bwzu
            public final Object a() {
                Context context = dqru.b;
                return Integer.valueOf(this.a.i().updateWithOnConflict(str, contentValues, str2, strArr, ((dqpb) dqyhVar).g));
            }
        };
        dqpb dqpbVar = (dqpb) dqyhVar;
        return ((Integer) T(bwzuVar, ab(dqus.UPDATE, str, dqpbVar.d, new ejxr() { // from class: bwze
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, new ejxr() { // from class: bwzf
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return dqxc.c("UPDATE " + str + " SET " + dqru.k(contentValues, null, null) + " WHERE " + str2, strArr);
            }
        }, this, dqpbVar.c, contentValues))).intValue();
    }

    @Override // defpackage.dqsy
    public final int a(final SQLiteStatement sQLiteStatement) {
        return ((Integer) T(new bwzu() { // from class: bwyl
            @Override // defpackage.bwzu
            public final Object a() {
                ekrg ekrgVar = bwzy.a;
                return Integer.valueOf(sQLiteStatement.executeUpdateDelete());
            }
        }, k(dqus.RAW_SQL, new dqsb("DatabasePlugin#executeStatement"), new ejxr() { // from class: bwyn
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this))).intValue();
    }

    @Override // defpackage.dqsy
    public final int b(final SQLiteStatement sQLiteStatement, dqsb dqsbVar) {
        sQLiteStatement.getClass();
        return ((Integer) T(new bwzu() { // from class: bwwz
            @Override // defpackage.bwzu
            public final Object a() {
                return Integer.valueOf(sQLiteStatement.executeUpdateDelete());
            }
        }, k(dqus.RAW_SQL, dqsbVar, new ejxr() { // from class: bwxa
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this))).intValue();
    }

    @Override // defpackage.dqsy
    public final int c(final dqqf dqqfVar) {
        return ((Integer) R(new bwzu() { // from class: bwzc
            @Override // defpackage.bwzu
            public final Object a() {
                ekrg ekrgVar = bwzy.a;
                return Integer.valueOf(dqqfVar.cP());
            }
        }, ac(new dqsb("DatabasePlugin#getCountForCursor"), dqqfVar))).intValue();
    }

    @Override // defpackage.dqsy
    public final long d(final String str, final String str2, final String[] strArr) {
        return ((Long) R(new bwzu() { // from class: bwyh
            @Override // defpackage.bwzu
            public final Object a() {
                return Long.valueOf(DatabaseUtils.queryNumEntries(this.a.i(), str, str2, strArr));
            }
        }, aa(dqus.QUERY, str, new dqsb("queryCount"), new ejxr() { // from class: bwyi
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this))).longValue();
    }

    @Override // defpackage.dqsy
    public final Cursor e(final String str, final String[] strArr) {
        return S(new bwzu() { // from class: bwxm
            @Override // defpackage.bwzu
            public final Object a() {
                return this.a.i().rawQuery(str, strArr);
            }
        }, k(dqus.QUERY, dqsb.c, new ejxr() { // from class: bwxn
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return dqxc.c(str, strArr);
            }
        }, this));
    }

    @Override // defpackage.dqsy
    public final Cursor f(final String str, final String[] strArr, dqwv dqwvVar) {
        bwzu bwzuVar = new bwzu() { // from class: bwxh
            @Override // defpackage.bwzu
            public final Object a() {
                return this.a.i().rawQuery(str, strArr);
            }
        };
        dqus dqusVar = dqus.QUERY;
        dqoy dqoyVar = (dqoy) dqwvVar;
        dqsb dqsbVar = dqoyVar.t;
        if (dqsbVar == null) {
            dqsbVar = dqsb.a;
        }
        dqsb dqsbVar2 = dqsbVar;
        ejxr ejxrVar = dqoyVar.w;
        if (ejxrVar == null) {
            ejxrVar = new ejxr() { // from class: bwxq
                @Override // defpackage.ejxr
                public final Object get() {
                    ekrg ekrgVar = bwzy.a;
                    return null;
                }
            };
        }
        return S(bwzuVar, ab(dqusVar, null, dqsbVar2, ejxrVar, new ejxr() { // from class: bwyb
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return dqxc.c(str, strArr);
            }
        }, this, dqoyVar.s, null));
    }

    @Override // defpackage.dqsy
    public final Cursor g(final String str, final String[] strArr, dqwv dqwvVar, final CancellationSignal cancellationSignal) throws dqwt {
        OperationCanceledException operationCanceledException;
        bwzu bwzuVar;
        dqus dqusVar;
        dqsb dqsbVar;
        ejxr ejxrVar;
        try {
            bwzuVar = new bwzu() { // from class: bwyz
                @Override // defpackage.bwzu
                public final Object a() {
                    return this.a.i().rawQuery(str, strArr, cancellationSignal);
                }
            };
            dqusVar = dqus.QUERY;
            dqoy dqoyVar = (dqoy) dqwvVar;
            dqsb dqsbVar2 = dqoyVar.t;
            if (dqsbVar2 == null) {
                try {
                    dqsbVar2 = dqsb.a;
                } catch (OperationCanceledException e) {
                    operationCanceledException = e;
                    throw new dqwt(operationCanceledException);
                }
            }
            dqsbVar = dqsbVar2;
            ejxrVar = dqoyVar.w;
            if (ejxrVar == null) {
                ejxrVar = new ejxr() { // from class: bwza
                    @Override // defpackage.ejxr
                    public final Object get() {
                        ekrg ekrgVar = bwzy.a;
                        return null;
                    }
                };
            }
        } catch (OperationCanceledException e2) {
            e = e2;
        }
        try {
            return S(bwzuVar, ab(dqusVar, null, dqsbVar, ejxrVar, new ejxr() { // from class: bwzb
                @Override // defpackage.ejxr
                public final Object get() {
                    ekrg ekrgVar = bwzy.a;
                    return dqxc.c(str, strArr);
                }
            }, this, ((dqoy) dqwvVar).s, null));
        } catch (OperationCanceledException e3) {
            e = e3;
            operationCanceledException = e;
            throw new dqwt(operationCanceledException);
        }
    }

    @Override // defpackage.dqsy
    public final SQLiteDatabase h() {
        return i();
    }

    public final SQLiteDatabase i() {
        bwzt bwztVar = this.j;
        if (bwztVar.d != null && Thread.currentThread() == bwztVar.d) {
            SQLiteDatabase sQLiteDatabase = bwztVar.e;
            sQLiteDatabase.getClass();
            return sQLiteDatabase;
        }
        Future future = (Future) bwztVar.a.get();
        future.getClass();
        try {
            try {
                return (SQLiteDatabase) eork.q(future);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new bwzo("Interrupted exception during database initialization", e);
            } catch (ExecutionException e2) {
                return bwzt.b(e2);
            }
        } catch (IllegalStateException unused) {
            ListenableFuture listenableFuture = (ListenableFuture) bwztVar.a.get();
            if (listenableFuture == null) {
                throw new IllegalStateException("no waiting future set");
            }
            eiju eijuVarG = eiju.g(eork.j(listenableFuture));
            return ecem.g() ? (SQLiteDatabase) eijuVarG.get() : (SQLiteDatabase) dqle.a(eijuVarG);
        } catch (ExecutionException e3) {
            return bwzt.b(e3);
        }
    }

    @Override // defpackage.dqsy
    public final dqrs j() {
        return this.e;
    }

    @Override // defpackage.dqsy
    public final eiju m() {
        Thread threadCurrentThread = Thread.currentThread();
        bwzt bwztVar = this.j;
        return threadCurrentThread == bwztVar.d ? eijx.e(null) : bwztVar.c.h(new ejvr() { // from class: bwzr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.dqsy
    public final Object n(ejxr ejxrVar) {
        Object obj;
        try {
            boolean zIsEmpty = r().isEmpty();
            x(new Runnable() { // from class: bwzg
                @Override // java.lang.Runnable
                public final void run() {
                    ekrg ekrgVar = bwzy.a;
                    bwzy.V(new dqxb());
                }
            }, k(dqus.BEGIN_SCOPE, new dqsb("DatabasePlugin#beginScope"), new ejxr() { // from class: bwzi
                @Override // defpackage.ejxr
                public final Object get() {
                    ekrg ekrgVar = bwzy.a;
                    return null;
                }
            }, this));
            if (zIsEmpty) {
                eieu eieuVarK = eiiy.k("executeInScope");
                try {
                    obj = ejxrVar.get();
                    eieuVarK.close();
                } finally {
                }
            } else {
                obj = ejxrVar.get();
            }
            C(true);
            return obj;
        } finally {
            af();
        }
    }

    @Override // defpackage.dqsy
    public final Object o(ejxr ejxrVar) {
        return p("AnonymousExecuteInTransaction", ejxrVar);
    }

    @Override // defpackage.dqsy
    public final Object p(String str, ejxr ejxrVar) {
        return q(new dqsb(str), ejxrVar, dqsx.c().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // defpackage.dqsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.dqsb r10, final defpackage.ejxr r11, final defpackage.dqsx r12) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "-END"
            r1 = r12
            dqop r1 = (defpackage.dqop) r1
            boolean r1 = r1.a
            r2 = r1 ^ 1
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L15
            boolean r5 = defpackage.dqsr.b(r9)
            if (r5 == 0) goto L15
            r5 = r4
            goto L16
        L15:
            r5 = r3
        L16:
            if (r1 != 0) goto L3c
            dqsb r6 = new dqsb
            java.lang.String r7 = "-BEGIN"
            r6.<init>(r10, r7)
            boolean r7 = defpackage.dqsr.b(r9)
            if (r7 == 0) goto L28
            dqus r7 = defpackage.dqus.BEGIN_NESTED_TRANSACTION
            goto L2a
        L28:
            dqus r7 = defpackage.dqus.BEGIN_TRANSACTION
        L2a:
            bwyc r8 = new bwyc
            r8.<init>()
            bwyd r12 = new bwyd
            r12.<init>()
            dqtx r12 = k(r7, r6, r12, r9)
            r9.x(r8, r12)
            goto L46
        L3c:
            dqrs r12 = r9.e
            dqxs r6 = new dqxs
            r6.<init>(r9, r12, r10)
            V(r6)
        L46:
            bwzk r12 = new bwzk     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            r12.<init>()     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            dqus r11 = defpackage.dqus.EXECUTE_IN_TRANSACTION_BODY     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            if (r5 == 0) goto L52
            dqsb r2 = defpackage.dqsb.c     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            goto L59
        L52:
            dqsb r2 = new dqsb     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            java.lang.String r5 = "-BODY"
            r2.<init>(r10, r5)     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
        L59:
            bwzl r5 = new bwzl     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            r5.<init>()     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            dqtx r11 = k(r11, r2, r5, r9)     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            java.lang.Object r11 = r9.R(r12, r11)     // Catch: java.lang.Throwable -> L79 java.lang.RuntimeException -> L7b
            if (r1 != 0) goto L71
            dqsb r12 = new dqsb
            r12.<init>(r10, r0)
            r9.u(r12, r3)
            return r11
        L71:
            dqxq r10 = ad()
            r10.h()
            return r11
        L79:
            r11 = move-exception
            goto L7f
        L7b:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L7d
        L7d:
            r11 = move-exception
            r3 = r4
        L7f:
            if (r1 != 0) goto L8a
            dqsb r12 = new dqsb
            r12.<init>(r10, r0)
            r9.u(r12, r3)
            goto L91
        L8a:
            dqxq r10 = ad()
            r10.h()
        L91:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwzy.q(dqsb, ejxr, dqsx):java.lang.Object");
    }

    public final void s() {
        dqrs dqrsVarA;
        Iterator itDescendingIterator = r().descendingIterator();
        while (itDescendingIterator.hasNext()) {
            dqxq dqxqVar = (dqxq) itDescendingIterator.next();
            if (dqxqVar != null && (dqrsVarA = dqxqVar.a()) != null && !dqxqVar.d()) {
                dqom dqomVar = (dqom) this.e;
                int i = dqomVar.d;
                int i2 = ((dqom) dqrsVarA).d;
                if (i2 <= i) {
                    return;
                }
                String str = dqomVar.b;
                throw new IllegalStateException("cannot begin transaction on " + i + "/" + str + " already holding " + i2 + "/" + str);
            }
        }
    }

    @Override // defpackage.dqsy
    public final void t() {
        x(new Runnable() { // from class: bwyo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i().close();
            }
        }, k(dqus.CLOSE, new dqsb("DatabasePlugin#close"), new ejxr() { // from class: bwyp
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this));
    }

    public final void u(dqsb dqsbVar, final boolean z) {
        bwzu bwzuVar = new bwzu() { // from class: bwxo
            @Override // defpackage.bwzu
            public final Object a() {
                return this.a.Y(true);
            }
        };
        Stream stream = Collection.EL.stream(r());
        final String str = ((dqom) this.e).b;
        dqru.s(this, (List) R(bwzuVar, k(stream.filter(new Predicate() { // from class: bwzm
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                dqrs dqrsVarA;
                dqxq dqxqVar = (dqxq) obj;
                ekrg ekrgVar = bwzy.a;
                if (dqxqVar == null || dqxqVar.d() || (dqrsVarA = dqxqVar.a()) == null) {
                    return false;
                }
                return ((dqom) dqrsVarA).b.equals(str);
            }
        }).count() > 1 ? dqus.END_NESTED_TRANSACTION : dqus.END_TRANSACTION, dqsbVar, new ejxr() { // from class: bwxp
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this)));
    }

    @Override // defpackage.dqsy
    public final void v(final String str) {
        T(new bwzu() { // from class: bwxb
            @Override // defpackage.bwzu
            public final Object a() throws SQLException {
                bwzy bwzyVar = this.a;
                ejwl.l(bwzyVar.L());
                bwzyVar.i().execSQL(str);
                return 1L;
            }
        }, k(dqus.RAW_SQL, new dqsb("DatabasePlugin#execSQL1"), new ejxr() { // from class: bwxc
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                return null;
            }
        }, this));
    }

    @Override // defpackage.dqsy
    public final void w(String str, final Runnable runnable) {
        p(str, new ejxr() { // from class: bwxw
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = bwzy.a;
                runnable.run();
                return null;
            }
        });
    }

    public final void x(final Runnable runnable, dqtx dqtxVar) {
    }

    @Override // defpackage.dqsy
    public final void z(Uri uri) {
        A(uri, null);
    }
}
