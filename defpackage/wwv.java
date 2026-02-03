package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wwv implements fdap {
    final /* synthetic */ fdce a;
    final /* synthetic */ www b;
    final /* synthetic */ MessageId c;

    public wwv(fdce fdceVar, www wwwVar, MessageId messageId) {
        this.a = fdceVar;
        this.b = wwwVar;
        this.c = messageId;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        vvw vvwVar = (vvw) obj;
        vvwVar.getClass();
        if (vvwVar.g == null) {
            return (!((Boolean) this.b.h.b()).booleanValue() || vvwVar.f == null) ? vvw.c(vvwVar, null, null, null, false, this.c, null, false, 0, null, 2031) : vvw.c(vvwVar, null, null, null, false, this.c, null, false, 0, null, 1998);
        }
        ekrw ekrwVarE = www.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl$setReplyTo$2$oldDraftData$1", "invoke", 103, "DraftReplyUiAdapterImpl.kt")).q("Don't allow to schedule a reply message.");
        this.a.a = true;
        return vvwVar;
    }
}
