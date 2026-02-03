package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwzt {
    public kog b;
    public Thread d;
    public SQLiteDatabase e;
    public final AtomicReference a = new AtomicReference();
    public final eiju c = eiju.g(kol.a(new koi() { // from class: bwzs
        @Override // defpackage.koi
        public final Object a(kog kogVar) {
            this.a.b = kogVar;
            return null;
        }
    }));

    public static final SQLiteDatabase b(Exception exc) {
        throw new bwzo("Unhandled exception during database initialization", exc);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
        this.d = sQLiteDatabase != null ? Thread.currentThread() : null;
    }
}
