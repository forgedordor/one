package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eno extends fcyz implements fdat {
    int a;
    final /* synthetic */ ens b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eno(ens ensVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ensVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eno) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ens ensVar = this.b;
            kjb kjbVar = new kjb(0L);
            this.a = 1;
            if (ensVar.e.e(kjbVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        ens ensVar2 = this.b;
        ensVar2.i();
        ensVar2.h();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eno(this.b, fcxyVar);
    }
}
