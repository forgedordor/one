package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djs extends fcyz implements fdat {
    int a;
    final /* synthetic */ ebh b;
    final /* synthetic */ ebk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djs(ebk ebkVar, ebh ebhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ebkVar;
        this.b = ebhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ebk ebkVar = this.c;
            ebh ebhVar = this.b;
            this.a = 1;
            if (ebkVar.a(ebhVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djs(this.c, this.b, fcxyVar);
    }
}
