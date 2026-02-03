package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmli extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmll b;
    final /* synthetic */ cmla c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmli(cmll cmllVar, cmla cmlaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmllVar;
        this.c = cmlaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmli) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmll cmllVar = this.b;
            cmla cmlaVar = this.c;
            this.a = 1;
            obj = cmllVar.l(cmlaVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmli(this.b, this.c, fcxyVar);
    }
}
