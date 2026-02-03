package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dccs {
    private static dccs c;
    public final Context a;
    public final ScheduledExecutorService b;
    private dccm d = new dccm(this);
    private int e = 1;

    public dccs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized dccs b(Context context) {
        if (c == null) {
            ddmw ddmwVar = ddmx.a;
            c = new dccs(context, ddmw.a(new dcnq("MessengerIpcClient")));
        }
        return c;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    public final defn c(int i, Bundle bundle) {
        return d(new dcco(a(), i, bundle));
    }

    public final synchronized defn d(dccp dccpVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(dccpVar.toString()));
        }
        if (!this.d.e(dccpVar)) {
            dccm dccmVar = new dccm(this);
            this.d = dccmVar;
            dccmVar.e(dccpVar);
        }
        return dccpVar.b.a;
    }
}
