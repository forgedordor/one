package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwv extends fcyz implements fdat {
    /* synthetic */ Object a;

    public dnwv(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnwv) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new dnwt((String) this.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnwv dnwvVar = new dnwv(fcxyVar);
        dnwvVar.a = obj;
        return dnwvVar;
    }
}
