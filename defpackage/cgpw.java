package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgpw {
    public static final eksp a = eksp.c("BugleNotifications");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final aqmq f;
    public final arpr g;
    private final fcsu h;

    public cgpw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, aqmq aqmqVar, arpr arprVar) {
        this.b = fcsuVar;
        this.h = fcsuVar2;
        this.c = fcsuVar3;
        this.e = fcsuVar4;
        this.d = fcsuVar5;
        this.f = aqmqVar;
        this.g = arprVar;
    }

    public final int a(ConversationIdType conversationIdType, long j) {
        if (this.f.a()) {
            bfro bfroVarF = ((baes) this.d.b()).f(conversationIdType, -1);
            String[] strArr = bfrt.a;
            bfrs bfrsVar = new bfrs();
            bfrsVar.ap(new dqty("messages.received_timestamp", 9, Long.valueOf(j)));
            bfroVarF.c(bfrsVar);
            return bfroVarF.b().h();
        }
        bgvg bgvgVarE = ((bael) this.c.b()).e(conversationIdType, -1, 0);
        String[] strArr2 = bgvl.a;
        bgvk bgvkVar = new bgvk();
        bgvkVar.e(j);
        bgvgVarE.e(bgvkVar);
        return bgvgVarE.b().h();
    }

    public final badt b(ConversationIdType conversationIdType) {
        badt badtVar = (badt) this.h.b();
        bbtk bbtkVar = (bbtk) bbth.a(conversationIdType).l();
        if (bbtkVar != null) {
            badtVar.L(bbtkVar);
            return badtVar;
        }
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cqnc.r, conversationIdType.a());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageNotificationQueries", "getConversationSync", 243, "IncomingMessageNotificationQueries.java")).q("Unable to find ConversationListItemData for conversation id");
        return null;
    }
}
