package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxz extends fcyz implements fdat {
    final /* synthetic */ cjya a;
    final /* synthetic */ emfc b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxz(cjya cjyaVar, emfc emfcVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cjyaVar;
        this.b = emfcVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        emfa emfaVar = (emfa) emff.a.createBuilder();
        emfaVar.getClass();
        emmp.d(emfe.PROVISIONING_UI_TYPE_WELCOME_MESSAGE, emfaVar);
        emmp.c(this.b, emfaVar);
        cjya cjyaVar = this.a;
        enpl enplVarB = ((dexw) cjyaVar.b.b()).b(new dggp(this.c));
        enplVarB.getClass();
        emmp.b(enplVarB, emfaVar);
        cjyaVar.c(emmp.a(emfaVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjxz(this.a, this.b, this.c, fcxyVar);
    }
}
