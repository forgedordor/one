package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbk implements Runnable {
    private final Callable a;
    private final lbz b;
    private final Handler c;

    public lbk(Handler handler, Callable callable, lbz lbzVar) {
        this.a = callable;
        this.b = lbzVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        laz lazVarCall;
        try {
            lazVarCall = ((lax) this.a).call();
        } catch (Exception unused) {
            lazVarCall = null;
        }
        this.c.post(new lbj(this.b, lazVarCall));
    }
}
