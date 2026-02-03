package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayou {
    private static final cqce a = cqce.g("BugleDataModel", "DeleteMessageUtil");
    private final fcsu b;
    private final cmqj c;

    public ayou(fcsu fcsuVar, cmqj cmqjVar) {
        this.b = fcsuVar;
        this.c = cmqjVar;
    }

    public final void a(MessageCoreData messageCoreData) {
        if (messageCoreData == null) {
            return;
        }
        fcsu fcsuVar = this.b;
        MessageIdType messageIdTypeC = messageCoreData.C();
        if (((cdww) fcsuVar.b()).a(messageIdTypeC) > 0) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Deleted local message.");
            cqbdVarC.d(messageIdTypeC);
            cqbdVarC.r();
        } else {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Could not delete local message.");
            cqbdVarE.d(messageIdTypeC);
            cqbdVarE.r();
        }
        Uri uriU = messageCoreData.u();
        if (uriU == null) {
            cqbd cqbdVarC2 = a.c();
            cqbdVarC2.I("Local message has no telephony uri.");
            cqbdVarC2.d(messageIdTypeC);
            cqbdVarC2.r();
            return;
        }
        if (this.c.a(uriU, "Bugle.Telephony.Delete.MmsWap.Latency") > 0) {
            cqbd cqbdVarC3 = a.c();
            cqbdVarC3.I("Deleted message. uri:");
            cqbdVarC3.I(uriU);
            cqbdVarC3.r();
            return;
        }
        cqbd cqbdVarE2 = a.e();
        cqbdVarE2.I("Could not delete message from telephony.");
        cqbdVarE2.d(messageIdTypeC);
        cqbdVarE2.A("messageUri", uriU);
        cqbdVarE2.r();
    }
}
