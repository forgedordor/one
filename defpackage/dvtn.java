package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtn extends SQLiteException {
    public dvtn(Throwable th) {
        super("Error when executing transaction!!", th);
    }
}
