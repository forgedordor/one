package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnk extends fcyz implements fdap {
    int a;
    final /* synthetic */ bvmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnk(bvmw bvmwVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = bvmwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bvmw bvmwVar = this.b;
        eiju eijuVarC = auvw.c(bvmwVar.h, fcyi.a, fdjz.a, new bvnb(bvmwVar, null));
        this.a = 1;
        Object objC = fdxs.c(eijuVarC, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bvnk(this.b, (fcxy) obj).b(fctx.a);
    }
}
