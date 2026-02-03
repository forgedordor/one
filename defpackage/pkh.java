package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkh extends SQLiteOpenHelper {
    private final Context a;
    private final pkd b;
    private final pjp c;
    private final boolean d;
    private boolean e;
    private final pkm f;
    private boolean g;

    public pkh(Context context, String str, final pkd pkdVar, pjp pjpVar, boolean z) {
        String string;
        super(context, str, null, pjpVar.b, new DatabaseErrorHandler() { // from class: pke
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                pkb pkbVarA = pkg.a(pkdVar, sQLiteDatabase);
                Log.e("SupportSQLite", a.h(pkbVarA, "Corruption reported by sqlite on database: ", ".path"));
                if (!pkbVarA.j()) {
                    String strC = pkbVarA.c();
                    if (strC != null) {
                        pjp.f(strC);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = pkbVarA.d.getAttachedDbs();
                    } catch (Throwable th) {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                pjp.f((String) obj);
                            }
                        } else {
                            String strC2 = pkbVarA.c();
                            if (strC2 != null) {
                                pjp.f(strC2);
                            }
                        }
                        throw th;
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    pkbVarA.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs == null) {
                    String strC3 = pkbVarA.c();
                    if (strC3 != null) {
                        pjp.f(strC3);
                        return;
                    }
                    return;
                }
                Iterator<T> it2 = attachedDbs.iterator();
                while (it2.hasNext()) {
                    Object obj2 = ((Pair) it2.next()).second;
                    obj2.getClass();
                    pjp.f((String) obj2);
                }
            }
        });
        this.a = context;
        this.b = pkdVar;
        this.c = pjpVar;
        this.d = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.f = new pkm(string, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final pkb a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return pkg.a(this.b, sQLiteDatabase);
    }

    public final pjo b() {
        SQLiteDatabase sQLiteDatabaseC;
        pjo pjoVarA;
        File parentFile;
        try {
            this.f.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            String databaseName = getDatabaseName();
            boolean z = this.g;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseC = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    sQLiteDatabaseC = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof pkf) {
                        pkf pkfVar = (pkf) th;
                        Throwable th2 = pkfVar.a;
                        int i = pkfVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new fctg();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        sQLiteDatabaseC = c();
                    } catch (pkf e) {
                        throw e.a;
                    }
                }
            }
            if (this.e) {
                close();
                pjoVarA = b();
            } else {
                pjoVarA = a(sQLiteDatabaseC);
            }
            return pjoVarA;
        } finally {
            this.f.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            pkm pkmVar = this.f;
            Map map = pkm.a;
            boolean z = pkmVar.b;
            pkmVar.a(false);
            super.close();
            this.b.a = null;
            this.g = false;
        } finally {
            this.f.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e && this.c.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            pjp pjpVar = this.c;
            a(sQLiteDatabase);
            pjpVar.e();
        } catch (Throwable th) {
            throw new pkf(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.a(a(sQLiteDatabase));
        } catch (Throwable th) {
            throw new pkf(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new pkf(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                this.c.c(a(sQLiteDatabase));
            } catch (Throwable th) {
                throw new pkf(5, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.d(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new pkf(3, th);
        }
    }
}
