package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgyl extends fcyz implements fdap {
    int a;
    final /* synthetic */ cgzi b;
    final /* synthetic */ cgxy c;
    final /* synthetic */ cgxv d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgyl(cgzi cgziVar, cgxy cgxyVar, cgxv cgxvVar, Object obj, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cgziVar;
        this.c = cgxyVar;
        this.d = cgxvVar;
        this.e = obj;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cgzi cgziVar = this.b;
        cgxy cgxyVar = this.c;
        cgxv cgxvVar = this.d;
        Object obj2 = this.e;
        this.a = 1;
        Object objJ = cgziVar.j(cgxyVar, cgxvVar, obj2, this);
        return objJ == fcylVar ? fcylVar : objJ;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cgyl(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
