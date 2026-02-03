package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vir extends fcyz implements fdat {
    int a;
    final /* synthetic */ vis b;
    final /* synthetic */ ajlk c;
    final /* synthetic */ ekgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vir(vis visVar, ajlk ajlkVar, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = visVar;
        this.c = ajlkVar;
        this.d = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vir) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.c.c().b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        boolean z = ((ajlh) obj).e().g;
        vis visVar = this.b;
        ajlk ajlkVar = this.c;
        ConversationId conversationIdD = ajlkVar.d();
        conversationIdD.getClass();
        String strM = ajlkVar.m();
        strM.getClass();
        ekgb ekgbVar = this.d;
        ekgbVar.getClass();
        visVar.b.h(new agga(new ctia(conversationIdD, strM, ekgbVar, z)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vir(this.b, this.c, this.d, fcxyVar);
    }
}
