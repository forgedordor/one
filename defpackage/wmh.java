package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmh extends fcyz implements fdat {
    int a;
    final /* synthetic */ wmp b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmh(fcxy fcxyVar, wmp wmpVar, boolean z) {
        super(2, fcxyVar);
        this.b = wmpVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
            return obj;
        }
        fctl.b(obj);
        this.d = this;
        this.a = 1;
        fdiu fdiuVar = new fdiu(fcym.c(this), 1);
        fdiuVar.B();
        auwm auwmVar = new auwm(fdiuVar);
        wmp wmpVar = this.b;
        wmpVar.d.e(new wmm(auwmVar, wmpVar, this.c));
        Object objM = fdiuVar.m();
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wmh wmhVar = new wmh(fcxyVar, this.b, this.c);
        wmhVar.d = obj;
        return wmhVar;
    }
}
