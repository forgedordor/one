package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbkk extends fcyz implements fdap {
    int a;
    final /* synthetic */ cbkq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkk(cbkq cbkqVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cbkqVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbkq cbkqVar = this.b;
        cbkj cbkjVar = new cbkj(null);
        this.a = 1;
        Object objB = cbkqVar.e.b(cbkjVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbkk(this.b, (fcxy) obj).b(fctx.a);
    }
}
