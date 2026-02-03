package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkl extends pkk implements pju {
    public final SQLiteStatement a;

    public pkl(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final void a() {
        this.a.executeUpdateDelete();
    }
}
