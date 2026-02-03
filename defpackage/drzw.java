package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drzw extends fcyz implements fdap {
    int a;
    final /* synthetic */ drzz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drzw(drzz drzzVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = drzzVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        drzz drzzVar = this.b;
        this.a = 1;
        Object objD = drzzVar.d(this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new drzw(this.b, (fcxy) obj).b(fctx.a);
    }
}
