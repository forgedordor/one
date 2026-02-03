package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lzq implements Callable {
    final /* synthetic */ lzt a;

    public lzq(lzt lztVar) {
        this.a = lztVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        Object objA;
        lzt lztVar = this.a;
        lztVar.e.set(true);
        try {
            Process.setThreadPriority(10);
            objA = lztVar.a();
            try {
                Binder.flushPendingCommands();
                return objA;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.a.d.set(true);
                    throw th;
                } finally {
                    this.a.d(objA);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            objA = null;
        }
    }
}
