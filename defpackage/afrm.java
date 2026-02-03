package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afrm extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ afrq b;
    final /* synthetic */ afmy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afrm(afrq afrqVar, afmy afmyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afrqVar;
        this.c = afmyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afrm) c((ctnv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.b.c.a((ctnv) this.a, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afrm afrmVar = new afrm(this.b, this.c, fcxyVar);
        afrmVar.a = obj;
        return afrmVar;
    }
}
