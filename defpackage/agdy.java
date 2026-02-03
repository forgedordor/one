package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agdy extends fcyz implements fdat {
    int a;
    final /* synthetic */ agdz b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ ConversationIdType e;
    final /* synthetic */ ConversationId f;
    final /* synthetic */ Recipient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdy(agdz agdzVar, String str, String str2, ConversationIdType conversationIdType, ConversationId conversationId, Recipient recipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agdzVar;
        this.c = str;
        this.d = str2;
        this.e = conversationIdType;
        this.f = conversationId;
        this.g = recipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agdy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agdz agdzVar = this.b;
            ConversationId conversationId = this.f;
            String str = this.d;
            Recipient recipient = this.g;
            String str2 = this.c;
            fcyh fcyhVarA = eicg.a(agdzVar.b);
            agdx agdxVar = new agdx(null, agdzVar, conversationId, str, recipient, str2);
            this.a = 1;
            obj = fdin.a(fcyhVarA, agdxVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ekrw ekrwVarJ = agdz.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cgey.t, this.c);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler$handleNotificationNavigation$1", "invokeSuspend", 116, "NotificationSettings.kt")).q("Error creating shortcut, can't open notification settings");
            return fctx.a;
        }
        ekrw ekrwVarH = agdz.a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ekrd ekrdVar2 = (ekrd) ekrwVarH;
        String str3 = this.c;
        ekrdVar2.X(cgey.t, str3);
        agdz agdzVar2 = this.b;
        ekrdVar2.X(cgey.v, Boolean.valueOf(((cqdn) agdzVar2.c.b()).i(str3)));
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler$handleNotificationNavigation$1", "invokeSuspend", 127, "NotificationSettings.kt")).q("Shortcut was created. Will launch notification settings now.");
        agdzVar2.b(this.d, this.e, str3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agdy(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
