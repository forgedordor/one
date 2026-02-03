package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqx implements cgqw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/QueueStrategyDefault");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final asjn e;
    private final asjm f;
    private final asjp g;

    public cgqx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, asjn asjnVar, asjm asjmVar, asjp asjpVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        asjnVar.getClass();
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = asjnVar;
        this.f = asjmVar;
        this.g = asjpVar;
    }

    @Override // defpackage.cgqw
    public final Object a(ConversationIdType conversationIdType, Duration duration, boolean z, cgrc cgrcVar, akbr akbrVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleNotifications");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar2 = cqnc.S;
        ekrdVar.X(ekrzVar2, "QueueStrategyDefault");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/QueueStrategyDefault", "queueNotification", 49, "QueueStrategyDefault.kt")).I("queueDefaultNotification for conversationId=%s, isSilent=%s, shouldPostNotificationBasedOnParentalApproval=%s", conversationIdType.a(), Boolean.valueOf(z), akbrVar);
        int iOrdinal = akbrVar.ordinal();
        if (iOrdinal == 1) {
            cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
            String string = conversationIdType.toString();
            cgos cgosVar = (cgos) cgov.a.createBuilder();
            long millis = duration.toMillis();
            cgosVar.copyOnWrite();
            cgov cgovVar = (cgov) cgosVar.instance;
            cgovVar.b |= 1;
            cgovVar.c = millis;
            cgosVar.copyOnWrite();
            cgov cgovVar2 = (cgov) cgosVar.instance;
            cgovVar2.d = 1;
            cgovVar2.b |= 2;
            cgpbVar.a(string, (cgov) cgosVar.build());
            cgpbVar.copyOnWrite();
            cgpd cgpdVar = (cgpd) cgpbVar.instance;
            cgpdVar.b |= 2;
            cgpdVar.e = false;
            cgpbVar.copyOnWrite();
            cgpd cgpdVar2 = (cgpd) cgpbVar.instance;
            cgpdVar2.b |= 1;
            cgpdVar2.d = false;
            evsn evsnVarBuild = cgpbVar.build();
            evsnVarBuild.getClass();
            ((cgkj) this.b.b()).d((cgiw) this.d.b(), (cgpd) evsnVarBuild, z);
        } else if (iOrdinal == 2) {
            ((cgrx) this.c.b()).a(new BugleConversationId(conversationIdType));
        } else {
            if (iOrdinal != 3) {
                Objects.toString(akbrVar);
                throw new IllegalArgumentException("Unknown ConversationTrustedContactsNotificationState: ".concat(String.valueOf(akbrVar)));
            }
            if (!this.e.a() && !this.f.a() && !this.g.a()) {
                throw new IllegalArgumentException("Unknown ConversationTrustedContactsNotificationState: ".concat(String.valueOf(akbrVar.name())));
            }
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleNotifications");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(ekrzVar2, "QueueStrategyDefault");
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/QueueStrategyDefault", "queueNotification", 70, "QueueStrategyDefault.kt")).t("Skipping notification enqueue for conversationId=%s", conversationIdType.a());
        }
        return fctx.a;
    }
}
