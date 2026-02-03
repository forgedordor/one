package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aodv extends fcyz implements fdat {
    final /* synthetic */ aodw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aodv(aodw aodwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aodwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aodv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.j();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aodv(this.a, fcxyVar);
    }
}
