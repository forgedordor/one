package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnwi extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnwk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnwi(dnwk dnwkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnwkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnwi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dnwk dnwkVar = this.b;
        ecmd ecmdVarB = dnwkVar.b();
        ecnr ecnrVar = dnvt.a;
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("\n      SELECT COUNT(*)\n      FROM `emotify`\n      ");
        eopy eopyVarA = ecmdVarB.a(ecnwVar.a());
        dnwh dnwhVar = new dnwh(null);
        this.a = 1;
        Object objA = dngi.a(eopyVarA, dnwkVar.b, dnwhVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnwi(this.b, fcxyVar);
    }
}
