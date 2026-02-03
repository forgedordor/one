package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgy extends fcyz implements fdat {
    int a;
    final /* synthetic */ cthb b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctgy(fcxy fcxyVar, cthb cthbVar, String str) {
        super(2, fcxyVar);
        this.b = cthbVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctgy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cthb cthbVar = this.b;
        String str = this.c;
        this.a = 1;
        Object objB = cthbVar.b(str, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctgy ctgyVar = new ctgy(fcxyVar, this.b, this.c);
        ctgyVar.d = obj;
        return ctgyVar;
    }
}
