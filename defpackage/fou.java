package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fou extends fcyz implements fdat {
    int a;
    final /* synthetic */ fqa b;
    final /* synthetic */ ebj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fou(fqa fqaVar, ebj ebjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fqaVar;
        this.c = ebjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fou) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fqa fqaVar = this.b;
            ebj ebjVar = this.c;
            this.a = 1;
            if (fqaVar.a(ebjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fou(this.b, this.c, fcxyVar);
    }
}
