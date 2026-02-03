package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abih extends fcyz implements fdat {
    final /* synthetic */ abij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abih(abij abijVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = abijVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abih) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        abod abodVarA = ((aboe) this.a.c.b()).a();
        abodVarA.d = true;
        abou abouVar = abou.FOREGROUND;
        eppg eppgVar = (eppg) eppi.a.createBuilder();
        evrl evrlVar = evrl.a;
        eppgVar.copyOnWrite();
        eppi eppiVar = (eppi) eppgVar.instance;
        evrlVar.getClass();
        eppiVar.c = evrlVar;
        eppiVar.b = 208;
        abodVarA.d(abouVar, (eppi) eppgVar.build());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abih(this.a, fcxyVar);
    }
}
