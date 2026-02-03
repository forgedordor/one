package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzg {
    private final Executor a;

    public qzg(Handler handler) {
        this.a = new qze(handler);
    }

    public final void a(qzo qzoVar, qzx qzxVar) {
        qzoVar.d("post-error");
        this.a.execute(new qzf(qzoVar, new qzu(qzxVar), null));
    }

    public final void b(qzo qzoVar, qzu qzuVar) {
        c(qzoVar, qzuVar, null);
    }

    public final void c(qzo qzoVar, qzu qzuVar, Runnable runnable) {
        qzoVar.h();
        qzoVar.d("post-response");
        this.a.execute(new qzf(qzoVar, qzuVar, runnable));
    }
}
