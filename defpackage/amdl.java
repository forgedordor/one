package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amdl implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ BugleConversationId b;
    final /* synthetic */ String c;

    public amdl(String str, BugleConversationId bugleConversationId, String str2) {
        this.a = str;
        this.b = bugleConversationId;
        this.c = str2;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        ekrw ekrwVarH = amdx.a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.t, this.b);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$1", "onSuccess", 2188, "CoreBugleMessageRepository.java")).q(this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ekrw ekrwVarJ = amdx.a.j();
        ekrwVarJ.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.t, this.b);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$1", "onFailure", 2196, "CoreBugleMessageRepository.java")).q(this.c);
    }
}
