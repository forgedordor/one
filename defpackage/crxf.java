package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crxf extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ crxg c;
    final /* synthetic */ efoi d;
    final /* synthetic */ crwu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxf(crxg crxgVar, efoi efoiVar, crwu crwuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = crxgVar;
        this.d = efoiVar;
        this.e = crwuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        crwi crwiVar;
        crxf crxfVar;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            eiju eijuVarP = ((anty) this.c.c.b()).p(this.d.c);
            this.b = 1;
            obj = fdxs.c(eijuVarP, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            obj2 = this.a;
            fctl.b(obj);
            crxfVar = this;
            ((bycw) crxfVar.c.d.b()).c(barn.b(crxfVar.d.a), (crwi) obj2, true);
            return fctx.a;
        }
        fctl.b(obj);
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
        if (resolvedRecipient == null) {
            ekrw ekrwVarJ = crxg.a.j();
            ekrwVarJ.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/spam/a2p/transport/IncomingChatbotSubscriptionActionHandler$onMessageReceived$1", "invokeSuspend", 38, "IncomingChatbotSubscriptionActionHandler.kt")).q("No sender found in IncomingProtoMessageData");
            return fctx.a;
        }
        efoi efoiVar = this.d;
        String str = efoiVar.a;
        if (str == null || fdgn.H(str)) {
            ekrw ekrwVarJ2 = crxg.a.j();
            ekrwVarJ2.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/util/spam/a2p/transport/IncomingChatbotSubscriptionActionHandler$onMessageReceived$1", "invokeSuspend", 43, "IncomingChatbotSubscriptionActionHandler.kt")).q("No convId found in IncomingProtoMessageData");
            return fctx.a;
        }
        crwu crwuVar = this.e;
        int i2 = (crwuVar.b == 2 ? (crxc) crwuVar.c : crxc.a).b;
        char c = i2 != 0 ? i2 != 1 ? i2 != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        if (c == 0 || c != 3) {
            ekrw ekrwVarJ3 = crxg.a.j();
            ekrwVarJ3.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarJ3.h("com/google/android/apps/messaging/shared/util/spam/a2p/transport/IncomingChatbotSubscriptionActionHandler$onMessageReceived$1", "invokeSuspend", 50, "IncomingChatbotSubscriptionActionHandler.kt")).t("Subscription request was not successful for chatbot: %s", efoiVar.c);
            return fctx.a;
        }
        ekrw ekrwVarH = crxg.a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/a2p/transport/IncomingChatbotSubscriptionActionHandler$onMessageReceived$1", "invokeSuspend", 56, "IncomingChatbotSubscriptionActionHandler.kt");
        crxh crxhVarB = crxh.b((crwuVar.b == 2 ? (crxc) crwuVar.c : crxc.a).c);
        if (crxhVarB == null) {
            crxhVarB = crxh.UNRECOGNIZED;
        }
        ekrdVar.t("Processing incoming ChatbotSubscriptionAction with type: %s", crxhVarB);
        crxh crxhVarB2 = crxh.b((crwuVar.b == 2 ? (crxc) crwuVar.c : crxc.a).c);
        if (crxhVarB2 == null) {
            crxhVarB2 = crxh.UNRECOGNIZED;
        }
        int iOrdinal = crxhVarB2.ordinal();
        if (iOrdinal == 1) {
            crwiVar = crwi.SUBSCRIBE_CONFIRMED;
        } else {
            if (iOrdinal != 2) {
                return fctx.a;
            }
            crwiVar = crwi.UNSUBSCRIBE_CONFIRMED;
        }
        crwi crwiVar2 = crwiVar;
        crwr crwrVar = (crwr) this.c.b.b();
        String str2 = resolvedRecipient.F().a;
        str2.getClass();
        long j = Long.parseLong(str2);
        this.a = crwiVar2;
        this.b = 2;
        crxfVar = this;
        if (crwrVar.c(j, crws.CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED, crwiVar2, crxfVar) != fcylVar) {
            obj2 = crwiVar2;
            ((bycw) crxfVar.c.d.b()).c(barn.b(crxfVar.d.a), (crwi) obj2, true);
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxf(this.c, this.d, this.e, fcxyVar);
    }
}
