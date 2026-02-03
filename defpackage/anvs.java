package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvs extends fcyz implements fdat {
    int a;
    final /* synthetic */ anvt b;
    final /* synthetic */ BugleConversationId c;
    final /* synthetic */ ekgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvs(anvt anvtVar, BugleConversationId bugleConversationId, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anvtVar;
        this.c = bugleConversationId;
        this.d = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anvs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            anvt anvtVar = this.b;
            BugleConversationId bugleConversationId = this.c;
            ekgb ekgbVar = this.d;
            this.a = 1;
            Object objA = fdin.a(anvtVar.b, new anvr(bugleConversationId, ekgbVar, anvtVar, null), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anvs(this.b, this.c, this.d, fcxyVar);
    }
}
