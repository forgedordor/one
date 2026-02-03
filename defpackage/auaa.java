package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auaa extends fcyz implements fdat {
    int a;
    final /* synthetic */ auab b;
    final /* synthetic */ awjl c;
    final /* synthetic */ axcm d;
    final /* synthetic */ ajsm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auaa(auab auabVar, awjl awjlVar, axcm axcmVar, ajsm ajsmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = auabVar;
        this.c = awjlVar;
        this.d = axcmVar;
        this.e = ajsmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auaa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        auab auabVar = this.b;
        awjl awjlVar = this.c;
        axcm axcmVar = this.d;
        ajsm ajsmVar = this.e;
        this.a = 1;
        Object objB = auabVar.a.b(awjlVar, axcmVar, ajsmVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auaa(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
