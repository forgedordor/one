package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aafn extends fcyz implements fdat {
    int a;
    final /* synthetic */ aafo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafn(aafo aafoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aafoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aafn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bxun, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aafo aafoVar = this.b;
            Optional optional = aafoVar.c;
            optional.isPresent();
            aafm aafmVar = new aafm(aafoVar, optional.get(), null);
            this.a = 1;
            if (fdpy.b(((aajt) aafoVar.d).l, aafmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aafn(this.b, fcxyVar);
    }
}
