package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wic extends fcyz implements fdat {
    int a;
    final /* synthetic */ wiq b;
    final /* synthetic */ vvw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wic(fcxy fcxyVar, wiq wiqVar, vvw vvwVar) {
        super(2, fcxyVar);
        this.b = wiqVar;
        this.c = vvwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wic) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        wiq wiqVar = this.b;
        vvw vvwVar = this.c;
        vwj vwjVarA = wiqVar.a();
        this.a = 1;
        Object objC = vwjVarA.c(vvwVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wic wicVar = new wic(fcxyVar, this.b, this.c);
        wicVar.d = obj;
        return wicVar;
    }
}
