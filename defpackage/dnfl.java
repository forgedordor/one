package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfl extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnfr b;
    final /* synthetic */ ecnv c;
    final /* synthetic */ dnfr d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfl(dnfr dnfrVar, ecnv ecnvVar, fcxy fcxyVar, dnfr dnfrVar2) {
        super(2, fcxyVar);
        this.b = dnfrVar;
        this.c = ecnvVar;
        this.d = dnfrVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnfl) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.e;
            dnfr dnfrVar = this.b;
            ecnv ecnvVar = this.c;
            dnfr dnfrVar2 = this.d;
            fcyh fcyhVarHE = dnfrVar.c.hE();
            dnfk dnfkVar = new dnfk(dnfrVar, ecnvVar, fdosVar, null, dnfrVar2);
            this.a = 1;
            if (fdin.a(fcyhVarHE, dnfkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnfl dnflVar = new dnfl(this.b, this.c, fcxyVar, this.d);
        dnflVar.e = obj;
        return dnflVar;
    }
}
