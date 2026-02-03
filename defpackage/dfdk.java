package defpackage;

import android.database.sqlite.SQLiteDatabase;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdk {
    public static final Optional a(SQLiteDatabase sQLiteDatabase, ejxr ejxrVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Object obj = ejxrVar.get();
            sQLiteDatabase.setTransactionSuccessful();
            return Optional.ofNullable(obj);
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static final void b(SQLiteDatabase sQLiteDatabase, Runnable runnable) {
        sQLiteDatabase.beginTransaction();
        try {
            runnable.run();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
