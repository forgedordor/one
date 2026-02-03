package defpackage;

import android.telephony.SubscriptionManager;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwwi extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ bwwk a;

    public bwwi(bwwk bwwkVar) {
        this.a = bwwkVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        bwwk bwwkVar = this.a;
        eieh eiehVarC = bwwkVar.e.c("DataModelImpl#OnSubscriptionsChangedListener", "com/google/android/apps/messaging/shared/datamodel/impl/DataModelImpl$1", "onSubscriptionsChanged", 270);
        try {
            auvh.h(((auwp) bwwkVar.f.get()).a());
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
