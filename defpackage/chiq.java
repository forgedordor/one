package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chiq extends fcyz implements fdat {
    int a;
    final /* synthetic */ chir b;
    final /* synthetic */ chik c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chiq(chir chirVar, chik chikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chirVar;
        this.c = chikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chiq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chir chirVar = this.b;
        chik chikVar = this.c;
        this.a = 1;
        Object objB = chirVar.b(chikVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chiq(this.b, this.c, fcxyVar);
    }
}
