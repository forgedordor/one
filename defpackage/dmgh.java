package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgh extends fcyz implements fdat {
    final /* synthetic */ ddp a;
    final /* synthetic */ ddp b;
    final /* synthetic */ ddp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgh(ddp ddpVar, ddp ddpVar2, ddp ddpVar3, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ddpVar;
        this.b = ddpVar2;
        this.c = ddpVar3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.d;
        fdil.d(fdjxVar, null, null, new dmge(this.a, null), 3);
        fdil.d(fdjxVar, null, null, new dmgf(this.b, null), 3);
        fdil.d(fdjxVar, null, null, new dmgg(this.c, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmgh dmghVar = new dmgh(this.a, this.b, this.c, fcxyVar);
        dmghVar.d = obj;
        return dmghVar;
    }
}
