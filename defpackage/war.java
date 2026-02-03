package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class war extends fcyz implements fdat {
    int a;
    final /* synthetic */ was b;
    final /* synthetic */ dojw c;
    final /* synthetic */ dnhn d;
    final /* synthetic */ fduf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public war(was wasVar, dojw dojwVar, dnhn dnhnVar, fduf fdufVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wasVar;
        this.c = dojwVar;
        this.d = dnhnVar;
        this.e = fdufVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((war) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            was wasVar = this.b;
            dojw dojwVar = this.c;
            dnhn dnhnVar = this.d;
            this.a = 1;
            if (wasVar.a.b(dojwVar, dnhnVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.e.f(false);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new war(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
