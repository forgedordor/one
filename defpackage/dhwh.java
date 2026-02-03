package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwh implements dhwf {
    private final dhwf a;
    private final dhwf b;

    public dhwh(dhwf dhwfVar, dhwf dhwfVar2) {
        this.a = dhwfVar;
        this.b = dhwfVar2;
        new ConcurrentHashMap();
    }

    private final dhwf c(dhvz dhvzVar) {
        if (!(dhvzVar instanceof dhvy) || ((dhvy) dhvzVar).f == null) {
            return this.a;
        }
        dhwf dhwfVar = this.b;
        if (dhwfVar != null) {
            return dhwfVar;
        }
        throw new IllegalStateException("VM unavailable for loading protections");
    }

    @Override // defpackage.dhob
    public final Object a(fcxy fcxyVar) {
        return this.a.a(fcxyVar);
    }

    @Override // defpackage.dhwf
    public final Object b(dhvz dhvzVar, fcxy fcxyVar) {
        return c(dhvzVar).b(dhvzVar, fcxyVar);
    }

    @Override // defpackage.dhro
    public final Object d(dhvy dhvyVar, fcxy fcxyVar) {
        return c(dhvyVar).d(dhvyVar, fcxyVar);
    }
}
