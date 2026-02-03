package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crja extends fcyz implements fdat {
    int a;
    final /* synthetic */ brmz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crja(fcxy fcxyVar, brmz brmzVar) {
        super(2, fcxyVar);
        this.b = brmzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crja) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarX = this.b.x();
        eijuVarX.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarX, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crja crjaVar = new crja(fcxyVar, this.b);
        crjaVar.c = obj;
        return crjaVar;
    }
}
