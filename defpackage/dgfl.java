package defpackage;

import android.telephony.SubscriptionManager;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgfl extends SubscriptionManager.OnSubscriptionsChangedListener {
    public final SubscriptionManager a;
    public final ExecutorService b;
    private final int c;
    private int d = 1;
    private final dgcq e;

    public dgfl(SubscriptionManager subscriptionManager, int i, dgcq dgcqVar, ExecutorService executorService) {
        ejwl.b(i >= 0, "Invalid SubscriptionId");
        this.c = i;
        this.e = dgcqVar;
        this.a = subscriptionManager;
        this.b = executorService;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        try {
            if (this.a.getActiveSubscriptionInfo(this.c) == null) {
                if (this.d == 2) {
                    dgcq dgcqVar = this.e;
                    dgcs dgcsVar = dgcqVar.b;
                    dhja.d(dgcsVar.a, "SIM(subId=%d) is removed.", Integer.valueOf(dgcqVar.a));
                    dgfg dgfgVar = dgcsVar.c;
                    if (!Objects.isNull(dgfgVar)) {
                        dgfgVar.G(false);
                    }
                }
                this.d = 3;
                return;
            }
            if (this.d == 3) {
                dgcq dgcqVar2 = this.e;
                dgcs dgcsVar2 = dgcqVar2.b;
                dhja.d(dgcsVar2.a, "SIM(subId=%d) is detected.", Integer.valueOf(dgcqVar2.a));
                dgfg dgfgVar2 = dgcsVar2.c;
                if (!Objects.isNull(dgfgVar2)) {
                    dgfgVar2.G(true);
                }
            }
            this.d = 2;
        } catch (SecurityException unused) {
        }
    }
}
