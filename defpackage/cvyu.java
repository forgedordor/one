package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyu extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvyx b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvyu(cvyx cvyxVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvyxVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvyu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objA = obj;
        } else {
            cvyx cvyxVar = this.b;
            this.a = 1;
            objA = fdtc.a(cvyxVar.c, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        ConversationId conversationIdD = ((ajlk) objA).d();
        conversationIdD.getClass();
        final cvyx cvyxVar2 = this.b;
        final ResolvedRecipient resolvedRecipient = this.c;
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationIdD;
        Object[] objArr = {cvyx.c(resolvedRecipient)};
        Context context = cvyxVar2.a;
        String string = context.getString(R.string.remove_user_dialog_message, objArr);
        string.getClass();
        String string2 = context.getString(android.R.string.ok);
        string2.getClass();
        dktq dktqVar = new dktq(string2, new fdae() { // from class: cvyn
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                cvyx cvyxVar3 = cvyxVar2;
                eigp eigpVar = cvyxVar3.i;
                BugleConversationId bugleConversationId2 = bugleConversationId;
                ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                eieh eiehVarA = eigpVar.a("GroupMembersUiAdapterImpl: Remove user from group");
                try {
                    ((uta) cvyxVar3.g.b()).a();
                    ((utj) cvyxVar3.j.b()).a(bugleConversationId2.a, resolvedRecipient2.F());
                    fczl.a(eiehVarA, null);
                    return fctx.a;
                } finally {
                }
            }
        });
        String string3 = context.getString(android.R.string.cancel);
        string3.getClass();
        cvyxVar2.h.c(new djmj(string, null, null, null, false, false, dktqVar, new dktq(string3, new fdae() { // from class: cvyo
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), null, 318), false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvyu(this.b, this.c, fcxyVar);
    }
}
