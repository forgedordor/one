package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awya extends fcyz implements fdat {
    int a;
    final /* synthetic */ awyb b;
    final /* synthetic */ Optional c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awya(awyb awybVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awybVar;
        this.c = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awya) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awyb awybVar = this.b;
            this.a = 1;
            if (awybVar.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awya(this.b, this.c, fcxyVar);
    }
}
