package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdj extends cpyr {
    private final SQLiteException a;

    public bzdj(String str, String str2, SQLiteException sQLiteException) {
        super(14, cpyz.NO_RETRY, a.n(str2, str, "Could not set the CMS Id for ", " row "));
        this.a = sQLiteException;
    }

    public final boolean equals(Object obj) {
        bzdj bzdjVar = obj instanceof bzdj ? (bzdj) obj : null;
        if (bzdjVar == null) {
            return false;
        }
        return fdbq.f(getMessage(), bzdjVar.getMessage());
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.a;
    }
}
