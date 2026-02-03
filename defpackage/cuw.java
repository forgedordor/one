package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cuw extends fcyy implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ cuy f;
    final /* synthetic */ cux g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuw(cuy cuyVar, cux cuxVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.f = cuyVar;
        this.g = cuxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuw) c((fdex) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdex fdexVar;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        fcyl fcylVar = fcyl.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            Object obj5 = this.b;
            obj2 = this.a;
            fdexVar = (fdex) this.h;
            fctl.b(obj);
            obj4 = obj5;
        } else {
            fctl.b(obj);
            fdexVar = (fdex) this.h;
            cuy cuyVar = this.f;
            obj2 = this.g;
            cuv cuvVar = cuyVar.a;
            obj3 = cuvVar.c;
            i = cuvVar.e;
            obj4 = cuyVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((cux) obj2).a = i;
            Object obj6 = ((cuy) obj4).a.b[i];
            this.h = fdexVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (fdexVar.a(obj6, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cuw cuwVar = new cuw(this.f, this.g, fcxyVar);
        cuwVar.h = obj;
        return cuwVar;
    }
}
