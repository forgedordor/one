package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdls extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdlu b;
    final /* synthetic */ Instant c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdls(fcxy fcxyVar, cdlu cdluVar, Instant instant) {
        super(2, fcxyVar);
        this.b = cdluVar;
        this.c = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdls) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        cdlt cdltVar = new cdlt(this.c);
        this.a = 1;
        Object objB = crrj.b(cdluVar.b, cdltVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdls cdlsVar = new cdls(fcxyVar, this.b, this.c);
        cdlsVar.d = obj;
        return cdlsVar;
    }
}
