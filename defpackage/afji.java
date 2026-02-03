package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afji extends fcyz implements fdat {
    final /* synthetic */ afjl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afji(afjl afjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = afjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        afjl afjlVar = this.a;
        eieu eieuVarH = eiiy.h("fetchConversationList");
        try {
            ((acxm) afjlVar.m.b()).j(cdpg.HOME);
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afji(this.a, fcxyVar);
    }
}
