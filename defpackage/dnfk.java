package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfk extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnfr b;
    final /* synthetic */ ecnv c;
    final /* synthetic */ dnfr d;
    final /* synthetic */ fdos e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnfk(dnfr dnfrVar, ecnv ecnvVar, fdos fdosVar, fcxy fcxyVar, dnfr dnfrVar2) {
        super(2, fcxyVar);
        this.b = dnfrVar;
        this.c = ecnvVar;
        this.d = dnfrVar2;
        this.e = fdosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnfk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnfr dnfrVar = this.b;
            eopy eopyVarA = ((ecmd) dnfrVar.b.b()).a(this.c);
            dnfj dnfjVar = new dnfj(this.e, dnfrVar, null, this.d);
            this.a = 1;
            if (dngi.a(eopyVarA, dnfrVar.c, dnfjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnfk(this.b, this.c, this.e, fcxyVar, this.d);
    }
}
