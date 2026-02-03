package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgom implements cgiq {
    final /* synthetic */ cgkj a;

    public cgom(cgkj cgkjVar) {
        this.a = cgkjVar;
    }

    @Override // defpackage.cgiq
    public final eiju a(cldb cldbVar, Intent intent, Bundle bundle, cgkd cgkdVar) {
        eksl ekslVar = (eksl) cgop.a.h();
        cggs cggsVar = (cggs) cgkdVar;
        ekslVar.X(cgey.n, cggsVar.a);
        ekslVar.X(cgey.d, (String) cggsVar.b.orElse(null));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$3", "onActionCalled", 144, "IncomingMessageCallbacksModule.java")).q("Cancel IM notification from mark as read callback");
        cgoj.b(this.a, cgkdVar);
        return eijx.e(null);
    }
}
