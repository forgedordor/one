package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cgoj {
    public static final /* synthetic */ int a = 0;

    static {
        eksp ekspVar = cgop.a;
    }

    public static eiju a(final Context context, final cldb cldbVar, final Bundle bundle, final Intent intent, final fcsu fcsuVar) {
        return eijx.f(new Runnable() { // from class: cgoi
            @Override // java.lang.Runnable
            public final void run() {
                int i = cgoj.a;
                Intent intent2 = new Intent(context, (Class<?>) NoConfirmationMessageSendAction.class);
                intent2.setAction("android.intent.action.RESPOND_VIA_MESSAGE");
                intent2.putExtras(bundle);
                intent2.setClipData(intent.getClipData());
                ((aypn) fcsuVar.b()).b(cldbVar, intent2);
            }
        }, eoqg.a);
    }

    public static void b(cgkj cgkjVar, cgkd cgkdVar) {
        cggs cggsVar = (cggs) cgkdVar;
        Optional optional = cggsVar.b;
        if (optional.isEmpty()) {
            ((eksl) ((eksl) cgop.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule", "cancelNotification", 178, "IncomingMessageCallbacksModule.java")).q("Missing tag on notification action callback, which should not happen");
        } else {
            cgkjVar.b(cggsVar.a, (String) optional.get());
        }
    }
}
