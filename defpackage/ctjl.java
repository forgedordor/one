package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctjl extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctjm b;
    final /* synthetic */ ctrq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjl(ctjm ctjmVar, ctrq ctrqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctjmVar;
        this.c = ctrqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ctjm ctjmVar = this.b;
            final ctrq ctrqVar = this.c;
            fdae fdaeVar = new fdae() { // from class: ctjk
                @Override // defpackage.fdae
                public final Object invoke() {
                    ctjmVar.b(ctrqVar);
                    return fctx.a;
                }
            };
            ConversationId conversationId = ctjmVar.b;
            conversationId.getClass();
            cudx cudxVarE = ctjmVar.d.e();
            this.a = 1;
            if (ctjmVar.g.a(fdaeVar, conversationId, cudxVarE, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctjl(this.b, this.c, fcxyVar);
    }
}
