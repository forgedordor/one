package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lve extends fcyz implements fdat {
    final /* synthetic */ lvf a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lve(lvf lvfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = lvfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lve) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.b;
        lvf lvfVar = this.a;
        lvc lvcVar = lvfVar.a;
        if (lvcVar.a().compareTo(lvb.b) >= 0) {
            lvcVar.c(lvfVar);
        } else {
            fdlw.d(fdjxVar.hE(), null);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lve lveVar = new lve(this.a, fcxyVar);
        lveVar.b = obj;
        return lveVar;
    }
}
