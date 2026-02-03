package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqb extends fcyz implements fdat {
    int a;
    final /* synthetic */ xqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqb(xqi xqiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xqiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xqb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xqi xqiVar = this.b;
            afkc afkcVar = (afkc) xqiVar.e.b();
            ConversationIdType conversationIdType = ((BugleConversationId) xqiVar.c).a;
            this.a = 1;
            obj = afkcVar.c(conversationIdType, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ekrw ekrwVarJ = xqi.a.j();
            ekrwVarJ.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/stickytoolstone/scam/PenpalScamAlertCardUiAdapterImpl$dismissAlertCard$1", "invokeSuspend", 291, "PenpalScamAlertCardUiAdapterImpl.kt")).q("Penpal alert card failed to dismiss scam classification.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xqb(this.b, fcxyVar);
    }
}
