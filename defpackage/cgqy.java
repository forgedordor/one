package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqy implements cgqw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/QueueStrategyMute");
    private final fcsu b;
    private final asjn c;
    private final asjm d;
    private final asjp e;

    public cgqy(fcsu fcsuVar, fcsu fcsuVar2, asjn asjnVar, asjm asjmVar, asjp asjpVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        asjnVar.getClass();
        this.b = fcsuVar;
        this.c = asjnVar;
        this.d = asjmVar;
        this.e = asjpVar;
    }

    @Override // defpackage.cgqw
    public final Object a(ConversationIdType conversationIdType, Duration duration, boolean z, cgrc cgrcVar, akbr akbrVar) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleNotifications");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar2 = cqnc.S;
        ekrdVar.X(ekrzVar2, "QueueStrategyMute");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/QueueStrategyMute", "queueNotification", 39, "QueueStrategyMute.kt")).I("queueMuteExceptionNotification for conversationId=%s, isSilent=%s, shouldPostNotificationBasedOnParentalApproval=%s", conversationIdType.a(), Boolean.valueOf(z), akbrVar);
        int iOrdinal = akbrVar.ordinal();
        if (iOrdinal == 1) {
            cgqz cgqzVar = (cgqz) this.b.b();
            cgrcVar.getClass();
            cgqzVar.a(conversationIdType, duration, z, cgrcVar);
        } else if (iOrdinal == 2) {
            ((cgqz) this.b.b()).a(conversationIdType, duration, z, cgrc.e);
        } else {
            if (iOrdinal != 3) {
                Objects.toString(akbrVar);
                throw new IllegalArgumentException("Unknown ConversationTrustedContactsNotificationState: ".concat(String.valueOf(akbrVar)));
            }
            if (!this.c.a() && !this.d.a() && !this.e.a()) {
                throw new IllegalArgumentException("Unknown ConversationTrustedContactsNotificationState: ".concat(String.valueOf(akbrVar.name())));
            }
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleNotifications");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(ekrzVar2, "QueueStrategyMute");
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/pwq/QueueStrategyMute", "queueNotification", 74, "QueueStrategyMute.kt")).t("Skipping notification enqueue for conversationId=%s", conversationIdType.a());
        }
        return fctx.a;
    }
}
