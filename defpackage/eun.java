package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eun extends fcyz implements fdat {
    final /* synthetic */ euo a;
    final /* synthetic */ ivy b;
    final /* synthetic */ fdae c;
    final /* synthetic */ fdae d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eun(euo euoVar, ivy ivyVar, fdae fdaeVar, fdae fdaeVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = euoVar;
        this.b = ivyVar;
        this.c = fdaeVar;
        this.d = fdaeVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.e;
        euo euoVar = this.a;
        fdil.d(fdjxVar, null, null, new eul(euoVar, this.b, this.c, null), 3);
        return fdil.d(fdjxVar, null, null, new eum(euoVar, this.d, null), 3);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        eun eunVar = new eun(this.a, this.b, this.c, this.d, fcxyVar);
        eunVar.e = obj;
        return eunVar;
    }
}
