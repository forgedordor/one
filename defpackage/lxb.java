package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxb {
    public final lvn a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private lxa c;

    public lxb(lvj lvjVar) {
        this.a = new lvn(lvjVar);
    }

    public final void a(lva lvaVar) {
        lxa lxaVar = this.c;
        if (lxaVar != null) {
            lxaVar.run();
        }
        lxa lxaVar2 = new lxa(this.a, lvaVar);
        this.c = lxaVar2;
        this.b.postAtFrontOfQueue(lxaVar2);
    }
}
