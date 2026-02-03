package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvs extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConversationDetailsViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvs(ConversationDetailsViewModel conversationDetailsViewModel, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = conversationDetailsViewModel;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvvs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ConversationDetailsViewModel conversationDetailsViewModel = this.b;
            fdpl fdplVarB = fdsc.b(new cvvr(conversationDetailsViewModel.a), 1);
            cvvo cvvoVar = new cvvo(conversationDetailsViewModel);
            this.a = 1;
            if (fdplVarB.a(cvvoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvvs(this.b, fcxyVar);
    }
}
