package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dopa extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlsu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dopa(dlsu dlsuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlsuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dopa) c((eaik) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eaik eaikVar = (eaik) this.c;
            dlsu dlsuVar = this.b;
            eagz eagzVar = (eagz) eaha.a.createBuilder();
            eagzVar.getClass();
            eagzVar.copyOnWrite();
            eaha eahaVar = (eaha) eagzVar.instance;
            eahaVar.b |= 1;
            eahaVar.c = dlsuVar.a;
            evsn evsnVarBuild = eagzVar.build();
            evsnVarBuild.getClass();
            this.a = 1;
            obj = eaikVar.c((eaha) evsnVarBuild, new fbrg(), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int i2 = ((eahd) obj).b;
        eahb eahbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : eahb.SIGNED_IN_SETUP_COMPLETE : eahb.SIGNED_IN_SETUP_PENDING : eahb.SIGNED_OUT : eahb.UNKNOWN;
        return eahbVar == null ? eahb.UNRECOGNIZED : eahbVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dopa dopaVar = new dopa(this.b, fcxyVar);
        dopaVar.c = obj;
        return dopaVar;
    }
}
