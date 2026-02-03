package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cftm extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cftn d;
    final /* synthetic */ cfsp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cftm(cftn cftnVar, cfsp cfspVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = cftnVar;
        this.e = cfspVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cftm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cftn cftnVar = this.d;
            cfsp cfspVar = this.e;
            cfst cfstVarA = cfss.a((cfsq) cfsr.a.createBuilder());
            cfsv cfsvVar = cfspVar.c;
            if (cfsvVar == null) {
                cfsvVar = cfsv.a;
            }
            ezol ezolVar = cfsvVar.c;
            if (ezolVar == null) {
                ezolVar = ezol.a;
            }
            cftp cftpVar = cftnVar.a;
            ezolVar.getClass();
            this.a = cfstVarA;
            this.b = cfstVarA;
            this.c = 1;
            obj = cftpVar.a(ezolVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = cfstVarA;
            obj3 = obj2;
        }
        ezns eznsVar = (ezns) obj;
        eznsVar.getClass();
        cfsq cfsqVar = ((cfst) obj2).a;
        cfsqVar.copyOnWrite();
        cfsr cfsrVar = (cfsr) cfsqVar.instance;
        cfsr cfsrVar2 = cfsr.a;
        cfsrVar.c = eznsVar;
        cfsrVar.b |= 1;
        return ((cfst) obj3).a();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cftm(this.d, this.e, fcxyVar);
    }
}
