package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaid extends fcyz implements fdat {
    final /* synthetic */ aaih a;
    final /* synthetic */ zqm b;
    final /* synthetic */ tcl c;
    final /* synthetic */ ygn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaid(tcl tclVar, aaih aaihVar, zqm zqmVar, ygn ygnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = tclVar;
        this.a = aaihVar;
        this.b = zqmVar;
        this.d = ygnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((aaid) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Optional optional = this.a.a;
        optional.isPresent();
        zqm zqmVar = this.b;
        ?? r7 = optional.get();
        aaic aaicVar = new aaic(zqmVar.a());
        tcl tclVar = this.c;
        tck tckVar = (tck) tclVar.a.b();
        tckVar.getClass();
        tdu tduVar = (tdu) tclVar.b.b();
        tduVar.getClass();
        tdu tduVar2 = (tdu) tclVar.c.b();
        tduVar2.getClass();
        fdjx fdjxVar = (fdjx) tclVar.e.b();
        fdjxVar.getClass();
        return new tcx(tckVar, tduVar, tduVar2, tclVar.d, fdjxVar, r7, aaicVar, this.d.b).d;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aaid(this.c, this.a, this.b, this.d, fcxyVar);
    }
}
