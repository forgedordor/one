package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cucr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fduf b;
    final /* synthetic */ ahat c;
    final /* synthetic */ cucv d;
    final /* synthetic */ ekgb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cucr(fduf fdufVar, ahat ahatVar, cucv cucvVar, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdufVar;
        this.c = ahatVar;
        this.d = cucvVar;
        this.e = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cucr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fduf fdufVar = this.b;
            cucq cucqVar = new cucq(this.c, this.d, this.e, fdufVar);
            this.a = 1;
            if (fdufVar.a(cucqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cucr(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
