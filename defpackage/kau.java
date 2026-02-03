package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kau extends fcyz implements fdap {
    int a;
    final /* synthetic */ kax b;
    final /* synthetic */ kbh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kau(kax kaxVar, kbh kbhVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = kaxVar;
        this.c = kbhVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        kax kaxVar = this.b;
        kbh kbhVar = this.c;
        this.a = 1;
        Object objC = kaxVar.c(kbhVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new kau(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
