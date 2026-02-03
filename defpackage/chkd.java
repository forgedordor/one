package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chkd extends fcyz implements fdap {
    int a;
    final /* synthetic */ chkj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chkd(chkj chkjVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = chkjVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chkj chkjVar = this.b;
        this.a = 1;
        Object objG = chkjVar.g(this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new chkd(this.b, (fcxy) obj).b(fctx.a);
    }
}
