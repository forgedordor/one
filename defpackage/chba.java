package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chba extends fcyz implements fdat {
    int a;
    final /* synthetic */ chbc b;
    final /* synthetic */ cgzx c;
    final /* synthetic */ Instant d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chba(chbc chbcVar, cgzx cgzxVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chbcVar;
        this.c = cgzxVar;
        this.d = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chba) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        chbc chbcVar = this.b;
        cgzx cgzxVar = this.c;
        Instant instant = this.d;
        this.a = 1;
        Object objA = eicj.a(chbcVar.a.a, new chat(instant, cgzxVar, null), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chba(this.b, this.c, this.d, fcxyVar);
    }
}
