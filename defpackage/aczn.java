package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczn extends fcyz implements fdat {
    int a;
    final /* synthetic */ aczp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczn(fcxy fcxyVar, aczp aczpVar) {
        super(2, fcxyVar);
        this.b = aczpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aczp aczpVar = this.b;
            this.a = 1;
            obj = aczpVar.a.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new aczl(new Integer(((Number) obj).intValue()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aczn acznVar = new aczn(fcxyVar, this.b);
        acznVar.c = obj;
        return acznVar;
    }
}
