package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djt extends fcyz implements fdat {
    int a;
    final /* synthetic */ ebi b;
    final /* synthetic */ ebk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djt(ebk ebkVar, ebi ebiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ebkVar;
        this.b = ebiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ebk ebkVar = this.c;
            ebi ebiVar = this.b;
            this.a = 1;
            if (ebkVar.a(ebiVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djt(this.c, this.b, fcxyVar);
    }
}
