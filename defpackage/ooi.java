package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ooi extends fcyz implements fdat {
    /* synthetic */ Object a;

    public ooi(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ooi) c((fcvv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(((fcvv) this.a) != null);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ooi ooiVar = new ooi(fcxyVar);
        ooiVar.a = obj;
        return ooiVar;
    }
}
