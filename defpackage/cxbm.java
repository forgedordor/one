package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxbm extends fcyz implements fdat {
    final /* synthetic */ cxbn a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxbm(cxbn cxbnVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cxbnVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxbm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String strConcat = "";
        for (etsf etsfVar : etsf.values()) {
            etsf etsfVar2 = etsf.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS;
            if (etsfVar.equals(etsfVar2) || etsfVar.equals(etsf.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS)) {
                String str = strConcat + "Configuration Type: " + etsfVar.name() + "\n";
                ekgp ekgpVarB = ekoj.a;
                if (etsfVar == etsfVar2) {
                    ekgpVarB = ((cebq) this.a.d.b()).a(this.b);
                } else if (etsfVar == etsf.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS) {
                    ekgpVarB = ((cebq) this.a.d.b()).b(this.b);
                }
                ekqg ekqgVarListIterator = ekgpVarB.keySet().listIterator();
                ekqgVarListIterator.getClass();
                while (ekqgVarListIterator.hasNext()) {
                    String str2 = (String) ekqgVarListIterator.next();
                    str = str + str2 + ": " + ekgpVarB.get(str2) + "\n";
                }
                strConcat = str.concat("\n");
            }
        }
        this.a.f.put(this.b, strConcat);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cxbm(this.a, this.b, fcxyVar);
    }
}
