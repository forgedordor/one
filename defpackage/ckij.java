package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckij extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckil b;
    final /* synthetic */ emey c;
    final /* synthetic */ String d;
    final /* synthetic */ dggn e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckij(ckil ckilVar, emey emeyVar, String str, dggn dggnVar, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckilVar;
        this.c = emeyVar;
        this.d = str;
        this.e = dggnVar;
        this.f = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckij) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckil ckilVar = this.b;
            emey emeyVar = this.c;
            String str = this.d;
            dggn dggnVar = this.e;
            String str2 = this.f;
            this.a = 1;
            obj = eicj.a(ckilVar.a, new ckik(ckilVar, dggnVar, emeyVar, str, str2, null), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckij(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
