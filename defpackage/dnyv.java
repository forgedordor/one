package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyv extends fcyz implements fdap {
    int a;
    final /* synthetic */ dnyw b;
    final /* synthetic */ dnwt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnyv(dnyw dnywVar, dnwt dnwtVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dnywVar;
        this.c = dnwtVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dnyw dnywVar = this.b;
        dnwt dnwtVar = this.c;
        this.a = 1;
        Object objA = dnywVar.a.a(dnwtVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnyv(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
