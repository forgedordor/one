package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgx extends fcyz implements fdat {
    int a;
    final /* synthetic */ adhb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgx(fcxy fcxyVar, adhb adhbVar) {
        super(2, fcxyVar);
        this.b = adhbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adgx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        adhb adhbVar = this.b;
        this.a = 1;
        Object objA = adhbVar.a.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        adgx adgxVar = new adgx(fcxyVar, this.b);
        adgxVar.c = obj;
        return adgxVar;
    }
}
