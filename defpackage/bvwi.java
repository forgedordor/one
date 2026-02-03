package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvwi extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvwj b;
    final /* synthetic */ bvxd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvwi(bvwj bvwjVar, bvxd bvxdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvwjVar;
        this.c = bvxdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvwi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bvwj bvwjVar = this.b;
        bvxd bvxdVar = this.c;
        this.a = 1;
        Object objM = bvwjVar.m(bvxdVar, this);
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvwi(this.b, this.c, fcxyVar);
    }
}
