package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecmp {
    public final SQLiteDatabase a;
    public final Executor b;
    public volatile boolean c = false;
    public final ecmy d;
    private final Executor e;

    public ecmp(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, ecmy ecmyVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.e = executor2;
        this.d = ecmyVar;
    }

    public final ListenableFuture a(final Callable callable) {
        c();
        eosa eosaVar = new eosa(eiid.l(new Callable() { // from class: ecmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ecmp ecmpVar = this.a;
                ecmpVar.d.b();
                try {
                    return callable.call();
                } finally {
                    ecmpVar.d.a();
                }
            }
        }));
        this.b.execute(eosaVar);
        return eosaVar;
    }

    public final ListenableFuture b(ecny ecnyVar) {
        c();
        eiez eiezVar = eiey.a;
        final ecoa ecoaVar = new ecoa(this.a);
        eieu eieuVarJ = eiiy.j("Transaction", eiezVar);
        try {
            final eosa eosaVar = new eosa(eiid.l(new ecmn(this, ecnyVar, ecoaVar)));
            this.e.execute(eosaVar);
            eosaVar.b(new Runnable() { // from class: ecmk
                @Override // java.lang.Runnable
                public final void run() {
                    if (eosaVar.isCancelled()) {
                        ecoaVar.a.cancel();
                    }
                }
            }, eoqg.a);
            eieuVarJ.b(eosaVar);
            eieuVarJ.close();
            return eosaVar;
        } catch (Throwable th) {
            try {
                eieuVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (this.c) {
            throw new IllegalStateException("Already closed");
        }
    }
}
