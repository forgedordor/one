package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyap extends fcyz implements fdat {
    int a;
    final /* synthetic */ cyaq b;
    final /* synthetic */ efwo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyap(fcxy fcxyVar, cyaq cyaqVar, efwo efwoVar) {
        super(2, fcxyVar);
        this.b = cyaqVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyap) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                cprd cprdVar = this.b.a;
                efwo efwoVar = this.c;
                this.a = 1;
                obj = cprdVar.d(efwoVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return ((cpqt) obj).name();
        } catch (Exception e) {
            e.toString();
            return "Failed. ".concat(e.toString());
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cyap cyapVar = new cyap(fcxyVar, this.b, this.c);
        cyapVar.d = obj;
        return cyapVar;
    }
}
