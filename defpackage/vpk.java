package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vpk extends fcyz implements fdat {
    int a;
    final /* synthetic */ vpp b;
    final /* synthetic */ ekgb c;
    final /* synthetic */ ConversationId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpk(vpp vppVar, ekgb ekgbVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vppVar;
        this.c = ekgbVar;
        this.d = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vpk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csyj csyjVar = (csyj) this.b.c.b();
            ekgb ekgbVar = this.c;
            ConversationId conversationId = this.d;
            this.a = 1;
            obj = csyjVar.a(ekgbVar, conversationId, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vpk(this.b, this.c, this.d, fcxyVar);
    }
}
