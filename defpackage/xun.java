package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xun extends fcyz implements fdat {
    final /* synthetic */ xuo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xun(xuo xuoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xuoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b.b(new xum());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xun(this.a, fcxyVar);
    }
}
