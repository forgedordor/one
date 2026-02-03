package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cskt extends fcyz implements fdat {
    int a;
    final /* synthetic */ csku b;
    final /* synthetic */ cskx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cskt(csku cskuVar, cskx cskxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cskuVar;
        this.c = cskxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cskt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csks csksVar = (csks) this.b.a.b();
            cskx cskxVar = this.c;
            this.a = 1;
            if (csksVar.a(cskxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return cbcw.i();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cskt(this.b, this.c, fcxyVar);
    }
}
