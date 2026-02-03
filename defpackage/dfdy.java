package defpackage;

import com.google.android.ims.events.EventHubProxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfdy implements eora {
    final /* synthetic */ EventHubProxy a;

    public dfdy(EventHubProxy eventHubProxy) {
        this.a = eventHubProxy;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dhja.i(th, "Failed to send events from proxy %s", this.a.b);
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
