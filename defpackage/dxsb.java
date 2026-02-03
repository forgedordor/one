package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxsb implements dxrk {
    public final dxrn a;
    private final fcyh b;

    static {
        eksp.c("GnpSdk");
    }

    public dxsb(dxrn dxrnVar, fcyh fcyhVar) {
        this.a = dxrnVar;
        this.b = fcyhVar;
    }

    @Override // defpackage.dxrk
    public final Object a(dxvi dxviVar, fcxy fcxyVar) {
        return fdin.a(this.b, new dxrw(this, dxviVar, null), fcxyVar);
    }

    @Override // defpackage.dxrk
    public final Object b(dxvi dxviVar, fcxy fcxyVar) {
        return fdin.a(this.b, new dxrx(this, dxviVar, null), fcxyVar);
    }

    @Override // defpackage.dxrk
    public final Object c(fcxy fcxyVar) {
        return fdin.a(this.b, new dxry(this, null), fcxyVar);
    }

    @Override // defpackage.dxrk
    public final Object d(List list, fcxy fcxyVar) {
        return fdin.a(this.b, new dxrz(this, list, null), fcxyVar);
    }

    @Override // defpackage.dxrk
    public final Object e(List list, fcxy fcxyVar) {
        return fdin.a(this.b, new dxsa(this, list, null), fcxyVar);
    }
}
