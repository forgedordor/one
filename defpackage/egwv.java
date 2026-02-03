package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egwv extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdat c;
    final /* synthetic */ fduf d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egwv(fcxy fcxyVar, fdpl fdplVar, fdat fdatVar, fduf fdufVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fdatVar;
        this.d = fdufVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egwv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVarB = fdqc.b(fdqc.a(new fdpg(new egwn(new egxc(), new egwt(this.b, this.c), egwp.a, new fdap() { // from class: egwo
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    egxa egxaVar = (egxa) obj2;
                    egxaVar.getClass();
                    return Boolean.valueOf(egxaVar instanceof egwy);
                }
            }, null))), fdkq.b);
            egww egwwVar = new egww(this.d);
            this.a = 1;
            if (fdplVarB.a(egwwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egwv egwvVar = new egwv(fcxyVar, this.b, this.c, this.d);
        egwvVar.e = obj;
        return egwvVar;
    }
}
