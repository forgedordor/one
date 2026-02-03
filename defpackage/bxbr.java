package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxbr implements bxam {
    private final Set e;
    private ekfw f;
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin");
    public static final cczi a = cdag.m(cdag.b, "QueryPlanCheckerPlugin_enabled", true);
    static final ekgb b = ekgb.z("DELETE FROM conversations", "DELETE FROM events", "DELETE FROM generic_worker_queue", "DELETE FROM participants", "DELETE FROM p2p_conversation_suggestion_event", "DELETE FROM remote_user_id_to_registration_id WHERE 1", "DELETE FROM user_references WHERE ((SELECT EXISTS (SELECT messages._id FROM messages WHERE ((messages._id = user_references.message_id) AND ((messages.message_status = ", "UPDATE messages SET raw_status=10001,message_status=8 WHERE ((messages.message_status = ?) AND (messages._id IN (SELECT parts.message_id FROM parts WHERE (parts.processing_status NOT IN (0,3)))))", "UPDATE generic_worker_queue SET retry_count=4 WHERE ((generic_worker_queue.worker_type IN (32,64,128)) AND (generic_worker_queue");
    static final ekgb c = ekgb.w(Pattern.compile("INSERT INTO participants .*", 32), Pattern.compile(".*\\(participants\\.color_type \\<\\> 0\\).*"), Pattern.compile(".*\\(participants\\._id IN \\(SELECT.*"), Pattern.compile(".*\\(participants\\.sub_id = -2\\)"), Pattern.compile("UPDATE participants SET .* WHERE .*"), Pattern.compile(".*PHONE_NUMBERS_EQUAL.*"));

    public bxbr(Set set) {
        int i = ekgb.d;
        this.f = new ekfw();
        this.e = set;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    public final void f(dqtx dqtxVar, Throwable th) {
        dqxc dqxcVarP = dqtxVar.p();
        final String strA = dqxcVarP.a();
        String[] strArr = (String[]) Collection.EL.stream(dqxcVarP.b()).toArray(new IntFunction() { // from class: bxbn
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                cczi ccziVar = bxbr.a;
                return new String[i];
            }
        });
        if (strA == null || strA.startsWith("EXPLAIN ")) {
            return;
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        try {
            dqsy dqsyVar = ((dqov) dqtxVar).c;
            dqse dqseVarD = dqru.d(((bwzy) dqsyVar).i(), strA, strArr, this.e);
            if (dqseVarD.b && !strA.startsWith("/*EXEMPT-FROM-QUERY-PLAN-CHECK*/") && Collection.EL.stream(c).noneMatch(new Predicate() { // from class: bxbo
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
                    cczi ccziVar = bxbr.a;
                    return ((Pattern) obj).matcher(strA).matches();
                }
            }) && Collection.EL.stream(b).noneMatch(new Predicate() { // from class: bxbp
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
                    return strA.contains((String) obj);
                }
            })) {
                String str = "query plan with warnings for " + ((dqov) dqtxVar).a.toString() + "\n" + strA + "\nsdk " + Build.VERSION.SDK_INT + "\nsqlite version " + dqru.l(((bwzy) dqsyVar).i()) + "\n" + dqseVarD.a + "\n" + ((String) DesugarArrays.stream(th.getStackTrace()).map(new Function() { // from class: bxbq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cczi ccziVar = bxbr.a;
                        return ((StackTraceElement) obj).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining("\n")));
                ekrw ekrwVarJ = d.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin", "checkQueryPlan", 232, "QueryPlanCheckerPlugin.java")).t("%s", str);
                throw new IllegalStateException(str);
            }
        } catch (SQLiteException e) {
            ekrw ekrwVarG = d.g();
            ekrwVarG.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarG).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/QueryPlanCheckerPlugin", "checkQueryPlan", 244, "QueryPlanCheckerPlugin.java")).t("got SQLiteException evaluating query plan: %s", strA);
        }
    }

    @Override // defpackage.bxam
    public final Closeable m(final dqtx dqtxVar) {
        if (!((Boolean) a.e()).booleanValue()) {
            return null;
        }
        dqov dqovVar = (dqov) dqtxVar;
        if (dqovVar.d) {
            return null;
        }
        int iOrdinal = dqovVar.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 8) {
                final ekgb ekgbVarG = this.f.g();
                int i = ekgb.d;
                this.f = new ekfw();
                return new Closeable() { // from class: bxbk
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        cczi ccziVar = bxbr.a;
                        int i2 = 0;
                        while (true) {
                            ekgb ekgbVar = ekgbVarG;
                            if (i2 >= ((ekoe) ekgbVar).c) {
                                return;
                            }
                            ((Runnable) ekgbVar.get(i2)).run();
                            i2++;
                        }
                    }
                };
            }
            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                return null;
            }
        }
        final IllegalStateException illegalStateException = new IllegalStateException();
        Runnable runnable = new Runnable() { // from class: bxbl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(dqtxVar, illegalStateException);
            }
        };
        if (((bwzy) dqovVar.c).i().inTransaction()) {
            this.f.h(new Runnable() { // from class: bxbm
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(dqtxVar, illegalStateException);
                }
            });
            return null;
        }
        runnable.run();
        return null;
    }

    @Override // defpackage.bxam
    public final void n(SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) a.e()).booleanValue()) {
            eieu eieuVarK = eiiy.k("QueryPlanCheckerPlugin#initialize");
            try {
                sQLiteDatabase.execSQL("PRAGMA automatic_index = 0;");
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT count(*) FROM sqlite_master WHERE name = 'sqlite_stat1'", null);
                try {
                    if (cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) == 0) {
                        sQLiteDatabase.execSQL("ANALYZE");
                        sQLiteDatabase.execSQL("DELETE FROM sqlite_stat1");
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master", null);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            String string = cursorRawQuery.getString(0);
                            if (string.hashCode() == 100346066 && string.equals("index")) {
                                String string2 = cursorRawQuery.getString(2);
                                if (!string2.startsWith("sqlite")) {
                                    String string3 = cursorRawQuery.getString(1);
                                    Context context = dqru.b;
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("tbl", string2);
                                    contentValues.put("idx", string3);
                                    contentValues.put("stat", (Integer) 10000);
                                    sQLiteDatabase.insertOrThrow("sqlite_stat1", null, contentValues);
                                }
                            }
                        } finally {
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS foo_for_testing");
                    sQLiteDatabase.execSQL("CREATE TABLE foo_for_testing (foo, bar)");
                    sQLiteDatabase.execSQL("ANALYZE foo_for_testing");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS foo_for_testing");
                    eieuVarK.close();
                } finally {
                }
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

    @Override // defpackage.bxam
    public final boolean o() {
        return bxal.a();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
