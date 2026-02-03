package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ecnj extends eooi implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final ecni b;

    public ecnj(ecni ecniVar) {
        this.b = ecniVar;
    }

    protected abstract void d(ecni ecniVar);

    public final void e(Executor executor) {
        executor.execute(eiid.k(this));
    }

    @Override // defpackage.eooi
    public final String gu() {
        return "query=[" + this.b.b() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            if (Log.isLoggable("ASQLDB", 2)) {
                ecni ecniVar = this.b;
                ecniVar.c();
                Log.v("ASQLDB", "The query's result is currently:");
                Log.v("ASQLDB", ecoa.e(ecniVar.a(new CancellationSignal())));
                Log.v("ASQLDB", "NOTE(b/171271240): If another thread commits in parallel with this query, the printed debug result above might be from an earlier snapshot than this query's Future<Cursor> iterates.");
            }
            ecni ecniVar2 = this.b;
            eieu eieuVarK = eiiy.k("Query: " + ecniVar2.b());
            try {
                d(ecniVar2);
                eieuVarK.close();
            } finally {
            }
        } catch (Throwable th) {
            setException(th);
        }
    }
}
