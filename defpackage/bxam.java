package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bxam {
    Cursor a(Cursor cursor, dqtx dqtxVar);

    int e(Exception exc, int i, dqtx dqtxVar);

    Closeable m(dqtx dqtxVar);

    void n(SQLiteDatabase sQLiteDatabase);

    boolean o();
}
