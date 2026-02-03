package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxx extends fcyz implements fdat {
    final /* synthetic */ cjya a;
    final /* synthetic */ boolean b;
    final /* synthetic */ emfc c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxx(cjya cjyaVar, boolean z, emfc emfcVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cjyaVar;
        this.b = z;
        this.c = emfcVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        emfa emfaVar = (emfa) emff.a.createBuilder();
        emfaVar.getClass();
        emfe emfeVar = this.b ? emfe.PROVISIONING_UI_TYPE_RCS_DEFAULT_ON_OOB : emfe.PROVISIONING_UI_TYPE_RCS_SUCCESS;
        String str = this.d;
        cjya cjyaVar = this.a;
        emfc emfcVar = this.c;
        emmp.d(emfeVar, emfaVar);
        emmp.c(emfcVar, emfaVar);
        enpl enplVarB = ((dexw) cjyaVar.b.b()).b(new dggp(str));
        enplVarB.getClass();
        emmp.b(enplVarB, emfaVar);
        cjyaVar.c(emmp.a(emfaVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjxx(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
