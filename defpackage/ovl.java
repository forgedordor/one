package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovl extends fcyz implements fdap {
    int a;
    final /* synthetic */ ovn b;
    final /* synthetic */ oux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovl(ovn ovnVar, oux ouxVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ovnVar;
        this.c = ouxVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ovn ovnVar = this.b;
            oux ouxVar = this.c;
            oxe oxeVar = ouxVar.b;
            oxe oxeVar2 = ovnVar.c;
            ovnVar.c = oxeVar;
            if (oxeVar2 instanceof ovi) {
                ovi oviVar = (ovi) oxeVar2;
                boolean z = oviVar.a;
                if (oviVar.b) {
                    oxeVar.a();
                }
            }
            fdpl fdplVar = ouxVar.a;
            ovk ovkVar = new ovk(ovnVar, ouxVar);
            this.a = 1;
            if (fdplVar.a(ovkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ovl(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
