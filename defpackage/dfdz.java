package defpackage;

import android.os.IBinder;
import com.google.android.ims.events.EventHubProxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdz implements IBinder.DeathRecipient {
    final /* synthetic */ EventHubProxy a;

    public dfdz(EventHubProxy eventHubProxy) {
        this.a = eventHubProxy;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        EventHubProxy eventHubProxy = this.a;
        dhja.c("Process has died: %s", eventHubProxy.b);
        eventHubProxy.j = null;
        eventHubProxy.c = false;
    }
}
