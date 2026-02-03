package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdqi extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdqi(fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdqi) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.c;
            fdpl fdplVar = this.b;
            fdqh fdqhVar = new fdqh(fdosVar);
            this.a = 1;
            if (fdplVar.a(fdqhVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdqi fdqiVar = new fdqi(this.b, fcxyVar);
        fdqiVar.c = obj;
        return fdqiVar;
    }
}
