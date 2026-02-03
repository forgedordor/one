package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rjs implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ rjt b;

    public rjs(rjt rjtVar, Runnable runnable) {
        this.a = runnable;
        this.b = rjtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
