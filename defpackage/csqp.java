package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqp extends fcyz implements fdat {
    int a;
    final /* synthetic */ csrb b;
    final /* synthetic */ boolean c;
    Object d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csqp(fcxy fcxyVar, csrb csrbVar, boolean z) {
        super(2, fcxyVar);
        this.b = csrbVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csqp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdkf fdkfVar;
        eyjy eyjyVar;
        ezpp ezppVar;
        ezol ezolVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            fdjx fdjxVar = (fdjx) this.f;
            csrb csrbVar = this.b;
            eyjy eyjyVarA = ((csqj) csrbVar.a.b()).a();
            if (eyjyVarA == null) {
                return null;
            }
            ezpp ezppVarB = csrbVar.b();
            fcyi fcyiVar = fcyi.a;
            fdjz fdjzVar = fdjz.a;
            fcyh fcyhVarA = eicg.a(fcyiVar);
            boolean z = this.c;
            fdkf fdkfVarB = fdin.b(fdjxVar, fcyhVarA, fdjzVar, new csqq(null, csrbVar, z));
            fdkf fdkfVarB2 = fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new csqr(null, csrbVar, z));
            this.f = fdkfVarB2;
            this.d = ezppVarB;
            this.e = eyjyVarA;
            this.a = 1;
            Object objC = fdkfVarB.c(this);
            if (objC != fcylVar) {
                fdkfVar = fdkfVarB2;
                obj = objC;
                eyjyVar = eyjyVarA;
                ezppVar = ezppVarB;
            }
            return fcylVar;
        }
        if (i != 1) {
            ezolVar = (ezol) this.e;
            eyjyVar = (eyjy) this.d;
            ezppVar = (ezpp) this.f;
            fctl.b(obj);
            return new csql(eyjyVar, ezppVar, ezolVar, (ezpx) obj);
        }
        eyjyVar = (eyjy) this.e;
        ezppVar = (ezpp) this.d;
        fdkfVar = (fdkf) this.f;
        fctl.b(obj);
        ezol ezolVar2 = (ezol) obj;
        this.f = ezppVar;
        this.d = eyjyVar;
        this.e = ezolVar2;
        this.a = 2;
        Object objC2 = fdkfVar.c(this);
        if (objC2 != fcylVar) {
            ezolVar = ezolVar2;
            obj = objC2;
            return new csql(eyjyVar, ezppVar, ezolVar, (ezpx) obj);
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csqp csqpVar = new csqp(fcxyVar, this.b, this.c);
        csqpVar.f = obj;
        return csqpVar;
    }
}
