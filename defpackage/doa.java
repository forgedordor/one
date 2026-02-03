package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doa extends fcyz implements fdat {
    int a;
    final /* synthetic */ dob b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doa(dob dobVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dobVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dob dobVar = this.b;
            fdpl fdplVarA = hsb.a(new fdae() { // from class: dny
                @Override // defpackage.fdae
                public final Object invoke() {
                    dob dobVar2 = dobVar;
                    if (dobVar2.j() <= dobVar2.i()) {
                        return null;
                    }
                    int i2 = ((dns) dobVar2.g.a()).a;
                    if (!dns.a(1) || ((Boolean) dobVar2.e.a()).booleanValue()) {
                        return Float.valueOf(dobVar2.j() + dobVar2.k());
                    }
                    return null;
                }
            });
            dnz dnzVar = new dnz(dobVar, null);
            this.a = 1;
            if (fdpy.b(fdplVarA, dnzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doa(this.b, fcxyVar);
    }
}
