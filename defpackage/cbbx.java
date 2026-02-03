package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbbx extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fduf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbbx(fduf fdufVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdufVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbbx) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Map map = (Map) this.b;
            fduf fdufVar = this.c;
            this.a = 1;
            if (fdufVar.fO(map, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbbx cbbxVar = new cbbx(this.c, fcxyVar);
        cbbxVar.b = obj;
        return cbbxVar;
    }
}
