package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpp extends fcyz implements fdat {
    final /* synthetic */ bwps a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpp(fcxy fcxyVar, bwps bwpsVar) {
        super(2, fcxyVar);
        this.a = bwpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bwps bwpsVar = this.a;
        return ((ajln) bwpsVar.b.b()).a(new BugleConversationId(bwpsVar.e.a), ajlm.MINIMAL);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwpp bwppVar = new bwpp(fcxyVar, this.a);
        bwppVar.b = obj;
        return bwppVar;
    }
}
