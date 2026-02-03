package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgp extends fcyz implements fdat {
    int a;
    final /* synthetic */ atgs b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgp(fcxy fcxyVar, atgs atgsVar, String str) {
        super(2, fcxyVar);
        this.b = atgsVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atgp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        atgs atgsVar = this.b;
        atgi atgiVar = (atgi) atgj.a.createBuilder();
        atgiVar.getClass();
        String str = this.c;
        str.getClass();
        atgiVar.copyOnWrite();
        atgj atgjVar = (atgj) atgiVar.instance;
        atgjVar.b |= 1;
        atgjVar.c = str;
        evsn evsnVarBuild = atgiVar.build();
        evsnVarBuild.getClass();
        caxr caxrVar = new caxr();
        caxrVar.d = str;
        caxrVar.b = str;
        eiju eijuVarB = ((cazj) atgsVar.b.a.b()).a(cbcu.g("file_transfer_processor", (atgj) evsnVarBuild, caxrVar.a())).b();
        eijuVarB.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarB, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atgp atgpVar = new atgp(fcxyVar, this.b, this.c);
        atgpVar.d = obj;
        return atgpVar;
    }
}
