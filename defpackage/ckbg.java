package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbg extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    final /* synthetic */ ckbz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbg(fcxy fcxyVar, ckbk ckbkVar, ckbz ckbzVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
        this.c = ckbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckbg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckbk ckbkVar = this.b;
            ckbh ckbhVar = new ckbh(this.c);
            this.a = 1;
            if (ckbkVar.f.d(ckbhVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        ckbk ckbkVar2 = this.b;
        ckbkVar2.D(this.c);
        ckbkVar2.l();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckbg ckbgVar = new ckbg(fcxyVar, this.b, this.c);
        ckbgVar.d = obj;
        return ckbgVar;
    }
}
