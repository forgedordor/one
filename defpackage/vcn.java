package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcn extends fcyz implements fdat {
    final /* synthetic */ vcq a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcn(fcxy fcxyVar, vcq vcqVar, List list) {
        super(2, fcxyVar);
        this.a = vcqVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vcn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((crbb) this.a.a.b()).b(this.b, false, true);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vcn vcnVar = new vcn(fcxyVar, this.a, this.b);
        vcnVar.c = obj;
        return vcnVar;
    }
}
