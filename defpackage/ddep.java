package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddep {
    public final Context a;
    public final ScheduledExecutorService b;
    private ddek c;
    private int d;

    public ddep(Context context) {
        ddmw ddmwVar = ddmx.a;
        ScheduledExecutorService scheduledExecutorServiceA = ddmw.a(new dcnq("MessengerIpcClient"));
        this.c = new ddek(this);
        this.d = 1;
        this.a = context.getApplicationContext();
        this.b = scheduledExecutorServiceA;
    }

    public final synchronized int a() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public final synchronized defn b(ddem ddemVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(ddemVar.toString()));
        }
        if (!this.c.f(ddemVar)) {
            ddek ddekVar = new ddek(this);
            this.c = ddekVar;
            ddekVar.f(ddemVar);
        }
        return ddemVar.b.a;
    }
}
