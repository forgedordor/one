package com.google.android.apps.messaging.rcsprovisioning.singleregistration;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.ahff;
import defpackage.ahfh;
import defpackage.ahfi;
import defpackage.ahfn;
import defpackage.ahfr;
import defpackage.cqca;
import defpackage.dhiz;
import defpackage.dhja;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekrd;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SingleRegistrationProvisioningEventReceiver extends ahfh {
    public fcsu a;
    public fcsu b;

    @Override // defpackage.cldb
    protected final int a() {
        return 14;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("SingleRegistrationProvisioningEventReceiver Receive broadcast", "com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationProvisioningEventReceiver", "beginRootTrace", 43);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SingleRegistrationProvisioningEventReceiver.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return null;
    }

    @Override // defpackage.clca
    protected final eiju j(Context context, Intent intent) {
        if (dhja.c <= 3) {
            dhja.c("[SR]: SingleRegistrationProvisioningInfoEvent intent details:\n%s", dhiz.GENERIC.c("SingleRegistration provisioning intent details:" + String.format("\ntype: %s", intent.getType()) + String.format("\nextras: %s", cqca.a(intent))));
        }
        try {
            ahfi.a(intent, RcsIntents.ACTION_RCS_SINGLE_REGISTRATION_PROVISIONING_EVENT);
            ahfi.b(intent, RcsIntents.EXTRA_SIM_ID);
            String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_SIM_ID);
            stringExtra.getClass();
            ahfi.b(intent, RcsIntents.EXTRA_SUB_ID);
            int intExtra = intent.getIntExtra(RcsIntents.EXTRA_SUB_ID, -1);
            boolean booleanExtra = intent.getBooleanExtra(RcsIntents.EXTRA_SETUP_VENDOR_IMS, false);
            ekrw ekrwVarE = ahfr.d.e();
            ekrwVarE.X(eksq.a, "BugleRcsEngine");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationProvisioningEventInfo", "fromIntent", 57, "SingleRegistrationProvisioningEventInfo.java")).I("[SR]: Received SingleRegistrationProvisioningEvent intent with simId: %s, subId: %d, shouldSetupVendorIms: %b", dhiz.SIM_ID.c(stringExtra), Integer.valueOf(intExtra), Boolean.valueOf(booleanExtra));
            return ((ahfn) this.b.b()).a(new ahff(stringExtra, intExtra, booleanExtra));
        } catch (ahfi e) {
            dhja.i(e, "[SR]: Failed to parse an incoming intent.", new Object[0]);
            return eijx.e(null);
        }
    }
}
