package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugk extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ fdat c;
    final /* synthetic */ anpj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugk(fdat fdatVar, anpj anpjVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = fdatVar;
        this.d = anpjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdat fdatVar;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            fdat fdatVar2 = this.c;
            eiju eijuVarB = this.d.b();
            this.a = fdatVar2;
            this.b = 1;
            obj = fdxs.c(eijuVarB, this);
            fdatVar = fdatVar2;
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            fctl.b(obj);
            return obj;
        }
        Object obj2 = this.a;
        fctl.b(obj);
        fdatVar = obj2;
        this.a = null;
        this.b = 2;
        Object objA = fdatVar.a(obj, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ugk(this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
