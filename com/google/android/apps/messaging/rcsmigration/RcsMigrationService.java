package com.google.android.apps.messaging.rcsmigration;

import android.content.Intent;
import android.os.IBinder;
import defpackage.ahez;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.fcsu;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class RcsMigrationService extends ahez {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/rcsmigration/RcsMigrationService");
    public fcsu a;
    public fcsu b;
    public fcsu c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        eieh eiehVarC = ((eigp) this.b.b()).c("RcsMigrationService::onBind", "com/google/android/apps/messaging/rcsmigration/RcsMigrationService", "onBind", 48);
        try {
            int intExtra = intent.getIntExtra("expected_version", -1);
            if (intExtra == 1) {
                ekrw ekrwVarH = d.h();
                ekrwVarH.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/rcsmigration/RcsMigrationService", "runOnBind", 68, "RcsMigrationService.java")).q("RcsMigrationService: Returning RCS state provider.");
                iBinder = (IBinder) this.a.b();
            } else {
                ekrw ekrwVarJ = d.j();
                ekrwVarJ.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/rcsmigration/RcsMigrationService", "runOnBind", 71, "RcsMigrationService.java")).u("RcsMigrationService: Version not supported returning null. Current Version:%d Expected Version:%d", 1, intExtra);
                iBinder = null;
            }
            eiehVarC.close();
            return iBinder;
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
