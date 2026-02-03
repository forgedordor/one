package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fch extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ebk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fch(hox hoxVar, boolean z, ebk ebkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = z;
        this.e = ebkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fch) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        hox hoxVar;
        fcyl fcylVar = fcyl.a;
        if (this.b == 0) {
            fctl.b(obj);
            hox hoxVar2 = this.c;
            ebm ebmVar = (ebm) hoxVar2.a();
            if (ebmVar != null) {
                boolean z = this.d;
                ebk ebkVar = this.e;
                ebj ebnVar = z ? new ebn(ebmVar) : new ebl(ebmVar);
                if (ebkVar != null) {
                    this.a = hoxVar2;
                    this.b = 1;
                    if (ebkVar.a(ebnVar, this) == fcylVar) {
                        return fcylVar;
                    }
                }
                hoxVar = hoxVar2;
            }
            return fctx.a;
        }
        Object obj2 = this.a;
        fctl.b(obj);
        hoxVar = obj2;
        hoxVar.b(null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fch(this.c, this.d, this.e, fcxyVar);
    }
}
