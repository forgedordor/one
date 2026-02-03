package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cydg extends fcyz implements fdap {
    int a;
    final /* synthetic */ cydk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cydg(cydk cydkVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cydkVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cydk cydkVar = this.b;
            this.a = 1;
            obj = cydkVar.e.c(this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        cycn cycnVar = (cycn) obj;
        this.a = 2;
        Object objA = fdin.a(eicg.a(cycnVar.b), new cycl(null, cycnVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cydg(this.b, (fcxy) obj).b(fctx.a);
    }
}
