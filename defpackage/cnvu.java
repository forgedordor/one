package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnvu extends fcyz implements fdat {
    final /* synthetic */ fdap a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnvu(fdap fdapVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdapVar;
        this.b = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((cnvu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.invoke(this.b);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnvu(this.a, this.b, fcxyVar);
    }
}
