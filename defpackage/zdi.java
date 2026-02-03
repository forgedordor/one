package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdi extends fcyz implements fdat {
    int a;
    final /* synthetic */ zdm b;
    final /* synthetic */ amvy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdi(zdm zdmVar, amvy amvyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zdmVar;
        this.c = amvyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zdi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zdm zdmVar = this.b;
            ConversationIdType conversationIdType = ((RbmConversationId) zdmVar.e).a;
            amvy amvyVar = this.c;
            agdn agdnVar = new agdn(2, amvyVar.e(), amvyVar.b(), bace.a(zdmVar.c, conversationIdType), 16);
            this.a = 1;
            obj = zdmVar.g.f(agdnVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aggc aggcVar = (aggc) obj;
        ekrw ekrwVarH = zdm.a.h();
        ekrwVarH.X(eksq.a, "BugleRbmRichCard");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter$openImage$1", "invokeSuspend", 386, "RichCardBubbleUiAdapter.kt")).t("Rich Card bubble image MediaViewer result: %s", aggcVar);
        if (aggcVar != null) {
            zdm zdmVar2 = this.b;
            dltb dltbVar = zdm.b;
            doig doigVarA = zdmVar2.i.a() ? dohx.a(aggcVar.a) : null;
            zdmVar2.c(aggcVar, zdmVar2.h.j(dltbVar, doigVarA != null ? doigVarA.b : null));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zdi(this.b, this.c, fcxyVar);
    }
}
