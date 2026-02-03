package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkb implements pjo {
    public final SQLiteDatabase d;
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] e = new String[0];
    public static final fctc b = fctd.b(3, new fdae() { // from class: pjy
        @Override // defpackage.fdae
        public final Object invoke() {
            String[] strArr = pkb.a;
            try {
                Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    });
    public static final fctc c = fctd.b(3, new fdae() { // from class: pjz
        @Override // defpackage.fdae
        public final Object invoke() {
            Class<?> returnType;
            String[] strArr = pkb.a;
            try {
                Method methodB = pka.b();
                if (methodB == null || (returnType = methodB.getReturnType()) == null) {
                    return null;
                }
                Class<?> cls = Integer.TYPE;
                return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    });

    public pkb(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // defpackage.pjo
    public final Cursor a(final pjv pjvVar) {
        final fdav fdavVar = new fdav() { // from class: pjw
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                String[] strArr = pkb.a;
                sQLiteQuery.getClass();
                pjvVar.h(new pkk(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            }
        };
        Cursor cursorRawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: pjx
            /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor, java.lang.Object] */
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                String[] strArr = pkb.a;
                return fdavVar.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, pjvVar.b(), e, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.pjo
    public final Cursor b(String str) {
        return a(new pjn(str));
    }

    @Override // defpackage.pjo
    public final String c() {
        return this.d.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.pjo
    public final void d() {
        this.d.beginTransaction();
    }

    @Override // defpackage.pjo
    public final void e() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // defpackage.pjo
    public final void f() {
        this.d.endTransaction();
    }

    @Override // defpackage.pjo
    public final void g(String str) throws SQLException {
        this.d.execSQL(str);
    }

    @Override // defpackage.pjo
    public final void h() {
        this.d.setTransactionSuccessful();
    }

    @Override // defpackage.pjo
    public final boolean i() {
        return this.d.inTransaction();
    }

    @Override // defpackage.pjo
    public final boolean j() {
        return this.d.isOpen();
    }

    @Override // defpackage.pjo
    public final pkl k(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.d.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new pkl(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.pjo
    public final void l(Object[] objArr) throws SQLException {
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
