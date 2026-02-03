package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgut extends fcyz implements fdat {
    int a;
    final /* synthetic */ cguu b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgut(cguu cguuVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cguuVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgut) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgte cgteVar = (cgte) ((Optional) this.b.a.b()).get();
            this.a = 1;
            obj = cgteVar.d(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        fdbq.f(this.c, (String) obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgut(this.b, this.c, fcxyVar);
    }
}
