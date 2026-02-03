package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chaz extends fcyz implements fdat {
    int a;
    final /* synthetic */ chbc b;
    final /* synthetic */ cgzx c;
    final /* synthetic */ cgxy d;
    final /* synthetic */ byte[] e;
    final /* synthetic */ String f;
    final /* synthetic */ cgzv g;
    final /* synthetic */ Instant h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chaz(chbc chbcVar, cgzx cgzxVar, cgxy cgxyVar, byte[] bArr, String str, cgzv cgzvVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chbcVar;
        this.c = cgzxVar;
        this.d = cgxyVar;
        this.e = bArr;
        this.f = str;
        this.g = cgzvVar;
        this.h = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chaz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        cgxy cgxyVar = this.d;
        byte[] bArr = this.e;
        String str = this.f;
        cgzv cgzvVar = this.g;
        Instant instant = this.h;
        this.a = 1;
        Object objB = chbcVar.a.b(cgzxVar, cgxyVar, bArr, str, cgzvVar, instant, 1L, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chaz(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
