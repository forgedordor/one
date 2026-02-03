package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cygt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cyha b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cygt(cyha cyhaVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cyhaVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cygt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fduf fdufVar;
        Object objC;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                cyha cyhaVar = this.b;
                do {
                    fdufVar = cyhaVar.f;
                    objC = fdufVar.c();
                    ((Boolean) objC).booleanValue();
                } while (!fdufVar.g(objC, true));
                fdap fdapVar = this.c;
                this.a = 1;
                if (fdapVar.invoke(this) == fcylVar) {
                    return fcylVar;
                }
            }
            this.b.a();
            return fctx.a;
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cygt(this.b, this.c, fcxyVar);
    }
}
