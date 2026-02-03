package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chlr extends fcyz implements fdat {
    int a;
    final /* synthetic */ chlu b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlr(fcxy fcxyVar, chlu chluVar, String str, boolean z) {
        super(2, fcxyVar);
        this.b = chluVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chlu chluVar = this.b;
        String str = this.c;
        boolean z = this.d;
        this.a = 1;
        Object objB = chluVar.b.b(str, z, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chlr chlrVar = new chlr(fcxyVar, this.b, this.c, this.d);
        chlrVar.e = obj;
        return chlrVar;
    }
}
