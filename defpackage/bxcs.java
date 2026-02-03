package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcs implements bxam {
    private final fcsu d;
    private static final cqce c = cqce.g("BugleDatabase", "DatabaseWrapperBusyHandler");
    public static final cczv a = cdag.e(cdag.b, "SqliteLockedHandlerRetryIterations", 20);
    public static final cczv b = cdag.f(cdag.b, "SqliteLockedHandlerBackoffMillis", 50);

    public bxcs(fcsu fcsuVar) {
        this.d = fcsuVar;
    }

    @Override // defpackage.bxam
    public final int e(Exception exc, int i, dqtx dqtxVar) {
        if (!(exc instanceof SQLiteDatabaseLockedException)) {
            return 1;
        }
        if (i >= ((Integer) a.e()).intValue()) {
            return 3;
        }
        c.r("got SQLiteDatabaseLockedException");
        if (i == 0) {
            ((ains) this.d.b()).c("Bugle.Datamodel.DatabaseLocked.Counts");
        }
        eote.c(((Long) b.e()).longValue(), TimeUnit.MILLISECONDS);
        return 2;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Closeable m(dqtx dqtxVar) {
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return true;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
