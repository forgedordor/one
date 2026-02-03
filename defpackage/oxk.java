package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oxk extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ oxm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxk(oxm oxmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = oxmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oxk) c((oux) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            oux ouxVar = (oux) this.b;
            oxm oxmVar = this.c;
            this.a = 1;
            if (oxmVar.a.c(ouxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        oxk oxkVar = new oxk(this.c, fcxyVar);
        oxkVar.b = obj;
        return oxkVar;
    }
}
