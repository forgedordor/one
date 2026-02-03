package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzo extends fcyz implements fdat {
    int a;
    final /* synthetic */ drzp b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drzo(drzp drzpVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = drzpVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drzo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            drzp drzpVar = this.b;
            List list = this.c;
            this.a = 1;
            obj = drzpVar.a.a(list, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return ejwi.i(obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new drzo(this.b, this.c, fcxyVar);
    }
}
