package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ches extends fcyz implements fdat {
    int a;
    final /* synthetic */ chet b;
    final /* synthetic */ chfi c;
    final /* synthetic */ axcm d;
    final /* synthetic */ awjl e;
    final /* synthetic */ awpx f;
    final /* synthetic */ chfg g;
    final /* synthetic */ chfo h;
    final /* synthetic */ fhaz i;
    final /* synthetic */ basd j;
    final /* synthetic */ eyga k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ches(chet chetVar, chfi chfiVar, axcm axcmVar, awjl awjlVar, awpx awpxVar, chfg chfgVar, chfo chfoVar, fhaz fhazVar, basd basdVar, eyga eygaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chetVar;
        this.c = chfiVar;
        this.d = axcmVar;
        this.e = awjlVar;
        this.f = awpxVar;
        this.g = chfgVar;
        this.h = chfoVar;
        this.i = fhazVar;
        this.j = basdVar;
        this.k = eygaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ches) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chet chetVar = this.b;
        chfi chfiVar = this.c;
        axcm axcmVar = this.d;
        awjl awjlVar = this.e;
        awpx awpxVar = this.f;
        chfg chfgVar = this.g;
        chfo chfoVar = this.h;
        fhaz fhazVar = this.i;
        basd basdVar = this.j;
        eyga eygaVar = this.k;
        this.a = 1;
        Object objC = chetVar.a.c(chfiVar, axcmVar, awjlVar, awpxVar, chfgVar, chfoVar, fhazVar, basdVar, eygaVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ches(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, fcxyVar);
    }
}
