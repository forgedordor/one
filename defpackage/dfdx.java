package defpackage;

import com.google.android.ims.events.EventHubProxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdx implements Runnable {
    final /* synthetic */ EventHubProxy a;

    public dfdx(EventHubProxy eventHubProxy) {
        this.a = eventHubProxy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            while (true) {
                long jLongValue = dhkl.a().longValue();
                EventHubProxy eventHubProxy = this.a;
                if (jLongValue < eventHubProxy.e) {
                    try {
                        wait(eventHubProxy.e - dhkl.a().longValue());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        dhja.i(e, "timer interrupted", new Object[0]);
                    }
                } else {
                    this.a.e = Long.MAX_VALUE;
                }
            }
        }
        this.a.postQueuedEvents();
    }
}
