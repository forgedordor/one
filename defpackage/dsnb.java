package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnb extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsnc b;
    final /* synthetic */ evje c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnb(dsnc dsncVar, evje evjeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsncVar;
        this.c = evjeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dsnc dsncVar = this.b;
        evje evjeVar = this.c;
        this.a = 1;
        Object objA = dsncVar.a.a(evjeVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnb(this.b, this.c, fcxyVar);
    }
}
