package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmg {
    public final qlo a;
    public final fdjq b;
    final Handler c = new Handler(Looper.getMainLooper());
    public final Executor d = new qmf(this);

    public qmg(Executor executor) {
        qlo qloVar = new qlo(executor);
        this.a = qloVar;
        this.b = fdli.b(qloVar);
    }

    public final /* synthetic */ void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
