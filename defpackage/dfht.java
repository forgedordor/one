package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfht {
    public dfhs a;
    private final BroadcastReceiver b = new dfhr(this);
    private final Context c;
    private final AlarmManager d;
    private final String e;
    private long f;

    protected dfht(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.e = str;
        this.d = (AlarmManager) applicationContext.getSystemService("alarm");
    }

    public static dfht a(Context context, String str) {
        return new dfht(context, str.replaceAll("[(): ]", ""));
    }

    public final synchronized void b() {
        dfhs dfhsVar = this.a;
        if (dfhsVar != null) {
            dhja.c("Cancelling task %s", dfhsVar.a.getName());
            c();
        }
    }

    public final void c() {
        dfhs dfhsVar = this.a;
        if (dfhsVar != null) {
            this.d.cancel(dfhsVar.c);
            this.a = null;
            try {
                this.c.unregisterReceiver(this.b);
            } catch (Exception e) {
                dhja.i(e, "Error unregistering broadcast receiver", new Object[0]);
            }
        }
    }

    public final synchronized void d(Thread thread, long j) {
        if (thread == null) {
            throw new IllegalArgumentException("Task cannot be null!");
        }
        b();
        String str = this.e;
        dhja.c("%s: Scheduling task \"%s\" for execution in %ds", str, thread.getName(), Long.valueOf(j));
        dfhs dfhsVar = new dfhs();
        dfhsVar.a = thread;
        dfhsVar.b = str + "." + thread.getName().replace(' ', '.');
        Intent intent = new Intent(dfhsVar.b);
        Context context = this.c;
        dfhsVar.c = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        this.a = dfhsVar;
        kxj.g(context, this.b, new IntentFilter(dfhsVar.b));
        dfhs dfhsVar2 = this.a;
        if (dfhsVar2 != null && dfhsVar2.c != null) {
            this.f = dhkl.a().longValue() + TimeUnit.SECONDS.toMillis(j);
            dhja.c("Setting alarm for post-M devices", new Object[0]);
            dfhs dfhsVar3 = this.a;
            if (dfhsVar3 != null) {
                this.d.setExactAndAllowWhileIdle(0, this.f, dfhsVar3.c);
                return;
            }
            return;
        }
        dhja.g("PendingIntent for task %s is null, alarm won't be set", dfhsVar2.a);
    }

    public final synchronized boolean e() {
        return this.a != null;
    }
}
