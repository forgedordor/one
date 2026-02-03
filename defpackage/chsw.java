package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chsw extends fcyz implements fdat {
    int a;
    final /* synthetic */ chtk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chsw(chtk chtkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chtkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chsw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chtk chtkVar = this.b;
            this.a = 1;
            obj = chtkVar.h(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return ekfv.a((Collection) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chsw(this.b, fcxyVar);
    }
}
