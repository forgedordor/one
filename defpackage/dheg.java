package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dheg<ResultT> extends BroadcastReceiver {
    protected abstract void c(Context context, Intent intent);

    protected Executor d() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    protected boolean e(Context context, Intent intent) {
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (e(context, intent)) {
            new dhef(this, context, intent, goAsync()).executeOnExecutor(cqaz.n() ? eoqg.a : d(), new Void[0]);
        }
    }
}
