package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhfc extends BroadcastReceiver {
    private static final dhip c = new dhip("ShutdownReceiver");
    static boolean a = false;
    private static final dhfc d = new dhfc();
    private static dgtw e = null;
    public static final dfny b = dfnv.b("catch_unregistering_shutdown_receiver_error");

    public static synchronized void a(Context context, dgtw dgtwVar) {
        dgtwVar.getClass();
        e = dgtwVar;
        if (a) {
            return;
        }
        context.registerReceiver(d, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        a = true;
    }

    public static synchronized void b(Context context) {
        if (a) {
            if (((Boolean) b.a()).booleanValue()) {
                try {
                    context.unregisterReceiver(d);
                } catch (IllegalArgumentException e2) {
                    dhja.j(e2, c, "ShutdownReceiver unregisterReceiver failed", new Object[0]);
                }
            } else {
                context.unregisterReceiver(d);
            }
            a = false;
            e = null;
        } else {
            e = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((String) Optional.ofNullable(intent.getAction()).orElse("")).equals("android.intent.action.ACTION_SHUTDOWN")) {
            dhja.c("ShutdownReceiver SHUTDOWN received - closing down Jibe service", new Object[0]);
            dgtw dgtwVar = e;
            if (dgtwVar != null) {
                dgtwVar.shutdown();
            }
            b(context);
        }
    }
}
