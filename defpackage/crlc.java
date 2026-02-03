package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crlc extends fcyz implements fdat {
    int a;
    final /* synthetic */ crlj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crlc(crlj crljVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crljVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crlc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        crlj crljVar = this.b;
        this.a = 1;
        Object objC = crljVar.b.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crlc(this.b, fcxyVar);
    }
}
