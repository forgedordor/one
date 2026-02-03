package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wws extends fcyz implements fdat {
    final /* synthetic */ www a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wws(www wwwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = wwwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wws) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        www wwwVar = this.a;
        wwwVar.c();
        wwwVar.f.a.a(186072, null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wws(this.a, fcxyVar);
    }
}
