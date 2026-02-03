package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class aypn implements ayms {
    public static final cqce a = cqce.g("Bugle", "NoConfirmationMessageSendAction");

    public abstract Action a();

    public final void b(cldb cldbVar, Intent intent) {
        Action actionA = a();
        if (intent == null) {
            return;
        }
        cqce cqceVar = a;
        cqceVar.q("sendMessageFromNotificationIntent.");
        String action = intent.getAction();
        if (!"android.intent.action.RESPOND_VIA_MESSAGE".equals(action)) {
            cqbd cqbdVarD = cqceVar.d();
            cqbdVarD.I("onHandleIntent wrong action:");
            cqbdVarD.I(action);
            cqbdVarD.r();
            return;
        }
        if (intent.getExtras() == null) {
            cqceVar.q("Called to send SMS but no extras.");
        } else {
            actionA.v.t("notification_intent", intent);
            actionA.q(cldbVar);
        }
    }
}
