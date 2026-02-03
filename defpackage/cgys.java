package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgys extends fcyz implements fdap {
    int a;
    final /* synthetic */ cgzi b;
    final /* synthetic */ chbe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgys(cgzi cgziVar, chbe chbeVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cgziVar;
        this.c = chbeVar;
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
        chbe chbeVar = this.c;
        this.a = 1;
        Object objK = cgziVar.k(chbeVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cgys(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
