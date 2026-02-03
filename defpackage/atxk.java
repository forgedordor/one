package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atxk extends fcyz implements fdat {
    int a;
    final /* synthetic */ atxl b;
    final /* synthetic */ BugleConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atxk(atxl atxlVar, BugleConversationId bugleConversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atxlVar;
        this.c = bugleConversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atxk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        atxl atxlVar = this.b;
        apto aptoVar = atxlVar.c;
        if (aptoVar.a()) {
            return null;
        }
        BugleConversationId bugleConversationId = this.c;
        this.a = 1;
        if (aptoVar.a() || (objC = fdxs.c(((ajwh) atxlVar.a.b()).a(bugleConversationId), this)) != obj2) {
            objC = fctx.a;
        }
        if (objC == obj2) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atxk(this.b, this.c, fcxyVar);
    }
}
