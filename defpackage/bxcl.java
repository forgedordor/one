package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcl implements bxam {
    public static final cqce a = cqce.g("BugleDatabase", "DatabaseWrapperCursorHandler");
    public static final ejxr b = ejxx.a(new ejxr() { // from class: bxbz
        @Override // defpackage.ejxr
        public final Object get() {
            cqce cqceVar = bxcl.a;
            return cdag.e(cdag.b, "DatabaseWrapperCursorHandlerRetryIterations", 20);
        }
    });
    public static final ejxr c = ejxx.a(new ejxr() { // from class: bxca
        @Override // defpackage.ejxr
        public final Object get() {
            cqce cqceVar = bxcl.a;
            return cdag.f(cdag.b, "DatabaseWrapperCursorHandlerBackoffMillis", 50L);
        }
    });
    public static final cczi d = cdag.p(150089955);
    public final fcsu e;

    public bxcl(fcsu fcsuVar) {
        this.e = fcsuVar;
    }

    @Override // defpackage.bxam
    public final Cursor a(Cursor cursor, dqtx dqtxVar) {
        return new bxck(this, cursor);
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Closeable m(dqtx dqtxVar) {
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((Boolean) d.e()).booleanValue();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }
}
