package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejds extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejfj b;
    final /* synthetic */ ejdt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejds(ejfj ejfjVar, ejdt ejdtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejfjVar;
        this.c = ejdtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejds) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ejfj ejfjVar = this.b;
            ejdr ejdrVar = new ejdr(this.c);
            this.a = 1;
            if (ejfjVar.t.a(ejdrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejds(this.b, this.c, fcxyVar);
    }
}
