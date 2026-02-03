package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kaw extends fcyz implements fdat {
    int a;
    final /* synthetic */ kax b;
    final /* synthetic */ kbh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kaw(kax kaxVar, kbh kbhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = kaxVar;
        this.c = kbhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kaw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        kax kaxVar = this.b;
        kbh kbhVar = this.c;
        this.a = 1;
        Object objA = kaxVar.a.a(kbhVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new kaw(this.b, this.c, fcxyVar);
    }
}
