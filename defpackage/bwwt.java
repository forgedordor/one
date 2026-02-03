package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwt implements bxam {
    static final cczi a = cdag.p(173707567);
    public static final cqce b = cqce.g("BugleDatabase", "DatabaseCloseChecker");
    public final AtomicBoolean c = new AtomicBoolean(false);

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        AtomicBoolean atomicBoolean = this.c;
        boolean z = !atomicBoolean.get();
        dqus dqusVar = ((dqov) dqtxVar).b;
        ejwl.p(z, "database is already closed %s", dqusVar);
        if (dqusVar.ordinal() != 15) {
            return new bwws(new ejvr() { // from class: bwwq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Boolean.valueOf(this.a.c.get());
                }
            });
        }
        atomicBoolean.set(true);
        cqbd cqbdVarE = b.e();
        cqbdVarE.I("Bugle database has started to close.  New database operations will fail.");
        cqbdVarE.r();
        return new bwwr();
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
