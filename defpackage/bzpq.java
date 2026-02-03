package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzpq extends fcyz implements fdap {
    int a;
    final /* synthetic */ bzps b;
    final /* synthetic */ cand c;
    final /* synthetic */ cayy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzpq(bzps bzpsVar, cand candVar, cayy cayyVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = bzpsVar;
        this.c = candVar;
        this.d = cayyVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bzps bzpsVar = this.b;
        cand candVar = this.c;
        String str = candVar.d;
        str.getClass();
        cayy cayyVar = this.d;
        int i2 = candVar.c;
        this.a = 1;
        Object objC = bzpsVar.c(str, i2, cayyVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzpq(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
