package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class andb extends fcyz implements fdat {
    int a;
    final /* synthetic */ andf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public andb(andf andfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = andfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((andb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            andf andfVar = this.b;
            anaz anazVarB = andfVar.e.b();
            int iA = anazVarB != null ? anazVarB.a : andfVar.i.a() + 4;
            avad avadVar = andfVar.g;
            anbb anbbVar = andfVar.f;
            anda andaVar = new anda(avadVar, andfVar, iA);
            this.a = 1;
            if (anbbVar.c.a(andaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new andb(this.b, fcxyVar);
    }
}
