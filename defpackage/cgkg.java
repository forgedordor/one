package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgkg implements cgiq {
    final /* synthetic */ cglv a;

    public cgkg(cglv cglvVar) {
        this.a = cglvVar;
    }

    @Override // defpackage.cgiq
    public final eiju a(cldb cldbVar, Intent intent, Bundle bundle, cgkd cgkdVar) {
        cgit cgitVarB = cgit.b(intent.getIntExtra("extra_notification_action_type", cgit.NAT_UNKNOWN.p));
        cgitVarB.getClass();
        eksl ekslVar = (eksl) cgki.a.h();
        cggs cggsVar = (cggs) cgkdVar;
        ekslVar.X(cgey.n, cggsVar.a);
        ekslVar.X(cgey.d, (String) cggsVar.b.orElse(null));
        ekslVar.X(cgey.p, cgitVarB);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$1", "onActionCalled", 55, "NotificationDirectorCallbacksModule.java")).q("Notification action clicked");
        ((ains) this.a.a.b()).e("Bugle.Notifications2o.ActionClicked.Count", cgitVarB.p);
        return eijx.e(null);
    }
}
