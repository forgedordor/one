package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djy extends fcyz implements fdat {
    int a;
    final /* synthetic */ dkd b;
    final /* synthetic */ ebm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djy(dkd dkdVar, ebm ebmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dkdVar;
        this.c = ebmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ebk ebkVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (ebkVar = this.b.i) != null) {
            ebm ebmVar = this.c;
            this.a = 1;
            if (ebkVar.a(ebmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djy(this.b, this.c, fcxyVar);
    }
}
