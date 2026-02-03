package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceeg extends fcyz implements fdat {
    int a;
    final /* synthetic */ ceeh b;
    final /* synthetic */ epqd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceeg(ceeh ceehVar, epqd epqdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ceehVar;
        this.c = epqdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceeg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ceeh ceehVar = this.b;
        epqd epqdVar = this.c;
        this.a = 1;
        Object objB = ceehVar.b(epqdVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ceeg(this.b, this.c, fcxyVar);
    }
}
