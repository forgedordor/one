package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vkg extends fcyz implements fdat {
    int a;
    final /* synthetic */ vkk b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkg(vkk vkkVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vkkVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vkg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vkk vkkVar = this.b;
            ((ains) vkkVar.f.b()).c("Bugle.UI.PeopleAndOptions.LeaveRcsGroup");
            eiju eijuVarR = vkkVar.b.r(this.c);
            eijuVarR.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarR, this) == fcylVar) {
                return fcylVar;
            }
        }
        vkk vkkVar2 = this.b;
        vkkVar2.e.g();
        vkkVar2.i.h(agbl.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vkg(this.b, this.c, fcxyVar);
    }
}
