package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnwc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnwk b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnwc(dnwk dnwkVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnwkVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnwc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        String str = this.c;
        str.getClass();
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("\n      SELECT *\n      FROM `emotify`\n      WHERE `id` = ?\n      ");
        ecnwVar.d(str);
        eopy eopyVarA = ecmdVarB.a(ecnwVar.a());
        dnwb dnwbVar = new dnwb(dnwkVar, null);
        this.a = 1;
        Object objA = dngi.a(eopyVarA, dnwkVar.b, dnwbVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnwc(this.b, this.c, fcxyVar);
    }
}
