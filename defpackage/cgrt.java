package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgrt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgrw b;
    final /* synthetic */ cgrq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgrt(cgrw cgrwVar, cgrq cgrqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgrwVar;
        this.c = cgrqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgrt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgrw cgrwVar = this.b;
            ConversationId conversationIdC = cgrwVar.b.c(this.c.c.I());
            if (!(conversationIdC instanceof BugleConversationId)) {
                ekrw ekrwVarG = cgrw.a.g();
                ekrwVarG.X(eksq.a, "Bugle");
                ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/notification2o/unapprovedincomingmessage/UnapprovedIncomingMessageNotificationBlueprint$createNotificationCreationPackage$1", "invokeSuspend", 78, "UnapprovedIncomingMessageNotificationBlueprint.kt")).q("Cannot create unapproved incoming message notification. ConversationId is not an instance of BugleConversationId.");
                return null;
            }
            this.a = 1;
            obj = cgrwVar.h((BugleConversationId) conversationIdC, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new cggr(ekgb.r(obj), Optional.empty());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgrt(this.b, this.c, fcxyVar);
    }
}
