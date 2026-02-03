package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oti extends fcyz implements fdat {
    int a;
    final /* synthetic */ ots b;
    final /* synthetic */ fdoa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oti(ots otsVar, fdoa fdoaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = otsVar;
        this.c = fdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oti) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ots otsVar = this.b;
            oth othVar = new oth(this.c);
            this.a = 1;
            if (otsVar.c.a(othVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new oti(this.b, this.c, fcxyVar);
    }
}
