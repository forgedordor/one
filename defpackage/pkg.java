package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkg {
    public static final pkb a(pkd pkdVar, SQLiteDatabase sQLiteDatabase) {
        pkdVar.getClass();
        pkb pkbVar = pkdVar.a;
        if (pkbVar != null && fdbq.f(pkbVar.d, sQLiteDatabase)) {
            return pkbVar;
        }
        pkb pkbVar2 = new pkb(sQLiteDatabase);
        pkdVar.a = pkbVar2;
        return pkbVar2;
    }
}
