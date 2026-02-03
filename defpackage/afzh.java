package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afzh extends fcyz implements fdat {
    int a;
    final /* synthetic */ afzi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzh(afzi afziVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afziVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afzh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            afzi afziVar = this.b;
            fdvc fdvcVarA = afziVar.b.a();
            afzg afzgVar = new afzg(afziVar, fdjxVar);
            this.a = 1;
            if (fdvcVarA.a(afzgVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afzh afzhVar = new afzh(this.b, fcxyVar);
        afzhVar.c = obj;
        return afzhVar;
    }
}
