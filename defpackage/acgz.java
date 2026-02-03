package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgz implements cdbr {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/growthkit/gnp/fcm/GnpFcmHandler");
    private final Context b;
    private final fcsu c;

    public acgz(Context context, fcsu fcsuVar) {
        this.b = context;
        this.c = fcsuVar;
    }

    @Override // defpackage.cdbr
    public final int a(esju esjuVar) {
        return 0;
    }

    @Override // defpackage.cdbr
    public final void b(esju esjuVar) {
        if (((dxjj) this.c.b()).a(this.b, esjuVar)) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "GnpFcmHandler");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/growthkit/gnp/fcm/GnpFcmHandler", "onMessageReceived", 32, "GnpFcmHandler.java")).q("Successful FCM message handled by GnpFirebaseHandler");
        } else {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "GnpFcmHandler");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/growthkit/gnp/fcm/GnpFcmHandler", "onMessageReceived", 34, "GnpFcmHandler.java")).q("GnpFirebaseHandler failed to handle FCM messages");
        }
    }

    @Override // defpackage.cdbr
    public final void c() {
    }
}
