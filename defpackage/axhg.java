package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axhg extends SQLiteOpenHelper {
    private final aptk A;
    private final SettableFuture B;
    private final bbmi C;
    public final axie e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final AtomicReference i;
    public final Object j;
    public final ejxr k;
    public final dqrs l;
    public final DatabaseErrorHandler m;
    DatabaseErrorHandler n;
    public final dqro o;
    private final Context r;
    private final Optional s;
    private final fcsu t;
    private final fcsu u;
    private final cogw v;
    private final fcsu w;
    private final String x;
    private final fcsu y;
    private final Map z;
    private static final cqce p = cqce.g("Bugle", "DatabaseHelperBasic");
    private static final ekrg q = ekrg.c("com/google/android/apps/messaging/shared/datamodel/DatabaseHelperBasic");
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final ejxr b = ejxx.a(new ejxr() { // from class: axhd
        @Override // defpackage.ejxr
        public final Object get() {
            AtomicBoolean atomicBoolean = axhg.a;
            return cdag.e(cdag.b, "database_open_retry_iterations", 20);
        }
    });
    static final cczv c = cdag.f(cdag.b, "cursor_window_size", 4194304);
    static final cczv d = cdag.g(cdag.b, "larger_cursor_window_logging_tags", "partOffsetQuery|+loadMessages");

    /* JADX WARN: Illegal instructions before constructor call */
    public axhg(Context context, fcsu fcsuVar, Optional optional, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, cogw cogwVar, bbmi bbmiVar, fcsu fcsuVar7, fcsu fcsuVar8, Map map, dqro dqroVar, aptk aptkVar, dqrs dqrsVar) {
        dqom dqomVar = (dqom) dqrsVar;
        super(context, dqomVar.a, null, axie.b(dqrsVar), null);
        this.i = new AtomicReference();
        this.j = new Object();
        this.m = new DefaultDatabaseErrorHandler();
        this.B = SettableFuture.create();
        this.r = context;
        this.y = fcsuVar8;
        this.z = map;
        this.o = dqroVar;
        this.A = aptkVar;
        this.l = dqrsVar;
        this.e = ((axif) fcsuVar.b()).a(dqrsVar);
        this.s = optional;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.t = fcsuVar5;
        this.u = fcsuVar6;
        this.v = cogwVar;
        this.C = bbmiVar;
        this.w = fcsuVar7;
        this.k = ejxx.a(new ejxr() { // from class: axgr
            @Override // defpackage.ejxr
            public final Object get() {
                Stream map2 = DesugarArrays.stream(((String) axhg.d.e()).split("\\|")).map(new Function() { // from class: axgs
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String str = (String) obj;
                        AtomicBoolean atomicBoolean = axhg.a;
                        return str.startsWith("+") ? str.substring(1) : str;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: axgt
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
                        AtomicBoolean atomicBoolean = axhg.a;
                        return !((String) obj).isEmpty();
                    }
                }).map(new Function() { // from class: axgu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        AtomicBoolean atomicBoolean = axhg.a;
                        return "/* " + ((String) obj) + " */";
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return (ekgb) map2.collect(ekcv.a);
            }
        });
        this.x = dqomVar.b.equals("$primary") ? "bugle_db" : dqomVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.database.sqlite.SQLiteDatabase e() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axhg.e():android.database.sqlite.SQLiteDatabase");
    }

    private static boolean f(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", null, "type = 'trigger' AND name = ?", new String[]{str}, null, null, null);
        try {
            boolean z = cursorQuery.getCount() > 0;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return z;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0204 A[Catch: all -> 0x0231, TRY_LEAVE, TryCatch #12 {all -> 0x0231, blocks: (B:106:0x01d3, B:108:0x0204, B:110:0x0227, B:112:0x0229, B:113:0x0230, B:104:0x01b9), top: B:147:0x01b9, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0227 A[Catch: all -> 0x0231, TRY_ENTER, TryCatch #12 {all -> 0x0231, blocks: (B:106:0x01d3, B:108:0x0204, B:110:0x0227, B:112:0x0229, B:113:0x0230, B:104:0x01b9), top: B:147:0x01b9, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.sqlite.SQLiteDatabase a() {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axhg.a():android.database.sqlite.SQLiteDatabase");
    }

    final SQLiteDatabase b(String str) {
        eieu eieuVarK = eiiy.k("DatabaseHelperBasic#openOrCreateDatabase");
        try {
            this.n = new DatabaseErrorHandler() { // from class: axhe
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    axhg axhgVar = this.a;
                    fcsu fcsuVar = axhgVar.f;
                    ((ains) fcsuVar.b()).c("Bugle.Datamodel.DatabaseCorrupted.Counts");
                    ((ains) fcsuVar.b()).a();
                    axhgVar.m.onCorruption(sQLiteDatabase);
                    axhgVar.c();
                }
            };
            int iIntValue = ((Integer) ((cczi) b.get()).e()).intValue();
            int i = 0;
            SQLiteException sQLiteException = null;
            while (i <= iIntValue) {
                try {
                    SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(str, Build.VERSION.SDK_INT < 28 ? null : new SQLiteDatabase.CursorFactory() { // from class: axhf
                        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                            SQLiteCursor sQLiteCursor = new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                            ejxr ejxrVar = this.a.k;
                            final String string = sQLiteQuery.toString();
                            if (!Collection.EL.stream((ekgb) ejxrVar.get()).anyMatch(new Predicate() { // from class: axgx
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
                                    AtomicBoolean atomicBoolean = axhg.a;
                                    return string.contains((String) obj);
                                }
                            }) && !string.contains("/* use_custom_cursor_window_for_testing */")) {
                                return sQLiteCursor;
                            }
                            sQLiteCursor.setWindow(new CursorWindow("bugle-cursor-window", ((Long) axhg.c.e()).longValue()));
                            return sQLiteCursor;
                        }
                    }, 805306384, this.n);
                    if (i > 0) {
                        ((ains) this.f.b()).e("Bugle.Datamodel.OpenSucceedAfterRetries.Counts", i);
                    }
                    eieuVarK.close();
                    return sQLiteDatabaseOpenDatabase;
                } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException e) {
                    if (sQLiteException != null) {
                        e.addSuppressed(sQLiteException);
                    }
                    eote.c(50L, TimeUnit.MILLISECONDS);
                    i++;
                    sQLiteException = e;
                }
            }
            ((ains) this.f.b()).c("Bugle.Datamodel.UnableToOpenDatabaseExceededRetries.Counts");
            if (sQLiteException == null) {
                throw new SQLiteDiskIOException("doOpenDatabase was never called");
            }
            throw sQLiteException;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void c() {
        ((aill) this.u.b()).b();
        crrf.a();
    }

    public final void d() {
        try {
            SettableFuture settableFuture = this.B;
            dqle.c();
            eote.a(settableFuture);
        } catch (ExecutionException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigure(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L45
            r0 = 1
            r5.setForeignKeyConstraintsEnabled(r0)
            boolean r1 = defpackage.axie.h(r5)
            defpackage.cqaz.k(r1)
            java.lang.String r1 = "pragma journal_mode"
            r2 = 0
            android.database.Cursor r5 = r5.rawQuery(r1, r2)
            r1 = 0
            if (r5 == 0) goto L3c
            boolean r2 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3c
            java.lang.String r2 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "wal"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L2e
            goto L3c
        L2e:
            r5.close()
            goto L42
        L32:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r5 = move-exception
            r0.addSuppressed(r5)
        L3b:
            throw r0
        L3c:
            if (r5 == 0) goto L41
            r5.close()
        L41:
            r0 = r1
        L42:
            defpackage.cqaz.k(r0)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axhg.onConfigure(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        eieu eieuVarK = eiiy.k("DatabaseHelperBasic#onDowngrade");
        try {
            this.C.a((dqsy) this.i.get(), this.l, i, i2).onDowngrade();
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        eieu eieuVarK = eiiy.k("DatabaseHelperBasic#onUpgrade");
        try {
            ejwl.l(i2 > i);
            AtomicReference atomicReference = this.i;
            ((bwzy) atomicReference.get()).j.a(sQLiteDatabase);
            this.C.a((dqsy) atomicReference.get(), this.l, i, i2).onUpgrade();
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }
}
