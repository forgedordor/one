package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbd extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    final /* synthetic */ dggn c;
    final /* synthetic */ ckcc d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbd(fcxy fcxyVar, ckbk ckbkVar, dggn dggnVar, ckcc ckccVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
        this.c = dggnVar;
        this.d = ckccVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckbd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ckbk ckbkVar = this.b;
        ckbe ckbeVar = new ckbe(this.c, this.d);
        this.a = 1;
        Object objD = ckbkVar.f.d(ckbeVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckbd ckbdVar = new ckbd(fcxyVar, this.b, this.c, this.d);
        ckbdVar.e = obj;
        return ckbdVar;
    }
}
