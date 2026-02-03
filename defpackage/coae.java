package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coae extends fcyz implements fdat {
    int a;
    final /* synthetic */ coaf b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coae(fcxy fcxyVar, coaf coafVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = coafVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coae) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        coaf coafVar = this.b;
        fdap fdapVar = this.c;
        cmfo cmfoVarA = coafVar.a();
        final coad coadVar = new coad(fdapVar);
        eiju eijuVarJ = cmfoVarA.j(new ejvr() { // from class: coax
            @Override // defpackage.ejvr
            public final /* synthetic */ Object apply(Object obj2) {
                return coadVar.invoke(obj2);
            }
        });
        this.a = 1;
        Object objC = fdxs.c(eijuVarJ, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        coae coaeVar = new coae(fcxyVar, this.b, this.c);
        coaeVar.d = obj;
        return coaeVar;
    }
}
