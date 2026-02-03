package defpackage;

import android.database.sqlite.SQLiteConstraintException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdb extends cpyr {
    private final SQLiteConstraintException a;

    public bzdb(SQLiteConstraintException sQLiteConstraintException) {
        super(22, cpyz.NO_RETRY, "Tried to backup a conversation but CMS already assigned its ID to a different conversation");
        this.a = sQLiteConstraintException;
    }

    public final boolean equals(Object obj) {
        bzdb bzdbVar = obj instanceof bzdb ? (bzdb) obj : null;
        if (bzdbVar == null) {
            return false;
        }
        return fdbq.f(getMessage(), bzdbVar.getMessage());
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.a;
    }
}
