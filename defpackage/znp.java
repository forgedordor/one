package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znp implements zmv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl");
    public final fdjx b;
    public final ajmh c;
    public final AtomicBoolean d;
    public zmp e;
    public final fdpl f;
    public final fdpl g;
    public final znw h;
    public final anej i;
    private final fcsu j;
    private final MessageId k;

    public znp(fdjx fdjxVar, znw znwVar, anej anejVar, ajmh ajmhVar, fcsu fcsuVar, OpenConversation2Arguments openConversation2Arguments, apqp apqpVar, fcsu fcsuVar2) {
        fdpl fdpuVar;
        fdpl fdpuVar2;
        fdjxVar.getClass();
        anejVar.getClass();
        ajmhVar.getClass();
        fcsuVar.getClass();
        openConversation2Arguments.getClass();
        fcsuVar2.getClass();
        this.b = fdjxVar;
        this.h = znwVar;
        this.i = anejVar;
        this.c = ajmhVar;
        this.j = fcsuVar;
        this.d = new AtomicBoolean(false);
        if (((eoth) ((aove) apqpVar).a.b()).a("bugle.use_last_read_marker")) {
            fdpl fdplVarG = auvw.g(new fdae() { // from class: zmw
                @Override // defpackage.fdae
                public final Object invoke() {
                    eiju eijuVarX = this.a.c.x();
                    eijuVarX.getClass();
                    return eijuVarX;
                }
            });
            long j = fdhi.a;
            Object objB = fcsuVar.b();
            objB.getClass();
            fdpuVar = avan.b(fdplVarG, fdhk.g(((Number) objB).longValue(), fdhl.c), new znf(null));
        } else {
            fdpuVar = new fdpu(null);
        }
        this.f = fdpuVar;
        if (((aprc) fcsuVar2.b()).a()) {
            fdpl fdplVarG2 = auvw.g(new fdae() { // from class: zmx
                @Override // defpackage.fdae
                public final Object invoke() {
                    return this.a.c.u();
                }
            });
            long j2 = fdhi.a;
            Object objB2 = fcsuVar.b();
            objB2.getClass();
            fdpuVar2 = avan.b(fdplVarG2, fdhk.g(((Number) objB2).longValue(), fdhl.c), new zne(null));
        } else {
            fdpuVar2 = new fdpu(null);
        }
        this.g = fdpuVar2;
        this.k = openConversation2Arguments.b;
    }

    @Override // defpackage.zmv
    public final fdpl a() {
        ekrd ekrdVar = (ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl", "getInitialMessageId", 145, "MessageListPagingDataProviderImpl.kt");
        MessageId messageId = this.k;
        ekrdVar.t("getInitialMessageId - searchedMessagedId: %s", messageId);
        return messageId != null ? new fdpu(new zms(messageId)) : new zna(this.f);
    }
}
