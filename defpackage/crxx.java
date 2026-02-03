package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxx extends fcyz implements fdat {
    int a;
    final /* synthetic */ crxy b;
    final /* synthetic */ csdr c;
    final /* synthetic */ csdl d;
    final /* synthetic */ eoeo e;
    final /* synthetic */ int f;
    final /* synthetic */ String g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxx(crxy crxyVar, csdr csdrVar, csdl csdlVar, eoeo eoeoVar, int i, int i2, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crxyVar;
        this.c = csdrVar;
        this.d = csdlVar;
        this.e = eoeoVar;
        this.f = i;
        this.h = i2;
        this.g = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        crxx crxxVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            crxxVar = this;
        } else {
            fcsu fcsuVar = this.b.a;
            cryk crykVar = (cryk) fcsuVar.b();
            csdr csdrVar = this.c;
            cryl crylVarA = crykVar.a(csdrVar);
            cryk crykVar2 = (cryk) fcsuVar.b();
            this.a = 1;
            cspl csplVar = (cspl) csdrVar;
            crxxVar = this;
            obj = crykVar2.k(csplVar.b, csplVar.d, csplVar.e, crylVarA, crxxVar);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        crxy crxyVar = crxxVar.b;
        csdl csdlVar = crxxVar.d;
        eoeo eoeoVar = crxxVar.e;
        int i2 = crxxVar.f;
        int i3 = crxxVar.h;
        eofc eofcVar = (eofc) obj;
        eoel eoelVarA = crxy.a(csdlVar, eoeoVar, i2);
        eoelVarA.copyOnWrite();
        eoem eoemVar = (eoem) eoelVarA.instance;
        eoem eoemVar2 = eoem.a;
        if (i3 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        eoemVar.i = i3 - 2;
        eoemVar.b |= 32;
        cczi ccziVar = crtr.a;
        if (crtr.h().booleanValue()) {
            String str = crxxVar.g;
            eoelVarA.copyOnWrite();
            eoem eoemVar3 = (eoem) eoelVarA.instance;
            eoemVar3.b |= 256;
            eoemVar3.l = str;
        }
        eoem eoemVar4 = (eoem) eoelVarA.build();
        eofcVar.copyOnWrite();
        eofe eofeVar = (eofe) eofcVar.instance;
        eofe eofeVar2 = eofe.a;
        eoemVar4.getClass();
        eofeVar.d = eoemVar4;
        eofeVar.c = 4;
        cryb crybVar = (cryb) crxyVar.b.b();
        eoea eoeaVar = (eoea) eoeb.a.createBuilder();
        eoeaVar.copyOnWrite();
        eoeb eoebVar = (eoeb) eoeaVar.instance;
        eofe eofeVar3 = (eofe) eofcVar.build();
        eofeVar3.getClass();
        eoebVar.c = eofeVar3;
        eoebVar.b = 1;
        evsn evsnVarBuild = eoeaVar.build();
        evsnVarBuild.getClass();
        crybVar.b((eoeb) evsnVarBuild);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxx(this.b, this.c, this.d, this.e, this.f, this.h, this.g, fcxyVar);
    }
}
