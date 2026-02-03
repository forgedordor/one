package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crli extends fcyz implements fdat {
    int a;
    final /* synthetic */ crlj b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crli(fcxy fcxyVar, crlj crljVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = crljVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crli) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        fdap fdapVar = this.c;
        this.a = 1;
        Object objD = crljVar.b.d(fdapVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crli crliVar = new crli(fcxyVar, this.b, this.c);
        crliVar.d = obj;
        return crliVar;
    }
}
