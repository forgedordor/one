package defpackage;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhew extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ dhey a;

    public dhew(dhey dheyVar) {
        this.a = dheyVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        boolean z;
        dhja.d(dhey.a, "Received onSubscriptionsChanged event", new Object[0]);
        boolean zBooleanValue = ((Boolean) dfpm.a().a.e.a()).booleanValue();
        dhey dheyVar = this.a;
        if (zBooleanValue) {
            try {
                Context context = dheyVar.h;
                List<SubscriptionInfo> listD = dhks.b(context).d();
                ewkm ewkmVar = (ewkm) ewkp.a.createBuilder();
                if (listD == null || listD.isEmpty()) {
                    z = false;
                } else {
                    z = false;
                    for (SubscriptionInfo subscriptionInfo : listD) {
                        int mcc = subscriptionInfo.getMcc();
                        int mnc = subscriptionInfo.getMnc();
                        if (mcc > 0 && mnc > 0) {
                            ewkn ewknVar = (ewkn) ewko.a.createBuilder();
                            ewknVar.copyOnWrite();
                            ewko ewkoVar = (ewko) ewknVar.instance;
                            ewkoVar.b |= 1;
                            ewkoVar.c = mcc;
                            ewknVar.copyOnWrite();
                            ewko ewkoVar2 = (ewko) ewknVar.instance;
                            ewkoVar2.b |= 2;
                            ewkoVar2.d = mnc;
                            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
                            ewknVar.copyOnWrite();
                            ewko ewkoVar3 = (ewko) ewknVar.instance;
                            ewkoVar3.b |= 4;
                            ewkoVar3.e = simSlotIndex;
                            int subscriptionId = subscriptionInfo.getSubscriptionId();
                            ewknVar.copyOnWrite();
                            ewko ewkoVar4 = (ewko) ewknVar.instance;
                            ewkoVar4.b |= 8;
                            ewkoVar4.f = subscriptionId;
                            ewko ewkoVar5 = (ewko) ewknVar.build();
                            ewkmVar.copyOnWrite();
                            ewkp ewkpVar = (ewkp) ewkmVar.instance;
                            ewkoVar5.getClass();
                            evtg evtgVar = ewkpVar.e;
                            if (!evtgVar.c()) {
                                ewkpVar.e = evsn.mutableCopy(evtgVar);
                            }
                            ewkpVar.e.add(ewkoVar5);
                            z = true;
                        }
                    }
                }
                ewkmVar.copyOnWrite();
                ewkp ewkpVar2 = (ewkp) ewkmVar.instance;
                ewkpVar2.b |= 2;
                ewkpVar2.d = z;
                int iB = dheyVar.b(context);
                ewkmVar.copyOnWrite();
                ewkp ewkpVar3 = (ewkp) ewkmVar.instance;
                ewkpVar3.b = 1 | ewkpVar3.b;
                ewkpVar3.c = iB;
                dheyVar.f.c((ewkp) ewkmVar.build());
            } catch (dhkf unused) {
                dhja.h(dhey.a, "Permission is required for SubscriptionManager", new Object[0]);
            }
        }
        dhey dheyVar2 = this.a;
        dhep dhepVar = dheyVar2.g;
        if (dhepVar == null || !dhepVar.c(dhey.B(dheyVar2.h))) {
            dheyVar2.l(-1);
        } else {
            dhja.d(dhey.a, "delay onSubscriptionsChanged", new Object[0]);
        }
    }
}
