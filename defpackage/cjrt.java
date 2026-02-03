package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjrt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjrv b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjrt(cjrv cjrvVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cjrvVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjrt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cjrv cjrvVar = this.b;
            String str = this.c;
            this.a = 1;
            obj = cjrvVar.a(str, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjrt(this.b, this.c, fcxyVar);
    }
}
