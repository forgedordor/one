package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abds extends fcyz implements fdat {
    final /* synthetic */ abdu a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abds(fcxy fcxyVar, abdu abduVar) {
        super(2, fcxyVar);
        this.a = abduVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((abds) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        abod abodVarA = ((aboe) this.a.b.b()).a();
        abodVarA.d = true;
        abou abouVar = abou.FOREGROUND;
        eppg eppgVar = (eppg) eppi.a.createBuilder();
        eppgVar.getClass();
        epnx epnxVar = (epnx) epnz.a.createBuilder();
        epnxVar.getClass();
        epnxVar.copyOnWrite();
        ((epnz) epnxVar.instance).d = epny.a(5);
        evsn evsnVarBuild = epnxVar.build();
        evsnVarBuild.getClass();
        eppgVar.copyOnWrite();
        eppi eppiVar = (eppi) eppgVar.instance;
        eppiVar.c = (epnz) evsnVarBuild;
        eppiVar.b = 212;
        evsn evsnVarBuild2 = eppgVar.build();
        evsnVarBuild2.getClass();
        abodVarA.d(abouVar, (eppi) evsnVarBuild2);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abds abdsVar = new abds(fcxyVar, this.a);
        abdsVar.b = obj;
        return abdsVar;
    }
}
