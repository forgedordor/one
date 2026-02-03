package com.google.android.apps.messaging.rcsprovisioning.singleregistration;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ahfe;
import defpackage.ahfg;
import defpackage.ahfi;
import defpackage.ahfj;
import defpackage.ahgh;
import defpackage.arhf;
import defpackage.auvh;
import defpackage.ccyw;
import defpackage.chyx;
import defpackage.chza;
import defpackage.ckhg;
import defpackage.cqbm;
import defpackage.crsd;
import defpackage.dfog;
import defpackage.dgga;
import defpackage.dheq;
import defpackage.dhja;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekrd;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.enxe;
import defpackage.eooz;
import defpackage.ewjm;
import defpackage.fcsu;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class SingleRegistrationCapabilityReceiver extends ahfg {
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public fcsu j;

    @Override // defpackage.cldb
    protected final int a() {
        return 13;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("SingleRegistrationCapabilityReceiver Receive broadcast", "com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationCapabilityReceiver", "beginRootTrace", 78);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        if (((arhf) this.j.b()).a()) {
            dhja.q("[SR]: Single Registration Capability Intent received, but VendorImsService is deprecated.", new Object[0]);
        } else {
            dhja.k("[SR]: Single Registration Capability Intent received!", new Object[0]);
            try {
                ahfi.a(intent, "android.telephony.ims.action.RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE");
                ahfi.b(intent, "android.telephony.ims.extra.STATUS");
                ahfi.b(intent, "android.telephony.ims.extra.SUBSCRIPTION_ID");
                int intExtra = intent.getIntExtra("android.telephony.ims.extra.SUBSCRIPTION_ID", 0);
                int intExtra2 = intent.getIntExtra("android.telephony.ims.extra.STATUS", 1);
                int i = intExtra2 != 0 ? intExtra2 != 1 ? intExtra2 != 2 ? 1 : 4 : 3 : 2;
                ekrw ekrwVarE = ahfj.d.e();
                ekrwVarE.X(eksq.a, "BugleRcsEngine");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationCapabilityInfo", "fromIntent", 53, "SingleRegistrationCapabilityInfo.java")).w("[SR]: Received intent with subId: %d and status: %s", intExtra, i != 1 ? i != 2 ? i != 3 ? "STATUS_CARRIER_NOT_CAPABLE" : "STATUS_DEVICE_NOT_CAPABLE" : "STATUS_CAPABLE" : "STATUS_UNKNOWN");
                ahfe ahfeVar = new ahfe(intExtra, i, i == 2);
                int iA = ((dheq) this.d.b()).a(context);
                final int i2 = ahfeVar.a;
                boolean z = iA == i2;
                ((dgga) this.f.b()).b(ahfeVar.c, z, !dfog.G());
                if (z) {
                    ((ccyw) this.h.b()).b(context, crsd.PHENOTYPE_REGISTRATION_TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE);
                    ((chza) ((cqbm) this.c.b()).a()).o(chyx.SINGLE_REGISTRATION_CAPABILITY_UPDATE);
                    if (ahfeVar.b) {
                        auvh.h(((ckhg) this.g.b()).a(enxe.SINGLE_REGISTRATION_CAPABILITY_UPDATE).i(new eooz() { // from class: ahfl
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                return ((ahgh) this.a.e.b()).a(i2, ewjm.TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT);
                            }
                        }, (Executor) this.b.b()));
                    } else {
                        final ahgh ahghVar = (ahgh) this.e.b();
                        final ewjm ewjmVar = ewjm.TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT;
                        dhja.d(ahgh.a, "[SR]: Enabled to run VendorImsCallQueue:cancelAllPending asynchronously", new Object[0]);
                        Runnable runnable = new Runnable() { // from class: ahge
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahgh ahghVar2 = ahghVar;
                                ahghVar2.c.a();
                                ((ahfv) ahghVar2.b.b()).a();
                            }
                        };
                        fcsu fcsuVar = ahghVar.d;
                        auvh.h(eijx.f(runnable, (Executor) fcsuVar.b()).i(new eooz() { // from class: ahgf
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                return ahghVar.b(i2, ewjo.OPERATION_TYPE_TERMINATE_VENDOR_IMS, ewjmVar);
                            }
                        }, (Executor) fcsuVar.b()).i(new eooz() { // from class: ahfk
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                ((ckhg) this.a.g.b()).j(enxe.SINGLE_REGISTRATION_CAPABILITY_UPDATE);
                                return eijx.e(Optional.empty());
                            }
                        }, (Executor) this.b.b()));
                    }
                } else {
                    dhja.q("[SR]: The subscriptionId in the received ACTION_RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE intent: %d is different than the Call SIM's subscriptionId: %d. The provisioning process will not be started.", Integer.valueOf(i2), Integer.valueOf(iA));
                }
            } catch (ahfi e) {
                dhja.i(e, "[SR]: Failed to parse an incoming intent to SingleRegistrationCapabilityInfo.", new Object[0]);
                ((dgga) this.f.b()).a();
            }
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SingleRegistrationCapabilityReceiver.Latency";
    }
}
