package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckje {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho");

    public static void a(Context context, int i, int i2) {
        if (craf.h) {
            Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_STATUS");
            c(intent, i, i2);
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTycho", 58, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Status");
            if (cqbe.h()) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }
    }

    public static void b(Context context, int i, int i2) {
        if (craf.h) {
            Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_SCHEDULED_STATUS");
            intent.putExtra("provisioning_scheduled_status", i - 1);
            intent.putExtra("sub_id", i2);
            intent.setPackage("com.google.android.apps.tycho");
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTychoAboutProvisioningScheduled", 83, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Scheduled Status");
            if (cqbe.h()) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }
    }

    public static void c(Intent intent, int i, int i2) {
        intent.putExtra("provisioning_status", i - 1);
        intent.putExtra("sub_id", i2);
        intent.setPackage("com.google.android.apps.tycho");
    }
}
