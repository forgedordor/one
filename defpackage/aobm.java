package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aobm extends fcyz implements fdat {
    int a;
    final /* synthetic */ aobn b;
    final /* synthetic */ anty c;
    final /* synthetic */ antq d;
    final /* synthetic */ anue e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aobm(fcxy fcxyVar, aobn aobnVar, anty antyVar, anue anueVar, antq antqVar) {
        super(2, fcxyVar);
        this.b = aobnVar;
        this.c = antyVar;
        this.e = anueVar;
        this.d = antqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aobm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aobn aobnVar = this.b;
        anty antyVar = this.c;
        anue anueVar = this.e;
        antq antqVar = this.d;
        this.a = 1;
        Object objE = aobnVar.e(antyVar, anueVar, antqVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aobm aobmVar = new aobm(fcxyVar, this.b, this.c, this.e, this.d);
        aobmVar.f = obj;
        return aobmVar;
    }
}
