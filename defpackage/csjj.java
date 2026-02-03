package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csjj extends fcyz implements fdat {
    int a;
    final /* synthetic */ csjm b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjj(fcxy fcxyVar, csjm csjmVar, boolean z) {
        super(2, fcxyVar);
        this.b = csjmVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csjj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csjm csjmVar = this.b;
        csjl csjlVar = new csjl(this.c);
        this.a = 1;
        Object objD = csjmVar.a.d(csjlVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csjj csjjVar = new csjj(fcxyVar, this.b, this.c);
        csjjVar.d = obj;
        return csjjVar;
    }
}
