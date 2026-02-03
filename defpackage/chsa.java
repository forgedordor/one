package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chsa implements anke {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/profile/transport/ProfileBugleSendMessageListener");
    private final fcsu b;
    private final fcsu c;
    private final cohg d;

    public chsa(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = new cohf("ProfileBugleSendMessageListener::onMessageSent");
    }

    @Override // defpackage.anke
    public final eieu a() {
        return this.d.a();
    }

    @Override // defpackage.anke
    public final eiju b(amzg amzgVar) {
        amzgVar.getClass();
        final amlm amlmVarD = amzgVar.d();
        if (amlmVarD.g() == null) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/transport/ProfileBugleSendMessageListener", "onMessageSent", 46, "ProfileBugleSendMessageListener.kt")).q("Not sending profile info, self identity null");
            eiju eijuVarE = eijx.e(null);
            eijuVarE.getClass();
            return eijuVarE;
        }
        Object objB = this.c.b();
        objB.getClass();
        chsd chsdVar = (chsd) fdct.b((Optional) objB);
        if (fdbq.f(chsdVar != null ? (ConversationId) chsdVar.b.get() : null, amzgVar.d().f())) {
            Optional optional = (Optional) this.b.b();
            final fdap fdapVar = new fdap() { // from class: chry
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    chrj chrjVar = (chrj) obj;
                    chrjVar.getClass();
                    chrjVar.a(amlmVarD);
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: chrz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eiju eijuVarE2 = eijx.e(null);
            eijuVarE2.getClass();
            return eijuVarE2;
        }
        ekrw ekrwVarH2 = a.h();
        ekrwVarH2.X(eksq.a, "BugleProfiles");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/profile/transport/ProfileBugleSendMessageListener", "onMessageSent", 53, "ProfileBugleSendMessageListener.kt")).q("User didn't interact with conversation, not sharing profile");
        eiju eijuVarE3 = eijx.e(null);
        eijuVarE3.getClass();
        return eijuVarE3;
    }
}
