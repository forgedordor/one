package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csji extends fcyz implements fdat {
    int a;
    final /* synthetic */ csjm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csji(fcxy fcxyVar, csjm csjmVar) {
        super(2, fcxyVar);
        this.b = csjmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            z = ((csjo) obj).b;
        } else {
            if (csje.a()) {
                csjm csjmVar = this.b;
                this.a = 1;
                obj = csjmVar.a.c(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                if (((csjo) obj).b) {
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csji csjiVar = new csji(fcxyVar, this.b);
        csjiVar.c = obj;
        return csjiVar;
    }
}
