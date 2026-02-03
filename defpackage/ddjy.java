package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjy {
    private static final ekgb e = ekgb.r("CREATE TABLE collections(id INTEGER PRIMARY KEY, collection_name STRING NOT NULL,time INTEGER NOT NULL,selection_key INTEGER NOT NULL,value BLOB NOT NULL)");
    public final ddka a;
    public final diep b;
    public final Random c;
    public final ExecutorService d;

    public ddjy(Context context, diep diepVar, Random random, ExecutorService executorService) {
        this.a = new ddka(context, e);
        this.b = diepVar;
        this.c = random;
        this.d = executorService;
    }

    public static void b(String str) {
        if (Log.isLoggable("SqliteExampleStore", 3)) {
            Log.d("SqliteExampleStore", str);
        }
    }

    public final ListenableFuture a(final ejvr ejvrVar) {
        return eork.n(new eooy() { // from class: ddju
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ejvr ejvrVar2 = ejvrVar;
                ddjy ddjyVar = this.a;
                SQLiteDatabase writableDatabase = ddjyVar.a.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    try {
                        Object objApply = ejvrVar2.apply(new ddjx(writableDatabase, ddjyVar.b, ddjyVar.c));
                        writableDatabase.setTransactionSuccessful();
                        ListenableFuture listenableFutureI = eork.i(objApply);
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return listenableFutureI;
                    } finally {
                        writableDatabase.endTransaction();
                    }
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }, this.d);
    }
}
