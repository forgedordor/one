package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlt extends fcyz implements fdat {
    int a;
    final /* synthetic */ wmp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlt(fcxy fcxyVar, wmp wmpVar) {
        super(2, fcxyVar);
        this.b = wmpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wlt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
            return obj;
        }
        fctl.b(obj);
        this.c = this;
        this.a = 1;
        fdiu fdiuVar = new fdiu(fcym.c(this), 1);
        fdiuVar.B();
        auwm auwmVar = new auwm(fdiuVar);
        wmp wmpVar = this.b;
        wmpVar.d.d(true, new wlz(auwmVar, wmpVar));
        Object objM = fdiuVar.m();
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wlt wltVar = new wlt(fcxyVar, this.b);
        wltVar.c = obj;
        return wltVar;
    }
}
