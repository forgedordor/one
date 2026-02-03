package defpackage;

import android.telephony.SubscriptionManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmke extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ cmkg a;

    public cmke(cmkg cmkgVar) {
        this.a = cmkgVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() throws IOException {
        cmkg cmkgVar = this.a;
        eieh eiehVarA = ((eigp) cmkgVar.e.b()).a("SimStateMonitor#onSubscriptionsChanged");
        try {
            auvw.k(cmkgVar.d, null, null, new cmkd(cmkgVar, null), 3);
            fczl.a(eiehVarA, null);
        } finally {
        }
    }
}
