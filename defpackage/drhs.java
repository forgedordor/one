package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhs {
    public final String a;
    public final drht b;
    private final Executor c;

    public drhs(String str, drht drhtVar) {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        if (str == null) {
            throw new NullPointerException("Answer URL was missing");
        }
        if (drhtVar == null) {
            throw new NullPointerException("HaTS cookie store was missing");
        }
        if (executor == null) {
            throw new NullPointerException("Executor was missing");
        }
        this.a = str;
        this.b = drhtVar;
        this.c = executor;
    }

    public final void a(drhq drhqVar) {
        this.c.execute(new drhr(this, drhqVar.a(true)));
    }
}
