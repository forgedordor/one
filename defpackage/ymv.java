package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ymv extends fcyz implements fdat {
    int a;
    final /* synthetic */ amec b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymv(amec amecVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amecVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ymv) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.c;
            amec amecVar = this.b;
            fdosVar.b(amecVar);
            final cquc cqucVarF = amecVar.f(new ymt(fdosVar, amecVar));
            fdae fdaeVar = new fdae() { // from class: ymu
                @Override // defpackage.fdae
                public final Object invoke() {
                    cqucVarF.a();
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
        ymv ymvVar = new ymv(this.b, fcxyVar);
        ymvVar.c = obj;
        return ymvVar;
    }
}
