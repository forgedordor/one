package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhpp extends fcyz implements fdat {
    /* synthetic */ Object a;

    public dhpp(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhpp) c((List) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        List list = (List) this.a;
        list.getClass();
        qbp qbpVar = (qbp) fcva.Y(list);
        return Boolean.valueOf(qbpVar != null ? qbpVar.b.a() : false);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dhpp dhppVar = new dhpp(fcxyVar);
        dhppVar.a = obj;
        return dhppVar;
    }
}
