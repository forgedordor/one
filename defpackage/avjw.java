package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avjw extends fcyz implements fdat {
    final /* synthetic */ avjz a;
    final /* synthetic */ avlb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjw(fcxy fcxyVar, avjz avjzVar, avlb avlbVar) {
        super(2, fcxyVar);
        this.a = avjzVar;
        this.b = avlbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.d.a(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avjw avjwVar = new avjw(fcxyVar, this.a, this.b);
        avjwVar.c = obj;
        return avjwVar;
    }
}
