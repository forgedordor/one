package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfem extends fcyz implements fdat {
    int a;
    final /* synthetic */ cezv b;
    final /* synthetic */ cfen c;
    final /* synthetic */ ezvu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfem(cezv cezvVar, cfen cfenVar, ezvu ezvuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cezvVar;
        this.c = cfenVar;
        this.d = ezvuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfem) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [ceqe, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cezv cezvVar = this.b;
        eieu eieuVarK = eiiy.k("GrpcProxies#getUserDataGrpcProxy");
        try {
            Optional optional = cezvVar.b;
            optional.isPresent();
            ejwl.m(true, "Module for UserDataGrpcProxyFactory not found");
            ceqg ceqgVarA = optional.get().a();
            eieuVarK.close();
            ezvu ezvuVar = this.d;
            this.a = 1;
            Object objA = fdin.a(eicg.a(ceqgVarA.b), new ceqf(null, ceqgVarA, ezvuVar), this);
            return objA == fcylVar ? fcylVar : objA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfem(this.b, this.c, this.d, fcxyVar);
    }
}
