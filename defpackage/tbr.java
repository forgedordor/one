package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbr extends fcyz implements fdat {
    int a;
    final /* synthetic */ tbt b;
    final /* synthetic */ tci c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbr(fcxy fcxyVar, tbt tbtVar, tci tciVar) {
        super(2, fcxyVar);
        this.b = tbtVar;
        this.c = tciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tbr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        tbt tbtVar = this.b;
        tci tciVar = this.c;
        cmfo cmfoVarA = tbtVar.a();
        tbs tbsVar = new tbs(tciVar);
        this.a = 1;
        Object objD = cmfoVarA.d(tbsVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tbr tbrVar = new tbr(fcxyVar, this.b, this.c);
        tbrVar.d = obj;
        return tbrVar;
    }
}
