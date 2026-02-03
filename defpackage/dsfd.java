package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfd extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsfe b;
    final /* synthetic */ dsbi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsfd(dsfe dsfeVar, dsbi dsbiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsfeVar;
        this.c = dsbiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsfd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dsfe dsfeVar = this.b;
        dsbi dsbiVar = this.c;
        this.a = 1;
        Object objA = fdin.a(((fdxz) fdjy.c()).a, new dsfl((dsfm) dsfeVar.a, dsbiVar, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsfd(this.b, this.c, fcxyVar);
    }
}
