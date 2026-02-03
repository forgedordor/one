package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class onz extends fcyz implements fdat {
    /* synthetic */ boolean a;

    public onz(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((onz) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(!this.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        onz onzVar = new onz(fcxyVar);
        onzVar.a = ((Boolean) obj).booleanValue();
        return onzVar;
    }
}
