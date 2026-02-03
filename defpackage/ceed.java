package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceed implements ServiceConnection {
    private final ceee a;

    public ceed(ceee ceeeVar) {
        this.a = ceeeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.c = (ceea) iBinder;
        ceee.a.m("DittoForegroundService is connected");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.c = null;
        ceee.a.m("DittoForegroundService is disconnected");
    }
}
