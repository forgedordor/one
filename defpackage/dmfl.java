package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfl extends fcyz implements fdap {
    final /* synthetic */ fdae a;
    final /* synthetic */ fdjx b;
    final /* synthetic */ ddp c;
    final /* synthetic */ ddp d;
    final /* synthetic */ dmhi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmfl(fdae fdaeVar, fdjx fdjxVar, ddp ddpVar, ddp ddpVar2, dmhi dmhiVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = fdaeVar;
        this.b = fdjxVar;
        this.c = ddpVar;
        this.d = ddpVar2;
        this.e = dmhiVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.invoke();
        dmfj dmfjVar = new dmfj(this.c, null);
        fdjx fdjxVar = this.b;
        fdil.d(fdjxVar, null, null, dmfjVar, 3);
        fdil.d(fdjxVar, null, null, new dmfk(this.d, this.e, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dmfl(this.a, this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
