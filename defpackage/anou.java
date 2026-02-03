package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anou extends fcyz implements fdat {
    int a;
    final /* synthetic */ anpj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anou(anpj anpjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anpjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anou) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fdos fdosVar = (fdos) this.c;
            final anpj anpjVar = this.b;
            fdosVar.b(anpjVar);
            final cquc cqucVarA = anpjVar.a(new anpi() { // from class: anos
                @Override // defpackage.anpi
                public final eiju a() {
                    fdosVar.b(anpjVar);
                    return eijx.e(null);
                }
            });
            fdae fdaeVar = new fdae() { // from class: anot
                @Override // defpackage.fdae
                public final Object invoke() {
                    cqucVarA.a();
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        anou anouVar = new anou(this.b, fcxyVar);
        anouVar.c = obj;
        return anouVar;
    }
}
