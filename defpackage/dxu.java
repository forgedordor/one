package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxu extends fcyz implements fdat {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxu(long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxu) c((dyh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((dyh) this.b).b(this.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxu dxuVar = new dxu(this.a, fcxyVar);
        dxuVar.b = obj;
        return dxuVar;
    }
}
