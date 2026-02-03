package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlo extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdlu b;
    final /* synthetic */ Instant c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdlo(fcxy fcxyVar, cdlu cdluVar, int i, Instant instant, int i2) {
        super(2, fcxyVar);
        this.b = cdluVar;
        this.d = i;
        this.c = instant;
        this.e = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdlo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cdlu cdluVar = this.b;
        cdlp cdlpVar = new cdlp(this.d, this.c, this.e);
        this.a = 1;
        Object objB = crrj.b(cdluVar.b, cdlpVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdlo cdloVar = new cdlo(fcxyVar, this.b, this.d, this.c, this.e);
        cdloVar.f = obj;
        return cdloVar;
    }
}
