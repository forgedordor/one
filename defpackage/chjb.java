package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chjb extends fcyz implements fdat {
    int a;
    final /* synthetic */ chjc b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ fhaz e;
    final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chjb(chjc chjcVar, int i, long j, fhaz fhazVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chjcVar;
        this.c = i;
        this.d = j;
        this.e = fhazVar;
        this.f = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chjb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chjc chjcVar = this.b;
            int i2 = this.c;
            long j = this.d;
            fhaz fhazVar = this.e;
            List list = this.f;
            this.a = 1;
            if (chjcVar.a(i2, j, fhazVar, list, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chjb(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
