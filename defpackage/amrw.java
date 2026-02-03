package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrw extends fcyz implements fdat {
    int a;
    final /* synthetic */ amsc b;
    final /* synthetic */ ajts c;
    final /* synthetic */ amlm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrw(amsc amscVar, ajts ajtsVar, amlm amlmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amscVar;
        this.c = ajtsVar;
        this.d = amlmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        amsc amscVar = this.b;
        cmpx cmpxVar = cmpx.IDLE;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        ajts ajtsVar = this.c;
        amlm amlmVar = this.d;
        aoer aoerVarG = amlmVar.g();
        this.a = 1;
        Object objE = amscVar.e(cmpxVar, instant, ajtsVar, amlmVar, aoerVarG, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amrw(this.b, this.c, this.d, fcxyVar);
    }
}
