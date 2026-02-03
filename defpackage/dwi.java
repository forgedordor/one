package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwi extends fcyz implements fdat {
    int a;
    final /* synthetic */ dyk b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwi(dyk dykVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dykVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dyk dykVar = this.b;
            fdat fdatVar = this.c;
            dod dodVar = dod.b;
            this.a = 1;
            if (dykVar.i(dodVar, fdatVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dwi(this.b, this.c, fcxyVar);
    }
}
