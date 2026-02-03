package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnar extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnau b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnar(dnau dnauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnar) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnhb dnhbVarQ = this.b.q();
            List listG = fcva.g(dngy.e, dngy.f);
            this.a = 1;
            obj = dnhbVarQ.a(listG, false, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        dmbl dmblVar = this.b.ah;
        if (dmblVar == null) {
            fdbq.c("galleryMediaObserver");
            dmblVar = null;
        }
        dmblVar.onChange(true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnar(this.b, fcxyVar);
    }
}
