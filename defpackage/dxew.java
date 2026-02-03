package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxew extends BroadcastReceiver {
    final /* synthetic */ dxfd a;

    public dxew(dxfd dxfdVar) {
        this.a = dxfdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.a.g();
        }
    }
}
