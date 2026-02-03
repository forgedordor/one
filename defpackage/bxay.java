package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxay implements bxam {
    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        if (((dqov) dqtxVar).a.c()) {
            throw new IllegalStateException("missing logging tag");
        }
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return cqbe.a == elvg.ROBOLECTRIC_BUILD;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
