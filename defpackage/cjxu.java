package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxu extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjya b;
    final /* synthetic */ emfc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxu(cjya cjyaVar, emfc emfcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cjyaVar;
        this.c = emfcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cjya cjyaVar = this.b;
            emfc emfcVar = this.c;
            emfe emfeVar = emfe.PROVISIONING_UI_TYPE_LEGAL_FYI;
            this.a = 1;
            if (cjyaVar.b(emfeVar, emfcVar, null, null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjxu(this.b, this.c, fcxyVar);
    }
}
