package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ebj b;
    final /* synthetic */ fdks c;
    final /* synthetic */ ebk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmj(ebk ebkVar, ebj ebjVar, fdks fdksVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ebkVar;
        this.b = ebjVar;
        this.c = fdksVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ebk ebkVar = this.d;
            ebj ebjVar = this.b;
            this.a = 1;
            if (ebkVar.a(ebjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        fdks fdksVar = this.c;
        if (fdksVar != null) {
            fdksVar.hz();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmj(this.d, this.b, this.c, fcxyVar);
    }
}
