package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjz extends fcyz implements fdat {
    public cfjz(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new cfjz((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        epng epngVar = (epng) epni.a.createBuilder();
        epngVar.getClass();
        return Optional.of(epnj.a(epngVar));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfjz(fcxyVar);
    }
}
